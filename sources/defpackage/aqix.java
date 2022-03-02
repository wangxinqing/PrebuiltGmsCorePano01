package defpackage;

/* renamed from: aqix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqix extends aqjl {
    public double a = Double.NaN;
    public int b = 0;
    private final double e;
    private final int f;
    private final double g;
    private final double h;

    public aqix(aqjq aqjq, double d, double d2) {
        super(aqjq);
        double a2 = aqjt.a(2.0d, 0.0d, 10.0d);
        this.e = a2;
        this.f = (int) Math.max(a2, 1.0d);
        this.g = aqjt.a(d, 0.0d, 2.0d);
        this.h = aqjt.a(d2, 0.0d, 2.0d);
    }

    public final void a() {
        ativ.a((Object) this.d, (Object) "Evidence needs to be set.");
        double d = this.d.d;
        if (!Double.isNaN(this.a)) {
            double d2 = this.a;
            if (d > d2) {
                int i = (int) ((d - d2) * this.e);
                this.b = i;
                if (i > 0) {
                    this.a = d;
                }
                int i2 = this.f;
                if (i > i2) {
                    this.b = i2;
                    return;
                }
                return;
            }
            return;
        }
        this.a = d;
    }

    public final void b() {
        this.b = 0;
    }

    public final void a(aqjc aqjc) {
        double[] dArr = aqjc.b;
        int i = this.b;
        if (i > 0) {
            aqjc.a = this.a;
            double sqrt = Math.sqrt((double) i);
            double d = this.g;
            double d2 = this.h * sqrt;
            dArr[2] = dArr[2] + (sqrt * d * this.c.a());
            dArr[0] = dArr[0] + (this.c.a() * d2);
            dArr[1] = dArr[1] + (d2 * this.c.a());
        }
    }
}
