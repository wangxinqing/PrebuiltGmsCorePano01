package defpackage;

/* renamed from: aqhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhh {
    public static final aqhh a = new aqhh(1.0d, 0.0d);
    public static final aqhh b = new aqhh(0.0d, 1.0d);
    public double c;
    public double d;
    public double e;

    public aqhh() {
    }

    public final double a() {
        double d2 = this.c;
        double d3 = this.d;
        double d4 = this.e;
        return Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4));
    }

    public final void a(aqhh aqhh) {
        aqhh.c = this.c;
        aqhh.d = this.d;
        aqhh.e = this.e;
    }

    public final aqhh b() {
        aqhh aqhh = new aqhh();
        a(aqhh);
        return aqhh;
    }

    public final void c() {
        double d2;
        double a2 = a();
        if (a2 >= 1.0E-99d) {
            double d3 = 1.0d / a2;
            this.c *= d3;
            this.d *= d3;
            d2 = this.e * d3;
        } else {
            aqhh aqhh = a;
            this.c = aqhh.c;
            this.d = aqhh.d;
            d2 = aqhh.e;
        }
        this.e = d2;
    }

    public aqhh(double d2, double d3) {
        this.c = d2;
        this.d = 0.0d;
        this.e = d3;
    }
}
