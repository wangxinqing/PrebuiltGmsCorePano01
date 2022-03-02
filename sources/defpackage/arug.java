package defpackage;

/* renamed from: arug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arug {
    public final double[] a = new double[9];

    public static void a(arug arug, arug arug2, arug arug3) {
        double[] dArr = arug3.a;
        double[] dArr2 = arug.a;
        double d = dArr2[0];
        double[] dArr3 = arug2.a;
        dArr[0] = d + dArr3[0];
        dArr[1] = dArr2[1] + dArr3[1];
        dArr[2] = dArr2[2] + dArr3[2];
        dArr[3] = dArr2[3] + dArr3[3];
        dArr[4] = dArr2[4] + dArr3[4];
        dArr[5] = dArr2[5] + dArr3[5];
        dArr[6] = dArr2[6] + dArr3[6];
        dArr[7] = dArr2[7] + dArr3[7];
        dArr[8] = dArr2[8] + dArr3[8];
    }

    public static void b(arug arug, arug arug2, arug arug3) {
        double[] dArr = arug.a;
        double d = dArr[0];
        double[] dArr2 = arug2.a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = dArr2[1];
        double d8 = dArr2[4];
        double d9 = dArr2[7];
        double d10 = dArr2[2];
        double d11 = dArr2[5];
        double d12 = dArr2[8];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        arug3.a((d * d2) + (d3 * d4) + (d5 * d6), (d * d7) + (d3 * d8) + (d5 * d9), (d * d10) + (d3 * d11) + (d5 * d12), (d13 * d2) + (d14 * d4) + (d15 * d6), (d13 * d7) + (d14 * d8) + (d15 * d9), (d13 * d10) + (d14 * d11) + (d15 * d12), (d2 * d16) + (d4 * d17) + (d6 * d18), (d7 * d16) + (d8 * d17) + (d9 * d18), (d16 * d10) + (d17 * d11) + (d18 * d12));
    }

    public static void a(arug arug, aruk aruk, aruk aruk2) {
        aruk aruk3 = aruk;
        aruk aruk4 = aruk2;
        double[] dArr = arug.a;
        double d = dArr[0];
        double d2 = aruk3.a;
        double d3 = dArr[1];
        double d4 = aruk3.b;
        double d5 = dArr[2];
        double d6 = aruk3.c;
        double d7 = dArr[3];
        double d8 = dArr[4];
        double d9 = dArr[5];
        double d10 = dArr[6];
        double d11 = dArr[7];
        double d12 = dArr[8];
        aruk4.a = (d * d2) + (d3 * d4) + (d5 * d6);
        aruk4.b = (d7 * d2) + (d8 * d4) + (d9 * d6);
        aruk4.c = (d10 * d2) + (d11 * d4) + (d12 * d6);
    }

    public final void b() {
        double[] dArr = this.a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public final double a(int i, int i2) {
        return this.a[(i * 3) + i2];
    }

    public final void b(arug arug) {
        double[] dArr = this.a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = arug.a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    public final void a() {
        double[] dArr = this.a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public final void a(double d) {
        double[] dArr = this.a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    public final void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = this.a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    public final void a(int i, int i2, double d) {
        this.a[(i * 3) + i2] = d;
    }

    public final void a(int i, aruk aruk) {
        double[] dArr = this.a;
        dArr[i] = aruk.a;
        dArr[i + 3] = aruk.b;
        dArr[i + 6] = aruk.c;
    }

    public final void a(arug arug) {
        double[] dArr = this.a;
        double[] dArr2 = arug.a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }
}
