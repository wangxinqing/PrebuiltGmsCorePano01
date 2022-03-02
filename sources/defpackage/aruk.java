package defpackage;

/* renamed from: aruk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruk {
    public double a;
    public double b;
    public double c;

    public aruk() {
    }

    public static double a(aruk aruk, aruk aruk2) {
        return (aruk.a * aruk2.a) + (aruk.b * aruk2.b) + (aruk.c * aruk2.c);
    }

    public final void a() {
        this.c = 0.0d;
        this.b = 0.0d;
        this.a = 0.0d;
    }

    public final void a(double d) {
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    public final void a(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final void a(int i, double d) {
        if (i == 0) {
            this.a = d;
        } else if (i != 1) {
            this.c = d;
        } else {
            this.b = d;
        }
    }

    public final void b() {
        double c2 = c();
        if (c2 != 0.0d) {
            a(1.0d / c2);
        }
    }

    public final double c() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        StringBuilder sb = new StringBuilder(76);
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        return sb.toString();
    }

    public aruk(double d, double d2) {
        a(0.0d, d, d2);
    }

    public static void a(aruk aruk, aruk aruk2, aruk aruk3) {
        aruk aruk4 = aruk;
        aruk aruk5 = aruk2;
        double d = aruk4.b;
        double d2 = aruk5.c;
        double d3 = aruk4.c;
        double d4 = aruk5.b;
        double d5 = aruk5.a;
        double d6 = aruk4.a;
        aruk3.a((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    public final void a(aruk aruk) {
        this.a = aruk.a;
        this.b = aruk.b;
        this.c = aruk.c;
    }
}
