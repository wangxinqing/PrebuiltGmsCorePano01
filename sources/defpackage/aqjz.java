package defpackage;

/* renamed from: aqjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjz extends aqjr {
    public final double b;
    private final double c;
    private final boolean d;
    private final double e;
    private double f;
    private boolean g;

    public aqjz(double d2, double d3, boolean z) {
        this.e = d2;
        this.b = d3;
        this.c = aqjt.a(d3, 1.0d);
        this.d = z;
    }

    public final double a(aqjc aqjc) {
        if (!this.g) {
            return 1.0d;
        }
        double a = aqjw.a(aqjc.b, this.a);
        if (!this.d) {
            return aqjt.a(a, this.f);
        }
        double d2 = this.b;
        double d3 = this.f;
        return a < d2 * d3 ? aqjt.a(a, d3) : this.c;
    }

    public final void a() {
        boolean z;
        int i = this.a.c;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = i == 2;
        }
        ativ.a(z, "Expected GNSS (type# = %s), WIFI (type# = %s) or debug (type# >= %s), but got type# %s.", 1, 2, 200, Integer.valueOf(this.a.c));
        double a = this.a.a(2) * this.e;
        this.f = a;
        if (a > 0.1d) {
            z2 = true;
        }
        this.g = z2;
    }
}
