package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoc {
    private static final ahmn[] a = {ahmn.IN_VEHICLE, ahmn.ON_BICYCLE, ahmn.ON_FOOT, ahmn.STILL, ahmn.INCONSISTENT};
    private static final double[] b = {1.0d, 1.0d, 0.8d};
    private static final double[][] c = {new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}};
    private static final double[] d = {1.0d, 1.0d, 0.8d};
    private static final double[][] e = {new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}};
    private static final double[] f = {0.8d, 1.0d, 0.6d};
    private static final double[][] g = {new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}};
    private static final double[] h = {0.8d, 1.0d, 0.6d};
    private static final double[][] i = {new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}};
    private static final double[] j = {0.8d, 1.0d, 1.0d};
    private static final double[][] k = {new double[]{-0.8d, -0.8d, 1.0d, 0.2d, 0.2d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}};
    private static final double[] l = {0.8d, 1.0d, 1.0d};
    private static final double[][] m = {new double[]{-0.8d, -0.8d, 1.0d, 0.2d, 0.2d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}};
    private final double[] n;
    private final double[][] o;

    private ahoc(double[] dArr, double[][] dArr2) {
        ativ.b(dArr.length == dArr2.length, "Incosistent dimension");
        this.n = dArr;
        this.o = dArr2;
    }

    public static aiba a(int i2) {
        ahoc ahoc;
        ahoc ahoc2;
        switch (i2) {
            case 1:
            case 2:
                ahoc = new ahoc(b, c);
                ahoc2 = new ahoc(d, e);
                break;
            case 3:
            case 4:
                ahoc = new ahoc(f, g);
                ahoc2 = new ahoc(h, i);
                break;
            case 5:
            case 6:
                ahoc = new ahoc(j, k);
                ahoc2 = new ahoc(l, m);
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid floor change type: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
        return aiba.a(ahoc, ahoc2);
    }

    public final double a(List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int[] iArr = new int[2];
        boolean z3 = true;
        iArr[1] = a.length;
        iArr[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (int i3 = 0; i3 < a.length; i3++) {
                double[] dArr2 = dArr[i2];
                double a2 = (double) ahmo.a((List) list.get(i2), a[i3]);
                Double.isNaN(a2);
                dArr2[i3] = a2 / 100.0d;
            }
        }
        String valueOf = String.valueOf(Arrays.deepToString(dArr));
        if (valueOf.length() == 0) {
            new String("prob: ");
        } else {
            "prob: ".concat(valueOf);
        }
        int length = dArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        ativ.b(z, "activityProbabilityMatrix is empty");
        if (length <= this.o.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        ativ.b(z2, "activityProbabilityMatrix is too long");
        if (dArr[0].length != this.o[0].length) {
            z3 = false;
        }
        ativ.b(z3, "activityProbabilityMatrix has wrong size of activity");
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i4 = 0; i4 < dArr.length; i4++) {
            d3 += this.n[i4];
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            int i6 = 0;
            while (true) {
                double[] dArr3 = dArr[i5];
                if (i6 >= dArr3.length) {
                    break;
                }
                d2 += ((dArr3[i6] * this.o[i5][i6]) * this.n[i5]) / d3;
                i6++;
            }
        }
        return d2;
    }
}
