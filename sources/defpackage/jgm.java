package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: jgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgm extends Animation {
    final /* synthetic */ jgq a;
    final /* synthetic */ jgs b;

    public jgm(jgs jgs, jgq jgq) {
        this.b = jgs;
        this.a = jgq;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        jgq jgq = this.a;
        double d = (double) jgq.f;
        Double.isNaN(d);
        double radians = Math.toRadians(d / (jgq.n * 6.283185307179586d));
        jgq jgq2 = this.a;
        float f2 = jgq2.k;
        float f3 = jgq2.j;
        float f4 = jgq2.l;
        this.a.b(f2 + ((0.8f - ((float) radians)) * jgs.b.getInterpolation(f)));
        this.a.a(f3 + (jgs.a.getInterpolation(f) * 0.8f));
        this.a.c(f4 + (0.25f * f));
        jgs jgs = this.b;
        jgs.a((f * 144.0f) + ((jgs.e / 5.0f) * 720.0f));
    }
}
