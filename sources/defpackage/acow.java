package defpackage;

/* renamed from: acow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acow implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ acox b;
    final /* synthetic */ acoy c;

    public acow(acoy acoy, String str, acox acox) {
        this.c = acoy;
        this.a = str;
        this.b = acox;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        if (r5 == 6) goto L_0x0128;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "￭WIFI"
            acoy r1 = r13.c     // Catch:{ Exception -> 0x029a }
            java.lang.String r2 = r13.a     // Catch:{ Exception -> 0x029a }
            java.lang.String r3 = "preSharedKey"
            android.content.Context r4 = r1.b     // Catch:{ Exception -> 0x029a }
            long r4 = defpackage.jhg.a((android.content.Context) r4)     // Catch:{ Exception -> 0x029a }
            android.content.Context r6 = r1.b     // Catch:{ Exception -> 0x029a }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ Exception -> 0x029a }
            android.content.ContentResolver r7 = r6.getContentResolver()     // Catch:{ Exception -> 0x029a }
            java.lang.String r8 = "backup_enabled"
            r9 = 0
            int r7 = android.provider.Settings.Secure.getInt(r7, r8, r9)     // Catch:{ Exception -> 0x029a }
            r8 = 0
            if (r7 == 0) goto L_0x002b
            gsa r7 = new gsa     // Catch:{ Exception -> 0x029a }
            r7.<init>(r6)     // Catch:{ Exception -> 0x029a }
            android.accounts.Account r6 = r7.a()     // Catch:{ Exception -> 0x029a }
            goto L_0x002c
        L_0x002b:
            r6 = r8
        L_0x002c:
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x003b
            iwd r0 = defpackage.acoy.a     // Catch:{ Exception -> 0x029a }
            java.lang.String r1 = "Backups are disabled or backup account does not exist"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x029a }
            r0.e(r1, r4)     // Catch:{ Exception -> 0x029a }
            goto L_0x01a8
        L_0x003b:
            gsf r10 = defpackage.gsf.e     // Catch:{ Exception -> 0x029a }
            aucd r10 = r10.o()     // Catch:{ Exception -> 0x029a }
            boolean r11 = r10.c     // Catch:{ Exception -> 0x029a }
            if (r11 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r10.c()     // Catch:{ Exception -> 0x029a }
            r10.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x004b:
            aucj r11 = r10.b     // Catch:{ Exception -> 0x029a }
            gsf r11 = (defpackage.gsf) r11     // Catch:{ Exception -> 0x029a }
            int r12 = r11.a     // Catch:{ Exception -> 0x029a }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ Exception -> 0x029a }
            r11.b = r4     // Catch:{ Exception -> 0x029a }
            gse r4 = defpackage.gse.d     // Catch:{ Exception -> 0x029a }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x029a }
            java.lang.String r5 = "com.android.providers.settings"
            boolean r11 = r4.c     // Catch:{ Exception -> 0x029a }
            if (r11 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            r4.c()     // Catch:{ Exception -> 0x029a }
            r4.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x0069:
            aucj r11 = r4.b     // Catch:{ Exception -> 0x029a }
            gse r11 = (defpackage.gse) r11     // Catch:{ Exception -> 0x029a }
            r5.getClass()     // Catch:{ Exception -> 0x029a }
            int r12 = r11.a     // Catch:{ Exception -> 0x029a }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ Exception -> 0x029a }
            r11.b = r5     // Catch:{ Exception -> 0x029a }
            gsd r5 = defpackage.gsd.c     // Catch:{ Exception -> 0x029a }
            aucd r5 = r5.o()     // Catch:{ Exception -> 0x029a }
            boolean r11 = r5.c     // Catch:{ Exception -> 0x029a }
            if (r11 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r5.c()     // Catch:{ Exception -> 0x029a }
            r5.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x0088:
            aucj r11 = r5.b     // Catch:{ Exception -> 0x029a }
            gsd r11 = (defpackage.gsd) r11     // Catch:{ Exception -> 0x029a }
            r0.getClass()     // Catch:{ Exception -> 0x029a }
            int r12 = r11.a     // Catch:{ Exception -> 0x029a }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ Exception -> 0x029a }
            r11.b = r0     // Catch:{ Exception -> 0x029a }
            boolean r11 = r4.c     // Catch:{ Exception -> 0x029a }
            if (r11 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r4.c()     // Catch:{ Exception -> 0x029a }
            r4.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x00a1:
            aucj r11 = r4.b     // Catch:{ Exception -> 0x029a }
            gse r11 = (defpackage.gse) r11     // Catch:{ Exception -> 0x029a }
            aucj r5 = r5.i()     // Catch:{ Exception -> 0x029a }
            gsd r5 = (defpackage.gsd) r5     // Catch:{ Exception -> 0x029a }
            r5.getClass()     // Catch:{ Exception -> 0x029a }
            r11.c = r5     // Catch:{ Exception -> 0x029a }
            int r5 = r11.a     // Catch:{ Exception -> 0x029a }
            r5 = r5 | 4
            r11.a = r5     // Catch:{ Exception -> 0x029a }
            aucj r4 = r4.i()     // Catch:{ Exception -> 0x029a }
            gse r4 = (defpackage.gse) r4     // Catch:{ Exception -> 0x029a }
            boolean r5 = r10.c     // Catch:{ Exception -> 0x029a }
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r10.c()     // Catch:{ Exception -> 0x029a }
            r10.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x00c6:
            aucj r5 = r10.b     // Catch:{ Exception -> 0x029a }
            gsf r5 = (defpackage.gsf) r5     // Catch:{ Exception -> 0x029a }
            r4.getClass()     // Catch:{ Exception -> 0x029a }
            aucx r11 = r5.d     // Catch:{ Exception -> 0x029a }
            boolean r11 = r11.a()     // Catch:{ Exception -> 0x029a }
            if (r11 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            aucx r11 = r5.d     // Catch:{ Exception -> 0x029a }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ Exception -> 0x029a }
            r5.d = r11     // Catch:{ Exception -> 0x029a }
        L_0x00de:
            aucx r5 = r5.d     // Catch:{ Exception -> 0x029a }
            r5.add(r4)     // Catch:{ Exception -> 0x029a }
            android.content.Context r4 = r1.b     // Catch:{ Exception -> 0x029a }
            java.lang.String r4 = defpackage.acoy.a((android.content.Context) r4, (android.accounts.Account) r6)     // Catch:{ Exception -> 0x029a }
            if (r4 == 0) goto L_0x01a7
            boolean r5 = r10.c     // Catch:{ Exception -> 0x029a }
            if (r5 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r10.c()     // Catch:{ Exception -> 0x029a }
            r10.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x00f5:
            aucj r5 = r10.b     // Catch:{ Exception -> 0x029a }
            gsf r5 = (defpackage.gsf) r5     // Catch:{ Exception -> 0x029a }
            r4.getClass()     // Catch:{ Exception -> 0x029a }
            int r11 = r5.a     // Catch:{ Exception -> 0x029a }
            r11 = r11 | 16
            r5.a = r11     // Catch:{ Exception -> 0x029a }
            r5.c = r4     // Catch:{ Exception -> 0x029a }
            aucj r4 = r10.i()     // Catch:{ Exception -> 0x029a }
            gsf r4 = (defpackage.gsf) r4     // Catch:{ Exception -> 0x029a }
            gsm r4 = r1.a(r4)     // Catch:{ Exception -> 0x029a }
            if (r4 == 0) goto L_0x0165
            int r5 = r4.a     // Catch:{ Exception -> 0x029a }
            int r5 = defpackage.gsl.a(r5)     // Catch:{ Exception -> 0x029a }
            if (r5 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            r11 = 5
            if (r5 != r11) goto L_0x011d
            goto L_0x0128
        L_0x011d:
            int r5 = r4.a     // Catch:{ Exception -> 0x029a }
            int r5 = defpackage.gsl.a(r5)     // Catch:{ Exception -> 0x029a }
            if (r5 == 0) goto L_0x0165
            r11 = 6
            if (r5 != r11) goto L_0x0165
        L_0x0128:
            android.content.Context r4 = r1.b     // Catch:{ Exception -> 0x029a }
            aucj r5 = r10.b     // Catch:{ Exception -> 0x029a }
            gsf r5 = (defpackage.gsf) r5     // Catch:{ Exception -> 0x029a }
            java.lang.String r5 = r5.c     // Catch:{ Exception -> 0x029a }
            qub r4 = defpackage.acpd.a(r4)     // Catch:{ Exception -> 0x029a }
            java.lang.String r11 = "com.google"
            r4.b((java.lang.String) r11, (java.lang.String) r5)     // Catch:{ Exception -> 0x029a }
            android.content.Context r4 = r1.b     // Catch:{ Exception -> 0x029a }
            java.lang.String r4 = defpackage.acoy.a((android.content.Context) r4, (android.accounts.Account) r6)     // Catch:{ Exception -> 0x029a }
            if (r4 == 0) goto L_0x01a7
            boolean r5 = r10.c     // Catch:{ Exception -> 0x029a }
            if (r5 != 0) goto L_0x0146
            goto L_0x014b
        L_0x0146:
            r10.c()     // Catch:{ Exception -> 0x029a }
            r10.c = r9     // Catch:{ Exception -> 0x029a }
        L_0x014b:
            aucj r5 = r10.b     // Catch:{ Exception -> 0x029a }
            gsf r5 = (defpackage.gsf) r5     // Catch:{ Exception -> 0x029a }
            r4.getClass()     // Catch:{ Exception -> 0x029a }
            int r6 = r5.a     // Catch:{ Exception -> 0x029a }
            r6 = r6 | 16
            r5.a = r6     // Catch:{ Exception -> 0x029a }
            r5.c = r4     // Catch:{ Exception -> 0x029a }
            aucj r4 = r10.i()     // Catch:{ Exception -> 0x029a }
            gsf r4 = (defpackage.gsf) r4     // Catch:{ Exception -> 0x029a }
            gsm r4 = r1.a(r4)     // Catch:{ Exception -> 0x029a }
            goto L_0x0166
        L_0x0165:
        L_0x0166:
            if (r4 != 0) goto L_0x0172
            iwd r0 = defpackage.acoy.a     // Catch:{ Exception -> 0x029a }
            java.lang.String r1 = "backupResponse was null"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x029a }
            r0.e(r1, r4)     // Catch:{ Exception -> 0x029a }
            goto L_0x01a8
        L_0x0172:
            aucx r1 = r4.b     // Catch:{ Exception -> 0x029a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x029a }
        L_0x0178:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x029a }
            if (r4 == 0) goto L_0x01a5
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x029a }
            gsg r4 = (defpackage.gsg) r4     // Catch:{ Exception -> 0x029a }
            aucx r4 = r4.a     // Catch:{ Exception -> 0x029a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x029a }
        L_0x018a:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x029a }
            if (r5 == 0) goto L_0x0178
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x029a }
            gsn r5 = (defpackage.gsn) r5     // Catch:{ Exception -> 0x029a }
            java.lang.String r6 = r5.a     // Catch:{ Exception -> 0x029a }
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x029a }
            if (r6 == 0) goto L_0x018a
            auay r0 = r5.b     // Catch:{ Exception -> 0x029a }
            java.lang.String r7 = r0.l()     // Catch:{ Exception -> 0x029a }
            goto L_0x01a8
        L_0x01a5:
            goto L_0x01a8
        L_0x01a7:
        L_0x01a8:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x029a }
            byte[] r1 = r7.getBytes()     // Catch:{ Exception -> 0x029a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x029a }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x029a }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x029a }
            r4.<init>(r0)     // Catch:{ Exception -> 0x029a }
            r1.<init>(r4)     // Catch:{ Exception -> 0x029a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x029a }
            r0.<init>()     // Catch:{ Exception -> 0x029a }
            r4 = r8
        L_0x01c1:
            boolean r5 = r1.ready()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r5 == 0) goto L_0x024d
            java.lang.String r5 = r1.readLine()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            java.lang.String r5 = r5.trim()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            java.lang.String r6 = "network={"
            boolean r6 = r5.startsWith(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r6 == 0) goto L_0x01dd
            acoz r4 = new acoz     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            goto L_0x01c1
        L_0x01dd:
            java.lang.String r6 = "}"
            boolean r6 = r5.startsWith(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r6 != 0) goto L_0x0236
            java.lang.String r6 = "="
            int r6 = r5.indexOf(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r6 > 0) goto L_0x01ee
            goto L_0x0218
        L_0x01ee:
            int r7 = r5.length()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            int r7 = r7 + -1
            if (r6 >= r7) goto L_0x0218
            if (r4 == 0) goto L_0x0217
            java.lang.String r7 = r5.substring(r9, r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            java.lang.String r6 = "ssid"
            boolean r6 = r7.equals(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r6 != 0) goto L_0x020b
            goto L_0x0211
        L_0x020b:
            java.lang.String r6 = defpackage.acqc.b(r5)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r4.a = r6     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
        L_0x0211:
            java.util.Map r6 = r4.b     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r6.put(r7, r5)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            goto L_0x01c1
        L_0x0217:
            goto L_0x026d
        L_0x0218:
            iwd r6 = defpackage.acpb.a     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            java.lang.String r7 = "unexpected string in WPA Supplicant file: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            int r10 = r5.length()     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r10 != 0) goto L_0x022c
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r5.<init>(r7)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            goto L_0x0230
        L_0x022c:
            java.lang.String r5 = r7.concat(r5)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
        L_0x0230:
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r6.b(r5, r7)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            goto L_0x01c1
        L_0x0236:
            if (r4 == 0) goto L_0x024d
            java.lang.String r5 = r4.a     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            if (r5 == 0) goto L_0x0244
            acpa r6 = new acpa     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            java.util.Map r4 = r4.b     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            r6.<init>(r5, r4)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
            goto L_0x0245
        L_0x0244:
            r6 = r8
        L_0x0245:
            if (r6 == 0) goto L_0x024a
            r0.add(r6)     // Catch:{ IOException -> 0x025e, NullPointerException -> 0x024e }
        L_0x024a:
            r4 = r8
            goto L_0x01c1
        L_0x024d:
            goto L_0x026d
        L_0x024e:
            r0 = move-exception
            iwd r1 = defpackage.acpb.a     // Catch:{ Exception -> 0x029a }
            java.lang.String r4 = "NullPointerException encountered"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x029a }
            r1.e(r4, r0, r5)     // Catch:{ Exception -> 0x029a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x029a }
            r0.<init>()     // Catch:{ Exception -> 0x029a }
            goto L_0x026d
        L_0x025e:
            r0 = move-exception
            iwd r1 = defpackage.acpb.a     // Catch:{ Exception -> 0x029a }
            java.lang.String r4 = "IOException encountered"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x029a }
            r1.e(r4, r0, r5)     // Catch:{ Exception -> 0x029a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x029a }
            r0.<init>()     // Catch:{ Exception -> 0x029a }
        L_0x026d:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x029a }
        L_0x0271:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x029a }
            if (r1 == 0) goto L_0x028f
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x029a }
            acpa r1 = (defpackage.acpa) r1     // Catch:{ Exception -> 0x029a }
            java.lang.String r4 = r1.a     // Catch:{ Exception -> 0x029a }
            boolean r4 = r4.equals(r2)     // Catch:{ Exception -> 0x029a }
            if (r4 == 0) goto L_0x0271
            java.util.Map r0 = r1.b     // Catch:{ Exception -> 0x029a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x029a }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x029a }
            goto L_0x0290
        L_0x028f:
        L_0x0290:
            acox r0 = r13.b     // Catch:{ Exception -> 0x029a }
            java.lang.String r1 = defpackage.acqc.b(r8)     // Catch:{ Exception -> 0x029a }
            r0.a((java.lang.String) r1)     // Catch:{ Exception -> 0x029a }
            return
        L_0x029a:
            r0 = move-exception
            acox r1 = r13.b
            r1.a((java.lang.Exception) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acow.run():void");
    }
}
