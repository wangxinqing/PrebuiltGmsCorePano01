package defpackage;

/* renamed from: ahoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoh {
    public final double[] a = {1.0d, 0.0d};
    public final double[][] b = {new double[]{0.0d, 1.0d}, new double[]{1.0d, 0.0d}};
    public final double[][] c;
    public final double[][][] d;
    public final int[] e = {70, 67};
    public final double[] f = {0.6d, 0.52d};
    public final int[] g = {30, 40};
    public final int[] h = {200, 90};

    public ahoh(boolean z) {
        double[][] dArr;
        double[][][] dArr2;
        if (!z) {
            dArr = new double[][]{new double[]{0.55d}, new double[]{0.92d}};
        } else {
            dArr = new double[][]{new double[]{0.35d}, new double[]{0.8d}};
        }
        this.c = dArr;
        if (z) {
            dArr2 = new double[][][]{new double[][]{new double[]{10.0d}}, new double[][]{new double[]{40.0d}}};
        } else {
            dArr2 = new double[][][]{new double[][]{new double[]{10.0d}}, new double[][]{new double[]{100.0d}}};
        }
        this.d = dArr2;
    }
}
