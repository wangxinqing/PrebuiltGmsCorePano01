package defpackage;

import java.util.Random;

/* renamed from: aqiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiv extends aqjl {
    private static final double a = Math.toRadians(10.0d);
    private final Random b;
    private double e;
    private double f;
    private double g;
    private double h;

    public aqiv(aqjq aqjq) {
        super(aqjq);
        this.b = aqjq.b();
    }

    public final void a() {
        boolean z;
        if (this.d.c == 8) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Expected type# %s, but got type# %s.", 8, Integer.valueOf(this.d.c));
        aqik aqik = (aqik) this.d;
        this.e = aqik.a.a(0);
        this.f = aqik.a.a(1);
        this.g = aqik.a.a(2);
        this.h = Double.NaN;
        if (!Double.isNaN(aqik.a(1))) {
            this.h = aqik.a(1);
        }
    }

    public final void b() {
        this.h = Double.NaN;
        this.g = Double.NaN;
        this.e = Double.NaN;
        this.f = Double.NaN;
    }

    public final void a(aqjc aqjc) {
        double d;
        aqjc.a = this.d.d;
        double a2 = this.c.a() * this.g;
        double nextDouble = this.b.nextDouble() * 3.141592653589793d;
        if (Double.isNaN(this.h)) {
            d = this.b.nextDouble() * 6.283185307179586d;
        } else {
            d = this.h + (this.b.nextGaussian() * a);
        }
        double[] dArr = aqjc.b;
        dArr[0] = this.e + (Math.cos(nextDouble) * a2);
        dArr[1] = this.f + (Math.sin(nextDouble) * a2);
        dArr[2] = d;
    }
}
