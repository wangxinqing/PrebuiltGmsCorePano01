package defpackage;

/* renamed from: ahmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmi {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[LOOP:3: B:23:0x0051->B:24:0x0053, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float a(boolean r22, double[][] r23, boolean r24) {
        /*
            r0 = 0
            r1 = r23[r0]
            int r1 = r1.length
            r2 = 3
            if (r22 != 0) goto L_0x0009
            r3 = 3
            goto L_0x000a
        L_0x0009:
            r3 = 4
        L_0x000a:
            int r3 = r1 / r3
            double[] r4 = new double[r2]
            double[] r5 = new double[r2]
            r6 = 0
        L_0x0011:
            if (r6 < r2) goto L_0x0092
            r9 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r6 = 0
            r11 = 0
        L_0x0018:
            r13 = 0
            r14 = 0
        L_0x001b:
            if (r13 >= r2) goto L_0x0035
            r16 = r5[r13]
            double r7 = (double) r3
            r20 = r4[r13]
            java.lang.Double.isNaN(r7)
            double r20 = r20 / r7
            java.lang.Double.isNaN(r7)
            double r16 = r16 / r7
            double r20 = r20 * r20
            double r16 = r16 - r20
            double r14 = r14 + r16
            int r13 = r13 + 1
            goto L_0x001b
        L_0x0035:
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
            r11 = r14
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            int r7 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0042
            r9 = r14
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            int r7 = r6 + r3
            if (r24 == 0) goto L_0x004e
            int r8 = r1 + -1
            if (r7 != r8) goto L_0x004c
            goto L_0x0087
        L_0x004c:
            r8 = 0
            goto L_0x0051
        L_0x004e:
            if (r7 == r1) goto L_0x0087
            r8 = 0
        L_0x0051:
            if (r8 >= r2) goto L_0x007e
            r13 = r4[r8]
            r15 = r23[r8]
            r17 = r1
            r0 = r15[r6]
            double r0 = -r0
            r20 = r15[r7]
            double r0 = r0 + r20
            double r13 = r13 + r0
            r4[r8] = r13
            r0 = r5[r8]
            r13 = r15[r6]
            r20 = r15[r7]
            r22 = r3
            double r2 = -r13
            double r2 = r2 * r13
            double r20 = r20 * r20
            double r2 = r2 + r20
            double r0 = r0 + r2
            r5[r8] = r0
            int r8 = r8 + 1
            r3 = r22
            r1 = r17
            r0 = 0
            r2 = 3
            goto L_0x0051
        L_0x007e:
            r17 = r1
            r22 = r3
            int r6 = r6 + 1
            r0 = 0
            r2 = 3
            goto L_0x0018
        L_0x0087:
            double r9 = r9 / r11
            float r0 = (float) r9
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 == 0) goto L_0x0091
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0091:
            return r0
        L_0x0092:
            r17 = r1
            r22 = r3
            r0 = 0
            r7 = 0
            r18 = 0
        L_0x009b:
            r1 = r22
            if (r0 >= r1) goto L_0x00ad
            r2 = r23[r6]
            r9 = r2[r0]
            double r7 = r7 + r9
            double r9 = r9 * r9
            double r18 = r18 + r9
            int r0 = r0 + 1
            r22 = r1
            goto L_0x009b
        L_0x00ad:
            r4[r6] = r7
            r5[r6] = r18
            int r6 = r6 + 1
            r3 = r1
            r1 = r17
            r0 = 0
            r2 = 3
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmi.a(boolean, double[][], boolean):float");
    }

    private static float b(double[] dArr) {
        int i = 0;
        for (double d : dArr) {
            if (d > 0.0d) {
                i++;
            }
        }
        return ((float) i) / ((float) r0);
    }

    public static float a(double[] dArr) {
        int length;
        float f;
        float f2;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = dArr.length;
            if (i >= length - 1) {
                break;
            }
            double d = dArr[i - 1];
            double d2 = dArr[i];
            int i5 = i + 1;
            if ((d < d2) != (d2 < dArr[i5])) {
                if (i2 == 0) {
                    i4 = i;
                }
                i2++;
                i3 = i;
            }
            i = i5;
        }
        if (i2 > 1) {
            f = (float) (i2 - 1);
            f2 = (float) (i3 - i4);
        } else {
            f = (float) i2;
            f2 = (float) (length - 2);
        }
        return f / f2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v19, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: double[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double[] a(defpackage.ahml r31, double[][] r32, boolean r33) {
        /*
            r0 = r31
            r1 = r32
            r2 = 0
            r3 = r1[r2]
            int r3 = r3.length
            r4 = 1
            int r3 = r3 + r4
            double[] r5 = new double[r3]
            r6 = 0
        L_0x000d:
            r7 = 3
            if (r6 >= r7) goto L_0x001d
            r7 = r1[r6]
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            defpackage.ahmx.a((double[]) r7, (double) r8, (double[]) r5)
            int r6 = r6 + 1
            goto L_0x000d
        L_0x001d:
            int r6 = r1.length
            if (r6 != r7) goto L_0x0022
            r6 = 1
            goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            defpackage.ativ.b(r6)
            r6 = r1[r2]
            int r6 = r6.length
            r8 = r1[r4]
            int r8 = r8.length
            if (r8 != r6) goto L_0x0030
            r8 = 1
            goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            defpackage.ativ.b(r8)
            r8 = 2
            r9 = r1[r8]
            int r9 = r9.length
            if (r9 != r6) goto L_0x003c
            r9 = 1
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            defpackage.ativ.b(r9)
            double[] r9 = new double[r7]
            r10 = 0
        L_0x0043:
            if (r10 < r7) goto L_0x046c
            r10 = r9[r2]
            r12 = r9[r4]
            r14 = r9[r8]
            double r10 = r10 * r10
            double r12 = r12 * r12
            double r10 = r10 + r12
            double r14 = r14 * r14
            double r10 = r10 + r14
            double r11 = java.lang.Math.sqrt(r10)
            r13 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0068
            double[] r6 = new double[r7]
            r6 = {0, 0, 0} // fill-array
            r23 = r3
            r24 = r5
            goto L_0x023e
        L_0x0068:
            double[] r15 = new double[r7]
            r10 = 0
        L_0x006c:
            if (r10 < r7) goto L_0x0455
        L_0x006e:
            double[] r9 = new double[r7]
            double r10 = java.lang.Math.random()
            r16 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r10 = r10 + r16
            r9[r2] = r10
            double r10 = java.lang.Math.random()
            double r10 = r10 + r16
            r9[r4] = r10
            double r10 = java.lang.Math.random()
            double r10 = r10 + r16
            r9[r8] = r10
            r16 = r15[r2]
            r18 = r9[r2]
            double r16 = r16 * r18
            r18 = r15[r4]
            r20 = r9[r4]
            double r18 = r18 * r20
            double r16 = r16 + r18
            r18 = r15[r8]
            double r18 = r18 * r10
            double r16 = r16 + r18
            r10 = 0
        L_0x00a0:
            if (r10 < r7) goto L_0x043a
            r10 = r9[r2]
            r16 = r9[r4]
            r18 = r9[r8]
            double r10 = r10 * r10
            double r16 = r16 * r16
            double r10 = r10 + r16
            double r18 = r18 * r18
            double r10 = r10 + r18
            double r10 = java.lang.Math.sqrt(r10)
            r16 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x042c
            r12 = 0
        L_0x00c0:
            if (r12 < r7) goto L_0x0415
            double[] r10 = new double[r7]
            r11 = r15[r4]
            r16 = r9[r8]
            r18 = r15[r8]
            r20 = r9[r4]
            double r22 = r11 * r16
            double r24 = r18 * r20
            double r22 = r22 - r24
            r10[r2] = r22
            r22 = r9[r2]
            r24 = r15[r2]
            double r18 = r18 * r22
            double r16 = r16 * r24
            double r18 = r18 - r16
            r10[r4] = r18
            double r24 = r24 * r20
            double r11 = r11 * r22
            double r24 = r24 - r11
            r10[r8] = r24
            r11 = r1[r2]
            r12 = r1[r4]
            double[] r13 = new double[r7]
            r14 = r1[r8]
            r7 = 0
        L_0x00f1:
            if (r7 >= r6) goto L_0x0158
            r16 = r15[r2]
            r21 = r1[r2]
            r22 = r21[r7]
            double r16 = r16 * r22
            r21 = r15[r4]
            r23 = r1[r4]
            r24 = r23[r7]
            double r21 = r21 * r24
            double r16 = r16 + r21
            r21 = r15[r8]
            r23 = r1[r8]
            r24 = r23[r7]
            double r21 = r21 * r24
            double r16 = r16 + r21
            r8 = 0
        L_0x0110:
            r4 = 3
            if (r8 < r4) goto L_0x0148
            r14[r7] = r16
            r16 = r13[r2]
            r23 = r9[r2]
            r8 = 1
            r25 = r13[r8]
            r27 = r9[r8]
            r8 = 2
            r29 = r13[r8]
            double r23 = r23 * r16
            double r27 = r27 * r25
            double r23 = r23 + r27
            r20 = r9[r8]
            double r20 = r20 * r29
            double r23 = r23 + r20
            r11[r7] = r23
            r20 = r10[r2]
            double r16 = r16 * r20
            r20 = 1
            r23 = r10[r20]
            double r25 = r25 * r23
            double r16 = r16 + r25
            r23 = r10[r8]
            double r29 = r29 * r23
            double r16 = r16 + r29
            r12[r7] = r16
            int r7 = r7 + 1
            r4 = 1
            r8 = 2
            goto L_0x00f1
        L_0x0148:
            r20 = r1[r8]
            r23 = r20[r7]
            r25 = r15[r8]
            double r25 = r25 * r16
            double r23 = r23 - r25
            r13[r8] = r23
            int r8 = r8 + 1
            r4 = 1
            goto L_0x0110
        L_0x0158:
            int r4 = r11.length
            int r7 = r12.length
            if (r7 != r4) goto L_0x015e
            r7 = 1
            goto L_0x015f
        L_0x015e:
            r7 = 0
        L_0x015f:
            defpackage.ativ.b(r7)
            r7 = 0
            r8 = 0
            r13 = 0
            r16 = 0
        L_0x0169:
            if (r7 >= r4) goto L_0x017e
            r23 = r11[r7]
            double r25 = r23 * r23
            double r13 = r13 + r25
            r25 = r12[r7]
            double r23 = r23 * r25
            double r8 = r8 + r23
            double r25 = r25 * r25
            double r16 = r16 + r25
            int r7 = r7 + 1
            goto L_0x0169
        L_0x017e:
            r4 = 2
            double[] r7 = new double[r4]
            r23 = r3
            double r2 = r8 + r8
            r24 = r5
            double r4 = r13 - r16
            double r2 = java.lang.Math.atan2(r2, r4)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r4
            r4 = 0
            r7[r4] = r2
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r2 = r2 + r4
            r4 = 1
            r7[r4] = r2
            r2 = 2
            int[] r3 = new int[r2]
            r3 = {2, 2} // fill-array
            java.lang.Class<double> r4 = double.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            double[][] r3 = (double[][]) r3
            double[] r4 = new double[r2]
            r5 = 0
        L_0x01ae:
            if (r5 >= r2) goto L_0x01f4
            r2 = r3[r5]
            r25 = r7[r5]
            double r25 = java.lang.Math.cos(r25)
            r20 = 0
            r2[r20] = r25
            r2 = r3[r5]
            r25 = r7[r5]
            double r25 = java.lang.Math.sin(r25)
            r10 = 1
            r2[r10] = r25
            r2 = 2
            double[] r10 = new double[r2]
            r2 = r3[r5]
            r25 = r2[r20]
            double r25 = r25 * r13
            r22 = 1
            r27 = r2[r22]
            double r27 = r27 * r8
            double r25 = r25 + r27
            r10[r20] = r25
            r25 = r2[r20]
            double r25 = r25 * r8
            r27 = r2[r22]
            double r27 = r27 * r16
            double r25 = r25 + r27
            r10[r22] = r25
            r27 = r10[r20]
            double r27 = r27 * r27
            double r25 = r25 * r25
            double r27 = r27 + r25
            r4[r5] = r27
            int r5 = r5 + 1
            r2 = 2
            goto L_0x01ae
        L_0x01f4:
            r20 = 0
            r22 = 1
            r7 = r4[r20]
            r9 = r4[r22]
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x020d
            r2 = 2
            double[][] r4 = new double[r2][]
            r2 = r3[r22]
            r4[r20] = r2
            r2 = r3[r20]
            r4[r22] = r2
            r3 = r4
            goto L_0x020e
        L_0x020d:
        L_0x020e:
            r2 = r1[r22]
            r4 = r1[r20]
            r5 = 0
        L_0x0214:
            if (r5 >= r6) goto L_0x023d
            r7 = r11[r5]
            r9 = r3[r20]
            r13 = r9[r20]
            r16 = r12[r5]
            r25 = r9[r22]
            r9 = r3[r22]
            r27 = r9[r20]
            r29 = r9[r22]
            double r13 = r13 * r7
            double r25 = r25 * r16
            double r13 = r13 + r25
            r2[r5] = r13
            double r7 = r7 * r27
            double r16 = r16 * r29
            double r7 = r7 + r16
            r4[r5] = r7
            int r5 = r5 + 1
            r20 = 0
            r22 = 1
            goto L_0x0214
        L_0x023d:
            r6 = r15
        L_0x023e:
            r2 = 0
            r3 = r1[r2]
            r2 = 1
            r4 = r1[r2]
            r2 = 2
            r5 = r1[r2]
            double r7 = defpackage.ahmx.a(r5)
            r2 = 0
        L_0x024d:
            int r9 = r5.length
            if (r2 >= r9) goto L_0x0258
            r9 = r5[r2]
            double r9 = r9 - r7
            r5[r2] = r9
            int r2 = r2 + 1
            goto L_0x024d
        L_0x0258:
            double r7 = defpackage.ahmx.c(r3)
            double r10 = defpackage.ahmx.c(r4)
            double r12 = defpackage.ahmx.c(r5)
            double r7 = r7 + r10
            double r7 = r7 + r12
            float r2 = (float) r7
            r0.a = r2
            float r2 = (float) r10
            r0.s = r2
            float r2 = (float) r12
            r0.c = r2
            if (r33 == 0) goto L_0x027a
            r2 = 1
            r7 = 0
            float r8 = a((boolean) r2, (double[][]) r1, (boolean) r7)
            r0.b = r8
            goto L_0x0282
        L_0x027a:
            r2 = 1
            r7 = 0
            float r8 = a((boolean) r7, (double[][]) r1, (boolean) r2)
            r0.b = r8
        L_0x0282:
            float r2 = b(r5)
            r0.k = r2
            float r2 = b(r4)
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            float r2 = r2 + r7
            float r2 = java.lang.Math.abs(r2)
            r0.l = r2
            int r2 = r4.length
            if (r2 != r9) goto L_0x029a
            r7 = 1
            goto L_0x029b
        L_0x029a:
            r7 = 0
        L_0x029b:
            defpackage.ativ.b(r7)
            int r7 = r2 + 1
            r8 = r23
            if (r8 < r7) goto L_0x02a6
            r7 = 1
            goto L_0x02a7
        L_0x02a6:
            r7 = 0
        L_0x02a7:
            defpackage.ativ.b(r7)
            double[] r7 = new double[r2]
            r8 = 0
        L_0x02ad:
            r9 = 4
            if (r8 >= r9) goto L_0x0380
            r9 = 1
            int r14 = r9 << r8
            double r14 = (double) r14
            r16 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r16
            int r9 = r4.length
            r16 = r6
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r7, r6, r9)
            r6 = r24
            defpackage.ahmx.a((double[]) r7, (double) r14, (double[]) r6)
            double r23 = defpackage.ahmx.b(r7)
            r9 = r3
            r17 = r4
            double r3 = r23 / r10
            float r3 = (float) r3
            float[] r4 = r0.n
            boolean r23 = java.lang.Float.isNaN(r3)
            r24 = 0
            if (r23 != 0) goto L_0x02df
            goto L_0x02e0
        L_0x02df:
            r3 = 0
        L_0x02e0:
            r4[r8] = r3
            float[] r3 = r0.q
            float r4 = a(r7)
            r3[r8] = r4
            int r3 = r5.length
            r4 = 0
            java.lang.System.arraycopy(r5, r4, r7, r4, r3)
            defpackage.ahmx.a((double[]) r7, (double) r14, (double[]) r6)
            double r14 = defpackage.ahmx.b(r7)
            double r14 = r14 / r12
            float r3 = (float) r14
            float[] r14 = r0.m
            boolean r15 = java.lang.Float.isNaN(r3)
            if (r15 != 0) goto L_0x0303
            r24 = r3
            goto L_0x0304
        L_0x0303:
        L_0x0304:
            r14[r8] = r24
            float[] r3 = r0.o
            r14 = 0
            r15 = 0
            r20 = 0
            r23 = 0
        L_0x030e:
            int r4 = r2 + -1
            if (r14 >= r4) goto L_0x033c
            r25 = r7[r14]
            r18 = 0
            int r4 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x031c
            r4 = 0
            goto L_0x031d
        L_0x031c:
            r4 = 1
        L_0x031d:
            int r25 = r14 + 1
            r26 = r7[r25]
            int r28 = (r26 > r18 ? 1 : (r26 == r18 ? 0 : -1))
            r26 = r6
            if (r28 > 0) goto L_0x0329
            r6 = 0
            goto L_0x032a
        L_0x0329:
            r6 = 1
        L_0x032a:
            if (r4 != r6) goto L_0x032d
            goto L_0x0336
        L_0x032d:
            if (r15 == 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r23 = r14
        L_0x0332:
            int r15 = r15 + 1
            r20 = r14
        L_0x0336:
            r14 = r25
            r6 = r26
            r4 = 0
            goto L_0x030e
        L_0x033c:
            r26 = r6
            r18 = 0
            r6 = 1
            if (r15 <= r6) goto L_0x034b
            int r15 = r15 + -1
            float r6 = (float) r15
            int r14 = r20 - r23
            float r14 = (float) r14
            float r6 = r6 / r14
            goto L_0x034e
        L_0x034b:
            float r6 = (float) r15
            float r14 = (float) r4
            float r6 = r6 / r14
        L_0x034e:
            r3[r8] = r6
            float[] r3 = r0.p
            float r6 = a(r7)
            r3[r8] = r6
            r3 = 1
            if (r8 == r3) goto L_0x035c
            goto L_0x0375
        L_0x035c:
            r6 = 0
            r14 = 1
        L_0x035e:
            if (r14 >= r2) goto L_0x0370
            r22 = r7[r14]
            int r15 = r14 + -1
            r27 = r7[r15]
            int r15 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r15 > 0) goto L_0x036b
            goto L_0x036d
        L_0x036b:
            int r6 = r6 + 1
        L_0x036d:
            int r14 = r14 + 1
            goto L_0x035e
        L_0x0370:
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            r0.r = r6
        L_0x0375:
            int r8 = r8 + 1
            r3 = r9
            r6 = r16
            r4 = r17
            r24 = r26
            goto L_0x02ad
        L_0x0380:
            r9 = r3
            r17 = r4
            r16 = r6
            int r2 = r9.length
            double[] r3 = new double[r2]
            r4 = 0
        L_0x0389:
            if (r4 >= r2) goto L_0x0398
            r6 = r9[r4]
            r10 = r17[r4]
            double r6 = java.lang.Math.hypot(r6, r10)
            r3[r4] = r6
            int r4 = r4 + 1
            goto L_0x0389
        L_0x0398:
            java.util.Arrays.sort(r3)
            r6 = 4606641986844732948(0x3fee147ae147ae14, double:0.94)
            double r6 = defpackage.ahmx.a((double) r6, (double[]) r3)
            float r2 = (float) r6
            r0.t = r2
            r6 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r6 = defpackage.ahmx.a((double) r6, (double[]) r3)
            float r2 = (float) r6
            r0.u = r2
            r6 = 4601597955262077993(0x3fdc28f5c28f5c29, double:0.44)
            double r2 = defpackage.ahmx.a((double) r6, (double[]) r3)
            float r2 = (float) r2
            r0.v = r2
            java.util.Arrays.sort(r5)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.d = r2
            r2 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.e = r2
            r2 = 4606551914852185539(0x3fedc28f5c28f5c3, double:0.93)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.f = r2
            r2 = 4593851763903000740(0x3fc0a3d70a3d70a4, double:0.13)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.g = r2
            r2 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.h = r2
            r2 = 4598715651500560876(0x3fd1eb851eb851ec, double:0.28)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.i = r2
            r2 = 4603759683083215831(0x3fe3d70a3d70a3d7, double:0.62)
            double r2 = defpackage.ahmx.a((double) r2, (double[]) r5)
            float r2 = (float) r2
            r0.j = r2
            r0 = 0
            r2 = 2
            r1[r2] = r0
            return r16
        L_0x0415:
            r8 = r3
            r18 = r13
            r2 = 2
            r3 = 1
            r4 = 3
            r7 = 0
            r13 = r9[r12]
            double r13 = r13 / r10
            r9[r12] = r13
            int r12 = r12 + 1
            r3 = r8
            r13 = r18
            r2 = 0
            r4 = 1
            r7 = 3
            r8 = 2
            goto L_0x00c0
        L_0x042c:
            r8 = r3
            r18 = r13
            r2 = 2
            r3 = 1
            r4 = 3
            r7 = 0
            r3 = r8
            r2 = 0
            r4 = 1
            r7 = 3
            r8 = 2
            goto L_0x006e
        L_0x043a:
            r8 = r3
            r18 = r13
            r2 = 2
            r3 = 1
            r4 = 3
            r7 = 0
            r11 = r9[r10]
            r13 = r15[r10]
            double r13 = r13 * r16
            double r11 = r11 - r13
            r9[r10] = r11
            int r10 = r10 + 1
            r3 = r8
            r13 = r18
            r2 = 0
            r4 = 1
            r7 = 3
            r8 = 2
            goto L_0x00a0
        L_0x0455:
            r8 = r3
            r18 = r13
            r2 = 2
            r3 = 1
            r4 = 3
            r7 = 0
            r13 = r9[r10]
            double r13 = r13 / r11
            r15[r10] = r13
            int r10 = r10 + 1
            r3 = r8
            r13 = r18
            r2 = 0
            r4 = 1
            r7 = 3
            r8 = 2
            goto L_0x006c
        L_0x046c:
            r8 = r3
            r2 = 2
            r3 = 1
            r4 = 3
            r7 = 0
            r11 = r1[r10]
            double r11 = defpackage.ahmx.a(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            r3 = r8
            r2 = 0
            r4 = 1
            r7 = 3
            r8 = 2
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmi.a(ahml, double[][], boolean):double[]");
    }
}
