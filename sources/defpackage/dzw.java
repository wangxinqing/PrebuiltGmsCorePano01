package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: dzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzw extends FrameLayout {
    public eaf a;
    public dym b;
    public dyj c;
    public dzv d;
    public boolean e;
    public boolean f = true;
    public dxx g;

    public dzw(Context context) {
        super(context);
        eai eai = new eai(context);
        this.a = eai;
        eai.a = this;
        eai.setItemAnimator((aco) null);
        addView(this.a, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a() {
        if (this.e) {
            int max = Math.max(0, this.a.getChildPosition(this.a.getChildAt(0)));
            if (!this.f || max < this.b.g()) {
                if (this.d.getVisibility() != 8) {
                    this.b.a(this.c.e());
                }
                this.d.setVisibility(8);
                return;
            }
            if (this.d.getVisibility() != 0) {
                this.c.a(this.b.e());
            }
            this.d.setVisibility(0);
        }
    }

    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        ead ead = ((eai) this.a).e;
        return (ead != null && ead.a(motionEvent)) || super.onInterceptHoverEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ead ead = ((eai) this.a).e;
        return (ead != null && ead.a(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ead ead = ((eai) this.a).e;
        return (ead != null && ead.b(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    public final void a(int i) {
        eai eai = (eai) this.a;
        eai.f = i;
        ead ead = eai.e;
        if (ead != null) {
            ead.a(i);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
