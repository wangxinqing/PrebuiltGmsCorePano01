package defpackage;

/* renamed from: bahz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahz implements Runnable {
    final /* synthetic */ baic a;

    public bahz(baic baic) {
        this.a = baic;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (r6.d != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        r6.c.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r6.e != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        r1 = defpackage.bagz.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        r1 = defpackage.bagz.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        defpackage.bagz.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            baic r0 = r14.a
            monitor-enter(r0)
            baic r1 = r14.a     // Catch:{ all -> 0x00dd }
            r2 = 0
            r1.d = r2     // Catch:{ all -> 0x00dd }
            int r2 = r1.i     // Catch:{ all -> 0x00dd }
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0022
            r2 = 4
            r1.i = r2     // Catch:{ all -> 0x00dd }
            java.util.concurrent.ScheduledExecutorService r2 = r1.a     // Catch:{ all -> 0x00dd }
            java.lang.Runnable r3 = r1.e     // Catch:{ all -> 0x00dd }
            long r6 = r1.h     // Catch:{ all -> 0x00dd }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00dd }
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r6, r8)     // Catch:{ all -> 0x00dd }
            r1.c = r2     // Catch:{ all -> 0x00dd }
            r1 = 1
            goto L_0x0041
        L_0x0022:
            r6 = 3
            if (r2 != r6) goto L_0x0040
            java.util.concurrent.ScheduledExecutorService r2 = r1.a     // Catch:{ all -> 0x00dd }
            java.lang.Runnable r6 = r1.f     // Catch:{ all -> 0x00dd }
            long r7 = r1.g     // Catch:{ all -> 0x00dd }
            amsn r9 = r1.b     // Catch:{ all -> 0x00dd }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00dd }
            long r9 = r9.a((java.util.concurrent.TimeUnit) r10)     // Catch:{ all -> 0x00dd }
            long r7 = r7 - r9
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00dd }
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            r1.d = r2     // Catch:{ all -> 0x00dd }
            baic r1 = r14.a     // Catch:{ all -> 0x00dd }
            r1.i = r3     // Catch:{ all -> 0x00dd }
        L_0x0040:
            r1 = 0
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00dc
            baic r0 = r14.a
            baib r0 = r0.j
            baep r1 = r0.a
            baia r2 = new baia
            r2.<init>(r0)
            aoqm r0 = defpackage.aoqm.a
            r3 = r1
            bamt r3 = (defpackage.bamt) r3
            java.lang.Object r3 = r3.j
            monitor-enter(r3)
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            bamd r6 = r6.h     // Catch:{ all -> 0x00d9 }
            if (r6 == 0) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            defpackage.amrl.b(r6)     // Catch:{ all -> 0x00d9 }
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            boolean r6 = r6.r     // Catch:{ all -> 0x00d9 }
            if (r6 == 0) goto L_0x0076
            bamt r1 = (defpackage.bamt) r1     // Catch:{ all -> 0x00d9 }
            java.lang.Throwable r1 = r1.e()     // Catch:{ all -> 0x00d9 }
            defpackage.bagz.a(r2, r0, r1)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d9 }
            return
        L_0x0076:
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            bagz r6 = r6.q     // Catch:{ all -> 0x00d9 }
            if (r6 == 0) goto L_0x0081
            r7 = 0
            r4 = 0
            goto L_0x00a8
        L_0x0081:
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            java.util.Random r6 = r6.e     // Catch:{ all -> 0x00d9 }
            long r7 = r6.nextLong()     // Catch:{ all -> 0x00d9 }
            amsn r6 = defpackage.amsn.a()     // Catch:{ all -> 0x00d9 }
            r6.d()     // Catch:{ all -> 0x00d9 }
            bagz r9 = new bagz     // Catch:{ all -> 0x00d9 }
            r9.<init>(r7, r6)     // Catch:{ all -> 0x00d9 }
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            r6.q = r9     // Catch:{ all -> 0x00d9 }
            r6 = r1
            bamt r6 = (defpackage.bamt) r6     // Catch:{ all -> 0x00d9 }
            balu r6 = r6.D     // Catch:{ all -> 0x00d9 }
            long r10 = r6.f     // Catch:{ all -> 0x00d9 }
            r12 = 1
            long r10 = r10 + r12
            r6.f = r10     // Catch:{ all -> 0x00d9 }
            r6 = r9
        L_0x00a8:
            if (r4 == 0) goto L_0x00b7
            bamt r1 = (defpackage.bamt) r1     // Catch:{ all -> 0x00d9 }
            bamd r1 = r1.h     // Catch:{ all -> 0x00d9 }
            r4 = 32
            long r9 = r7 >>> r4
            int r4 = (int) r9     // Catch:{ all -> 0x00d9 }
            int r8 = (int) r7     // Catch:{ all -> 0x00d9 }
            r1.a((boolean) r5, (int) r4, (int) r8)     // Catch:{ all -> 0x00d9 }
        L_0x00b7:
            monitor-exit(r3)     // Catch:{ all -> 0x00d9 }
            monitor-enter(r6)
            boolean r1 = r6.d     // Catch:{ all -> 0x00d6 }
            if (r1 != 0) goto L_0x00c4
            java.util.Map r1 = r6.c     // Catch:{ all -> 0x00d6 }
            r1.put(r2, r0)     // Catch:{ all -> 0x00d6 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d6 }
            return
        L_0x00c4:
            java.lang.Throwable r1 = r6.e     // Catch:{ all -> 0x00d6 }
            if (r1 != 0) goto L_0x00cd
            java.lang.Runnable r1 = defpackage.bagz.a()     // Catch:{ all -> 0x00d6 }
            goto L_0x00d1
        L_0x00cd:
            java.lang.Runnable r1 = defpackage.bagz.a(r2)     // Catch:{ all -> 0x00d6 }
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00d6 }
            defpackage.bagz.a(r0, r1)
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d6 }
            throw r0
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d9 }
            throw r0
        L_0x00dc:
            return
        L_0x00dd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00dd }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bahz.run():void");
    }
}
