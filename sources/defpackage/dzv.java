package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: dzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzv extends ScrollView {
    public acg a;
    public final ArrayList b = new ArrayList();
    public final LinearLayout c;
    public final dzu d;
    private final int e;
    private boolean f;
    private boolean g;
    private int h;

    public dzv(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842801});
        setBackgroundColor(obtainStyledAttributes.getColor(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        this.d = new dzu(this);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.appinvite_overscroll_resistance);
    }

    public final void a() {
        this.c.removeAllViews();
        this.b.clear();
        for (int i = 0; i < this.a.a(); i++) {
            acg acg = this.a;
            adl b2 = acg.b((ViewGroup) this, acg.a(i));
            this.a.b(b2, i);
            LinearLayout linearLayout = this.c;
            View view = b2.a;
            linearLayout.addView(view, view.getLayoutParams());
            this.b.add(b2);
        }
    }

    public final boolean canScrollVertically(int i) {
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            this.f = false;
            if (getHeight() + getScrollY() >= this.c.getHeight()) {
                z = true;
            } else {
                z = false;
            }
            this.g = z;
            this.h = 0;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f || getVisibility() == 8) && (getParent() instanceof dzw)) {
            return ((dzw) getParent()).a(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f || !(getParent() instanceof dzw)) {
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(0);
        return ((dzw) getParent()).a(obtain);
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (z && (getParent() instanceof dzw)) {
            if (i2 >= 0) {
                int i9 = (i2 + i4) - (i6 + i8);
                if (i9 > 0) {
                    int i10 = this.h + i9;
                    this.h = i10;
                    if (this.g || i10 > this.e) {
                        ((dzw) getParent()).g.a(false);
                        this.f = true;
                    }
                }
            } else {
                this.g = false;
                this.h = 0;
                if (i2 + i4 < i8) {
                    this.f = true;
                }
            }
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
