package defpackage;

/* renamed from: aqhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhg {
    public double a;
    public double b;
    public double c;
    public double d;

    public aqhg() {
    }

    public static aqhg a() {
        return new aqhg((byte[]) null);
    }

    public final void a(double d2, double d3, double d4, double d5) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
    }

    public final void a(aqhg aqhg) {
        aqhg.a = this.a;
        aqhg.b = this.b;
        aqhg.c = this.c;
        aqhg.d = this.d;
    }

    public final void b() {
        double d2 = this.a;
        double d3 = this.b;
        double d4 = this.c;
        double d5 = this.d;
        double sqrt = Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4) + (d5 * d5));
        if (sqrt >= 1.0E-9d) {
            double d6 = 1.0d / sqrt;
            this.a *= d6;
            this.b *= d6;
            this.c *= d6;
            this.d *= d6;
            return;
        }
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 1.0d;
    }

    public aqhg(byte[] bArr) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 1.0d;
    }

    public static void a(aqhg aqhg, aqhg aqhg2, aqhg aqhg3, boolean z) {
        aqhg aqhg4 = aqhg;
        aqhg aqhg5 = aqhg2;
        aqhg aqhg6 = aqhg3;
        double d2 = aqhg4.d;
        double d3 = aqhg4.a;
        double d4 = aqhg4.b;
        double d5 = aqhg4.c;
        double d6 = aqhg5.d;
        double d7 = aqhg5.a;
        double d8 = d5;
        double d9 = aqhg5.b;
        double d10 = aqhg5.c;
        if (z) {
            d7 = -d7;
            d9 = -d9;
            d10 = -d10;
        }
        double d11 = d9;
        aqhg6.d = (((d2 * d6) - (d3 * d7)) - (d4 * d9)) - (d8 * d10);
        aqhg6.a = (((d2 * d7) + (d3 * d6)) + (d4 * d10)) - (d8 * d11);
        aqhg6.b = (((d2 * d11) + (d4 * d6)) + (d8 * d7)) - (d3 * d10);
        aqhg6.c = (((d2 * d10) + (d8 * d6)) + (d3 * d11)) - (d4 * d7);
    }
}
