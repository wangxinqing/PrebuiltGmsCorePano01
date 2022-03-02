package defpackage;

/* renamed from: aqiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiw extends aqjl {
    private final double a;
    private final double b;

    public aqiw(aqjq aqjq, double d, double d2) {
        super(aqjq);
        this.a = aqjt.a(d, 0.2d, 2.0d);
        this.b = aqjt.a(d2, 0.0d, 2.0d);
    }

    public final void a() {
        boolean z;
        if (this.d.c == 4) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Expected type# %s, but got type# %s.", 4, Integer.valueOf(this.d.c));
    }

    public final void a(aqjc aqjc) {
        double[] dArr = aqjc.b;
        aqjc.a = this.d.d;
        double d = dArr[2];
        double a2 = (this.a * 0.74d) + (this.c.a() * this.b);
        dArr[0] = dArr[0] + (Math.cos(d) * a2);
        dArr[1] = dArr[1] + (a2 * Math.sin(d));
    }
}
