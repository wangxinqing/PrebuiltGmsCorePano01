package defpackage;

/* renamed from: aemt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aemt extends aemn {
    final /* synthetic */ aemu a;

    public aemt(aemu aemu) {
        this.a = aemu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0152, code lost:
        if (defpackage.aemr.a(r19, r3.i, r3.j) != false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017b A[LOOP:2: B:41:0x0175->B:43:0x017b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r34) {
        /*
            r33 = this;
            r0 = r33
            aemu r1 = r0.a
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r34 / r2
            r4 = 0
            r1.e = r4
            long r5 = r1.d
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r5 = r2
        L_0x0016:
            long r5 = r2 - r5
            double r5 = (double) r5
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            r1.d = r2
            int r2 = r1.c
            if (r2 == 0) goto L_0x01be
            r2 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r5 = r2
        L_0x0033:
            java.util.concurrent.CopyOnWriteArrayList r2 = r1.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ba
            java.lang.Object r3 = r2.next()
            aemr r3 = (defpackage.aemr) r3
            ou r7 = r1.b
            java.lang.Object r7 = r7.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x01b3
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01ac
            boolean r7 = r3.a()
            if (r7 != 0) goto L_0x005c
            goto L_0x0066
        L_0x005c:
            boolean r8 = r3.k
            if (r8 == 0) goto L_0x0066
            r18 = r1
            r16 = r5
            goto L_0x0189
        L_0x0066:
            double r8 = r3.m
            double r8 = r8 + r5
            r3.m = r8
            double r8 = r3.f
            double r10 = r3.g
            double r12 = r3.h
            double r14 = r3.d
            r16 = r5
            double r4 = r3.e
        L_0x0077:
            r35 = r7
            double r6 = r3.m
            r18 = r1
            r0 = 0
            r19 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r21 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x011d
            r4 = -4661117527937406468(0xbf50624dd2f1a9fc, double:-0.001)
            double r6 = r6 + r4
            r3.m = r6
            double r4 = r3.a
            double r4 = r3.j
            double r6 = r3.b
            double r6 = r4 - r8
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 * r12
            r14 = 4625759767262920704(0x4032000000000000, double:18.0)
            double r21 = r10 * r14
            double r6 = r6 - r21
            double r21 = r6 * r19
            r23 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r21 = r21 * r23
            double r21 = r10 + r21
            double r25 = r10 * r19
            double r25 = r25 * r23
            double r25 = r8 + r25
            double r25 = r4 - r25
            double r25 = r25 * r12
            double r27 = r21 * r14
            double r25 = r25 - r27
            double r27 = r25 * r19
            double r27 = r27 * r23
            double r27 = r10 + r27
            double r29 = r21 * r19
            double r29 = r29 * r23
            double r29 = r8 + r29
            double r23 = r4 - r29
            double r23 = r23 * r12
            double r29 = r27 * r14
            double r23 = r23 - r29
            double r29 = r27 * r19
            double r29 = r8 + r29
            double r31 = r23 * r19
            double r31 = r10 + r31
            double r21 = r21 + r27
            double r25 = r25 + r23
            double r21 = r21 + r21
            double r21 = r10 + r21
            double r21 = r21 + r31
            r23 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r21 = r21 / r23
            double r21 = r21 * r19
            double r27 = r8 + r21
            double r25 = r25 + r25
            double r6 = r6 + r25
            double r21 = r4 - r29
            double r21 = r21 * r12
            double r31 = r31 * r14
            double r21 = r21 - r31
            double r6 = r6 + r21
            double r6 = r6 / r23
            double r6 = r6 * r19
            double r6 = r6 + r10
            boolean r12 = r3.l
            if (r12 != 0) goto L_0x00fe
            goto L_0x010e
        L_0x00fe:
            double r12 = r3.i
            r21 = r27
            r23 = r12
            r25 = r4
            boolean r4 = defpackage.aemr.a(r21, r23, r25)
            if (r4 == 0) goto L_0x010e
            r3.m = r0
        L_0x010e:
            r0 = r33
            r14 = r8
            r4 = r10
            r1 = r18
            r8 = r27
            r12 = r29
            r10 = r6
            r7 = r35
            goto L_0x0077
        L_0x011d:
            r3.h = r12
            r3.f = r8
            r3.g = r10
            r3.d = r14
            r3.e = r4
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x013e
            double r6 = r6 / r19
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 - r6
            double r8 = r8 * r6
            double r14 = r14 * r12
            double r8 = r8 + r14
            r3.f = r8
            double r10 = r10 * r6
            double r4 = r4 * r12
            double r10 = r10 + r4
            r3.g = r10
        L_0x013e:
            r19 = r8
            boolean r4 = r3.l
            if (r4 == 0) goto L_0x0155
            double r4 = r3.a
            double r4 = r3.i
            double r6 = r3.j
            r21 = r4
            r23 = r6
            boolean r4 = defpackage.aemr.a(r19, r21, r23)
            if (r4 == 0) goto L_0x0155
            goto L_0x015e
        L_0x0155:
            boolean r4 = r3.a()
            if (r4 != 0) goto L_0x015e
            r7 = r35
            goto L_0x016b
        L_0x015e:
            double r4 = r3.a
            double r4 = r3.j
            r3.i = r4
            r3.f = r4
            r3.g = r0
            r3.m = r0
            r7 = 1
        L_0x016b:
            boolean r0 = r3.k
            r3.k = r7
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0175:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0187
            java.lang.Object r1 = r0.next()
            aemv r1 = (defpackage.aemv) r1
            double r4 = r3.f
            r1.a((double) r4)
            goto L_0x0175
        L_0x0187:
            if (r7 == 0) goto L_0x01a2
        L_0x0189:
            r0 = r18
            ou r1 = r0.b
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r5)
            int r1 = r0.c
            int r1 = r1 + -1
            r0.c = r1
            r1 = r0
            r5 = r16
            r0 = r33
            goto L_0x0039
        L_0x01a2:
            r0 = r18
            r4 = 0
            r1 = r0
            r5 = r16
            r0 = r33
            goto L_0x0039
        L_0x01ac:
            r0 = r1
            r16 = r5
            r0 = r33
            goto L_0x0039
        L_0x01b3:
            r0 = r1
            r16 = r5
            r0 = r33
            goto L_0x0039
        L_0x01ba:
            r0 = r1
            r0.c()
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemt.a(long):void");
    }
}
