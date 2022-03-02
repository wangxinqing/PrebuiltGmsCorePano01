package defpackage;

/* renamed from: amun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amun extends amuo implements amtr {
    private static final long serialVersionUID = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amun(amtm amtm, amtp amtp) {
        super(new amvo(amtm, amtp));
        amrl.a((Object) amtp);
    }

    public final Object a(Object obj) {
        return d(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: amum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: amum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: amum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: amum} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        r12 = r11.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r12.c() != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r14 = r12.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r14 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r5.a.a(r11, r6) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r5.b(r11, r6);
        r0 = r5.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.unlock();
        r5.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5.a(r15, r14, r12.a(), defpackage.amvq.EXPIRED);
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r13 = null;
        r5.a(r15, (java.lang.Object) null, r12.a(), defpackage.amvq.COLLECTED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r5.l.remove(r11);
        r5.m.remove(r11);
        r5.b = r0;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r13 = null;
        r0 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            r2 = r17
            amvo r0 = r2.a     // Catch:{ ExecutionException -> 0x02aa }
            amtp r3 = r0.r     // Catch:{ ExecutionException -> 0x02aa }
            defpackage.amrl.a((java.lang.Object) r18)     // Catch:{ ExecutionException -> 0x02aa }
            int r4 = r0.a((java.lang.Object) r1)     // Catch:{ ExecutionException -> 0x02aa }
            amur r5 = r0.a((int) r4)     // Catch:{ ExecutionException -> 0x02aa }
            defpackage.amrl.a((java.lang.Object) r18)     // Catch:{ ExecutionException -> 0x02aa }
            defpackage.amrl.a((java.lang.Object) r3)     // Catch:{ ExecutionException -> 0x02aa }
            int r0 = r5.b     // Catch:{ ExecutionException -> 0x028a }
            if (r0 == 0) goto L_0x004a
            amvp r0 = r5.b((java.lang.Object) r1, (int) r4)     // Catch:{ ExecutionException -> 0x028a }
            if (r0 == 0) goto L_0x004a
            amvo r6 = r5.a     // Catch:{ ExecutionException -> 0x028a }
            amtd r6 = r6.p     // Catch:{ ExecutionException -> 0x028a }
            long r6 = r6.a()     // Catch:{ ExecutionException -> 0x028a }
            java.lang.Object r8 = r5.c(r0, r6)     // Catch:{ ExecutionException -> 0x028a }
            if (r8 != 0) goto L_0x0040
            amva r6 = r0.a()     // Catch:{ ExecutionException -> 0x028a }
            boolean r7 = r6.c()     // Catch:{ ExecutionException -> 0x028a }
            if (r7 == 0) goto L_0x004a
            java.lang.Object r8 = r5.a((defpackage.amvp) r0, (java.lang.Object) r1, (defpackage.amva) r6)     // Catch:{ ExecutionException -> 0x028a }
            goto L_0x0045
        L_0x0040:
            r5.a((defpackage.amvp) r0, (long) r6)     // Catch:{ ExecutionException -> 0x028a }
            amti r0 = r5.n     // Catch:{ ExecutionException -> 0x028a }
        L_0x0045:
            r5.e()     // Catch:{ ExecutionException -> 0x02aa }
            goto L_0x01db
        L_0x004a:
            r5.lock()     // Catch:{ ExecutionException -> 0x028a }
            amvo r0 = r5.a     // Catch:{ all -> 0x0280 }
            amtd r0 = r0.p     // Catch:{ all -> 0x0280 }
            long r6 = r0.a()     // Catch:{ all -> 0x0280 }
            r5.c(r6)     // Catch:{ all -> 0x0280 }
            int r0 = r5.b     // Catch:{ all -> 0x0280 }
            int r0 = r0 + -1
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f     // Catch:{ all -> 0x0280 }
            int r9 = r8.length()     // Catch:{ all -> 0x0280 }
            int r9 = r9 + -1
            r9 = r9 & r4
            java.lang.Object r10 = r8.get(r9)     // Catch:{ all -> 0x0280 }
            amvp r10 = (defpackage.amvp) r10     // Catch:{ all -> 0x0280 }
            r11 = r10
        L_0x006c:
            if (r11 == 0) goto L_0x00d5
            java.lang.Object r15 = r11.d()     // Catch:{ all -> 0x0280 }
            int r12 = r11.c()     // Catch:{ all -> 0x0280 }
            if (r12 == r4) goto L_0x0079
            goto L_0x00d0
        L_0x0079:
            if (r15 == 0) goto L_0x00d0
            amvo r12 = r5.a     // Catch:{ all -> 0x0280 }
            amqw r12 = r12.f     // Catch:{ all -> 0x0280 }
            boolean r12 = r12.b(r1, r15)     // Catch:{ all -> 0x0280 }
            if (r12 == 0) goto L_0x00d0
            amva r12 = r11.a()     // Catch:{ all -> 0x0280 }
            boolean r16 = r12.c()     // Catch:{ all -> 0x0280 }
            if (r16 != 0) goto L_0x00cd
            java.lang.Object r14 = r12.get()     // Catch:{ all -> 0x0280 }
            if (r14 == 0) goto L_0x00b5
            amvo r13 = r5.a     // Catch:{ all -> 0x0280 }
            boolean r13 = r13.a((defpackage.amvp) r11, (long) r6)     // Catch:{ all -> 0x0280 }
            if (r13 != 0) goto L_0x00aa
            r5.b((defpackage.amvp) r11, (long) r6)     // Catch:{ all -> 0x0280 }
            amti r0 = r5.n     // Catch:{ all -> 0x0280 }
            r5.unlock()     // Catch:{ ExecutionException -> 0x028a }
            r5.f()     // Catch:{ ExecutionException -> 0x028a }
            r8 = r14
            goto L_0x0045
        L_0x00aa:
            int r6 = r12.a()     // Catch:{ all -> 0x0280 }
            amvq r7 = defpackage.amvq.EXPIRED     // Catch:{ all -> 0x0280 }
            r5.a((java.lang.Object) r15, (java.lang.Object) r14, (int) r6, (defpackage.amvq) r7)     // Catch:{ all -> 0x0280 }
            r13 = 0
            goto L_0x00bf
        L_0x00b5:
            int r6 = r12.a()     // Catch:{ all -> 0x0280 }
            amvq r7 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x0280 }
            r13 = 0
            r5.a((java.lang.Object) r15, (java.lang.Object) r13, (int) r6, (defpackage.amvq) r7)     // Catch:{ all -> 0x0280 }
        L_0x00bf:
            java.util.Queue r6 = r5.l     // Catch:{ all -> 0x0280 }
            r6.remove(r11)     // Catch:{ all -> 0x0280 }
            java.util.Queue r6 = r5.m     // Catch:{ all -> 0x0280 }
            r6.remove(r11)     // Catch:{ all -> 0x0280 }
            r5.b = r0     // Catch:{ all -> 0x0280 }
            r0 = 1
            goto L_0x00d8
        L_0x00cd:
            r13 = 0
            r0 = 0
            goto L_0x00d8
        L_0x00d0:
            amvp r11 = r11.b()     // Catch:{ all -> 0x0280 }
            goto L_0x006c
        L_0x00d5:
            r13 = 0
            r12 = r13
            r0 = 1
        L_0x00d8:
            if (r0 == 0) goto L_0x00f0
            amum r6 = new amum     // Catch:{ all -> 0x0280 }
            r6.<init>()     // Catch:{ all -> 0x0280 }
            if (r11 != 0) goto L_0x00ec
            amvp r11 = r5.a((java.lang.Object) r1, (int) r4, (defpackage.amvp) r10)     // Catch:{ all -> 0x0280 }
            r11.a((defpackage.amva) r6)     // Catch:{ all -> 0x0280 }
            r8.set(r9, r11)     // Catch:{ all -> 0x0280 }
            goto L_0x00f1
        L_0x00ec:
            r11.a((defpackage.amva) r6)     // Catch:{ all -> 0x0280 }
            goto L_0x00f1
        L_0x00f0:
            r6 = r13
        L_0x00f1:
            r5.unlock()     // Catch:{ ExecutionException -> 0x028a }
            r5.f()     // Catch:{ ExecutionException -> 0x028a }
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = r5.a((defpackage.amvp) r11, (java.lang.Object) r1, (defpackage.amva) r12)     // Catch:{ ExecutionException -> 0x028a }
            r8 = r0
            goto L_0x0045
        L_0x0100:
            monitor-enter(r11)     // Catch:{ all -> 0x027c }
            amsn r0 = r6.c     // Catch:{ all -> 0x011a }
            r0.d()     // Catch:{ all -> 0x011a }
            amva r0 = r6.a     // Catch:{ all -> 0x011a }
            java.lang.Object r0 = r3.a((java.lang.Object) r1)     // Catch:{ all -> 0x011a }
            boolean r3 = r6.b(r0)     // Catch:{ all -> 0x011a }
            if (r3 != 0) goto L_0x0117
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)     // Catch:{ all -> 0x011a }
            goto L_0x0136
        L_0x0117:
            aosh r0 = r6.b     // Catch:{ all -> 0x011a }
            goto L_0x0136
        L_0x011a:
            r0 = move-exception
            aosh r3 = r6.b     // Catch:{ all -> 0x0279 }
            boolean r3 = r3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0279 }
            if (r3 != 0) goto L_0x0128
            aorr r3 = defpackage.aorl.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0279 }
            goto L_0x012a
        L_0x0128:
            aosh r3 = r6.b     // Catch:{ all -> 0x0279 }
        L_0x012a:
            boolean r0 = r0 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0135
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0279 }
            r0.interrupt()     // Catch:{ all -> 0x0279 }
        L_0x0135:
            r0 = r3
        L_0x0136:
            java.lang.Object r13 = defpackage.aosr.a(r0)     // Catch:{ all -> 0x021a }
            if (r13 == 0) goto L_0x01f0
            r6.f()     // Catch:{ all -> 0x01ee }
            r5.lock()     // Catch:{ all -> 0x01ee }
            amvo r0 = r5.a     // Catch:{ all -> 0x01e6 }
            amtd r0 = r0.p     // Catch:{ all -> 0x01e6 }
            long r7 = r0.a()     // Catch:{ all -> 0x01e6 }
            r5.c(r7)     // Catch:{ all -> 0x01e6 }
            int r0 = r5.b     // Catch:{ all -> 0x01e6 }
            r3 = 1
            int r0 = r0 + r3
            int r3 = r5.e     // Catch:{ all -> 0x01e6 }
            if (r0 > r3) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            r5.d()     // Catch:{ all -> 0x01e6 }
            int r0 = r5.b     // Catch:{ all -> 0x01e6 }
            r3 = 1
            int r0 = r0 + r3
        L_0x015d:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f     // Catch:{ all -> 0x01e6 }
            int r9 = r3.length()     // Catch:{ all -> 0x01e6 }
            int r9 = r9 + -1
            r9 = r9 & r4
            java.lang.Object r10 = r3.get(r9)     // Catch:{ all -> 0x01e6 }
            amvp r10 = (defpackage.amvp) r10     // Catch:{ all -> 0x01e6 }
            r12 = r10
        L_0x016d:
            if (r12 != 0) goto L_0x018b
            int r12 = r5.d     // Catch:{ all -> 0x01e6 }
            r14 = 1
            int r12 = r12 + r14
            r5.d = r12     // Catch:{ all -> 0x01e6 }
            amvp r10 = r5.a((java.lang.Object) r1, (int) r4, (defpackage.amvp) r10)     // Catch:{ all -> 0x01e6 }
            r5.a((defpackage.amvp) r10, (java.lang.Object) r13, (long) r7)     // Catch:{ all -> 0x01e6 }
            r3.set(r9, r10)     // Catch:{ all -> 0x01e6 }
            r5.b = r0     // Catch:{ all -> 0x01e6 }
            r5.a((defpackage.amvp) r10)     // Catch:{ all -> 0x01e6 }
            r5.unlock()     // Catch:{ all -> 0x01ee }
        L_0x0187:
            r5.f()     // Catch:{ all -> 0x01ee }
            goto L_0x01d5
        L_0x018b:
            java.lang.Object r14 = r12.d()     // Catch:{ all -> 0x01e6 }
            int r15 = r12.c()     // Catch:{ all -> 0x01e6 }
            if (r15 == r4) goto L_0x0198
            r14 = 1
            r15 = 0
            goto L_0x01e1
        L_0x0198:
            if (r14 == 0) goto L_0x01df
            amvo r15 = r5.a     // Catch:{ all -> 0x01e6 }
            amqw r15 = r15.f     // Catch:{ all -> 0x01e6 }
            boolean r14 = r15.b(r1, r14)     // Catch:{ all -> 0x01e6 }
            if (r14 == 0) goto L_0x01dc
            amva r3 = r12.a()     // Catch:{ all -> 0x01e6 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x01e6 }
            if (r6 != r3) goto L_0x01af
            goto L_0x01b6
        L_0x01af:
            if (r9 != 0) goto L_0x01cb
            amva r9 = defpackage.amvo.s     // Catch:{ all -> 0x01e6 }
            if (r3 != r9) goto L_0x01b6
            goto L_0x01cb
        L_0x01b6:
            int r3 = r5.d     // Catch:{ all -> 0x01e6 }
            r14 = 1
            int r3 = r3 + r14
            r5.d = r3     // Catch:{ all -> 0x01e6 }
            r6.d()     // Catch:{ all -> 0x01e6 }
            r5.a((defpackage.amvp) r12, (java.lang.Object) r13, (long) r7)     // Catch:{ all -> 0x01e6 }
            r5.b = r0     // Catch:{ all -> 0x01e6 }
            r5.a((defpackage.amvp) r12)     // Catch:{ all -> 0x01e6 }
            r5.unlock()     // Catch:{ all -> 0x01ee }
            goto L_0x0187
        L_0x01cb:
            amvq r0 = defpackage.amvq.REPLACED     // Catch:{ all -> 0x01e6 }
            r15 = 0
            r5.a((java.lang.Object) r1, (java.lang.Object) r13, (int) r15, (defpackage.amvq) r0)     // Catch:{ all -> 0x01e6 }
            r5.unlock()     // Catch:{ all -> 0x01ee }
            goto L_0x0187
        L_0x01d5:
            monitor-exit(r11)     // Catch:{ all -> 0x0279 }
            amti r0 = r5.n     // Catch:{ ExecutionException -> 0x028a }
            r8 = r13
            goto L_0x0045
        L_0x01db:
            return r8
        L_0x01dc:
            r14 = 1
            r15 = 0
            goto L_0x01e1
        L_0x01df:
            r14 = 1
            r15 = 0
        L_0x01e1:
            amvp r12 = r12.b()     // Catch:{ all -> 0x01e6 }
            goto L_0x016d
        L_0x01e6:
            r0 = move-exception
            r5.unlock()     // Catch:{ all -> 0x01ee }
            r5.f()     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r0 = move-exception
            goto L_0x021b
        L_0x01f0:
            amto r0 = new amto     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x01ee }
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01ee }
            int r7 = r7.length()     // Catch:{ all -> 0x01ee }
            int r7 = r7 + 35
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r8.<init>(r7)     // Catch:{ all -> 0x01ee }
            java.lang.String r7 = "CacheLoader returned null for key "
            r8.append(r7)     // Catch:{ all -> 0x01ee }
            r8.append(r3)     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = "."
            r8.append(r3)     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x01ee }
            r0.<init>(r3)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x021a:
            r0 = move-exception
        L_0x021b:
            if (r13 != 0) goto L_0x0278
            r6.f()     // Catch:{ all -> 0x0279 }
            r5.lock()     // Catch:{ all -> 0x0279 }
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f     // Catch:{ all -> 0x0270 }
            int r7 = r3.length()     // Catch:{ all -> 0x0270 }
            int r7 = r7 + -1
            r7 = r7 & r4
            java.lang.Object r8 = r3.get(r7)     // Catch:{ all -> 0x0270 }
            amvp r8 = (defpackage.amvp) r8     // Catch:{ all -> 0x0270 }
            r9 = r8
        L_0x0233:
            if (r9 == 0) goto L_0x026c
            java.lang.Object r10 = r9.d()     // Catch:{ all -> 0x0270 }
            int r12 = r9.c()     // Catch:{ all -> 0x0270 }
            if (r12 == r4) goto L_0x0240
            goto L_0x0267
        L_0x0240:
            if (r10 == 0) goto L_0x0267
            amvo r12 = r5.a     // Catch:{ all -> 0x0270 }
            amqw r12 = r12.f     // Catch:{ all -> 0x0270 }
            boolean r10 = r12.b(r1, r10)     // Catch:{ all -> 0x0270 }
            if (r10 == 0) goto L_0x0267
            amva r1 = r9.a()     // Catch:{ all -> 0x0270 }
            if (r1 != r6) goto L_0x0260
            r6.d()     // Catch:{ all -> 0x0270 }
            amvp r1 = r5.b((defpackage.amvp) r8, (defpackage.amvp) r9)     // Catch:{ all -> 0x0270 }
            r3.set(r7, r1)     // Catch:{ all -> 0x0270 }
            r5.unlock()     // Catch:{ all -> 0x0279 }
            goto L_0x0263
        L_0x0260:
            r5.unlock()     // Catch:{ all -> 0x0279 }
        L_0x0263:
            r5.f()     // Catch:{ all -> 0x0279 }
            goto L_0x0278
        L_0x0267:
            amvp r9 = r9.b()     // Catch:{ all -> 0x0270 }
            goto L_0x0233
        L_0x026c:
            r5.unlock()     // Catch:{ all -> 0x0279 }
            goto L_0x0263
        L_0x0270:
            r0 = move-exception
            r5.unlock()     // Catch:{ all -> 0x0279 }
            r5.f()     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0278:
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0279:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x027c }
        L_0x027c:
            r0 = move-exception
            amti r1 = r5.n     // Catch:{ ExecutionException -> 0x028a }
            throw r0     // Catch:{ ExecutionException -> 0x028a }
        L_0x0280:
            r0 = move-exception
            r5.unlock()     // Catch:{ ExecutionException -> 0x028a }
            r5.f()     // Catch:{ ExecutionException -> 0x028a }
            throw r0     // Catch:{ ExecutionException -> 0x028a }
        L_0x0288:
            r0 = move-exception
            goto L_0x02a6
        L_0x028a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x0288 }
            boolean r3 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x0288 }
            if (r3 != 0) goto L_0x029e
            boolean r3 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0288 }
            if (r3 == 0) goto L_0x029d
            aosq r0 = new aosq     // Catch:{ all -> 0x0288 }
            r0.<init>(r1)     // Catch:{ all -> 0x0288 }
            throw r0     // Catch:{ all -> 0x0288 }
        L_0x029d:
            throw r0     // Catch:{ all -> 0x0288 }
        L_0x029e:
            aoqn r0 = new aoqn     // Catch:{ all -> 0x0288 }
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0288 }
            r0.<init>(r1)     // Catch:{ all -> 0x0288 }
            throw r0     // Catch:{ all -> 0x0288 }
        L_0x02a6:
            r5.e()     // Catch:{ ExecutionException -> 0x02aa }
            throw r0     // Catch:{ ExecutionException -> 0x02aa }
        L_0x02aa:
            r0 = move-exception
            aosq r1 = new aosq
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            goto L_0x02b6
        L_0x02b5:
            throw r1
        L_0x02b6:
            goto L_0x02b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amun.d(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amul(this.a);
    }
}
