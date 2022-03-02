package defpackage;

/* renamed from: aqiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiq {
    public final aqic a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    double e = Double.NaN;
    public double f = Double.NaN;
    public double g = Double.NaN;
    public aqjb h;
    public aqjb i;
    public aqjb j;
    public aqjb k;

    public aqiq(aqic aqic) {
        this.a = aqic;
    }

    public final void a(double d2) {
        if (Double.isNaN(this.f) || this.f < d2) {
            this.f = d2;
            if (Double.isNaN(this.e)) {
                this.e = d2;
            }
        }
    }

    public final void b(aqjb aqjb) {
        this.i = aqjb;
        b();
        for (aqjv aqjv : aqju.a) {
        }
    }

    public final void c(aqjb aqjb) {
        b(aqjb);
        a(aqjb);
    }

    public final void d(aqjb aqjb) {
        this.j = aqjb;
        a();
        for (aqjv aqjv : aqju.a) {
        }
    }

    public final boolean d() {
        return this.b && this.c;
    }

    public final aqjb e() {
        if (b()) {
            return this.i;
        }
        return null;
    }

    public final aqjb f() {
        if (a()) {
            return this.j;
        }
        return null;
    }

    public final void g() {
        a(false);
        b(false);
        this.e = Double.NaN;
        this.f = Double.NaN;
        this.g = Double.NaN;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.d = false;
    }

    public final void c(boolean z) {
        this.d = z;
        for (aqjv aqjv : aqju.a) {
        }
    }

    public final void e(aqjb aqjb) {
        aqjb aqjb2;
        if (!(aqjb == null || (aqjb2 = this.h) == null || aqjb.d - aqjb2.d <= this.a.g())) {
            aqju.b();
            g();
        }
        this.h = aqjb;
        a(aqjb);
    }

    public final void a(aqjb aqjb) {
        if (aqjb != null) {
            a(aqjb.d);
        }
    }

    public final void a(boolean z) {
        this.b = z;
        for (aqjv aqjv : aqju.a) {
        }
    }

    public final void b(boolean z) {
        this.c = z;
        for (aqjv aqjv : aqju.a) {
        }
    }

    public final boolean c() {
        aqjb aqjb = this.k;
        return aqjb != null && aqjb.d > this.f - this.a.f();
    }

    public final boolean a() {
        aqjb aqjb = this.j;
        return aqjb != null && aqjb.d > this.f - this.a.e();
    }

    public final boolean b() {
        aqjb aqjb = this.i;
        return aqjb != null && aqjb.d > this.f - this.a.d();
    }

    public final boolean a(double d2, aqjb aqjb) {
        double d3;
        if (aqjb == null || Double.isNaN(d2)) {
            return false;
        }
        int i2 = aqjb.c;
        if (i2 == 1) {
            d3 = this.a.a();
        } else if (i2 != 2) {
            d3 = 1.0d;
        } else {
            d3 = this.a.b();
        }
        double a2 = aqjb.a(2) * d3;
        aqjb.a(2);
        for (aqjv aqjv : aqju.a) {
        }
        return d2 > a2;
    }

    public final boolean a(double[] dArr, aqjb aqjb) {
        if (aqjb != null) {
            return a(aqjw.a(dArr, aqjb), aqjb);
        }
        return false;
    }
}
