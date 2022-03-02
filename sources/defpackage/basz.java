package defpackage;

/* renamed from: basz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class basz extends Thread {
    public basz() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Class<bata> r0 = defpackage.bata.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0068 }
            bata r1 = defpackage.bata.d     // Catch:{ all -> 0x0065 }
            bata r1 = r1.e     // Catch:{ all -> 0x0065 }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0065 }
            java.lang.Class<bata> r1 = defpackage.bata.class
            long r5 = defpackage.bata.b     // Catch:{ all -> 0x0065 }
            r1.wait(r5)     // Catch:{ all -> 0x0065 }
            bata r1 = defpackage.bata.d     // Catch:{ all -> 0x0065 }
            bata r1 = r1.e     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0029
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0065 }
            long r5 = r5 - r3
            long r3 = defpackage.bata.c     // Catch:{ all -> 0x0065 }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0029
            bata r1 = defpackage.bata.d     // Catch:{ all -> 0x0065 }
            goto L_0x0054
        L_0x0029:
            r1 = r2
            goto L_0x0054
        L_0x002b:
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0065 }
            long r3 = r1.a((long) r3)     // Catch:{ all -> 0x0065 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0042
            bata r3 = defpackage.bata.d     // Catch:{ all -> 0x0065 }
            bata r4 = r1.e     // Catch:{ all -> 0x0065 }
            r3.e = r4     // Catch:{ all -> 0x0065 }
            r1.e = r2     // Catch:{ all -> 0x0065 }
            goto L_0x0054
        L_0x0042:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3 / r5
            java.lang.Class<bata> r1 = defpackage.bata.class
            java.lang.Long.signum(r7)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r4 = (int) r3
            r1.wait(r7, r4)     // Catch:{ all -> 0x0065 }
            r1 = r2
        L_0x0054:
            if (r1 == 0) goto L_0x0063
            bata r3 = defpackage.bata.d     // Catch:{ all -> 0x0065 }
            if (r1 != r3) goto L_0x005e
            defpackage.bata.d = r2     // Catch:{ all -> 0x0065 }
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            r1.a()     // Catch:{ InterruptedException -> 0x0068 }
            goto L_0x0000
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0000
        L_0x0065:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r1     // Catch:{ InterruptedException -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.basz.run():void");
    }
}
