package defpackage;

/* renamed from: ajzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzj extends ajyz {
    final float a = -1.0f;

    public final void a(ajzv ajzv, float f, float f2) {
        ajzv.a(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        ajzr ajzr = new ajzr(0.0f, 0.0f, f3, f3);
        ajzr.e = 180.0f;
        ajzr.f = 90.0f;
        ajzv.f.add(ajzr);
        ajzv.a((ajzu) new ajzp(ajzr), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        ajzv.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        ajzv.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
