package defpackage;

/* renamed from: nox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nox extends npc {
    public final mbd a;
    private final npa c;
    private final noa d;
    private final bhs e;

    public nox(npa npa, mbd mbd, noa noa, bhs bhs) {
        this.c = npa;
        this.a = mbd;
        this.d = noa;
        this.e = bhs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        if ((r0.getCause() instanceof defpackage.auda) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if ((r0.getCause() instanceof defpackage.auda) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        throw new defpackage.auda(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107 A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:8:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r29, defpackage.nqf r30) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            long r2 = java.lang.System.currentTimeMillis()
            nps r4 = new nps
            bhs r5 = r1.e
            r4.<init>(r0, r5)
            npr r5 = r4.a()
            r6 = 0
            if (r5 == 0) goto L_0x001c
            bhu r5 = r5.a
            java.lang.String r5 = r5.b
            r11 = r5
            goto L_0x001d
        L_0x001c:
            r11 = r6
        L_0x001d:
            npa r5 = r1.c
            bhs r12 = r1.e
            long r13 = java.lang.System.currentTimeMillis()
            aoru r7 = r5.a
            noy r8 = new noy
            r8.<init>(r0)
            aorr r0 = r7.b(r8)
            noz r15 = new noz
            r7 = r15
            r8 = r5
            r9 = r13
            r7.<init>(r8, r9, r11, r12)
            aoru r7 = r5.a
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.amqy) r15, (java.util.concurrent.Executor) r7)
            r7 = 4
            r8 = 0
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0119, InterruptedException -> 0x0117 }
            r18 = r0
            byte[] r18 = (byte[]) r18     // Catch:{ ExecutionException -> 0x0119, InterruptedException -> 0x0117 }
            noa r0 = r5.c     // Catch:{ ExecutionException -> 0x0119, InterruptedException -> 0x0117 }
            r9 = 5006(0x138e, float:7.015E-42)
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ ExecutionException -> 0x0119, InterruptedException -> 0x0117 }
            long r10 = r10 - r13
            r0.a(r9, r10)     // Catch:{ ExecutionException -> 0x0119, InterruptedException -> 0x0117 }
            long r9 = java.lang.System.currentTimeMillis()
            com.android.volley.toolbox.RequestFuture r0 = com.android.volley.toolbox.RequestFuture.newFuture()
            izs r11 = new izs
            axjj r12 = defpackage.axjj.a
            axjk r12 = r12.a()
            java.lang.String r17 = r12.a()
            lye r19 = defpackage.lye.c
            java.util.HashMap r25 = new java.util.HashMap
            r25.<init>()
            r16 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 21760(0x5500, float:3.0492E-41)
            r27 = -1
            r15 = r11
            r20 = r0
            r21 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.android.volley.RequestQueue r12 = r5.b
            r12.add(r11)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            lye r0 = (defpackage.lye) r0     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            if (r0 == 0) goto L_0x00f8
            noa r11 = r5.c     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            r12 = 5007(0x138f, float:7.016E-42)
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            long r13 = r13 - r9
            r11.a(r12, r13)     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            auay r0 = r0.a     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            aubs r11 = defpackage.aubs.c()     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            lyg r12 = defpackage.lyg.j     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            java.lang.Object r12 = r12.c(r7)     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            aucj r12 = (defpackage.aucj) r12     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            aueh r13 = defpackage.aueh.a     // Catch:{ IOException -> 0x00dc, RuntimeException -> 0x00cb }
            aueq r13 = r13.a((java.lang.Object) r12)     // Catch:{ IOException -> 0x00dc, RuntimeException -> 0x00cb }
            aubd r14 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x00dc, RuntimeException -> 0x00cb }
            r13.a(r12, r14, r11)     // Catch:{ IOException -> 0x00dc, RuntimeException -> 0x00cb }
            r13.d(r12)     // Catch:{ IOException -> 0x00dc, RuntimeException -> 0x00cb }
            r0.a((int) r8)     // Catch:{ auda -> 0x00c8, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            defpackage.aucj.b((defpackage.aucj) r12)     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            lyg r12 = (defpackage.lyg) r12     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            r6 = r12
            goto L_0x0126
        L_0x00c8:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
        L_0x00cb:
            r0 = move-exception
            java.lang.Throwable r11 = r0.getCause()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            boolean r11 = r11 instanceof defpackage.auda     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            if (r11 == 0) goto L_0x00db
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            throw r0     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
        L_0x00db:
            throw r0     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
        L_0x00dc:
            r0 = move-exception
            java.lang.Throwable r11 = r0.getCause()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            boolean r11 = r11 instanceof defpackage.auda     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            if (r11 != 0) goto L_0x00ef
            auda r11 = new auda     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            r11.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            throw r11     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
        L_0x00ef:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
            throw r0     // Catch:{ auda -> 0x00f6, InterruptedException -> 0x0109, ExecutionException -> 0x0107 }
        L_0x00f6:
            r0 = move-exception
            throw r0     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
        L_0x00f8:
            noa r0 = r5.c     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            r11 = 4006(0xfa6, float:5.614E-42)
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            long r12 = r12 - r9
            r0.a(r11, r12)     // Catch:{ InterruptedException -> 0x0109, ExecutionException -> 0x0107, auda -> 0x0105 }
            goto L_0x0126
        L_0x0105:
            r0 = move-exception
            goto L_0x010a
        L_0x0107:
            r0 = move-exception
            goto L_0x010a
        L_0x0109:
            r0 = move-exception
        L_0x010a:
            noa r5 = r5.c
            r11 = 2013(0x7dd, float:2.821E-42)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r9
            r5.a(r11, r12, r0)
            goto L_0x0126
        L_0x0117:
            r0 = move-exception
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            noa r5 = r5.c
            r9 = 2014(0x7de, float:2.822E-42)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r13
            r5.a(r9, r10, r0)
        L_0x0126:
            r5 = 1
            if (r6 != 0) goto L_0x012c
            r4 = 1
            goto L_0x0297
        L_0x012c:
            boolean r0 = r6.f
            if (r0 != 0) goto L_0x0296
            anml r0 = defpackage.anml.g
            auay r9 = r6.c
            byte[] r9 = r9.k()
            java.lang.String r0 = r0.a((byte[]) r9)
            auay r9 = r6.b
            byte[] r9 = r9.k()
            java.lang.String r9 = defpackage.npt.a((byte[]) r9)
            bhu r10 = defpackage.bhu.g
            aucd r10 = r10.o()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            r10.c()
            r10.c = r8
        L_0x0156:
            aucj r11 = r10.b
            bhu r11 = (defpackage.bhu) r11
            r0.getClass()
            int r12 = r11.a
            r12 = r12 | r5
            r11.a = r12
            r11.b = r0
            r9.getClass()
            r0 = r12 | 2
            r11.a = r0
            r11.c = r9
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            int r0 = r6.e
            r29 = r6
            long r5 = (long) r0
            long r11 = r11 + r5
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x017f
            goto L_0x0184
        L_0x017f:
            r10.c()
            r10.c = r8
        L_0x0184:
            aucj r0 = r10.b
            bhu r0 = (defpackage.bhu) r0
            int r5 = r0.a
            r5 = r5 | r7
            r0.a = r5
            r0.d = r11
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 / r13
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0199
            goto L_0x019e
        L_0x0199:
            r10.c()
            r10.c = r8
        L_0x019e:
            aucj r0 = r10.b
            bhu r0 = (defpackage.bhu) r0
            int r9 = r0.a
            r9 = r9 | 8
            r0.a = r9
            r0.e = r5
            r6 = r29
            int r5 = r6.e
            r9 = r9 | 16
            r0.a = r9
            long r11 = (long) r5
            r0.f = r11
            aucj r0 = r10.i()
            bhu r0 = (defpackage.bhu) r0
            bht r5 = defpackage.bht.e
            aucd r5 = r5.o()
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x01c6
            goto L_0x01cb
        L_0x01c6:
            r5.c()
            r5.c = r8
        L_0x01cb:
            aucj r9 = r5.b
            bht r9 = (defpackage.bht) r9
            r0.getClass()
            r9.b = r0
            int r0 = r9.a
            r10 = 1
            r0 = r0 | r10
            r9.a = r0
            auay r10 = r6.d
            r10.getClass()
            r0 = r0 | 2
            r9.a = r0
            r9.c = r10
            auay r6 = r6.b
            r6.getClass()
            r0 = r0 | r7
            r9.a = r0
            r9.d = r6
            aucj r0 = r5.i()
            bht r0 = (defpackage.bht) r0
            com.google.android.gms.gass.internal.ProgramResponse r5 = new com.google.android.gms.gass.internal.ProgramResponse
            auay r0 = r0.au()
            byte[] r0 = r0.k()
            r6 = 5
            r5.<init>(r0, r6)
            byte[] r0 = r5.b     // Catch:{ auda -> 0x0287 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ auda -> 0x0287 }
            aubs r5 = defpackage.aubs.c()     // Catch:{ auda -> 0x0287 }
            bht r6 = defpackage.bht.e     // Catch:{ auda -> 0x0287 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0285 }
            java.lang.Object r6 = r6.c(r7)     // Catch:{ auda -> 0x0285 }
            aucj r6 = (defpackage.aucj) r6     // Catch:{ auda -> 0x0285 }
            aueh r7 = defpackage.aueh.a     // Catch:{ IOException -> 0x026b, RuntimeException -> 0x025a }
            aueq r7 = r7.a((java.lang.Object) r6)     // Catch:{ IOException -> 0x026b, RuntimeException -> 0x025a }
            aubd r9 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x026b, RuntimeException -> 0x025a }
            r7.a(r6, r9, r5)     // Catch:{ IOException -> 0x026b, RuntimeException -> 0x025a }
            r7.d(r6)     // Catch:{ IOException -> 0x026b, RuntimeException -> 0x025a }
            r0.a((int) r8)     // Catch:{ auda -> 0x0257 }
            defpackage.aucj.b((defpackage.aucj) r6)     // Catch:{ auda -> 0x0287 }
            bht r6 = (defpackage.bht) r6     // Catch:{ auda -> 0x0287 }
            now r0 = new now     // Catch:{ auda -> 0x0287 }
            r0.<init>(r1)     // Catch:{ auda -> 0x0287 }
            boolean r0 = r4.a(r6, r0)     // Catch:{ auda -> 0x0287 }
            if (r0 != 0) goto L_0x024a
            noa r0 = r1.d     // Catch:{ auda -> 0x0287 }
            r4 = 4008(0xfa8, float:5.616E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x0287 }
            long r5 = r5 - r2
            r0.a(r4, r5)     // Catch:{ auda -> 0x0287 }
            r2 = 1
            return r2
        L_0x024a:
            noa r0 = r1.d     // Catch:{ auda -> 0x0287 }
            r4 = 5008(0x1390, float:7.018E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ auda -> 0x0287 }
            long r5 = r5 - r2
            r0.a(r4, r5)     // Catch:{ auda -> 0x0287 }
            return r8
        L_0x0257:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ auda -> 0x0285 }
        L_0x025a:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ auda -> 0x0285 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0285 }
            if (r4 == 0) goto L_0x026a
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0285 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0285 }
            throw r0     // Catch:{ auda -> 0x0285 }
        L_0x026a:
            throw r0     // Catch:{ auda -> 0x0285 }
        L_0x026b:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ auda -> 0x0285 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0285 }
            if (r4 != 0) goto L_0x027e
            auda r4 = new auda     // Catch:{ auda -> 0x0285 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0285 }
            r4.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0285 }
            throw r4     // Catch:{ auda -> 0x0285 }
        L_0x027e:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0285 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0285 }
            throw r0     // Catch:{ auda -> 0x0285 }
        L_0x0285:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x0287 }
        L_0x0287:
            r0 = move-exception
            noa r4 = r1.d
            r5 = 2012(0x7dc, float:2.82E-42)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            r4.a(r5, r6, r0)
            r4 = 1
            return r4
        L_0x0296:
            r4 = 1
        L_0x0297:
            noa r0 = r1.d
            r5 = 4003(0xfa3, float:5.61E-42)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            r0.a(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nox.a(android.content.Context, nqf):int");
    }
}
