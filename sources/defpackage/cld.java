package defpackage;

/* renamed from: cld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cld {
    public double a;
    public double b;
    public int c;

    public cld() {
        a();
    }

    public final void a() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0;
    }

    public final void a(double d) {
        this.a += d;
        this.b += d * d;
        this.c++;
    }

    public final double b() {
        int i = this.c;
        if (i <= 0) {
            return 0.0d;
        }
        double d = this.a;
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    public final double c() {
        double d = 0.0d;
        if (this.c > 0) {
            double b2 = b();
            int i = this.c;
            if (i > 0) {
                double d2 = this.b;
                double d3 = (double) i;
                Double.isNaN(d3);
                d = d2 / d3;
            }
            d -= b2 * b2;
        }
        return Math.sqrt(d);
    }
}
