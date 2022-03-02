package defpackage;

/* renamed from: aklw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklw {
    private static final int[] a = {14, 11};

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.HashSet, java.util.Collection, java.util.Set] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(defpackage.aklr r27, int r28) {
        /*
            r0 = r27
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 160(0xa0, float:2.24E-43)
            r1.<init>(r2)
            r2 = 15
            int r3 = r28 + 15
            int r4 = r0.a
            double r13 = defpackage.aell.a((int) r4)
            int r4 = r0.b
            double r15 = defpackage.aell.a((int) r4)
            int r4 = r0.a
            int r0 = r0.b
            long r4 = defpackage.aema.a((int) r4, (int) r0)
            long r4 = defpackage.aema.a((long) r4, (int) r2)
            r0 = 8
            long[] r6 = new long[r0]
            defpackage.aema.a((long) r4, (int) r2, (long[]) r6)
            r2 = 36
            long[] r7 = new long[r2]
            r17 = 0
            r8 = 0
        L_0x0033:
            r11 = 4
            if (r8 >= r11) goto L_0x003f
            long r9 = defpackage.aema.b((long) r4, (int) r8)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0033
        L_0x003f:
            r4 = 0
        L_0x0040:
            r18 = 0
            if (r4 < r0) goto L_0x0045
            goto L_0x0060
        L_0x0045:
            r8 = r6[r4]
            int r5 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x0060
            r5 = 0
        L_0x004c:
            if (r5 >= r11) goto L_0x005d
            int r8 = r4 * 4
            int r8 = r8 + r11
            int r8 = r8 + r5
            r9 = r6[r4]
            long r9 = defpackage.aema.b((long) r9, (int) r5)
            r7[r8] = r9
            int r5 = r5 + 1
            goto L_0x004c
        L_0x005d:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x0060:
            r0 = 144(0x90, float:2.02E-43)
            long[] r4 = new long[r0]
            r5 = 0
        L_0x0066:
            if (r5 < r2) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            r8 = r7[r5]
            int r6 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0083
            r6 = 0
        L_0x0070:
            if (r6 >= r11) goto L_0x0080
            int r8 = r5 * 4
            int r8 = r8 + r6
            r9 = r7[r5]
            long r9 = defpackage.aema.b((long) r9, (int) r6)
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x0070
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x0083:
            r2 = 2
            double[] r2 = new double[r2]
            r12 = 0
        L_0x0087:
            if (r12 < r0) goto L_0x008a
            goto L_0x00cd
        L_0x008a:
            r5 = r4[r12]
            int r7 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x00cd
            r9 = 0
        L_0x0091:
            if (r9 >= r11) goto L_0x00c5
            r5 = r4[r12]
            long r7 = defpackage.aema.b((long) r5, (int) r9)
            defpackage.aema.b((long) r7, (double[]) r2)
            r20 = r2[r17]
            r5 = 1
            r22 = r2[r5]
            r5 = r13
            r24 = r7
            r7 = r15
            r26 = r9
            r9 = r20
            r20 = r12
            r21 = 4
            r11 = r22
            double r5 = defpackage.aell.a((double) r5, (double) r7, (double) r9, (double) r11)
            double r7 = (double) r3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00bf
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            r1.add(r5)
        L_0x00bf:
            int r9 = r26 + 1
            r12 = r20
            r11 = 4
            goto L_0x0091
        L_0x00c5:
            r20 = r12
            r21 = 4
            int r12 = r20 + 1
            r11 = 4
            goto L_0x0087
        L_0x00cd:
            int[] r0 = a
            int r2 = r0.length
            r4 = r1
            r3 = 0
        L_0x00d2:
            if (r3 >= r2) goto L_0x0102
            r5 = r0[r3]
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00df:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00fb
            java.lang.Object r7 = r4.next()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r7 = defpackage.aema.a((long) r7, (int) r5)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.add(r7)
            goto L_0x00df
        L_0x00fb:
            r1.addAll(r6)
            int r3 = r3 + 1
            r4 = r6
            goto L_0x00d2
        L_0x0102:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.a(aklr, int):java.util.List");
    }
}
