package defpackage;

/* renamed from: ahnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnz {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r0.add(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ahyq a(defpackage.ahyq r10, float r11, float r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r10.b
            if (r2 < r3) goto L_0x0083
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x0082
            int r11 = r0.size()
            int r12 = r10.b
            if (r11 == r12) goto L_0x0080
            int r11 = r0.size()
            int r12 = r12 - r11
            long[] r11 = new long[r12]
            int r2 = r10.a()
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            r3[r4] = r12
            r3[r1] = r2
            java.lang.Class<float> r2 = float.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            float[][] r2 = (float[][]) r2
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0037:
            int r7 = r10.b
            if (r3 >= r7) goto L_0x006d
            int r7 = r0.size()
            if (r5 >= r7) goto L_0x0050
            java.lang.Object r7 = r0.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r3 != r7) goto L_0x0050
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0050:
            long r7 = r10.a((int) r3)
            r11[r6] = r7
            r7 = 0
        L_0x0057:
            int r8 = r10.a()
            if (r7 >= r8) goto L_0x0068
            r8 = r2[r7]
            float r9 = r10.a(r3, r7)
            r8[r6] = r9
            int r7 = r7 + 1
            goto L_0x0057
        L_0x0068:
            int r6 = r6 + 1
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x006d:
            int r10 = r0.size()
            if (r5 == r10) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            if (r6 != r12) goto L_0x0077
            r1 = 1
        L_0x0077:
            defpackage.ativ.a((boolean) r1)
            ahyq r10 = new ahyq
            r10.<init>(r11, r2)
            return r10
        L_0x0080:
            ahyq r10 = defpackage.ahyq.e
        L_0x0082:
            return r10
        L_0x0083:
            r3 = 0
        L_0x0084:
            int r4 = r10.a()
            if (r3 >= r4) goto L_0x00a1
            float r4 = r10.a(r2, r3)
            int r5 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x0093
            goto L_0x009a
        L_0x0093:
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x009a
            int r3 = r3 + 1
            goto L_0x0084
        L_0x009a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnz.a(ahyq, float, float):ahyq");
    }

    public static aiba a(double[] dArr, int i, int i2) {
        double d;
        int i3 = (i2 - i) + 1;
        double d2 = (double) i3;
        double d3 = (double) (i3 - 1);
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d3 * d2;
        double d5 = d4 / 2.0d;
        double d6 = (double) ((i3 + i3) - 1);
        Double.isNaN(d6);
        double d7 = (d4 * d6) / 6.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        for (int i4 = 0; i4 < i3; i4++) {
            double d10 = dArr[i + i4];
            d8 += d10;
            double d11 = (double) i4;
            Double.isNaN(d11);
            d9 += d10 * d11;
        }
        Double.isNaN(d2);
        double d12 = (d7 * d2) - (d5 * d5);
        if (d12 != 0.0d) {
            Double.isNaN(d2);
            double d13 = ((d2 * d9) - (d8 * d5)) / d12;
            double d14 = ((d8 * d7) - (d9 * d5)) / d12;
            if (i3 > 2) {
                double d15 = 0.0d;
                for (int i5 = 0; i5 < i3; i5++) {
                    double d16 = (double) i5;
                    Double.isNaN(d16);
                    double d17 = ((d16 * d13) + d14) - dArr[i + i5];
                    d15 += d17 * d17;
                }
                double d18 = (double) (i3 - 2);
                Double.isNaN(d18);
                d = d15 / d18;
            } else {
                d = 0.0d;
            }
            return aiba.a(Double.valueOf(d13), Double.valueOf(d));
        }
        Double valueOf = Double.valueOf(0.0d);
        return aiba.a(valueOf, valueOf);
    }
}
