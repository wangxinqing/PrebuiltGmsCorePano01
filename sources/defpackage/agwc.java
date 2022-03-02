package defpackage;

/* renamed from: agwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwc implements amsv {
    private final agwj a;

    public agwc(agwj agwj) {
        this.a = agwj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r13 = this;
            agwj r1 = r13.a
            boolean r0 = defpackage.agwj.a
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r1.f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Querying for "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x001a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x001e
        L_0x001a:
            java.lang.String r0 = r2.concat(r0)
        L_0x001e:
            android.os.Trace.beginSection(r0)
        L_0x0021:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = r1.f     // Catch:{ all -> 0x0100 }
            android.net.Uri r0 = defpackage.agvj.a(r0)     // Catch:{ all -> 0x0100 }
            agvm r2 = r1.e     // Catch:{ all -> 0x0100 }
            android.content.Context r2 = r2.d     // Catch:{ all -> 0x0100 }
            boolean r2 = defpackage.agvi.a(r2, r0)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00de
            java.lang.Class<agwj> r2 = defpackage.agwj.class
            monitor-enter(r2)     // Catch:{ all -> 0x0100 }
            amri r3 = defpackage.agwj.d     // Catch:{ all -> 0x00db }
            boolean r3 = r3.a()     // Catch:{ all -> 0x00db }
            r6 = 0
            if (r3 == 0) goto L_0x0046
            goto L_0x006c
        L_0x0046:
            agvm r3 = r1.e     // Catch:{ NameNotFoundException -> 0x00ce }
            android.content.Context r3 = r3.d     // Catch:{ NameNotFoundException -> 0x00ce }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ce }
            java.lang.String r7 = "com.google.android.gms"
            r10 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r10)     // Catch:{ NameNotFoundException -> 0x00ce }
            agvm r7 = r1.e     // Catch:{ all -> 0x00db }
            android.content.Context r7 = r7.d     // Catch:{ all -> 0x00db }
            hya r7 = defpackage.hya.a((android.content.Context) r7)     // Catch:{ all -> 0x00db }
            boolean r3 = r7.b((android.content.pm.PackageInfo) r3)     // Catch:{ all -> 0x00db }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00db }
            amri r3 = defpackage.amri.b(r3)     // Catch:{ all -> 0x00db }
            defpackage.agwj.d = r3     // Catch:{ all -> 0x00db }
        L_0x006c:
            amri r3 = defpackage.agwj.d     // Catch:{ all -> 0x00db }
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x00db }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00db }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x00db }
            monitor-exit(r2)     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x00de
            agvm r2 = r1.e     // Catch:{ all -> 0x0100 }
            android.content.Context r2 = r2.d     // Catch:{ all -> 0x0100 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0100 }
            agvm r3 = r1.e     // Catch:{ all -> 0x0100 }
            android.content.Context r3 = r3.d     // Catch:{ all -> 0x0100 }
            boolean r3 = defpackage.aekv.a(r3)     // Catch:{ all -> 0x0100 }
            if (r3 != 0) goto L_0x009a
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0100 }
            java.lang.String r7 = "account"
            r3[r6] = r7     // Catch:{ all -> 0x0100 }
            r6 = 1
            java.lang.String r7 = ""
            r3[r6] = r7     // Catch:{ all -> 0x0100 }
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            android.os.StrictMode$ThreadPolicy r6 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0100 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00bb }
            android.os.CancellationSignal r7 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x00bb }
            r7.<init>()     // Catch:{ IOException -> 0x00bb }
            java.util.Map r0 = r1.a((android.content.ContentResolver) r2, (android.net.Uri) r0, (java.lang.String[]) r3, (android.os.CancellationSignal) r7)     // Catch:{ IOException -> 0x00bb }
            agvm r2 = r1.e     // Catch:{ IOException -> 0x00bb }
            aorv r2 = r2.a()     // Catch:{ IOException -> 0x00bb }
            agwg r3 = new agwg     // Catch:{ IOException -> 0x00bb }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x00bb }
            r2.execute(r3)     // Catch:{ IOException -> 0x00bb }
            goto L_0x00c5
        L_0x00b9:
            r0 = move-exception
            goto L_0x00ca
        L_0x00bb:
            r0 = move-exception
            java.lang.String r0 = "ContentProviderFlagSource"
            java.lang.String r2 = "Could not read flags from disk snapshot, falling back to default values"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x00b9 }
            anaf r0 = defpackage.anfu.b     // Catch:{ all -> 0x00b9 }
        L_0x00c5:
            android.os.StrictMode.setThreadPolicy(r6)     // Catch:{ all -> 0x0100 }
            r10 = r0
            goto L_0x00e1
        L_0x00ca:
            android.os.StrictMode.setThreadPolicy(r6)     // Catch:{ all -> 0x0100 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x00ce:
            r0 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00db }
            amri r0 = defpackage.amri.b(r0)     // Catch:{ all -> 0x00db }
            defpackage.agwj.d = r0     // Catch:{ all -> 0x00db }
            monitor-exit(r2)     // Catch:{ all -> 0x00db }
            goto L_0x00de
        L_0x00db:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x00de:
            anaf r0 = defpackage.anfu.b     // Catch:{ all -> 0x0100 }
            r10 = r0
        L_0x00e1:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r6 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = defpackage.agwj.a
            if (r0 == 0) goto L_0x00f0
            android.os.Trace.endSection()
        L_0x00f0:
            agvm r0 = r1.e
            aorv r11 = r0.a()
            agwe r12 = new agwe
            r0 = r12
            r0.<init>(r1, r2, r4, r6, r8)
            r11.execute(r12)
            return r10
        L_0x0100:
            r0 = move-exception
            r10 = r0
            long r2 = android.os.SystemClock.uptimeMillis()
            long r6 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = defpackage.agwj.a
            if (r0 == 0) goto L_0x0111
            android.os.Trace.endSection()
        L_0x0111:
            agvm r0 = r1.e
            aorv r11 = r0.a()
            agwf r12 = new agwf
            r0 = r12
            r0.<init>(r1, r2, r4, r6, r8)
            r11.execute(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwc.a():java.lang.Object");
    }
}
