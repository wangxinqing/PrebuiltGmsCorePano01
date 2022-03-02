package defpackage;

/* renamed from: nho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nho implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r2.hasNext() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3 = (defpackage.nhc) r2.next();
        r4 = r3.a(r1.g, r1.h);
        r5 = r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5 <= 60000) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        defpackage.ngz.a("FontsServer", "Fetch for %s (status %s) cancelled for timeout after %d ms", r3.c, r4, java.lang.Long.valueOf(r5));
        r1.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            nhz r1 = defpackage.nhz.a     // Catch:{ Exception -> 0x0063 }
            nhf r1 = r1.a()     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r2 = r1.e     // Catch:{ Exception -> 0x0063 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0063 }
            java.util.Map r3 = r1.f     // Catch:{ all -> 0x0060 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x005e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0060 }
            java.util.Map r4 = r1.f     // Catch:{ all -> 0x0060 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0060 }
            r3.<init>(r4)     // Catch:{ all -> 0x0060 }
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ Exception -> 0x0063 }
        L_0x0022:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0063 }
            nhc r3 = (defpackage.nhc) r3     // Catch:{ Exception -> 0x0063 }
            ngm r4 = r1.g     // Catch:{ Exception -> 0x0063 }
            ngo r5 = r1.h     // Catch:{ Exception -> 0x0063 }
            com.google.android.gms.common.api.Status r4 = r3.a((defpackage.ngm) r4, (defpackage.ngo) r5)     // Catch:{ Exception -> 0x0063 }
            long r5 = r3.b()     // Catch:{ Exception -> 0x0063 }
            r7 = 60000(0xea60, double:2.9644E-319)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0022
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0063 }
            com.google.android.gms.fonts.FontMatchSpec r8 = r3.c     // Catch:{ Exception -> 0x0063 }
            r7[r0] = r8     // Catch:{ Exception -> 0x0063 }
            r8 = 1
            r7[r8] = r4     // Catch:{ Exception -> 0x0063 }
            r4 = 2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0063 }
            r7[r4] = r5     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "FontsServer"
            java.lang.String r5 = "Fetch for %s (status %s) cancelled for timeout after %d ms"
            defpackage.ngz.a(r4, r5, r7)     // Catch:{ Exception -> 0x0063 }
            r1.a((defpackage.nhc) r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0022
        L_0x005d:
            return
        L_0x005e:
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "FontsDownloadResultPump"
            java.lang.String r3 = "failed async checkComplete"
            defpackage.ngz.a((java.lang.String) r2, (java.lang.Throwable) r1, (java.lang.String) r3, (java.lang.Object[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nho.run():void");
    }
}
