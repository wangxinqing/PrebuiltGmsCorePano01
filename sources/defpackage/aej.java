package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: aej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aej extends TouchDelegate {
    private final View a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final int e;
    private boolean f;

    public aej(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(Rect rect, Rect rect2) {
        this.b.set(rect);
        this.d.set(rect);
        Rect rect3 = this.d;
        int i = -this.e;
        rect3.inset(i, i);
        this.c.set(rect2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z3 = this.f;
                if (!z3 || this.d.contains(x, y)) {
                    z2 = z3;
                    z = true;
                } else {
                    z2 = z3;
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                boolean z4 = this.f;
                this.f = false;
                z2 = z4;
                z = true;
            }
        } else if (this.b.contains(x, y)) {
            this.f = true;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (z && !this.c.contains(x, y)) {
            motionEvent.setLocation((float) (this.a.getWidth() / 2), (float) (this.a.getHeight() / 2));
        } else {
            motionEvent.setLocation((float) (x - this.c.left), (float) (y - this.c.top));
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
