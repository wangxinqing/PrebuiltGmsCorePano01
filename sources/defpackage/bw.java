package defpackage;

/* renamed from: bw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bw implements Runnable {
    final /* synthetic */ ct a;
    final /* synthetic */ ct b;
    final /* synthetic */ int c;
    final /* synthetic */ ct d;
    final /* synthetic */ bx e;

    public bw(bx bxVar, ct ctVar, ct ctVar2, int i, ct ctVar3) {
        this.e = bxVar;
        this.a = ctVar;
        this.b = ctVar2;
        this.c = i;
        this.d = ctVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ad, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ae, code lost:
        if (r15 > r4) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b0, code lost:
        r19 = r3;
        r3 = r15 + r13;
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b8, code lost:
        if (r3 != (r4 + r13)) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        if (r3 != (r14 + r13)) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c4, code lost:
        r6 = r5 + r3;
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d2, code lost:
        if (r1[r6 - 1] >= r1[r6 + 1]) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d4, code lost:
        r6 = r1[(r5 + r3) - 1];
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dc, code lost:
        r6 = r1[(r5 + r3) + 1] - 1;
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e5, code lost:
        r21 = r6 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        if (r6 > 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e9, code lost:
        r25 = r11;
        r24 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ee, code lost:
        if (r21 <= 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        r24 = r13;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0100, code lost:
        if (r2.b((r8 + r6) - 1, (r11 + r21) - 1) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0102, code lost:
        r6 = r6 - 1;
        r21 = r21 - 1;
        r13 = r24;
        r11 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010b, code lost:
        r25 = r11;
        r24 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010f, code lost:
        r11 = r5 + r3;
        r1[r11] = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        if (r0 == 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0116, code lost:
        if (r3 < r14) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0118, code lost:
        if (r3 > r4) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        if (r2[r11] < r6) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011e, code lost:
        r13 = new defpackage.vm();
        r0 = r1[r11];
        r13.a = r0;
        r13.b = r0 - r3;
        r13.c = r2[r11] - r0;
        r13.d = r7;
        r13.e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0137, code lost:
        r15 = r15 + 2;
        r3 = r19;
        r6 = r20;
        r7 = r22;
        r13 = r24;
        r11 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0145, code lost:
        r19 = r3;
        r20 = r6;
        r22 = r7;
        r25 = r11;
        r24 = r13;
        r4 = r4 + 1;
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0172, code lost:
        if (r2[r3 - 1] < r2[r3 + 1]) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cc A[LOOP:2: B:10:0x00ab->B:64:0x01cc, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            ct r1 = r0.a
            cw r3 = r1.l
            ct r1 = r0.b
            cw r5 = r1.l
            bx r1 = r0.e
            vb r1 = r1.b
            vj r1 = r1.b
            int r4 = r3.a()
            int r1 = r5.a()
            int r2 = r3.size()
            int r6 = r3.b()
            int r7 = r5.size()
            int r8 = r5.b()
            cx r9 = new cx
            int r2 = r2 - r4
            int r6 = r2 - r6
            int r7 = r7 - r1
            int r7 = r7 - r8
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            int r1 = r9.d
            int r2 = r9.e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            vl r5 = new vl
            r5.<init>(r1, r2)
            r4.add(r5)
            int r5 = r1 + r2
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r5 = r5 + r1
            int r1 = r5 + r5
            int[] r2 = new int[r1]
            int[] r1 = new int[r1]
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x005c:
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x029c
            int r7 = r4.size()
            int r7 = r7 + -1
            java.lang.Object r7 = r4.remove(r7)
            vl r7 = (defpackage.vl) r7
            int r8 = r7.a
            int r10 = r7.b
            int r11 = r7.c
            int r10 = r10 - r8
            int r12 = r7.d
            int r12 = r12 - r11
            r13 = 0
            r14 = 1
            if (r10 > 0) goto L_0x0086
            r19 = r3
            r17 = r4
            r20 = r6
            r22 = r7
            goto L_0x01ea
        L_0x0086:
            if (r12 <= 0) goto L_0x01e2
            int r13 = r10 - r12
            int r15 = r10 + r12
            int r15 = r15 + r14
            int r15 = r15 / 2
            int r16 = r5 - r15
            int r0 = r16 + -1
            int r16 = r5 + r15
            r17 = r4
            int r4 = r16 + 1
            r14 = 0
            java.util.Arrays.fill(r2, r0, r4, r14)
            int r0 = r0 + r13
            int r4 = r4 + r13
            java.util.Arrays.fill(r1, r0, r4, r10)
            int r0 = r13 % 2
            r4 = 0
        L_0x00a5:
            if (r4 > r15) goto L_0x01da
            int r14 = -r4
            r18 = r15
            r15 = r14
        L_0x00ab:
            if (r15 <= r4) goto L_0x0156
            r15 = r14
        L_0x00ae:
            if (r15 > r4) goto L_0x0145
            r19 = r3
            int r3 = r15 + r13
            r20 = r6
            int r6 = r4 + r13
            if (r3 != r6) goto L_0x00bd
            r22 = r7
            goto L_0x00d4
        L_0x00bd:
            int r6 = r14 + r13
            if (r3 != r6) goto L_0x00c4
            r22 = r7
            goto L_0x00dc
        L_0x00c4:
            int r6 = r5 + r3
            int r21 = r6 + -1
            r22 = r7
            r7 = r1[r21]
            r16 = 1
            int r6 = r6 + 1
            r6 = r1[r6]
            if (r7 >= r6) goto L_0x00dc
        L_0x00d4:
            int r6 = r5 + r3
            int r6 = r6 + -1
            r6 = r1[r6]
            r7 = 0
            goto L_0x00e5
        L_0x00dc:
            int r6 = r5 + r3
            r7 = 1
            int r6 = r6 + r7
            r6 = r1[r6]
            int r6 = r6 + -1
            r7 = 1
        L_0x00e5:
            int r21 = r6 - r3
        L_0x00e7:
            if (r6 > 0) goto L_0x00ee
            r25 = r11
            r24 = r13
            goto L_0x010f
        L_0x00ee:
            if (r21 <= 0) goto L_0x010b
            int r23 = r8 + r6
            r24 = r13
            int r13 = r23 + -1
            int r23 = r11 + r21
            r25 = r11
            int r11 = r23 + -1
            boolean r11 = r9.b(r13, r11)
            if (r11 == 0) goto L_0x010f
            int r6 = r6 + -1
            int r21 = r21 + -1
            r13 = r24
            r11 = r25
            goto L_0x00e7
        L_0x010b:
            r25 = r11
            r24 = r13
        L_0x010f:
            int r11 = r5 + r3
            r1[r11] = r6
            if (r0 == 0) goto L_0x0116
        L_0x0115:
            goto L_0x0137
        L_0x0116:
            if (r3 < r14) goto L_0x0115
            if (r3 > r4) goto L_0x0115
            r13 = r2[r11]
            if (r13 < r6) goto L_0x0137
            vm r13 = new vm
            r13.<init>()
            r0 = r1[r11]
            r13.a = r0
            int r3 = r0 - r3
            r13.b = r3
            r3 = r2[r11]
            int r3 = r3 - r0
            r13.c = r3
            r13.d = r7
            r0 = 1
            r13.e = r0
            goto L_0x01ea
        L_0x0137:
            int r15 = r15 + 2
            r3 = r19
            r6 = r20
            r7 = r22
            r13 = r24
            r11 = r25
            goto L_0x00ae
        L_0x0145:
            r19 = r3
            r20 = r6
            r22 = r7
            r25 = r11
            r24 = r13
            int r4 = r4 + 1
            r15 = r18
            r14 = 0
            goto L_0x00a5
        L_0x0156:
            r19 = r3
            r20 = r6
            r22 = r7
            r25 = r11
            r24 = r13
            if (r15 != r14) goto L_0x0164
            r7 = 1
            goto L_0x0174
        L_0x0164:
            if (r15 != r4) goto L_0x0168
            r7 = 1
            goto L_0x017b
        L_0x0168:
            int r3 = r5 + r15
            int r6 = r3 + -1
            r6 = r2[r6]
            r7 = 1
            int r3 = r3 + r7
            r3 = r2[r3]
            if (r6 >= r3) goto L_0x017b
        L_0x0174:
            int r3 = r5 + r15
            int r3 = r3 + r7
            r3 = r2[r3]
            r6 = 0
            goto L_0x0183
        L_0x017b:
            int r3 = r5 + r15
            int r3 = r3 + -1
            r3 = r2[r3]
            int r3 = r3 + r7
            r6 = 1
        L_0x0183:
            int r7 = r3 - r15
        L_0x0185:
            if (r3 < r10) goto L_0x0188
            goto L_0x0199
        L_0x0188:
            if (r7 >= r12) goto L_0x0199
            int r11 = r8 + r3
            int r13 = r25 + r7
            boolean r11 = r9.b(r11, r13)
            if (r11 == 0) goto L_0x0199
            int r3 = r3 + 1
            int r7 = r7 + 1
            goto L_0x0185
        L_0x0199:
            int r7 = r5 + r15
            r2[r7] = r3
            if (r0 != 0) goto L_0x01a1
            r3 = 0
            goto L_0x01cc
        L_0x01a1:
            int r13 = r24 - r4
            r11 = 1
            int r13 = r13 + r11
            if (r15 < r13) goto L_0x01cb
            int r13 = r24 + r4
            int r13 = r13 + -1
            if (r15 > r13) goto L_0x01cb
            r11 = r1[r7]
            if (r3 < r11) goto L_0x01c9
            vm r13 = new vm
            r13.<init>()
            r0 = r1[r7]
            r13.a = r0
            int r3 = r0 - r15
            r13.b = r3
            r3 = r2[r7]
            int r3 = r3 - r0
            r13.c = r3
            r13.d = r6
            r3 = 0
            r13.e = r3
            goto L_0x01ea
        L_0x01c9:
            r3 = 0
            goto L_0x01cc
        L_0x01cb:
            r3 = 0
        L_0x01cc:
            int r15 = r15 + 2
            r3 = r19
            r6 = r20
            r7 = r22
            r13 = r24
            r11 = r25
            goto L_0x00ab
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            r19 = r3
            r17 = r4
            r20 = r6
            r22 = r7
        L_0x01ea:
            if (r13 != 0) goto L_0x01fc
            r0 = r20
            r7 = r22
            r0.add(r7)
            r6 = r0
            r4 = r17
            r3 = r19
            r0 = r26
            goto L_0x005c
        L_0x01fc:
            r0 = r20
            r7 = r22
            int r3 = r13.c
            if (r3 > 0) goto L_0x0207
            r3 = r19
            goto L_0x020c
        L_0x0207:
            r3 = r19
            r3.add(r13)
        L_0x020c:
            int r4 = r13.a
            int r6 = r7.a
            int r4 = r4 + r6
            r13.a = r4
            int r4 = r13.b
            int r6 = r7.c
            int r4 = r4 + r6
            r13.b = r4
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0226
            vl r4 = new vl
            r4.<init>()
            goto L_0x0232
        L_0x0226:
            int r4 = r0.size()
            int r4 = r4 + -1
            java.lang.Object r4 = r0.remove(r4)
            vl r4 = (defpackage.vl) r4
        L_0x0232:
            int r6 = r7.a
            r4.a = r6
            int r6 = r7.c
            r4.c = r6
            boolean r6 = r13.e
            if (r6 == 0) goto L_0x0247
            int r6 = r13.a
            r4.b = r6
            int r6 = r13.b
            r4.d = r6
            goto L_0x025e
        L_0x0247:
            boolean r6 = r13.d
            if (r6 == 0) goto L_0x0254
            int r6 = r13.a
            int r6 = r6 + -1
            r4.b = r6
            int r6 = r13.b
            goto L_0x025c
        L_0x0254:
            int r6 = r13.a
            r4.b = r6
            int r6 = r13.b
            int r6 = r6 + -1
        L_0x025c:
            r4.d = r6
        L_0x025e:
            r6 = r17
            r6.add(r4)
            boolean r4 = r13.e
            if (r4 != 0) goto L_0x0274
            int r4 = r13.a
            int r8 = r13.c
            int r4 = r4 + r8
            r7.a = r4
            int r4 = r13.b
            int r4 = r4 + r8
            r7.c = r4
            goto L_0x0293
        L_0x0274:
            boolean r4 = r13.d
            if (r4 == 0) goto L_0x0285
            int r4 = r13.a
            int r8 = r13.c
            int r4 = r4 + r8
            r10 = 1
            int r4 = r4 + r10
            r7.a = r4
            int r4 = r13.b
            int r4 = r4 + r8
            goto L_0x0291
        L_0x0285:
            int r4 = r13.a
            int r8 = r13.c
            int r4 = r4 + r8
            r7.a = r4
            int r4 = r13.b
            int r4 = r4 + r8
            r8 = 1
            int r4 = r4 + r8
        L_0x0291:
            r7.c = r4
        L_0x0293:
            r6.add(r7)
            r4 = r6
            r6 = r0
            r0 = r26
            goto L_0x005c
        L_0x029c:
            java.util.Comparator r0 = defpackage.vn.a
            java.util.Collections.sort(r3, r0)
            vi r0 = new vi
            r0.<init>(r9, r3, r2, r1)
            r1 = r26
            bx r2 = r1.e
            java.util.concurrent.Executor r2 = r2.c
            bv r3 = new bv
            r3.<init>(r1, r0)
            r2.execute(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.run():void");
    }
}
