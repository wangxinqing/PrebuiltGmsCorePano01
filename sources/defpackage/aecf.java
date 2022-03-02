package defpackage;

/* renamed from: aecf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecf {
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r4.edit().putLong(":lastRunMsec", r6).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022a, code lost:
        if (r11 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022c, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.edit().putLong(":lastRunMsec", r6).apply();
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r5 = r20;
        r15 = r21;
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        r5 = r20;
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0164, code lost:
        r5 = r20;
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016b, code lost:
        r5 = r20;
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0172, code lost:
        r5 = r20;
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:48:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ac A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:48:0x00db] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r19, defpackage.iby r20, defpackage.aupy r21, defpackage.hph r22) {
        /*
            r0 = r19
            r1 = r22
            java.lang.Class<aecf> r2 = defpackage.aecf.class
            monitor-enter(r2)
            java.lang.String r3 = "dropbox"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{ all -> 0x026b }
            android.os.DropBoxManager r3 = (android.os.DropBoxManager) r3     // Catch:{ all -> 0x026b }
            if (r3 != 0) goto L_0x0023
            java.lang.String r0 = "WestworldAwPOp"
            java.lang.String r3 = "Can't find dropbox"
            android.util.Log.i(r0, r3)     // Catch:{ all -> 0x026b }
            java.lang.String r0 = "UploadAwPFailsDropBoxManager"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x026b }
            r0.a()     // Catch:{ all -> 0x026b }
            monitor-exit(r2)
            return
        L_0x0023:
            java.lang.String r4 = "WestworldAwPOp"
            r5 = 0
            android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r5)     // Catch:{ all -> 0x026b }
            java.lang.String r6 = ":lastRunMsec"
            r7 = -1
            long r6 = r4.getLong(r6, r7)     // Catch:{ all -> 0x026b }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026b }
            hol r10 = defpackage.aecq.g     // Catch:{ all -> 0x026b }
            r11 = 0
            if (r10 != 0) goto L_0x0046
            hol r10 = new hol     // Catch:{ all -> 0x026b }
            java.lang.String r12 = defpackage.azwv.d()     // Catch:{ all -> 0x026b }
            r10.<init>(r0, r12, r11)     // Catch:{ all -> 0x026b }
            defpackage.aecq.g = r10     // Catch:{ all -> 0x026b }
        L_0x0046:
            hol r10 = defpackage.aecq.g     // Catch:{ all -> 0x026b }
        L_0x0048:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fd
            java.lang.String r0 = "perfprofd"
            android.os.DropBoxManager$Entry r11 = r3.getNextEntry(r0, r6)     // Catch:{ aecu -> 0x0231, IOException -> 0x020c, Exception -> 0x0201, all -> 0x01ff }
            if (r11 == 0) goto L_0x01f0
            long r6 = r11.getTimeMillis()     // Catch:{ aecu -> 0x01e7, IOException -> 0x01de, Exception -> 0x01dc, all -> 0x01d9 }
            int r0 = r11.getFlags()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0071
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r12 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r12, r6)     // Catch:{ all -> 0x026b }
            r0.apply()     // Catch:{ all -> 0x026b }
            r11.close()     // Catch:{ all -> 0x026b }
            goto L_0x0048
        L_0x0071:
            java.lang.String r0 = "UploadAwP"
            hox r0 = r1.c(r0)     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r0.a()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            aect r0 = new aect     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            java.io.InputStream r12 = r11.getInputStream()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            long r13 = defpackage.azwv.e()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            int r14 = (int) r13     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            int r14 = r14 + -24
            r0.<init>(r12, r14)     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            aecw r12 = new aecw     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r12.<init>(r0)     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            java.util.UUID r13 = java.util.UUID.randomUUID()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r14 = 0
        L_0x0094:
            boolean r15 = r0.a()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            if (r15 != 0) goto L_0x00b9
            int r15 = r0.a     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            if (r15 != 0) goto L_0x00b7
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r12 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r12, r6)     // Catch:{ all -> 0x026b }
            r0.apply()     // Catch:{ all -> 0x026b }
            r11.close()     // Catch:{ all -> 0x026b }
            r5 = r20
            r15 = r21
            r18 = r3
            r3 = 0
            goto L_0x0252
        L_0x00b7:
            r15 = 0
            goto L_0x00ba
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            aecv r5 = r12.a()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            if (r5 == 0) goto L_0x00c5
            int r5 = r5.c     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            int r15 = r15 + r5
            r5 = 0
            goto L_0x00ba
        L_0x00c5:
            if (r15 == 0) goto L_0x0188
            r5 = 0
            byte[] r15 = r0.a(r5, r15)     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            auay r5 = defpackage.auay.a((byte[]) r15)     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r12.d()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            aupv r15 = defpackage.aupv.f     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            aucd r15 = r15.o()     // Catch:{ aecu -> 0x01cc, IOException -> 0x01bf, Exception -> 0x01b9, all -> 0x01b2 }
            r16 = r6
            long r6 = r13.getLeastSignificantBits()     // Catch:{ aecu -> 0x0180, IOException -> 0x0178, Exception -> 0x01ac, all -> 0x01aa }
            r19 = r0
            boolean r0 = r15.c     // Catch:{ aecu -> 0x0180, IOException -> 0x0178, Exception -> 0x01ac, all -> 0x01aa }
            if (r0 != 0) goto L_0x00e8
            r18 = r3
            goto L_0x00f0
        L_0x00e8:
            r15.c()     // Catch:{ aecu -> 0x0180, IOException -> 0x0178, Exception -> 0x01ac, all -> 0x01aa }
            r18 = r3
            r3 = 0
            r15.c = r3     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
        L_0x00f0:
            aucj r0 = r15.b     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            aupv r0 = (defpackage.aupv) r0     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            int r3 = r0.a     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = r3 | 1
            r0.a = r3     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r0.b = r6     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            long r6 = r13.getMostSignificantBits()     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            boolean r0 = r15.c     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            if (r0 != 0) goto L_0x0105
            goto L_0x010b
        L_0x0105:
            r15.c()     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = 0
            r15.c = r3     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
        L_0x010b:
            aucj r0 = r15.b     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            aupv r0 = (defpackage.aupv) r0     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            int r3 = r0.a     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = r3 | 2
            r0.a = r3     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r0.c = r6     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = r3 | 4
            r0.a = r3     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r0.d = r14     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r5.getClass()     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = r3 | 8
            r0.a = r3     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r0.e = r5     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            auqa r0 = defpackage.auqa.g     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            aucd r0 = r0.o()     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            boolean r3 = r0.c     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            if (r3 != 0) goto L_0x0132
            r3 = 0
            goto L_0x0138
        L_0x0132:
            r0.c()     // Catch:{ aecu -> 0x0163, IOException -> 0x015c, Exception -> 0x01ac, all -> 0x01aa }
            r3 = 0
            r0.c = r3     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
        L_0x0138:
            aucj r5 = r0.b     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            auqa r5 = (defpackage.auqa) r5     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            aucj r6 = r15.i()     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            aupv r6 = (defpackage.aupv) r6     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            r6.getClass()     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            r5.c = r6     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            r6 = 5
            r5.b = r6     // Catch:{ aecu -> 0x0171, IOException -> 0x016a, Exception -> 0x01ac, all -> 0x01aa }
            r5 = r20
            r15 = r21
            defpackage.aecq.a(r5, r10, r15, r1, r0)     // Catch:{ aecu -> 0x01b0, IOException -> 0x01ae, Exception -> 0x01ac, all -> 0x01aa }
            int r14 = r14 + 1
            r0 = r19
            r6 = r16
            r3 = r18
            r5 = 0
            goto L_0x0094
        L_0x015c:
            r0 = move-exception
            r5 = r20
            r15 = r21
            goto L_0x01c8
        L_0x0163:
            r0 = move-exception
            r5 = r20
            r15 = r21
            goto L_0x01d5
        L_0x016a:
            r0 = move-exception
            r5 = r20
            r15 = r21
            goto L_0x01c9
        L_0x0171:
            r0 = move-exception
            r5 = r20
            r15 = r21
            goto L_0x01d6
        L_0x0178:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            goto L_0x01c8
        L_0x0180:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            goto L_0x01d5
        L_0x0188:
            r5 = r20
            r15 = r21
            r19 = r0
            r18 = r3
            r16 = r6
            r3 = 0
            boolean r0 = r12.c()     // Catch:{ aecu -> 0x01b0, IOException -> 0x01ae, Exception -> 0x01ac, all -> 0x01aa }
            if (r0 == 0) goto L_0x01a2
            r0 = r19
            r6 = r16
            r3 = r18
            r5 = 0
            goto L_0x0094
        L_0x01a2:
            aecu r0 = new aecu     // Catch:{ aecu -> 0x01b0, IOException -> 0x01ae, Exception -> 0x01ac, all -> 0x01aa }
            java.lang.String r6 = "Can't skip a field in file"
            r0.<init>(r6)     // Catch:{ aecu -> 0x01b0, IOException -> 0x01ae, Exception -> 0x01ac, all -> 0x01aa }
            throw r0     // Catch:{ aecu -> 0x01b0, IOException -> 0x01ae, Exception -> 0x01ac, all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            goto L_0x01b5
        L_0x01ac:
            r0 = move-exception
            goto L_0x01bc
        L_0x01ae:
            r0 = move-exception
            goto L_0x01c9
        L_0x01b0:
            r0 = move-exception
            goto L_0x01d6
        L_0x01b2:
            r0 = move-exception
            r16 = r6
        L_0x01b5:
            r6 = r16
            goto L_0x0258
        L_0x01b9:
            r0 = move-exception
            r16 = r6
        L_0x01bc:
            r6 = r16
            goto L_0x0202
        L_0x01bf:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r16 = r6
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            r6 = r16
            goto L_0x0214
        L_0x01cc:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r16 = r6
        L_0x01d5:
            r3 = 0
        L_0x01d6:
            r6 = r16
            goto L_0x0239
        L_0x01d9:
            r0 = move-exception
            goto L_0x0258
        L_0x01dc:
            r0 = move-exception
            goto L_0x0202
        L_0x01de:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r3 = 0
            goto L_0x0214
        L_0x01e7:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r3 = 0
            goto L_0x0239
        L_0x01f0:
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r1 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r6)     // Catch:{ all -> 0x026b }
            r0.apply()     // Catch:{ all -> 0x026b }
        L_0x01fd:
            monitor-exit(r2)
            return
        L_0x01ff:
            r0 = move-exception
            goto L_0x0258
        L_0x0201:
            r0 = move-exception
        L_0x0202:
            java.lang.String r3 = "AwPCrash"
            hox r1 = r1.c(r3)     // Catch:{ all -> 0x0257 }
            r1.a()     // Catch:{ all -> 0x0257 }
            throw r0     // Catch:{ all -> 0x0257 }
        L_0x020c:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r3 = 0
        L_0x0214:
            java.lang.String r0 = "BadDropBoxEntry"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x0257 }
            r0.a()     // Catch:{ all -> 0x0257 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r12 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r12, r6)     // Catch:{ all -> 0x026b }
            r0.apply()     // Catch:{ all -> 0x026b }
            if (r11 == 0) goto L_0x0230
        L_0x022c:
            r11.close()     // Catch:{ all -> 0x026b }
            goto L_0x0252
        L_0x0230:
            goto L_0x0252
        L_0x0231:
            r0 = move-exception
            r5 = r20
            r15 = r21
            r18 = r3
            r3 = 0
        L_0x0239:
            java.lang.String r0 = "BadAwPFile"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x0257 }
            r0.a()     // Catch:{ all -> 0x0257 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r12 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r12, r6)     // Catch:{ all -> 0x026b }
            r0.apply()     // Catch:{ all -> 0x026b }
            if (r11 == 0) goto L_0x0230
            goto L_0x022c
        L_0x0252:
            r3 = r18
            r5 = 0
            goto L_0x0048
        L_0x0257:
            r0 = move-exception
        L_0x0258:
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x026b }
            java.lang.String r3 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r3, r6)     // Catch:{ all -> 0x026b }
            r1.apply()     // Catch:{ all -> 0x026b }
            if (r11 == 0) goto L_0x026a
            r11.close()     // Catch:{ all -> 0x026b }
        L_0x026a:
            throw r0     // Catch:{ all -> 0x026b }
        L_0x026b:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x026f
        L_0x026e:
            throw r0
        L_0x026f:
            goto L_0x026e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecf.a(android.content.Context, iby, aupy, hph):void");
    }
}
