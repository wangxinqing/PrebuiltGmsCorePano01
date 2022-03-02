package defpackage;

/* renamed from: agez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agez implements Runnable {
    private final agfc a;
    private final agev b;

    public agez(agfc agfc, agev agev) {
        this.a = agfc;
        this.b = agev;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            agfc r0 = r9.a
            agev r1 = r9.b
            android.app.Application r2 = r0.c     // Catch:{ all -> 0x008e }
            r3 = 0
            basc r4 = defpackage.agjt.a(r3, r2)     // Catch:{ all -> 0x008e }
            r1.m = r4     // Catch:{ all -> 0x008e }
            anhq r4 = defpackage.agjq.a     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "agjq"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r7 = -1
            java.lang.String r8 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r8)     // Catch:{ SecurityException -> 0x002c }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ SecurityException -> 0x002c }
            if (r2 == 0) goto L_0x002b
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x002c }
            if (r2 == 0) goto L_0x002b
            int r7 = r2.getType()     // Catch:{ SecurityException -> 0x002c }
            goto L_0x0045
        L_0x002b:
            goto L_0x0045
        L_0x002c:
            r2 = move-exception
            anhq r8 = defpackage.agjq.a     // Catch:{ all -> 0x008e }
            anie r8 = r8.c()     // Catch:{ all -> 0x008e }
            anhn r8 = (defpackage.anhn) r8     // Catch:{ all -> 0x008e }
            r8.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x008e }
            r2 = 38
            anie r2 = r8.a((java.lang.String) r4, (java.lang.String) r5, (int) r2, (java.lang.String) r6)     // Catch:{ all -> 0x008e }
            anhn r2 = (defpackage.anhn) r2     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml"
            r2.a((java.lang.String) r4)     // Catch:{ all -> 0x008e }
        L_0x0045:
            int r2 = defpackage.barj.a(r7)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            r1.u = r2     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r0.e     // Catch:{ all -> 0x008e }
            monitor-enter(r2)     // Catch:{ all -> 0x008e }
            java.util.List r4 = r0.h     // Catch:{ all -> 0x008b }
            r4.add(r1)     // Catch:{ all -> 0x008b }
            java.util.List r1 = r0.h     // Catch:{ all -> 0x008b }
            int r1 = r1.size()     // Catch:{ all -> 0x008b }
            int r4 = r0.f     // Catch:{ all -> 0x008b }
            if (r1 < r4) goto L_0x0076
            java.util.List r1 = r0.h     // Catch:{ all -> 0x008b }
            int r3 = r1.size()     // Catch:{ all -> 0x008b }
            agev[] r3 = new defpackage.agev[r3]     // Catch:{ all -> 0x008b }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ all -> 0x008b }
            r3 = r1
            agev[] r3 = (defpackage.agev[]) r3     // Catch:{ all -> 0x008b }
            java.util.List r1 = r0.h     // Catch:{ all -> 0x008b }
            r1.clear()     // Catch:{ all -> 0x008b }
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            monitor-exit(r2)     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x0085
            agks r1 = r0.b     // Catch:{ all -> 0x008e }
            agew r2 = r0.g     // Catch:{ all -> 0x008e }
            basu r2 = r2.a((defpackage.agev[]) r3)     // Catch:{ all -> 0x008e }
            r1.a(r2)     // Catch:{ all -> 0x008e }
        L_0x0085:
            java.util.concurrent.atomic.AtomicInteger r0 = r0.j
            r0.decrementAndGet()
            return
        L_0x008b:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicInteger r0 = r0.j
            r0.decrementAndGet()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agez.run():void");
    }
}
