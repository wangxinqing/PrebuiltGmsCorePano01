package defpackage;

/* renamed from: dmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmn extends dma {
    private final dld a = new dld();

    public dmn(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            dkw r0 = r8.g()
            dld r1 = r0.e
            if (r1 == 0) goto L_0x0009
            goto L_0x0071
        L_0x0009:
            monitor-enter(r0)
            dld r1 = r0.e     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0070
            dld r1 = new dld     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            android.content.Context r2 = r0.b     // Catch:{ all -> 0x0092 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0092 }
            android.content.Context r3 = r0.b     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0092 }
            r1.c = r3     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = r2.getInstallerPackageName(r3)     // Catch:{ all -> 0x0092 }
            r1.d = r4     // Catch:{ all -> 0x0092 }
            r4 = 0
            android.content.Context r5 = r0.b     // Catch:{ NameNotFoundException -> 0x004e }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x004e }
            r6 = 0
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r5 == 0) goto L_0x004c
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch:{ NameNotFoundException -> 0x004e }
            java.lang.CharSequence r2 = r2.getApplicationLabel(r6)     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r6 != 0) goto L_0x0046
            java.lang.String r3 = r2.toString()     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            java.lang.String r4 = r5.versionName     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x004d
        L_0x004a:
            r2 = move-exception
            goto L_0x004f
        L_0x004c:
        L_0x004d:
            goto L_0x006a
        L_0x004e:
            r2 = move-exception
        L_0x004f:
            java.lang.String r2 = "GAv4"
            java.lang.String r5 = "Error retrieving package info: appName set to "
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0092 }
            int r7 = r6.length()     // Catch:{ all -> 0x0092 }
            if (r7 != 0) goto L_0x0063
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0092 }
            r6.<init>(r5)     // Catch:{ all -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ all -> 0x0092 }
        L_0x0067:
            android.util.Log.e(r2, r6)     // Catch:{ all -> 0x0092 }
        L_0x006a:
            r1.a = r3     // Catch:{ all -> 0x0092 }
            r1.b = r4     // Catch:{ all -> 0x0092 }
            r0.e = r1     // Catch:{ all -> 0x0092 }
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
        L_0x0071:
            dld r0 = r0.e
            dld r1 = r8.a
            r0.a((defpackage.dld) r1)
            dpy r0 = r8.k()
            java.lang.String r1 = r0.s()
            if (r1 != 0) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            dld r2 = r8.a
            r2.a = r1
        L_0x0087:
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L_0x0091
            dld r1 = r8.a
            r1.b = r0
        L_0x0091:
            return
        L_0x0092:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmn.a():void");
    }

    public final dld b() {
        q();
        return this.a;
    }
}
