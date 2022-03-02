package defpackage;

/* renamed from: aqhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhk {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private double f = Double.NaN;
    private int g = 0;
    private int h = 0;
    private boolean i = false;

    public aqhk(aqii aqii) {
        this.a = aqii.a();
        this.b = aqii.b();
        this.c = aqii.c();
        this.d = aqii.e();
        this.e = aqii.d();
    }

    public final double a(int i2, int i3, double d2, double d3) {
        if (this.i && (d3 - this.f <= this.d || aell.a(i2, i3, this.g, this.h) <= this.e)) {
            return Double.NaN;
        }
        this.g = i2;
        this.h = i3;
        this.f = d3;
        this.i = true;
        return aqjt.a(d2 * this.c, this.a, this.b);
    }

    public final void a() {
        this.f = Double.NaN;
        this.g = 0;
        this.h = 0;
        this.i = false;
    }
}
