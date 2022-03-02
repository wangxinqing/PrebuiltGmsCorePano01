package defpackage;

/* renamed from: afgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afgn implements Runnable {
    final long a = this.c.f.getAndIncrement();
    final /* synthetic */ aorr b;
    final /* synthetic */ afgp c;

    public afgn(afgp afgp, aorr aorr) {
        this.c = afgp;
        this.b = aorr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0100 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            afgp r0 = r8.c
            int r1 = defpackage.afgp.h
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            afgp r1 = r8.c     // Catch:{ all -> 0x012a }
            int r2 = r1.e     // Catch:{ all -> 0x012a }
            int r2 = r2 + -1
            r1.e = r2     // Catch:{ all -> 0x012a }
            r1 = 2
            r2 = 1
            r3 = 0
            aorr r4 = r8.b     // Catch:{ ExecutionException -> 0x007d }
            java.lang.Object r4 = defpackage.aorl.a((java.util.concurrent.Future) r4)     // Catch:{ ExecutionException -> 0x007d }
            afgo r5 = defpackage.afgo.NO_RESULT     // Catch:{ ExecutionException -> 0x007d }
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x007d }
            afgo r5 = r5.c     // Catch:{ ExecutionException -> 0x007d }
            int r5 = r5.ordinal()     // Catch:{ ExecutionException -> 0x007d }
            if (r5 == 0) goto L_0x0054
            if (r5 == r2) goto L_0x0038
            if (r5 == r1) goto L_0x0054
            r6 = 3
            if (r5 == r6) goto L_0x002e
            r1 = 0
            goto L_0x00b9
        L_0x002e:
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x007d }
            long r6 = r8.a     // Catch:{ ExecutionException -> 0x007d }
            boolean r1 = r5.a(r4, r6)     // Catch:{ ExecutionException -> 0x007d }
            goto L_0x00b9
        L_0x0038:
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x007d }
            aorr r5 = r5.d     // Catch:{ ExecutionException -> 0x007d }
            aosh r5 = (defpackage.aosh) r5     // Catch:{ ExecutionException -> 0x007d }
            r5.b((java.lang.Object) r4)     // Catch:{ ExecutionException -> 0x007d }
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x007d }
            long r6 = r8.a     // Catch:{ ExecutionException -> 0x007d }
            boolean r4 = r5.a(r4, r6)     // Catch:{ ExecutionException -> 0x007d }
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x0052 }
            afgo r6 = defpackage.afgo.GOOD_RESULT     // Catch:{ ExecutionException -> 0x0052 }
            r5.a((defpackage.afgo) r6)     // Catch:{ ExecutionException -> 0x0052 }
            r1 = r4
            goto L_0x00b9
        L_0x0052:
            r5 = move-exception
            goto L_0x0080
        L_0x0054:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ ExecutionException -> 0x007d }
            afgp r5 = r8.c     // Catch:{ ExecutionException -> 0x007d }
            afgo r5 = r5.c     // Catch:{ ExecutionException -> 0x007d }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ ExecutionException -> 0x007d }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ ExecutionException -> 0x007d }
            int r6 = r6.length()     // Catch:{ ExecutionException -> 0x007d }
            int r6 = r6 + 53
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x007d }
            r7.<init>(r6)     // Catch:{ ExecutionException -> 0x007d }
            java.lang.String r6 = "When a Future is returning, state couldn't have been "
            r7.append(r6)     // Catch:{ ExecutionException -> 0x007d }
            r7.append(r5)     // Catch:{ ExecutionException -> 0x007d }
            java.lang.String r5 = r7.toString()     // Catch:{ ExecutionException -> 0x007d }
            r4.<init>(r5)     // Catch:{ ExecutionException -> 0x007d }
            throw r4     // Catch:{ ExecutionException -> 0x007d }
        L_0x007d:
            r4 = move-exception
            r5 = r4
            r4 = 0
        L_0x0080:
            afgo r6 = defpackage.afgo.NO_RESULT     // Catch:{ all -> 0x012a }
            afgp r6 = r8.c     // Catch:{ all -> 0x012a }
            afgo r6 = r6.c     // Catch:{ all -> 0x012a }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x012a }
            if (r6 == 0) goto L_0x0101
            if (r6 == r2) goto L_0x0091
            if (r6 == r1) goto L_0x0101
            goto L_0x00b8
        L_0x0091:
            afgp r1 = r8.c     // Catch:{ all -> 0x012a }
            aorr r1 = r1.d     // Catch:{ all -> 0x012a }
            aosh r1 = (defpackage.aosh) r1     // Catch:{ all -> 0x012a }
            r1.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x012a }
            afgp r1 = r8.c     // Catch:{ all -> 0x012a }
            int r2 = r1.e     // Catch:{ all -> 0x012a }
            if (r2 > 0) goto L_0x00b2
            java.lang.Throwable r2 = r5.getCause()     // Catch:{ all -> 0x012a }
            aorr r2 = defpackage.aorl.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x012a }
            r1.d = r2     // Catch:{ all -> 0x012a }
            afgp r1 = r8.c     // Catch:{ all -> 0x012a }
            afgo r2 = defpackage.afgo.BAD_RESULT     // Catch:{ all -> 0x012a }
            r1.a((defpackage.afgo) r2)     // Catch:{ all -> 0x012a }
            goto L_0x00b8
        L_0x00b2:
            aosh r2 = defpackage.aosh.f()     // Catch:{ all -> 0x012a }
            r1.d = r2     // Catch:{ all -> 0x012a }
        L_0x00b8:
            r1 = r4
        L_0x00b9:
            afgp r2 = r8.c     // Catch:{ all -> 0x012a }
            afgo r4 = r2.c     // Catch:{ all -> 0x012a }
            r4.a(r2)     // Catch:{ all -> 0x012a }
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x0100
            afgp r0 = r8.c
            java.util.List r0 = r0.g
            monitor-enter(r0)
            afgp r1 = r8.c     // Catch:{ all -> 0x00fd }
            java.util.List r1 = r1.g     // Catch:{ all -> 0x00fd }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00fd }
        L_0x00d0:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00fd }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x00fd }
            java.lang.Object r4 = r2.second     // Catch:{ RuntimeException -> 0x00e8 }
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.Object r2 = r2.first     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ RuntimeException -> 0x00e8 }
            r4.execute(r2)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x00d0
        L_0x00e8:
            r2 = move-exception
            afgp r2 = r8.c     // Catch:{ all -> 0x00fd }
            awdn r2 = r2.a     // Catch:{ all -> 0x00fd }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x00fd }
            pia r2 = (defpackage.pia) r2     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "[FutureCoalescer] RuntimeException while executing success listeners"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fd }
            r2.d(r4, r5)     // Catch:{ all -> 0x00fd }
            goto L_0x00d0
        L_0x00fb:
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return
        L_0x00fd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            throw r1
        L_0x0100:
            return
        L_0x0101:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012a }
            afgp r2 = r8.c     // Catch:{ all -> 0x012a }
            afgo r2 = r2.c     // Catch:{ all -> 0x012a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x012a }
            int r3 = r3.length()     // Catch:{ all -> 0x012a }
            int r3 = r3 + 53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r4.<init>(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = "When a Future is returning, state couldn't have been "
            r4.append(r3)     // Catch:{ all -> 0x012a }
            r4.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x012a }
            r1.<init>(r2)     // Catch:{ all -> 0x012a }
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012d:
            throw r1
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgn.run():void");
    }
}
