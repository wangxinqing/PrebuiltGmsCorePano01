package defpackage;

/* renamed from: noo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class noo extends npc {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.io.File r6) {
        /*
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            r5 = 2
            if (r3 >= r5) goto L_0x0018
            java.lang.String r5 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r5 = move-exception
        L_0x0013:
            if (r4 != 0) goto L_0x0018
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0018:
            if (r4 == 0) goto L_0x0044
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x003d }
            r3.<init>(r6)     // Catch:{ all -> 0x003d }
            int r6 = r3.read(r0)     // Catch:{ all -> 0x003a }
        L_0x0023:
            r2 = -1
            if (r6 == r2) goto L_0x002e
            r4.update(r0, r1, r6)     // Catch:{ all -> 0x003a }
            int r6 = r3.read(r0)     // Catch:{ all -> 0x003a }
            goto L_0x0023
        L_0x002e:
            r3.close()
            byte[] r6 = r4.digest()
            java.lang.String r6 = defpackage.jjp.a((byte[]) r6)
            return r6
        L_0x003a:
            r6 = move-exception
            r2 = r3
            goto L_0x003e
        L_0x003d:
            r6 = move-exception
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()
        L_0x0043:
            throw r6
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noo.a(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        if (r11 != null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0218, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        defpackage.apev.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0242, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0277, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0278, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0290, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a4, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02b5, code lost:
        if (r4 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0277 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x028e A[Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277, auda -> 0x0244, auda -> 0x0274, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x028f A[Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277, auda -> 0x0244, auda -> 0x0274, all -> 0x02bb }, ExcHandler: NameNotFoundException (e android.content.pm.PackageManager$NameNotFoundException), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a2 A[Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277, auda -> 0x0244, auda -> 0x0274, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a3 A[Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277, auda -> 0x0244, auda -> 0x0274, all -> 0x02bb }, ExcHandler: NoSuchAlgorithmException (r0v1 'e' java.security.NoSuchAlgorithmException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe A[Catch:{ all -> 0x0210, all -> 0x0218, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d A[Catch:{ all -> 0x0210, all -> 0x0218, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r20, defpackage.nqf r21) {
        /*
            r19 = this;
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1
            r5 = 0
            r6 = r21
            auay r6 = r6.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            aubs r7 = defpackage.aubs.c()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            nqg r8 = defpackage.nqg.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            aubc r6 = r6.h()     // Catch:{ auda -> 0x0274 }
            r9 = 4
            java.lang.Object r8 = r8.c(r9)     // Catch:{ auda -> 0x0274 }
            aucj r8 = (defpackage.aucj) r8     // Catch:{ auda -> 0x0274 }
            aueh r10 = defpackage.aueh.a     // Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277 }
            aueq r10 = r10.a((java.lang.Object) r8)     // Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277 }
            aubd r11 = defpackage.aubd.a((defpackage.aubc) r6)     // Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277 }
            r10.a(r8, r11, r7)     // Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277 }
            r10.d(r8)     // Catch:{ IOException -> 0x0259, RuntimeException -> 0x0247, NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, all -> 0x0277 }
            r6.a((int) r5)     // Catch:{ auda -> 0x0244 }
            defpackage.aucj.b((defpackage.aucj) r8)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            nqg r8 = (defpackage.nqg) r8     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            java.lang.String r1 = r8.b     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6[r5] = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.content.pm.PackageManager r6 = r20.getPackageManager()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r5)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r6 == 0) goto L_0x0239
            int r7 = r6.versionCode     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r8 = r6.versionName     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r8 != 0) goto L_0x004b
            java.lang.String r8 = "0"
            goto L_0x004d
        L_0x004b:
            java.lang.String r8 = r6.versionName     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x004d:
            nqc r10 = defpackage.nqc.g     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            aucd r10 = r10.o()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r11[r5] = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r11[r3] = r8     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            axjm r11 = defpackage.axjm.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            axjn r11 = r11.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            boolean r11 = r11.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r11 != 0) goto L_0x0074
            java.io.File r11 = new java.io.File     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.content.pm.ApplicationInfo r12 = r6.applicationInfo     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r12 = r12.sourceDir     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r11.<init>(r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r11 = a(r11)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            goto L_0x0113
        L_0x0074:
            ahai r11 = defpackage.ahaj.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.content.pm.ApplicationInfo r12 = r6.applicationInfo     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r12 = r12.sourceDir     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r11.b(r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.net.Uri r11 = r11.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            avlt r12 = defpackage.ahcx.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            amzt r13 = defpackage.amzy.j()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            amzy r14 = defpackage.ahbw.a((android.net.Uri) r11)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r12 = defpackage.ahcx.a((defpackage.avlt) r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r15 = defpackage.ahbw.a((java.lang.String) r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            anhk r14 = r14.listIterator()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x0099:
            boolean r16 = r14.hasNext()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r16 != 0) goto L_0x021e
            r13.c(r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            amzy r12 = r13.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r12 = defpackage.ahbw.a((java.util.List) r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.net.Uri$Builder r11 = r11.encodedFragment(r12)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            android.net.Uri r11 = r11.build()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            agzs r12 = defpackage.nol.b()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            ahau r13 = new ahau     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r13.<init>(r11)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            ahcj r14 = defpackage.ahcj.a()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            agzk[] r15 = new defpackage.agzk[r3]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r15[r5] = r13     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.Object r11 = r12.a(r11, r14, r15)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            byte[] r12 = defpackage.anmr.a()     // Catch:{ all -> 0x0210 }
        L_0x00d1:
            int r14 = r11.read(r12)     // Catch:{ all -> 0x0210 }
            long r14 = (long) r14     // Catch:{ all -> 0x0210 }
            r16 = -1
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x00d1
            ahao r12 = r13.a     // Catch:{ all -> 0x0210 }
            java.lang.Class<java.io.IOException> r13 = java.io.IOException.class
            java.lang.Object r12 = defpackage.aorj.a((java.util.concurrent.Future) r12, (java.lang.Class) r13)     // Catch:{ all -> 0x0210 }
            android.net.Uri r12 = (android.net.Uri) r12     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "integrity"
            java.lang.String r14 = "sha256"
            ahbc r12 = defpackage.ahbe.a(r12, r13)     // Catch:{ all -> 0x0210 }
            if (r12 == 0) goto L_0x00fb
            java.lang.String r12 = r12.a(r14)     // Catch:{ all -> 0x0210 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0210 }
            if (r13 != 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r12 = 0
        L_0x00fc:
            if (r12 == 0) goto L_0x010d
            byte[] r12 = android.util.Base64.decode(r12, r2)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = defpackage.jjp.a((byte[]) r12)     // Catch:{ all -> 0x0210 }
            if (r11 == 0) goto L_0x010b
            r11.close()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x010b:
            r11 = r12
            goto L_0x0113
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r11.close()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x0112:
            r11 = 0
        L_0x0113:
            if (r11 != 0) goto L_0x011a
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6[r5] = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            return r2
        L_0x011a:
            boolean r12 = defpackage.axjd.b()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 != 0) goto L_0x0122
            goto L_0x0190
        L_0x0122:
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r13 = 28
            if (r12 >= r13) goto L_0x0155
            android.content.pm.Signature[] r12 = r6.signatures     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 == 0) goto L_0x0190
            android.content.pm.Signature[] r6 = r6.signatures     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            int r12 = r6.length     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 <= 0) goto L_0x0138
            r6 = r6[r5]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r6 = r6.toCharsString()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            if (r6 == 0) goto L_0x0190
            boolean r12 = r10.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 != 0) goto L_0x0140
            goto L_0x0145
        L_0x0140:
            r10.c()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r10.c = r5     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x0145:
            aucj r12 = r10.b     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            nqc r12 = (defpackage.nqc) r12     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            int r13 = r12.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r13 = r13 | 16
            r12.a = r13     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r12.f = r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            goto L_0x0190
        L_0x0155:
            android.content.pm.SigningInfo r12 = r6.signingInfo     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 == 0) goto L_0x0190
            android.content.pm.SigningInfo r6 = r6.signingInfo     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            boolean r12 = r6.hasMultipleSigners()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 != 0) goto L_0x0166
            android.content.pm.Signature[] r6 = r6.getSigningCertificateHistory()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            goto L_0x016a
        L_0x0166:
            android.content.pm.Signature[] r6 = r6.getApkContentsSigners()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x016a:
            int r12 = r6.length     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 <= 0) goto L_0x0174
            r6 = r6[r5]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r6 = r6.toCharsString()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            goto L_0x0175
        L_0x0174:
            r6 = 0
        L_0x0175:
            if (r6 == 0) goto L_0x0190
            boolean r12 = r10.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r12 != 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            r10.c()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r10.c = r5     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x0181:
            aucj r12 = r10.b     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            nqc r12 = (defpackage.nqc) r12     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            int r13 = r12.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r13 = r13 | 16
            r12.a = r13     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r12.f = r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x0190:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6[r5] = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6[r3] = r11     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            boolean r6 = r10.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r6 != 0) goto L_0x019b
            goto L_0x01a0
        L_0x019b:
            r10.c()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r10.c = r5     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x01a0:
            aucj r6 = r10.b     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            nqc r6 = (defpackage.nqc) r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r1.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            int r12 = r6.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r12 = r12 | r3
            r6.a = r12     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6.b = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            long r6 = (long) r7     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            boolean r7 = r10.c     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r7 != 0) goto L_0x01b8
            goto L_0x01bd
        L_0x01b8:
            r10.c()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r10.c = r5     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x01bd:
            aucj r7 = r10.b     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            nqc r7 = (defpackage.nqc) r7     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            int r12 = r7.a     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r9 = r9 | r12
            r7.a = r9     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r7.d = r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r8.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6 = r9 | 2
            r7.a = r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r7.c = r8     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r11 == 0) goto L_0x01df
            r11.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r6 = r6 | 8
            r7.a = r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r7.e = r11     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x01df:
            nog r4 = defpackage.nog.a(r20)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            aucj r6 = r10.i()     // Catch:{ NoSuchAlgorithmException -> 0x020c, NameNotFoundException -> 0x0209, IOException -> 0x0206, all -> 0x0202 }
            nqc r6 = (defpackage.nqc) r6     // Catch:{ NoSuchAlgorithmException -> 0x020c, NameNotFoundException -> 0x0209, IOException -> 0x0206, all -> 0x0202 }
            nnx r7 = r4.a     // Catch:{ noh -> 0x01f5 }
            r7.a(r6)     // Catch:{ noh -> 0x01f5 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ noh -> 0x01f5 }
            java.lang.String r8 = r6.b     // Catch:{ noh -> 0x01f5 }
            r7[r5] = r8     // Catch:{ noh -> 0x01f5 }
            goto L_0x01fc
        L_0x01f5:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ NoSuchAlgorithmException -> 0x020c, NameNotFoundException -> 0x0209, IOException -> 0x0206, all -> 0x0202 }
            java.lang.String r6 = r6.b     // Catch:{ NoSuchAlgorithmException -> 0x020c, NameNotFoundException -> 0x0209, IOException -> 0x0206, all -> 0x0202 }
            r7[r5] = r6     // Catch:{ NoSuchAlgorithmException -> 0x020c, NameNotFoundException -> 0x0209, IOException -> 0x0206, all -> 0x0202 }
        L_0x01fc:
            if (r4 == 0) goto L_0x0201
            r4.a()
        L_0x0201:
            return r5
        L_0x0202:
            r0 = move-exception
            r1 = r0
            goto L_0x02bd
        L_0x0206:
            r0 = move-exception
            goto L_0x027d
        L_0x0209:
            r0 = move-exception
            goto L_0x0291
        L_0x020c:
            r0 = move-exception
            r1 = r0
            goto L_0x02a6
        L_0x0210:
            r0 = move-exception
            r6 = r0
            if (r11 == 0) goto L_0x021d
            r11.close()     // Catch:{ all -> 0x0218 }
            goto L_0x021d
        L_0x0218:
            r0 = move-exception
            r7 = r0
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r7)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x021d:
            throw r6     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
        L_0x021e:
            java.lang.Object r16 = r14.next()     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r4 = r16
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            java.lang.String r9 = defpackage.ahbw.a((java.lang.String) r4)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            boolean r9 = r9.equals(r15)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            if (r9 != 0) goto L_0x0236
            r13.c(r4)     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r9 = 4
            goto L_0x0099
        L_0x0236:
            r9 = 4
            goto L_0x0099
        L_0x0239:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            r4[r5] = r1     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x0241, IOException -> 0x023e, all -> 0x0277 }
            return r2
        L_0x023e:
            r0 = move-exception
            r4 = 0
            goto L_0x027d
        L_0x0241:
            r0 = move-exception
            r4 = 0
            goto L_0x0291
        L_0x0244:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ auda -> 0x0274 }
        L_0x0247:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ auda -> 0x0274 }
            boolean r6 = r6 instanceof defpackage.auda     // Catch:{ auda -> 0x0274 }
            if (r6 == 0) goto L_0x0258
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ auda -> 0x0274 }
            auda r4 = (defpackage.auda) r4     // Catch:{ auda -> 0x0274 }
            throw r4     // Catch:{ auda -> 0x0274 }
        L_0x0258:
            throw r4     // Catch:{ auda -> 0x0274 }
        L_0x0259:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ auda -> 0x0274 }
            boolean r6 = r6 instanceof defpackage.auda     // Catch:{ auda -> 0x0274 }
            if (r6 != 0) goto L_0x026d
            auda r6 = new auda     // Catch:{ auda -> 0x0274 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ auda -> 0x0274 }
            r6.<init>((java.lang.String) r4)     // Catch:{ auda -> 0x0274 }
            throw r6     // Catch:{ auda -> 0x0274 }
        L_0x026d:
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ auda -> 0x0274 }
            auda r4 = (defpackage.auda) r4     // Catch:{ auda -> 0x0274 }
            throw r4     // Catch:{ auda -> 0x0274 }
        L_0x0274:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ NoSuchAlgorithmException -> 0x02a3, NameNotFoundException -> 0x028f, IOException -> 0x027b, all -> 0x0277 }
        L_0x0277:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x02bd
        L_0x027b:
            r0 = move-exception
            r4 = 0
        L_0x027d:
            java.lang.String r6 = defpackage.npc.b     // Catch:{ all -> 0x02bb }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02bb }
            r3[r5] = r1     // Catch:{ all -> 0x02bb }
            java.lang.String r1 = "Failed to hash package %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x02bb }
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x02bb }
            if (r4 == 0) goto L_0x02ba
            goto L_0x02b7
        L_0x028f:
            r0 = move-exception
            r4 = 0
        L_0x0291:
            java.lang.String r6 = defpackage.npc.b     // Catch:{ all -> 0x02bb }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02bb }
            r3[r5] = r1     // Catch:{ all -> 0x02bb }
            java.lang.String r1 = "Failed to find package %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x02bb }
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x02bb }
            if (r4 == 0) goto L_0x02ba
            goto L_0x02b7
        L_0x02a3:
            r0 = move-exception
            r1 = r0
            r4 = 0
        L_0x02a6:
            java.lang.String r6 = defpackage.npc.b     // Catch:{ all -> 0x02bb }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02bb }
            r3[r5] = r1     // Catch:{ all -> 0x02bb }
            java.lang.String r1 = "NoSuchAlgorithmException %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x02bb }
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x02bb }
            if (r4 == 0) goto L_0x02ba
        L_0x02b7:
            r4.a()
        L_0x02ba:
            return r2
        L_0x02bb:
            r0 = move-exception
            r1 = r0
        L_0x02bd:
            if (r4 == 0) goto L_0x02c2
            r4.a()
        L_0x02c2:
            goto L_0x02c4
        L_0x02c3:
            throw r1
        L_0x02c4:
            goto L_0x02c3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noo.a(android.content.Context, nqf):int");
    }
}
