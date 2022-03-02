package defpackage;

/* renamed from: ahod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahod {
    private final double[][] a;
    private final double[][][] b;
    private final int c;
    private final int d;
    private final double[] e;
    private double[] f;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r9[r10][r10] <= 0.0d) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r9 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahod(double[][] r26, double[][][] r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r25.<init>()
            int r3 = r1.length
            r0.c = r3
            r4 = 1
            r5 = 0
            if (r3 <= 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            defpackage.ativ.b(r3)
            int r3 = r2.length
            int r6 = r0.c
            if (r3 != r6) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            defpackage.ativ.b(r3)
            r3 = r1[r5]
            int r3 = r3.length
            r0.d = r3
            r3 = 0
        L_0x0027:
            int r6 = r0.c
            if (r3 < r6) goto L_0x00d2
            r0.a = r1
            r0.b = r2
            double[] r3 = new double[r6]
            r0.f = r3
            double[] r3 = new double[r6]
            r0.e = r3
            r3 = 0
        L_0x0038:
            int r6 = r0.c
            if (r3 >= r6) goto L_0x00d1
            double[] r6 = r0.e
            r7 = r2[r3]
            int r8 = r7.length
            r9 = 2
            int[] r9 = new int[r9]
            r9[r4] = r8
            r9[r5] = r8
            java.lang.Class<double> r10 = double.class
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r9)
            double[][] r9 = (double[][]) r9
            r10 = 0
        L_0x0051:
            r11 = 0
            r12 = 0
            if (r10 < r8) goto L_0x0057
            goto L_0x009c
        L_0x0057:
            r14 = 0
        L_0x0058:
            if (r14 > r10) goto L_0x0090
            r15 = r7[r10]
            r16 = r15[r14]
            r18 = r12
            r15 = 0
        L_0x0061:
            if (r15 >= r14) goto L_0x0072
            r20 = r9[r10]
            r21 = r20[r15]
            r20 = r9[r14]
            r23 = r20[r15]
            double r21 = r21 * r23
            double r18 = r18 + r21
            int r15 = r15 + 1
            goto L_0x0061
        L_0x0072:
            if (r10 == r14) goto L_0x007d
            double r16 = r16 - r18
            r15 = r9[r14]
            r18 = r15[r14]
            double r16 = r16 / r18
            goto L_0x0087
        L_0x007d:
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 < 0) goto L_0x008e
            double r16 = r16 - r18
            double r16 = java.lang.Math.sqrt(r16)
        L_0x0087:
            r15 = r9[r10]
            r15[r14] = r16
            int r14 = r14 + 1
            goto L_0x0058
        L_0x008e:
            r9 = r11
            goto L_0x009c
        L_0x0090:
            r14 = r9[r10]
            r15 = r14[r10]
            int r14 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x009b
            int r10 = r10 + 1
            goto L_0x0051
        L_0x009b:
            r9 = r11
        L_0x009c:
            if (r9 == 0) goto L_0x00b0
            r7 = 0
        L_0x009f:
            int r8 = r9.length
            if (r7 >= r8) goto L_0x00ae
            r8 = r9[r7]
            r10 = r8[r7]
            double r10 = java.lang.Math.log(r10)
            double r12 = r12 + r10
            int r7 = r7 + 1
            goto L_0x009f
        L_0x00ae:
            double r12 = r12 + r12
            goto L_0x00b2
        L_0x00b0:
            r12 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x00b2:
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r7
            r9 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r9 = java.lang.Math.log(r9)
            r11 = r1[r3]
            int r11 = r11.length
            double r14 = (double) r11
            java.lang.Double.isNaN(r14)
            double r9 = r9 * r14
            double r9 = r9 * r7
            double r12 = r12 - r9
            r6[r3] = r12
            int r3 = r3 + 1
            goto L_0x0038
        L_0x00d1:
            return
        L_0x00d2:
            r6 = r1[r3]
            int r6 = r6.length
            int r7 = r0.d
            if (r6 != r7) goto L_0x00db
            r6 = 1
            goto L_0x00dc
        L_0x00db:
            r6 = 0
        L_0x00dc:
            defpackage.ativ.b(r6)
            r6 = r2[r3]
            int r6 = r6.length
            int r7 = r0.d
            if (r6 != r7) goto L_0x00e8
            r6 = 1
            goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            defpackage.ativ.b(r6)
            r6 = 0
        L_0x00ed:
            int r7 = r0.d
            if (r6 >= r7) goto L_0x0101
            r8 = r2[r3]
            r8 = r8[r6]
            int r8 = r8.length
            if (r8 != r7) goto L_0x00fa
            r7 = 1
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            defpackage.ativ.b(r7)
            int r6 = r6 + 1
            goto L_0x00ed
        L_0x0101:
            int r3 = r3 + 1
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahod.<init>(double[][], double[][][]):void");
    }

    public final double a(int i) {
        ativ.b(i < this.c);
        return this.f[i];
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            this.f[i] = 0.0d;
        }
    }

    public final void a(float[] fArr) {
        boolean z;
        float[] fArr2 = fArr;
        int length = fArr2.length;
        boolean z2 = true;
        if (length == this.d) {
            z = true;
        } else {
            z = false;
        }
        ativ.b(z);
        if (length != this.d) {
            z2 = false;
        }
        ativ.b(z2);
        double[] dArr = new double[this.c];
        for (int i = 0; i < this.c; i++) {
            double[][] dArr2 = this.b[i];
            double[] dArr3 = this.a[i];
            double d2 = 0.0d;
            for (int i2 = 0; i2 < dArr3.length; i2++) {
                for (int i3 = 0; i3 < dArr3.length; i3++) {
                    double d3 = (double) fArr2[i2];
                    double d4 = dArr3[i2];
                    Double.isNaN(d3);
                    double d5 = (double) fArr2[i3];
                    double d6 = dArr3[i3];
                    Double.isNaN(d5);
                    d2 += (d3 - d4) * dArr2[i2][i3] * (d5 - d6);
                }
            }
            dArr[i] = (d2 * -0.5d) + this.e[i];
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            double[] dArr4 = this.f;
            dArr4[i4] = dArr4[i4] + dArr[i4];
        }
    }
}
