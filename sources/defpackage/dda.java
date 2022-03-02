package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dda implements aua {
    final /* synthetic */ AnimatorListenerAdapter a;
    final /* synthetic */ ddf b;

    public dda(ddf ddf, AnimatorListenerAdapter animatorListenerAdapter) {
        this.b = ddf;
        this.a = animatorListenerAdapter;
    }

    public final void a(int i) {
        ddf ddf = this.b;
        aqrx aqrx = ddf.b;
        int i2 = ((aqry) aqrx.c.get(ddf.b(i))).e;
        ddf ddf2 = this.b;
        dhn dhn = ddf2.a;
        int i3 = ddf2.h;
        int i4 = dhn.e;
        if (i4 != i2) {
            dhn.e = i2;
            dhn.d.a(i3, i3, i4, i2, 8);
            dhn.d.a(i3, i3, i4, dhn.e);
        }
        if (awgy.b() && this.b.d.isTouchExplorationEnabled()) {
            ddf ddf3 = this.b;
            if (cyd.a(ddf3.getContext())) {
                i = (this.b.b.c.size() - 1) - i;
            }
            dim.a(ddf3.f.getChildAt(i), ddf3.d, ddf3.a(i));
        }
    }

    public final void b(int i) {
    }

    public final void a(int i, float f) {
        if (!awgy.l() || this.b.i) {
            this.b.g.b((Animator.AnimatorListener) this.a);
            ddd ddd = this.b.c;
            int b2 = ddd.a.b(i);
            if (cyd.a(ddd.a.getContext())) {
                f = 1.0f - f;
            } else if (f > 0.0f) {
                b2++;
            } else {
                f = 1.0f;
            }
            aqpw aqpw = ((aqry) ddd.a.b.c.get(b2)).c;
            if (aqpw == null) {
                aqpw = aqpw.c;
            }
            int i2 = aqpw.b;
            int i3 = aqpw.a;
            aqpw aqpw2 = ((aqry) ddd.a.b.c.get(b2)).c;
            if (aqpw2 == null) {
                aqpw2 = aqpw.c;
            }
            int i4 = aqpw2.a;
            ddf ddf = ddd.a;
            ddf.g.a(ddf.c.a(i4 + ((int) (f * ((float) (i2 - i3))))));
        }
    }
}
