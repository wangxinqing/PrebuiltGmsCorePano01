package defpackage;

/* renamed from: pxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxb {
    static int a;
    static boolean b;
    private static final Object c = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[Catch:{ all -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            agvx r0 = defpackage.ozx.bv
            java.lang.Object r0 = r0.c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = c
            monitor-enter(r1)
            int r2 = a     // Catch:{ all -> 0x00dc }
            if (r2 == r0) goto L_0x00d8
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0071
            r4 = 2
            r5 = 4
            if (r0 == r4) goto L_0x005d
            r4 = 3
            if (r0 == r4) goto L_0x0049
            if (r0 == r5) goto L_0x0023
            b = r3     // Catch:{ Exception -> 0x008c }
            goto L_0x0073
        L_0x0023:
            ihs r4 = defpackage.ihs.b()     // Catch:{ Exception -> 0x008c }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "com.google.android.tv"
            boolean r5 = r4.hasSystemFeature(r5)     // Catch:{ Exception -> 0x008c }
            if (r5 != 0) goto L_0x0045
            java.lang.String r5 = "android.hardware.type.television"
            boolean r5 = r4.hasSystemFeature(r5)     // Catch:{ Exception -> 0x008c }
            if (r5 != 0) goto L_0x0045
            java.lang.String r5 = "android.software.leanback"
            boolean r4 = r4.hasSystemFeature(r5)     // Catch:{ Exception -> 0x008c }
            if (r4 != 0) goto L_0x0045
            r2 = 0
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            b = r2     // Catch:{ Exception -> 0x008c }
            goto L_0x0073
        L_0x0049:
            ihs r4 = defpackage.ihs.b()     // Catch:{ Exception -> 0x008c }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0059 }
            java.lang.String r5 = "com.google.android.katniss"
            r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0059 }
            b = r2     // Catch:{ NameNotFoundException -> 0x0059 }
            goto L_0x0073
        L_0x0059:
            r2 = move-exception
            b = r3     // Catch:{ Exception -> 0x008c }
            goto L_0x0073
        L_0x005d:
            ihs r4 = defpackage.ihs.b()     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch:{ Exception -> 0x008c }
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4     // Catch:{ Exception -> 0x008c }
            int r4 = r4.getCurrentModeType()     // Catch:{ Exception -> 0x008c }
            if (r4 != r5) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            b = r2     // Catch:{ Exception -> 0x008c }
        L_0x0073:
            a = r0     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Using %s flags by method %d"
            boolean r2 = b     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x007e
            java.lang.String r2 = "regular"
            goto L_0x0080
        L_0x007e:
            java.lang.String r2 = "TV"
        L_0x0080:
            int r3 = a     // Catch:{ all -> 0x00dc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00dc }
        L_0x0086:
            defpackage.oso.c((java.lang.String) r0, (java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x00dc }
            goto L_0x00d8
        L_0x008a:
            r2 = move-exception
            goto L_0x00c1
        L_0x008c:
            r2 = move-exception
            b = r3     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Failure resolving TV device"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
            defpackage.oso.g(r2, r4)     // Catch:{ all -> 0x008a }
            oyq r2 = new oyq     // Catch:{ Exception -> 0x00a5 }
            ihs r4 = defpackage.ihs.b()     // Catch:{ Exception -> 0x00a5 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00a5 }
            r4 = 10005(0x2715, float:1.402E-41)
            r2.b(r4)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00ad
        L_0x00a5:
            r2 = move-exception
            java.lang.String r2 = "Failure logging TV device resolution error"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
            defpackage.oso.g(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x00ad:
            a = r0     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Using %s flags by method %d"
            boolean r2 = b     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = "regular"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r2 = "TV"
        L_0x00ba:
            int r3 = a     // Catch:{ all -> 0x00dc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00dc }
            goto L_0x0086
        L_0x00c1:
            a = r0     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Using %s flags by method %d"
            boolean r3 = b     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = "regular"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r3 = "TV"
        L_0x00ce:
            int r4 = a     // Catch:{ all -> 0x00dc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00dc }
            defpackage.oso.c((java.lang.String) r0, (java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x00dc }
            throw r2     // Catch:{ all -> 0x00dc }
        L_0x00d8:
            monitor-exit(r1)     // Catch:{ all -> 0x00dc }
            boolean r0 = b
            return r0
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00e0
        L_0x00df:
            throw r0
        L_0x00e0:
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxb.a():boolean");
    }
}
