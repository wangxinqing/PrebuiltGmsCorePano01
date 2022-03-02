package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: jgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgk extends Animation {
    final /* synthetic */ jgq a;

    public jgk(jgq jgq) {
        this.a = jgq;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        double floor = Math.floor((double) (this.a.l / 0.8f));
        jgq jgq = this.a;
        float f2 = jgq.j;
        jgq.a(f2 + ((jgq.k - f2) * f));
        jgq jgq2 = this.a;
        float f3 = jgq2.l;
        jgq2.c(f3 + ((((float) (floor + 1.0d)) - f3) * f));
        jgq jgq3 = this.a;
        float f4 = 1.0f - f;
        if (f4 != jgq3.m) {
            jgq3.m = f4;
            jgq3.d();
        }
    }
}
