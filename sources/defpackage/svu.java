package defpackage;

/* renamed from: svu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svu implements Runnable {
    final /* synthetic */ swt a;
    final /* synthetic */ svv b;

    public svu(svv svv, swt swt) {
        this.b = svv;
        this.a = swt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0762  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            svv r0 = r14.b
            swt r1 = r14.a
            r0.p()
            spg r2 = r0.g
            r2.a()
            spn r2 = new spn
            r2.<init>(r0)
            r2.l()
            r0.p = r2
            suh r2 = new suh
            long r3 = r1.f
            r2.<init>(r0, r3)
            r2.m()
            r0.q = r2
            suj r1 = new suj
            r1.<init>(r0)
            r1.m()
            r0.n = r1
            sye r1 = new sye
            r1.<init>(r0)
            r1.m()
            r0.o = r1
            szj r1 = r0.k
            r1.m()
            svf r1 = r0.h
            r1.m()
            svi r1 = new svi
            r1.<init>(r0)
            r0.r = r1
            suh r1 = r0.q
            boolean r3 = r1.a
            if (r3 != 0) goto L_0x0807
            android.content.Context r3 = r1.z()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r1.z()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r5 = "unknown"
            java.lang.String r6 = "Unknown"
            java.lang.String r7 = "Unknown"
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            if (r4 != 0) goto L_0x0078
            sut r7 = r1.E()
            sur r7 = r7.c
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r3)
            java.lang.String r11 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.a(r11, r10)
            goto L_0x00d5
        L_0x0078:
            java.lang.String r5 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x007d }
            goto L_0x008d
        L_0x007d:
            r10 = move-exception
            sut r10 = r1.E()
            sur r10 = r10.c
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r3)
            java.lang.String r12 = "Error retrieving app installer package name. appId"
            r10.a(r12, r11)
        L_0x008d:
            if (r5 != 0) goto L_0x0092
            java.lang.String r5 = "manual_install"
            goto L_0x009d
        L_0x0092:
            java.lang.String r10 = "com.android.vending"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x009d
            java.lang.String r5 = ""
        L_0x009d:
            android.content.Context r10 = r1.z()     // Catch:{ NameNotFoundException -> 0x00c5 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c5 }
            android.content.pm.PackageInfo r10 = r4.getPackageInfo(r10, r9)     // Catch:{ NameNotFoundException -> 0x00c5 }
            if (r10 == 0) goto L_0x00c4
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo     // Catch:{ NameNotFoundException -> 0x00c5 }
            java.lang.CharSequence r11 = r4.getApplicationLabel(r11)     // Catch:{ NameNotFoundException -> 0x00c5 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ NameNotFoundException -> 0x00c5 }
            if (r12 != 0) goto L_0x00bc
            java.lang.String r7 = r11.toString()     // Catch:{ NameNotFoundException -> 0x00c5 }
            goto L_0x00bd
        L_0x00bc:
        L_0x00bd:
            java.lang.String r6 = r10.versionName     // Catch:{ NameNotFoundException -> 0x00c2 }
            int r8 = r10.versionCode     // Catch:{ NameNotFoundException -> 0x00c2 }
            goto L_0x00c4
        L_0x00c2:
            r10 = move-exception
            goto L_0x00c6
        L_0x00c4:
            goto L_0x00d5
        L_0x00c5:
            r10 = move-exception
        L_0x00c6:
            sut r10 = r1.E()
            sur r10 = r10.c
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r3)
            java.lang.String r12 = "Error retrieving package info. appId, appName"
            r10.a(r12, r11, r7)
        L_0x00d5:
            r1.b = r3
            r1.e = r5
            r1.c = r6
            r1.d = r8
            r5 = 0
            r1.f = r5
            spc r7 = r1.u()
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x014a
            android.content.Context r7 = r1.z()
            java.lang.String r8 = "Context must not be null."
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r8)
            java.lang.String r7 = "-"
            java.lang.String r8 = "App ID must be nonempty."
            defpackage.iva.a((java.lang.String) r7, (java.lang.Object) r8)
            java.lang.Object r8 = defpackage.ifr.a
            monitor-enter(r8)
            ifr r10 = defpackage.ifr.b     // Catch:{ all -> 0x0147 }
            if (r10 != 0) goto L_0x010d
            ifr r10 = new ifr     // Catch:{ all -> 0x0147 }
            r10.<init>((java.lang.String) r7)     // Catch:{ all -> 0x0147 }
            defpackage.ifr.b = r10     // Catch:{ all -> 0x0147 }
            ifr r7 = defpackage.ifr.b     // Catch:{ all -> 0x0147 }
            com.google.android.gms.common.api.Status r7 = r7.d     // Catch:{ all -> 0x0147 }
            monitor-exit(r8)     // Catch:{ all -> 0x0147 }
            goto L_0x0166
        L_0x010d:
            ifr r10 = defpackage.ifr.b     // Catch:{ all -> 0x0147 }
            java.lang.String r11 = r10.c     // Catch:{ all -> 0x0147 }
            if (r11 == 0) goto L_0x0143
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x0147 }
            if (r7 != 0) goto L_0x0143
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0147 }
            java.lang.String r10 = r10.c     // Catch:{ all -> 0x0147 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0147 }
            int r11 = r11.length()     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            int r11 = r11 + 97
            r12.<init>(r11)     // Catch:{ all -> 0x0147 }
            java.lang.String r11 = "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '"
            r12.append(r11)     // Catch:{ all -> 0x0147 }
            r12.append(r10)     // Catch:{ all -> 0x0147 }
            java.lang.String r10 = "'."
            r12.append(r10)     // Catch:{ all -> 0x0147 }
            r10 = 10
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0147 }
            r7.<init>(r10, r11)     // Catch:{ all -> 0x0147 }
            goto L_0x0145
        L_0x0143:
            com.google.android.gms.common.api.Status r7 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x0147 }
        L_0x0145:
            monitor-exit(r8)     // Catch:{ all -> 0x0147 }
            goto L_0x0166
        L_0x0147:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0147 }
            throw r0
        L_0x014a:
            android.content.Context r7 = r1.z()
            java.lang.String r8 = "Context must not be null."
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r8)
            java.lang.Object r8 = defpackage.ifr.a
            monitor-enter(r8)
            ifr r10 = defpackage.ifr.b     // Catch:{ all -> 0x0804 }
            if (r10 != 0) goto L_0x0161
            ifr r10 = new ifr     // Catch:{ all -> 0x0804 }
            r10.<init>((android.content.Context) r7)     // Catch:{ all -> 0x0804 }
            defpackage.ifr.b = r10     // Catch:{ all -> 0x0804 }
        L_0x0161:
            ifr r7 = defpackage.ifr.b     // Catch:{ all -> 0x0804 }
            com.google.android.gms.common.api.Status r7 = r7.d     // Catch:{ all -> 0x0804 }
            monitor-exit(r8)     // Catch:{ all -> 0x0804 }
        L_0x0166:
            r8 = 1
            if (r7 == 0) goto L_0x0171
            boolean r10 = r7.c()
            if (r10 == 0) goto L_0x0171
            r10 = 1
            goto L_0x0172
        L_0x0171:
            r10 = 0
        L_0x0172:
            svv r11 = r1.x
            java.lang.String r11 = r11.b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x018a
            svv r11 = r1.x
            java.lang.String r11 = r11.c
            java.lang.String r12 = "am"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x018a
            r11 = 1
            goto L_0x018b
        L_0x018a:
            r11 = 0
        L_0x018b:
            r10 = r10 | r11
            if (r10 == 0) goto L_0x0281
            boolean r7 = defpackage.ayjk.b()
            if (r7 == 0) goto L_0x0212
            spg r7 = r1.v()
            suc r10 = defpackage.sud.aI
            boolean r7 = r7.a((defpackage.suc) r10)
            if (r7 != 0) goto L_0x01a2
            goto L_0x0212
        L_0x01a2:
            svv r7 = r1.x
            int r7 = r7.r()
            switch(r7) {
                case 0: goto L_0x01ff;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01e7;
                case 3: goto L_0x01db;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01c3;
                case 6: goto L_0x01b7;
                default: goto L_0x01ab;
            }
        L_0x01ab:
            sut r10 = r1.E()
            sur r10 = r10.i
            java.lang.String r12 = "App measurement disabled via the global data collection setting"
            r10.a(r12)
            goto L_0x020a
        L_0x01b7:
            sut r10 = r1.E()
            sur r10 = r10.h
            java.lang.String r12 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r10.a(r12)
            goto L_0x020a
        L_0x01c3:
            sut r10 = r1.E()
            sur r10 = r10.k
            java.lang.String r12 = "App measurement disabled via the init parameters"
            r10.a(r12)
            goto L_0x020a
        L_0x01cf:
            sut r10 = r1.E()
            sur r10 = r10.i
            java.lang.String r12 = "App measurement disabled via the manifest"
            r10.a(r12)
            goto L_0x020a
        L_0x01db:
            sut r10 = r1.E()
            sur r10 = r10.i
            java.lang.String r12 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r10.a(r12)
            goto L_0x020a
        L_0x01e7:
            sut r10 = r1.E()
            sur r10 = r10.k
            java.lang.String r12 = "App measurement deactivated via the init parameters"
            r10.a(r12)
            goto L_0x020a
        L_0x01f3:
            sut r10 = r1.E()
            sur r10 = r10.i
            java.lang.String r12 = "App measurement deactivated via the manifest"
            r10.a(r12)
            goto L_0x020a
        L_0x01ff:
            sut r10 = r1.E()
            sur r10 = r10.k
            java.lang.String r12 = "App measurement collection enabled"
            r10.a(r12)
        L_0x020a:
            if (r7 == 0) goto L_0x020f
            r7 = 0
            goto L_0x02a4
        L_0x020f:
            r7 = 1
            goto L_0x02a4
        L_0x0212:
            spg r7 = r1.v()
            java.lang.Boolean r7 = r7.e()
            spg r10 = r1.v()
            boolean r10 = r10.d()
            if (r10 == 0) goto L_0x023c
            svv r7 = r1.x
            boolean r7 = r7.j()
            if (r7 == 0) goto L_0x023a
            sut r7 = r1.E()
            sur r7 = r7.i
            java.lang.String r10 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r7.a(r10)
            r7 = 0
            goto L_0x02a4
        L_0x023a:
            r7 = 0
            goto L_0x02a4
        L_0x023c:
            if (r7 == 0) goto L_0x025b
            boolean r10 = r7.booleanValue()
            if (r10 != 0) goto L_0x025b
            svv r7 = r1.x
            boolean r7 = r7.j()
            if (r7 == 0) goto L_0x0258
            sut r7 = r1.E()
            sur r7 = r7.i
            java.lang.String r10 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r7.a(r10)
            goto L_0x0259
        L_0x0258:
        L_0x0259:
            r7 = 0
            goto L_0x02a4
        L_0x025b:
            if (r7 == 0) goto L_0x025e
            goto L_0x0274
        L_0x025e:
            r1.v()
            boolean r7 = defpackage.ifr.b()
            if (r7 == 0) goto L_0x0274
            sut r7 = r1.E()
            sur r7 = r7.i
            java.lang.String r10 = "Collection disabled with google_app_measurement_enable=0"
            r7.a(r10)
            r7 = 0
            goto L_0x02a4
        L_0x0274:
            sut r7 = r1.E()
            sur r7 = r7.k
            java.lang.String r10 = "Collection enabled"
            r7.a(r10)
            r7 = 1
            goto L_0x02a4
        L_0x0281:
            if (r7 == 0) goto L_0x0298
            sut r10 = r1.E()
            sur r10 = r10.d
            int r12 = r7.i
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r7 = r7.j
            java.lang.String r13 = "GoogleService failed to initialize, status"
            r10.a(r13, r12, r7)
            r7 = 0
            goto L_0x02a4
        L_0x0298:
            sut r7 = r1.E()
            sur r7 = r7.d
            java.lang.String r10 = "GoogleService failed to initialize (no status)"
            r7.a(r10)
            r7 = 0
        L_0x02a4:
            java.lang.String r10 = ""
            r1.j = r10
            java.lang.String r10 = ""
            r1.k = r10
            java.lang.String r10 = ""
            r1.l = r10
            spc r10 = r1.u()
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x02b9
            goto L_0x0319
        L_0x02b9:
            if (r11 != 0) goto L_0x02bc
            goto L_0x02c2
        L_0x02bc:
            svv r10 = r1.x
            java.lang.String r10 = r10.b
            r1.k = r10
        L_0x02c2:
            java.lang.String r10 = defpackage.ifr.a()     // Catch:{ IllegalStateException -> 0x0309 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x0309 }
            if (r11 == 0) goto L_0x02cf
            java.lang.String r11 = ""
            goto L_0x02d0
        L_0x02cf:
            r11 = r10
        L_0x02d0:
            r1.j = r11     // Catch:{ IllegalStateException -> 0x0309 }
            defpackage.ayjy.c()     // Catch:{ IllegalStateException -> 0x0309 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x0309 }
            if (r10 != 0) goto L_0x02ec
            ivr r10 = new ivr     // Catch:{ IllegalStateException -> 0x0309 }
            android.content.Context r11 = r1.z()     // Catch:{ IllegalStateException -> 0x0309 }
            r10.<init>(r11)     // Catch:{ IllegalStateException -> 0x0309 }
            java.lang.String r11 = "admob_app_id"
            java.lang.String r10 = r10.a(r11)     // Catch:{ IllegalStateException -> 0x0309 }
            r1.k = r10     // Catch:{ IllegalStateException -> 0x0309 }
        L_0x02ec:
            if (r7 == 0) goto L_0x0319
            sut r7 = r1.E()     // Catch:{ IllegalStateException -> 0x0309 }
            sur r7 = r7.k     // Catch:{ IllegalStateException -> 0x0309 }
            java.lang.String r10 = "App measurement enabled for app package, google app id"
            java.lang.String r11 = r1.b     // Catch:{ IllegalStateException -> 0x0309 }
            java.lang.String r12 = r1.j     // Catch:{ IllegalStateException -> 0x0309 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IllegalStateException -> 0x0309 }
            if (r12 != 0) goto L_0x0303
            java.lang.String r12 = r1.j     // Catch:{ IllegalStateException -> 0x0309 }
            goto L_0x0305
        L_0x0303:
            java.lang.String r12 = r1.k     // Catch:{ IllegalStateException -> 0x0309 }
        L_0x0305:
            r7.a(r10, r11, r12)     // Catch:{ IllegalStateException -> 0x0309 }
            goto L_0x0319
        L_0x0309:
            r7 = move-exception
            sut r10 = r1.E()
            sur r10 = r10.c
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)
            java.lang.String r11 = "Fetching Google App Id failed with exception. appId"
            r10.a(r11, r3, r7)
        L_0x0319:
            r3 = 0
            r1.h = r3
            spg r7 = r1.v()
            suc r10 = defpackage.sud.ac
            boolean r7 = r7.a((defpackage.suc) r10)
            if (r7 == 0) goto L_0x036d
            spc r7 = r1.u()
            boolean r7 = r7.a
            if (r7 != 0) goto L_0x036d
            spg r7 = r1.v()
            java.lang.String r10 = "analytics.safelisted_events"
            java.util.List r7 = r7.c(r10)
            if (r7 == 0) goto L_0x036b
            int r10 = r7.size()
            if (r10 != 0) goto L_0x034e
            sut r7 = r1.E()
            sur r7 = r7.h
            java.lang.String r10 = "Safelisted event list is empty. Ignoring"
            r7.a(r10)
            goto L_0x036d
        L_0x034e:
            java.util.Iterator r10 = r7.iterator()
        L_0x0352:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x036b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            szj r12 = r1.x()
            java.lang.String r13 = "safelisted event"
            boolean r11 = r12.a((java.lang.String) r13, (java.lang.String) r11)
            if (r11 != 0) goto L_0x0352
            goto L_0x036d
        L_0x036b:
            r1.h = r7
        L_0x036d:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r4 == 0) goto L_0x037c
            android.content.Context r4 = r1.z()
            boolean r4 = defpackage.jng.a(r4)
            r1.i = r4
            goto L_0x037e
        L_0x037c:
            r1.i = r9
        L_0x037e:
            svv r4 = r1.x
            r4.u()
            r1.a = r8
            sut r1 = r0.E()
            sur r1 = r1.i
            spg r4 = r0.g
            long r10 = r4.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.String r7 = "App measurement initialized, version"
            r1.a(r7, r4)
            spc r1 = r0.f
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x03ab
            sut r1 = r0.E()
            sur r1 = r1.i
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.a(r4)
        L_0x03ab:
            spc r1 = r0.f
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x03f0
            java.lang.String r1 = r2.o()
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x03f0
            szj r2 = r0.f()
            boolean r2 = r2.g(r1)
            if (r2 == 0) goto L_0x03d1
            sut r1 = r0.E()
            sur r1 = r1.i
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.a(r2)
            goto L_0x03f0
        L_0x03d1:
            sut r2 = r0.E()
            sur r2 = r2.i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r7 = r1.length()
            if (r7 != 0) goto L_0x03e9
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x03ed
        L_0x03e9:
            java.lang.String r1 = r4.concat(r1)
        L_0x03ed:
            r2.a(r1)
        L_0x03f0:
            sut r1 = r0.E()
            sur r1 = r1.j
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.a(r2)
            int r1 = r0.v
            java.util.concurrent.atomic.AtomicInteger r2 = r0.w
            int r2 = r2.get()
            if (r1 == r2) goto L_0x0420
            sut r1 = r0.E()
            sur r1 = r1.c
            int r2 = r0.v
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.w
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r7 = "Not all components initialized"
            r1.a(r7, r2, r4)
        L_0x0420:
            r0.s = r8
            svv r0 = r14.b
            r0.p()
            svf r1 = r0.a()
            svc r1 = r1.d
            long r1 = r1.a()
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0442
            svf r1 = r0.a()
            svc r1 = r1.d
            long r10 = java.lang.System.currentTimeMillis()
            r1.a(r10)
        L_0x0442:
            svf r1 = r0.a()
            svc r1 = r1.i
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r1 = r1.longValue()
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0474
            sut r1 = r0.E()
            sur r1 = r1.k
            long r4 = r0.x
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Persisting first open"
            r1.a(r4, r2)
            svf r1 = r0.a()
            svc r1 = r1.i
            long r4 = r0.x
            r1.a(r4)
        L_0x0474:
            boolean r1 = r0.v()
            if (r1 == 0) goto L_0x0762
            spc r1 = r0.f
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x05a4
            suh r1 = r0.n()
            java.lang.String r1 = r1.p()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x049c
            suh r1 = r0.n()
            java.lang.String r1 = r1.q()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x05a4
        L_0x049c:
            szj r1 = r0.f()
            suh r2 = r0.n()
            java.lang.String r2 = r2.p()
            svf r4 = r0.a()
            r4.h()
            android.content.SharedPreferences r4 = r4.c()
            java.lang.String r5 = "gmp_app_id"
            java.lang.String r4 = r4.getString(r5, r3)
            suh r5 = r0.n()
            java.lang.String r5 = r5.q()
            svf r6 = r0.a()
            r6.h()
            android.content.SharedPreferences r6 = r6.c()
            java.lang.String r7 = "admob_app_id"
            java.lang.String r6 = r6.getString(r7, r3)
            boolean r1 = r1.a((java.lang.String) r2, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
            if (r1 == 0) goto L_0x0566
            sut r1 = r0.E()
            sur r1 = r1.i
            java.lang.String r2 = "Rechecking which service to use due to a GMP App Id change"
            r1.a(r2)
            svf r1 = r0.a()
            r1.h()
            java.lang.Boolean r2 = r1.d()
            android.content.SharedPreferences r4 = r1.c()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.clear()
            r4.apply()
            if (r2 == 0) goto L_0x0515
            boolean r2 = r2.booleanValue()
            r1.h()
            android.content.SharedPreferences r1 = r1.c()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = "measurement_enabled"
            r1.putBoolean(r4, r2)
            r1.apply()
        L_0x0515:
            suj r1 = r0.h()
            r1.i()
            r1.h()
            android.database.sqlite.SQLiteDatabase r2 = r1.o()     // Catch:{ SQLiteException -> 0x053c }
            java.lang.String r4 = "messages"
            int r2 = r2.delete(r4, r3, r3)     // Catch:{ SQLiteException -> 0x053c }
            if (r2 > 0) goto L_0x052c
            goto L_0x0548
        L_0x052c:
            sut r4 = r1.E()     // Catch:{ SQLiteException -> 0x053c }
            sur r4 = r4.k     // Catch:{ SQLiteException -> 0x053c }
            java.lang.String r5 = "Reset local analytics data. records"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x053c }
            r4.a(r5, r2)     // Catch:{ SQLiteException -> 0x053c }
            goto L_0x0548
        L_0x053c:
            r2 = move-exception
            sut r1 = r1.E()
            sur r1 = r1.c
            java.lang.String r4 = "Error resetting local analytics data. error"
            r1.a(r4, r2)
        L_0x0548:
            sye r1 = r0.o
            r1.t()
            sye r1 = r0.o
            r1.r()
            svf r1 = r0.a()
            svc r1 = r1.i
            long r4 = r0.x
            r1.a(r4)
            svf r1 = r0.a()
            sve r1 = r1.k
            r1.a(r3)
        L_0x0566:
            svf r1 = r0.a()
            suh r2 = r0.n()
            java.lang.String r2 = r2.p()
            r1.h()
            android.content.SharedPreferences r1 = r1.c()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = "gmp_app_id"
            r1.putString(r4, r2)
            r1.apply()
            svf r1 = r0.a()
            suh r2 = r0.n()
            java.lang.String r2 = r2.q()
            r1.h()
            android.content.SharedPreferences r1 = r1.c()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = "admob_app_id"
            r1.putString(r4, r2)
            r1.apply()
        L_0x05a4:
            sxd r1 = r0.e()
            svf r2 = r0.a()
            sve r2 = r2.k
            java.lang.String r2 = r2.a()
            r1.a(r2)
            spc r1 = r0.f
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x07e1
            boolean r1 = defpackage.ayis.b()
            if (r1 == 0) goto L_0x0602
            spg r1 = r0.g
            suc r2 = defpackage.sud.aC
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x0602
            szj r1 = r0.f()
            android.content.Context r1 = r1.z()     // Catch:{ ClassNotFoundException -> 0x05dd }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x05dd }
            java.lang.String r2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x05dd }
            goto L_0x0602
        L_0x05dd:
            r1 = move-exception
            svf r1 = r0.a()
            sve r1 = r1.w
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0602
            sut r1 = r0.E()
            sur r1 = r1.f
            java.lang.String r2 = "Remote config removed with active feature rollouts"
            r1.a(r2)
            svf r1 = r0.a()
            sve r1 = r1.w
            r1.a(r3)
        L_0x0602:
            suh r1 = r0.n()
            java.lang.String r1 = r1.p()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x061e
            suh r1 = r0.n()
            java.lang.String r1 = r1.q()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x07e1
        L_0x061e:
            boolean r1 = r0.q()
            svf r2 = r0.a()
            android.content.SharedPreferences r2 = r2.b
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0660
            spg r2 = r0.g
            boolean r2 = r2.d()
            if (r2 != 0) goto L_0x0660
            svf r2 = r0.a()
            r4 = r1 ^ 1
            r2.h()
            sut r5 = r2.E()
            sur r5 = r5.k
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.String r7 = "App measurement setting deferred collection"
            r5.a(r7, r6)
            android.content.SharedPreferences r2 = r2.c()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r5 = "deferred_analytics_collection"
            r2.putBoolean(r5, r4)
            r2.apply()
        L_0x0660:
            if (r1 != 0) goto L_0x0664
            goto L_0x073c
        L_0x0664:
            sxd r1 = r0.e()
            r1.h()
            r1.i()
            r1.l()
            svv r2 = r1.x
            boolean r2 = r2.v()
            if (r2 == 0) goto L_0x073c
            spg r2 = r1.v()
            suc r4 = defpackage.sud.an
            boolean r2 = r2.a((defpackage.suc) r4)
            if (r2 == 0) goto L_0x06b6
            spg r2 = r1.v()
            spc r4 = r2.u()
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x06b6
            java.lang.String r4 = "google_analytics_deferred_deep_link_enabled"
            java.lang.Boolean r2 = r2.b(r4)
            if (r2 == 0) goto L_0x06b6
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x06b6
            sut r2 = r1.E()
            sur r2 = r2.j
            java.lang.String r4 = "Deferred Deep Link feature enabled."
            r2.a(r4)
            svs r2 = r1.F()
            swu r4 = new swu
            r4.<init>(r1)
            r2.a((java.lang.Runnable) r4)
        L_0x06b6:
            sye r2 = r1.d()
            r2.h()
            r2.l()
            com.google.android.gms.measurement.internal.AppMetadata r4 = r2.a((boolean) r8)
            spg r5 = r2.v()
            suc r6 = defpackage.sud.ao
            boolean r5 = r5.a((defpackage.suc) r6)
            if (r5 == 0) goto L_0x06da
            suj r6 = r2.b()
            r7 = 3
            byte[] r8 = new byte[r9]
            r6.a(r7, r8)
        L_0x06da:
            sxq r6 = new sxq
            r6.<init>(r2, r4, r5)
            r2.a((java.lang.Runnable) r6)
            svf r2 = r1.w()
            r2.h()
            android.content.SharedPreferences r4 = r2.c()
            java.lang.String r5 = "previous_os_version"
            java.lang.String r3 = r4.getString(r5, r3)
            spn r4 = r2.B()
            java.lang.String r4 = r4.c()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0717
            boolean r5 = r4.equals(r3)
            if (r5 != 0) goto L_0x0717
            android.content.SharedPreferences r2 = r2.c()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r5 = "previous_os_version"
            r2.putString(r5, r4)
            r2.apply()
        L_0x0717:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x073c
            spn r2 = r1.B()
            java.lang.String r2 = r2.c()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x073c
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "_po"
            r2.putString(r4, r3)
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_ou"
            r1.a((java.lang.String) r3, (java.lang.String) r4, (android.os.Bundle) r2)
        L_0x073c:
            sys r1 = r0.d()
            syr r1 = r1.c
            defpackage.ayjq.c()
            sye r1 = r0.l()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.h()
            r1.l()
            com.google.android.gms.measurement.internal.AppMetadata r3 = r1.a((boolean) r9)
            sxp r4 = new sxp
            r4.<init>(r1, r2, r3)
            r1.a((java.lang.Runnable) r4)
            goto L_0x07e1
        L_0x0762:
            boolean r1 = r0.q()
            if (r1 == 0) goto L_0x07e1
            szj r1 = r0.f()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.e(r2)
            if (r1 != 0) goto L_0x077f
            sut r1 = r0.E()
            sur r1 = r1.c
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.a(r2)
        L_0x077f:
            szj r1 = r0.f()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.e(r2)
            if (r1 != 0) goto L_0x0796
            sut r1 = r0.E()
            sur r1 = r1.c
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.a(r2)
        L_0x0796:
            spc r1 = r0.f
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x07d6
            android.content.Context r1 = r0.a
            jnh r1 = defpackage.jni.b(r1)
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x07d6
            spg r1 = r0.g
            boolean r1 = r1.k()
            if (r1 != 0) goto L_0x07d6
            android.content.Context r1 = r0.a
            boolean r1 = defpackage.svm.a(r1)
            if (r1 != 0) goto L_0x07c3
            sut r1 = r0.E()
            sur r1 = r1.c
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.a(r2)
        L_0x07c3:
            android.content.Context r1 = r0.a
            boolean r1 = defpackage.szj.a((android.content.Context) r1)
            if (r1 != 0) goto L_0x07d6
            sut r1 = r0.E()
            sur r1 = r1.c
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.a(r2)
        L_0x07d6:
            sut r1 = r0.E()
            sur r1 = r1.c
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.a(r2)
        L_0x07e1:
            svf r1 = r0.a()
            svb r1 = r1.o
            spg r2 = r0.g
            suc r3 = defpackage.sud.Z
            boolean r2 = r2.a((defpackage.suc) r3)
            r1.a(r2)
            svf r1 = r0.a()
            svb r1 = r1.p
            spg r0 = r0.g
            suc r2 = defpackage.sud.aa
            boolean r0 = r0.a((defpackage.suc) r2)
            r1.a(r0)
            return
        L_0x0804:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0804 }
            throw r0
        L_0x0807:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            goto L_0x0810
        L_0x080f:
            throw r0
        L_0x0810:
            goto L_0x080f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svu.run():void");
    }
}
