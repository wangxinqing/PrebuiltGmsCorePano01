package defpackage;

/* renamed from: acvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acvc {
    static final agvx a;
    private static final agvw b;

    static {
        agvw agvw = new agvw(yef.a("com.google.android.gms"));
        b = agvw;
        a = agvx.a(agvw, "gms:system_health:lockbox_status", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r1 = r1.getAllProviders();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aoip a(android.content.Context r7) {
        /*
            aoip r0 = defpackage.aoip.h
            aucd r0 = r0.o()
            int r1 = defpackage.acvb.a
            java.lang.String r1 = "location"
            java.lang.Object r2 = r7.getSystemService(r1)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0016
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            boolean r5 = r0.c
            if (r5 == 0) goto L_0x0020
            r0.c()
            r0.c = r4
        L_0x0020:
            aucj r5 = r0.b
            aoip r5 = (defpackage.aoip) r5
            int r6 = r5.a
            r6 = r6 | r3
            r5.a = r6
            r5.b = r2
            java.lang.Object r1 = r7.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 == 0) goto L_0x0040
            java.util.List r1 = r1.getAllProviders()
            if (r1 == 0) goto L_0x0040
            java.lang.String r2 = "network"
            boolean r1 = r1.contains(r2)
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r0.c()
            r0.c = r4
        L_0x004b:
            aucj r2 = r0.b
            aoip r2 = (defpackage.aoip) r2
            int r5 = r2.a
            r5 = r5 | 2
            r2.a = r5
            r2.c = r1
            defpackage.acvb.a((android.content.Context) r7, (defpackage.aucd) r0)
            iby r1 = defpackage.adrz.b(r7)     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            acwa r1 = r1.o()     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            r5 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            java.lang.Object r1 = defpackage.acws.a(r1, r5, r2)     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            ick r1 = (defpackage.ick) r1     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            boolean r1 = r1.p()     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            if (r1 != 0) goto L_0x0073
            goto L_0x0096
        L_0x0073:
            boolean r1 = r0.c     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            if (r1 != 0) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r0.c()     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            r0.c = r4     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
        L_0x007d:
            aucj r1 = r0.b     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            aoip r1 = (defpackage.aoip) r1     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            int r2 = r1.a     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            r2 = r2 | 8
            r1.a = r2     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            r1.e = r3     // Catch:{ ExecutionException -> 0x0095, TimeoutException -> 0x0093, InterruptedException -> 0x008a }
            goto L_0x0096
        L_0x008a:
            r1 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x0096
        L_0x0093:
            r1 = move-exception
            goto L_0x0096
        L_0x0095:
            r1 = move-exception
        L_0x0096:
            aoik r1 = defpackage.aoik.b
            aucd r1 = r1.o()
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L_0x00da
            android.accounts.AccountManager r2 = android.accounts.AccountManager.get(r7)
            java.lang.String r3 = "com.google"
            defpackage.acva.a(r7, r2, r3, r1)
            java.lang.String r3 = "cn.google"
            defpackage.acva.a(r7, r2, r3, r1)
            aucj r7 = r1.i()
            aoik r7 = (defpackage.aoik) r7
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            r0.c()
            r0.c = r4
        L_0x00c4:
            aucj r1 = r0.b
            aoip r1 = (defpackage.aoip) r1
            r7.getClass()
            r1.f = r7
            int r7 = r1.a
            r7 = r7 | 16
            r1.a = r7
            aucj r7 = r0.i()
            aoip r7 = (defpackage.aoip) r7
            return r7
        L_0x00da:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot gather auth health data from main thread"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvc.a(android.content.Context):aoip");
    }
}
