package defpackage;

/* renamed from: cdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdc implements Runnable {
    final /* synthetic */ cdg a;

    public cdc(cdg cdg) {
        this.a = cdg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        if (r1.F >= 0.25f) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            cdg r1 = r0.a
            long r2 = r1.G
            jiq r4 = defpackage.cbi.i()
            long r4 = r4.a()
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            boolean r8 = r1.z
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            int r8 = r1.A
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r7[r10] = r8
            long r11 = r1.D
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r11 = 2
            r7[r11] = r8
            long r12 = r1.E
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r12 = 3
            r7[r12] = r8
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            r7[r9] = r8
            long r13 = r1.C
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r7[r10] = r8
            float r8 = r1.F
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7[r11] = r8
            boolean r7 = r1.b((int) r10)
            r8 = 50
            r14 = 100
            r15 = 10
            if (r7 != 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            int r7 = r1.A
            if (r7 != r11) goto L_0x0062
        L_0x005e:
            r8 = 100
            goto L_0x0163
        L_0x0062:
            if (r7 != r6) goto L_0x0065
            goto L_0x005e
        L_0x0065:
            if (r7 != r12) goto L_0x0068
            goto L_0x005e
        L_0x0068:
            boolean r7 = r1.z
            r16 = -1
            r14 = 16
            if (r7 == 0) goto L_0x011f
            boolean r6 = r1.b((int) r6)
            if (r6 == 0) goto L_0x009a
            long r6 = r1.D
            long r6 = r4 - r6
            long r18 = defpackage.awuz.i()
            int r20 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r20 > 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            long r6 = r1.D
            int r18 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x008a
            goto L_0x009a
        L_0x008a:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = defpackage.awuz.i()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r9] = r5
            r8 = 10
            goto L_0x0163
        L_0x009a:
            r6 = 8
            boolean r6 = r1.b((int) r6)
            if (r6 == 0) goto L_0x00c6
            jiq r6 = defpackage.cbi.i()
            long r6 = r6.b()
            long r12 = r1.E
            long r6 = r6 - r12
            long r12 = defpackage.awuz.k()
            int r16 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x00b6
            goto L_0x00c6
        L_0x00b6:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = defpackage.awuz.k()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r9] = r5
            r8 = 10
            goto L_0x0163
        L_0x00c6:
            boolean r6 = r1.b((int) r11)
            if (r6 == 0) goto L_0x010f
            long r6 = r1.C
            long r6 = r6 - r4
            long r12 = defpackage.awuz.g()
            r16 = 0
            int r20 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r20 > 0) goto L_0x00f1
            long r6 = r1.C
            long r6 = r6 - r4
            int r12 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f1
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = defpackage.awuz.g()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r9] = r5
            r8 = 90
            goto L_0x0163
        L_0x00f1:
            long r6 = r1.B
            int r12 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x010f
            long r6 = r6 - r4
            long r4 = defpackage.awuz.h()
            long r4 = -r4
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0102
            goto L_0x010f
        L_0x0102:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = defpackage.awuz.h()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r9] = r5
            goto L_0x0163
        L_0x010f:
            boolean r4 = r1.b((int) r14)
            if (r4 == 0) goto L_0x015a
            float r4 = r1.F
            r5 = 1048576000(0x3e800000, float:0.25)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0161
            goto L_0x0163
        L_0x011f:
            boolean r6 = r1.b((int) r6)
            if (r6 == 0) goto L_0x0148
            long r6 = r1.D
            long r4 = r4 - r6
            long r6 = defpackage.awuz.j()
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 > 0) goto L_0x0132
            goto L_0x0139
        L_0x0132:
            long r4 = r1.D
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0139
            goto L_0x0148
        L_0x0139:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = defpackage.awuz.j()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r9] = r5
            r8 = 10
            goto L_0x0163
        L_0x0148:
            boolean r4 = r1.b((int) r14)
            if (r4 == 0) goto L_0x015a
            float r4 = r1.F
            r5 = 1048576000(0x3e800000, float:0.25)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0163
            r8 = 10
            goto L_0x0163
        L_0x015a:
            boolean r4 = r1.z
            if (r4 != 0) goto L_0x0161
            r8 = 10
            goto L_0x0163
        L_0x0161:
            r8 = 90
        L_0x0163:
            int r4 = r1.I
            if (r4 == r8) goto L_0x0168
            goto L_0x016f
        L_0x0168:
            atrw r4 = r1.J
            atrw r5 = r1.K
            if (r4 != r5) goto L_0x016f
            return
        L_0x016f:
            r1.I = r8
            atrx r4 = defpackage.atrx.d
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            r4.c()
            r4.c = r9
        L_0x0181:
            aucj r5 = r4.b
            atrx r5 = (defpackage.atrx) r5
            int r6 = r5.a
            r6 = r6 | r10
            r5.a = r6
            r5.b = r8
            atrw r7 = r1.K
            int r7 = r7.d
            r5.c = r7
            r6 = r6 | r11
            r5.a = r6
            aucj r4 = r4.i()
            atrx r4 = (defpackage.atrx) r4
            jti r5 = new jti
            r6 = 59
            r5.<init>(r10, r6, r11)
            jut r2 = defpackage.jut.a(r2)
            r5.a((defpackage.jut) r2)
            auci r2 = defpackage.atrx.e
            r5.a(r2, r4)
            com.google.android.gms.contextmanager.ContextData r2 = r5.a()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            int r5 = r4.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r9] = r5
            int r4 = r4.c
            atrw r4 = defpackage.atrw.a(r4)
            if (r4 != 0) goto L_0x01c6
            atrw r4 = defpackage.atrw.UNKNOWN_STATE
        L_0x01c6:
            r3[r10] = r4
            r1.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdc.run():void");
    }
}
