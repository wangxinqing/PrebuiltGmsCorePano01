package defpackage;

/* renamed from: bam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bam {
    private static final bar a = bar.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final bar b = bar.a("n", "v");

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.ayr a(defpackage.bat r18, defpackage.auk r19) {
        /*
            r0 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0011:
            boolean r13 = r18.e()
            if (r13 == 0) goto L_0x00ff
            bar r13 = a
            int r13 = r0.a((defpackage.bar) r13)
            switch(r13) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00b6;
                case 8: goto L_0x0025;
                default: goto L_0x0020;
            }
        L_0x0020:
            r1 = 0
            r18.l()
            goto L_0x0011
        L_0x0025:
            r18.a()
        L_0x0028:
            boolean r13 = r18.e()
            r15 = 1
            if (r13 == 0) goto L_0x00a0
            r18.c()
            r13 = 0
            r16 = 0
        L_0x0035:
            boolean r17 = r18.e()
            if (r17 == 0) goto L_0x0056
            bar r2 = b
            int r2 = r0.a((defpackage.bar) r2)
            if (r2 == 0) goto L_0x0051
            if (r2 == r15) goto L_0x004c
            r18.g()
            r18.l()
            goto L_0x0035
        L_0x004c:
            axo r13 = defpackage.azk.a(r18, r19)
            goto L_0x0035
        L_0x0051:
            java.lang.String r16 = r18.h()
            goto L_0x0035
        L_0x0056:
            r18.d()
            int r2 = r16.hashCode()
            r14 = 100
            r1 = 2
            if (r2 == r14) goto L_0x0083
            r14 = 103(0x67, float:1.44E-43)
            if (r2 == r14) goto L_0x0077
            r14 = 111(0x6f, float:1.56E-43)
            if (r2 == r14) goto L_0x006b
            goto L_0x008f
        L_0x006b:
            java.lang.String r2 = "o"
            r14 = r16
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008f
            r2 = 0
            goto L_0x0090
        L_0x0077:
            r14 = r16
            java.lang.String r2 = "g"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008f
            r2 = 2
            goto L_0x0090
        L_0x0083:
            r14 = r16
            java.lang.String r2 = "d"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008f
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = -1
        L_0x0090:
            if (r2 == 0) goto L_0x009e
            if (r2 == r15) goto L_0x0097
            if (r2 == r1) goto L_0x0097
            goto L_0x0028
        L_0x0097:
            r19.c()
            r3.add(r13)
            goto L_0x0028
        L_0x009e:
            r5 = r13
            goto L_0x0028
        L_0x00a0:
            r18.b()
            int r1 = r3.size()
            if (r1 != r15) goto L_0x00b3
            r1 = 0
            java.lang.Object r2 = r3.get(r1)
            r3.add(r2)
            goto L_0x0011
        L_0x00b3:
            r1 = 0
            goto L_0x0011
        L_0x00b6:
            r1 = 0
            boolean r12 = r18.i()
            goto L_0x0011
        L_0x00bd:
            r1 = 0
            double r13 = r18.j()
            float r11 = (float) r13
            goto L_0x0011
        L_0x00c5:
            r1 = 0
            int[] r2 = defpackage.ayq.a()
            int r10 = r18.k()
            r13 = -1
            int r10 = r10 + r13
            r10 = r2[r10]
            goto L_0x0011
        L_0x00d4:
            r1 = 0
            r13 = -1
            int[] r2 = defpackage.ayp.a()
            int r9 = r18.k()
            int r9 = r9 + r13
            r9 = r2[r9]
            goto L_0x0011
        L_0x00e3:
            r1 = 0
            axq r7 = defpackage.azk.b(r18, r19)
            goto L_0x0011
        L_0x00ea:
            r1 = 0
            axo r8 = defpackage.azk.a(r18, r19)
            goto L_0x0011
        L_0x00f1:
            r1 = 0
            axn r6 = defpackage.azk.e(r18, r19)
            goto L_0x0011
        L_0x00f8:
            r1 = 0
            java.lang.String r4 = r18.h()
            goto L_0x0011
        L_0x00ff:
            ayr r13 = new ayr
            r0 = r13
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bam.a(bat, auk):ayr");
    }
}
