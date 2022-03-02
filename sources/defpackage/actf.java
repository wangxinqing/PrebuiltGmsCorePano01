package defpackage;

/* renamed from: actf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actf extends acrl {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public actf() {
        /*
            r4 = this;
            boolean r0 = defpackage.jkr.e()
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "activity"
            goto L_0x000b
        L_0x0009:
            java.lang.String r0 = "settings"
        L_0x000b:
            r1 = 0
            java.lang.String r2 = "Settingsstats"
            java.lang.String r3 = "SETTINGS_STATS"
            r4.<init>(r2, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actf.<init>():void");
    }

    public final int a() {
        return (int) azpg.a.a().b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9 A[Catch:{ IOException -> 0x0114, all -> 0x0110, all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avwc b(android.content.Context r18, java.io.InputStream r19, long r20, long r22, defpackage.hph r24) {
        /*
            r17 = this;
            actg r1 = new actg
            acth r0 = new acth
            r0.<init>()
            r1.<init>(r0)
            avwc r0 = defpackage.avwc.v
            aucd r0 = r0.o()
            r2 = r0
            avvz r2 = (defpackage.avvz) r2
            java.lang.String r0 = "com.google.android.metrics"
            r3 = 0
            r4 = r18
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r3)
            boolean r0 = r2.c
            if (r0 == 0) goto L_0x0025
            r2.c()
            r2.c = r3
        L_0x0025:
            aucj r0 = r2.b
            avwc r0 = (defpackage.avwc) r0
            int r5 = r0.a
            r6 = 1
            r5 = r5 | r6
            r0.a = r5
            r7 = r20
            r0.d = r7
            r5 = r5 | 2
            r0.a = r5
            r7 = r22
            r0.e = r7
            byte[] r0 = defpackage.jjt.b((java.io.InputStream) r19)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.nio.charset.Charset r7 = defpackage.acrk.e     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r5.<init>(r0, r7)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r7.<init>()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.util.regex.Pattern r0 = defpackage.actg.a     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.lang.String[] r5 = r0.split(r5)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            int r8 = r5.length     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r0 = 0
            r9 = r0
            r10 = 0
        L_0x0055:
            if (r10 >= r8) goto L_0x00e9
            r0 = r5[r10]     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.lang.String r11 = r0.trim()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.lang.String r0 = defpackage.actg.a(r11)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r12 = 10
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = defpackage.actg.a(r11)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r7.append(r11)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r7.append(r12)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r15 = r24
            r9 = r0
            goto L_0x00e5
        L_0x0074:
            if (r9 == 0) goto L_0x00e3
            java.util.regex.Pattern r0 = defpackage.actg.b     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            java.util.regex.Matcher r0 = r0.matcher(r11)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            boolean r13 = r0.matches()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            if (r13 != 0) goto L_0x0086
            java.lang.String r0 = ""
            r13 = r0
            goto L_0x008c
        L_0x0086:
            java.lang.String r0 = r0.group(r6)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r13 = r0
        L_0x008c:
            int r0 = r13.length()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            if (r0 <= 0) goto L_0x00e0
            acth r14 = r1.c     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            azpg r0 = defpackage.azpg.a     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            azph r0 = r0.a()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            boolean r0 = r0.d()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            if (r0 != 0) goto L_0x00a3
            r15 = r24
            goto L_0x00d1
        L_0x00a3:
            if (r4 == 0) goto L_0x00cf
            java.lang.String r0 = "SettingsStats__"
            java.lang.String r15 = java.lang.String.valueOf(r13)     // Catch:{ ClassCastException -> 0x00c2 }
            int r16 = r15.length()     // Catch:{ ClassCastException -> 0x00c2 }
            if (r16 != 0) goto L_0x00b7
            java.lang.String r15 = new java.lang.String     // Catch:{ ClassCastException -> 0x00c2 }
            r15.<init>(r0)     // Catch:{ ClassCastException -> 0x00c2 }
            goto L_0x00bb
        L_0x00b7:
            java.lang.String r15 = r0.concat(r15)     // Catch:{ ClassCastException -> 0x00c2 }
        L_0x00bb:
            boolean r0 = r4.getBoolean(r15, r3)     // Catch:{ ClassCastException -> 0x00c2 }
            r15 = r24
            goto L_0x00d7
        L_0x00c2:
            r0 = move-exception
            java.lang.String r0 = "SettingsClassCastException"
            r15 = r24
            hox r0 = r15.c(r0)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r0.a()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            goto L_0x00d1
        L_0x00cf:
            r15 = r24
        L_0x00d1:
            java.util.HashSet r0 = r14.a     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            boolean r0 = r0.contains(r13)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
        L_0x00d7:
            if (r0 == 0) goto L_0x00e5
            r7.append(r11)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r7.append(r12)     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            goto L_0x00e5
        L_0x00e0:
            r15 = r24
            goto L_0x00e5
        L_0x00e3:
            r15 = r24
        L_0x00e5:
            int r10 = r10 + 1
            goto L_0x0055
        L_0x00e9:
            java.lang.String r0 = r7.toString()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            boolean r1 = r2.c     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r2.c()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r2.c = r3     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
        L_0x00f7:
            aucj r1 = r2.b     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            avwc r1 = (defpackage.avwc) r1     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r0.getClass()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            int r3 = r1.a     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r3 = r3 | 8
            r1.a = r3     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            r1.g = r0     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            aucj r0 = r2.i()     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            avwc r0 = (defpackage.avwc) r0     // Catch:{ IOException -> 0x0114, all -> 0x0110 }
            defpackage.jjt.a((java.io.Closeable) r19)
            return r0
        L_0x0110:
            r0 = move-exception
            r1 = r17
            goto L_0x0125
        L_0x0114:
            r0 = move-exception
            r1 = r17
            java.lang.String r2 = r1.a     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "Failed to read dumpsys output file for settings stats."
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0124 }
            acrj r2 = new acrj     // Catch:{ all -> 0x0124 }
            r2.<init>((java.lang.Exception) r0)     // Catch:{ all -> 0x0124 }
            throw r2     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
        L_0x0125:
            defpackage.jjt.a((java.io.Closeable) r19)
            goto L_0x012a
        L_0x0129:
            throw r0
        L_0x012a:
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actf.b(android.content.Context, java.io.InputStream, long, long, hph):avwc");
    }

    public final long c() {
        return azpg.a.a().c();
    }

    public final long d() {
        return 0;
    }

    public final boolean g() {
        return azpg.a.a().a();
    }

    /* access modifiers changed from: protected */
    public final String[] a(long j, long j2) {
        if (jkr.e()) {
            return new String[0];
        }
        return new String[]{"provider", "com.android.providers.settings/.SettingsProvider"};
    }

    public final boolean b() {
        return azms.a.a().k() && jkr.b();
    }
}
