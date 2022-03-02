package defpackage;

@Deprecated
/* renamed from: nhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhq implements Runnable {
    private final nho a = new nho();
    private final nhp b = new nhp();

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            nhz r0 = defpackage.nhz.a
            nhf r1 = r0.a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.Object r4 = r1.e
            monitor-enter(r4)
            java.util.Map r1 = r1.f     // Catch:{ all -> 0x0019 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0019 }
            r1 = r1 ^ r2
            monitor-exit(r4)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            r1 = 0
        L_0x001d:
            boolean r4 = defpackage.nia.a()
            if (r1 == 0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            if (r4 != 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "FontsDownloadResultPump"
            java.lang.String r2 = "run fired but we have no work"
            defpackage.ngz.c(r1, r2, r0)
            return
        L_0x0030:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r5[r3] = r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r5[r2] = r3
            java.lang.String r2 = "FontsDownloadResultPump"
            java.lang.String r3 = "run svr work? %s update work? %s)"
            defpackage.ngz.c(r2, r3, r5)
            java.util.concurrent.ExecutorService r0 = r0.b()
            if (r1 == 0) goto L_0x0051
            nho r1 = r7.a
            r0.execute(r1)
        L_0x0051:
            if (r4 == 0) goto L_0x0058
            nhp r1 = r7.b
            r0.execute(r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhq.run():void");
    }
}
