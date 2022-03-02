package defpackage;

/* renamed from: psx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class psx implements aoqb {
    private final ptb a;
    private final pxu b;

    public psx(ptb ptb, pxu pxu) {
        this.a = ptb;
        this.b = pxu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (r0.c.equals(r5.a()) != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            ptb r2 = r1.a
            pxu r3 = r1.b
            r4 = r25
            agtj r4 = (defpackage.agtj) r4
            psl r5 = r2.d
            ovc r0 = r3.a
            boolean r6 = r0.k
            int r0 = r0.h
            ovg r0 = defpackage.ovg.a(r0)
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            ovg r0 = defpackage.ovg.GENERAL_USE
        L_0x001b:
            boolean r7 = r3.a()
            ovc r8 = r3.a
            long r9 = r8.g
            java.lang.String r11 = r8.b
            java.lang.String r12 = r8.e
            oqo r8 = r8.i
            if (r8 != 0) goto L_0x002d
            oqo r8 = defpackage.oqo.g
        L_0x002d:
            if (r6 == 0) goto L_0x0031
            goto L_0x0601
        L_0x0031:
            ovg r6 = defpackage.ovg.GENERAL_USE
            if (r0 == r6) goto L_0x0040
            ovg r6 = defpackage.ovg.FIREBASE_USER_ACTIONS_USE
            if (r0 == r6) goto L_0x0040
            java.lang.String r2 = "Usage type: %s not allowed for upload"
            defpackage.oso.d((java.lang.String) r2, (java.lang.Object) r0)
            goto L_0x0601
        L_0x0040:
            if (r7 == 0) goto L_0x0601
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x0601
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x0601
            java.lang.Long r0 = r5.c
            long r6 = r0.longValue()
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.Long r2 = r5.c
            java.lang.String r3 = "Report was created at %d, before current sign in at %d"
            defpackage.oso.d(r3, r0, r2)
            goto L_0x0601
        L_0x0065:
            ozb r0 = r5.a
            oyz r0 = r0.c(r11)
            axrj r6 = defpackage.axrj.a
            axrk r6 = r6.a()
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x008c
            ozb r6 = r5.a
            oza r6 = r6.a
            boolean r6 = r6.a()
            boolean r0 = r0.a((java.lang.String) r11, (boolean) r6)
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "Data sharing is not enabled for %s corpus in %s"
            defpackage.oso.d(r0, r12, r11)
            goto L_0x0601
        L_0x008c:
            java.lang.String r0 = "Feature flag to tie upload to data sharing ui is not enabled."
            defpackage.oso.d(r0)
        L_0x0092:
            prp r0 = r5.b
            boolean r0 = defpackage.psl.a(r11, r0)
            if (r0 != 0) goto L_0x0601
            boolean r0 = defpackage.axrj.b()
            java.lang.String r6 = "Failed to parse schemaOrgAction proto."
            java.lang.String r7 = ".private:action"
            r9 = 4
            r10 = 0
            if (r0 == 0) goto L_0x015b
            aucx r8 = r8.e
            int r11 = r8.size()
            r12 = 0
        L_0x00ad:
            if (r12 >= r11) goto L_0x015b
            java.lang.Object r0 = r8.get(r12)
            oqn r0 = (defpackage.oqn) r0
            oqy r14 = r0.d
            if (r14 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            oqy r14 = defpackage.oqy.r
        L_0x00bc:
            java.lang.String r14 = r14.m
            boolean r14 = r7.equals(r14)
            if (r14 != 0) goto L_0x00c6
            goto L_0x0155
        L_0x00c6:
            auay r0 = r0.c     // Catch:{ auda -> 0x0151 }
            aubs r14 = defpackage.aubs.c()     // Catch:{ auda -> 0x0151 }
            bazc r15 = defpackage.bazc.d     // Catch:{ auda -> 0x0151 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x014f }
            java.lang.Object r15 = r15.c(r9)     // Catch:{ auda -> 0x014f }
            aucj r15 = (defpackage.aucj) r15     // Catch:{ auda -> 0x014f }
            aueh r13 = defpackage.aueh.a     // Catch:{ IOException -> 0x0135, RuntimeException -> 0x0124 }
            aueq r13 = r13.a((java.lang.Object) r15)     // Catch:{ IOException -> 0x0135, RuntimeException -> 0x0124 }
            aubd r9 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x0135, RuntimeException -> 0x0124 }
            r13.a(r15, r9, r14)     // Catch:{ IOException -> 0x0135, RuntimeException -> 0x0124 }
            r13.d(r15)     // Catch:{ IOException -> 0x0135, RuntimeException -> 0x0124 }
            r0.a((int) r10)     // Catch:{ auda -> 0x0121 }
            defpackage.aucj.b((defpackage.aucj) r15)     // Catch:{ auda -> 0x0151 }
            bazc r15 = (defpackage.bazc) r15     // Catch:{ auda -> 0x0151 }
            aucx r0 = r15.c
            int r9 = r0.size()
            r13 = 0
        L_0x00f7:
            if (r13 >= r9) goto L_0x0155
            java.lang.Object r14 = r0.get(r13)
            baza r14 = (defpackage.baza) r14
            int r13 = r13 + 1
            java.lang.String r15 = r14.b
            java.lang.String r10 = "account"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x011f
            bazd r0 = r14.c
            if (r0 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            bazd r0 = defpackage.bazd.g
        L_0x0112:
            java.lang.String r0 = r0.c
            java.lang.String r5 = r5.a()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0601
            goto L_0x015b
        L_0x011f:
            r10 = 0
            goto L_0x00f7
        L_0x0121:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch:{ auda -> 0x014f }
        L_0x0124:
            r0 = move-exception
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ auda -> 0x014f }
            boolean r9 = r9 instanceof defpackage.auda     // Catch:{ auda -> 0x014f }
            if (r9 == 0) goto L_0x0134
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x014f }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x014f }
            throw r0     // Catch:{ auda -> 0x014f }
        L_0x0134:
            throw r0     // Catch:{ auda -> 0x014f }
        L_0x0135:
            r0 = move-exception
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ auda -> 0x014f }
            boolean r9 = r9 instanceof defpackage.auda     // Catch:{ auda -> 0x014f }
            if (r9 != 0) goto L_0x0148
            auda r9 = new auda     // Catch:{ auda -> 0x014f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x014f }
            r9.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x014f }
            throw r9     // Catch:{ auda -> 0x014f }
        L_0x0148:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x014f }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x014f }
            throw r0     // Catch:{ auda -> 0x014f }
        L_0x014f:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            defpackage.oso.b(r6)
        L_0x0155:
            int r12 = r12 + 1
            r9 = 4
            r10 = 0
            goto L_0x00ad
        L_0x015b:
            android.content.Context r0 = r2.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            ptd r5 = r2.e
            if (r5 != 0) goto L_0x01a7
            ptc r5 = r2.f
            android.content.SharedPreferences r5 = r5.a()
            java.lang.String r8 = "ActionsUploadSalt"
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x0174
            goto L_0x0194
        L_0x0174:
            ptc r5 = r2.f
            java.security.SecureRandom r9 = new java.security.SecureRandom
            r9.<init>()
            long r9 = r9.nextLong()
            android.content.SharedPreferences r5 = r5.a()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r9 = r9 & r11
            android.content.SharedPreferences$Editor r5 = r5.putLong(r8, r9)
            r5.commit()
        L_0x0194:
            ptd r5 = new ptd
            ptc r9 = r2.f
            android.content.SharedPreferences r9 = r9.a()
            r10 = -1
            long r8 = r9.getLong(r8, r10)
            r5.<init>(r8)
            r2.e = r5
        L_0x01a7:
            ptd r5 = r2.e
            avrb r8 = r2.b
            r9 = -1
            if (r8 == 0) goto L_0x01af
            goto L_0x01e3
        L_0x01af:
            android.content.Context r8 = r2.a
            int r8 = defpackage.jhg.d((android.content.Context) r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r10 = r8.intValue()
            if (r10 == r9) goto L_0x01c2
            r20 = r8
            goto L_0x01c4
        L_0x01c2:
            r20 = 0
        L_0x01c4:
            android.content.Context r8 = r2.a
            r17 = 0
            r18 = 0
            java.lang.String r10 = r8.getPackageName()
            r11 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r10, r11)
            int r10 = r10.versionCode
            r21 = 0
            r22 = 0
            r16 = r8
            r19 = r10
            avrb r8 = defpackage.jhg.a(r16, r17, r18, r19, r20, r21, r22)
            r2.b = r8
        L_0x01e3:
            avrb r8 = r2.b
            pth r10 = defpackage.pth.f
            aucd r10 = r10.o()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x01f0
            goto L_0x01f6
        L_0x01f0:
            r10.c()
            r11 = 0
            r10.c = r11
        L_0x01f6:
            aucj r11 = r10.b
            pth r11 = (defpackage.pth) r11
            r8.getClass()
            r11.d = r8
            int r8 = r11.a
            r12 = 4
            r8 = r8 | r12
            r11.a = r8
            ovc r8 = r3.a
            java.lang.String r8 = r8.b
            ptk r11 = defpackage.ptk.f
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0214
            goto L_0x021a
        L_0x0214:
            r11.c()
            r12 = 0
            r11.c = r12
        L_0x021a:
            aucj r12 = r11.b
            ptk r12 = (defpackage.ptk) r12
            r8.getClass()
            int r13 = r12.a
            r14 = 1
            r13 = r13 | r14
            r12.a = r13
            r12.b = r8
            boolean r12 = defpackage.jkr.g()
            r13 = 2
            if (r12 == 0) goto L_0x02e9
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r12)
            long r14 = r0.getLongVersionCode()
            boolean r8 = r11.c
            if (r8 == 0) goto L_0x0244
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x0244:
            aucj r8 = r11.b
            ptk r8 = (defpackage.ptk) r8
            int r12 = r8.a
            r12 = r12 | r13
            r8.a = r12
            r8.c = r14
            android.content.pm.SigningInfo r0 = r0.signingInfo
            if (r0 != 0) goto L_0x0257
            ptj r0 = defpackage.ptj.c
            goto L_0x02ce
        L_0x0257:
            boolean r8 = r0.hasMultipleSigners()
            if (r8 == 0) goto L_0x0296
            ptj r8 = defpackage.ptj.c
            aucd r8 = r8.o()
            android.content.pm.Signature[] r0 = r0.getApkContentsSigners()
            amzy r0 = defpackage.ptd.a(r0)
            boolean r12 = r8.c
            if (r12 != 0) goto L_0x0270
            goto L_0x0276
        L_0x0270:
            r8.c()
            r12 = 0
            r8.c = r12
        L_0x0276:
            aucj r12 = r8.b
            ptj r12 = (defpackage.ptj) r12
            aucx r14 = r12.a
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x028a
            aucx r14 = r12.a
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r12.a = r14
        L_0x028a:
            aucx r12 = r12.a
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r12)
            aucj r0 = r8.i()
            ptj r0 = (defpackage.ptj) r0
            goto L_0x02ce
        L_0x0296:
            ptj r8 = defpackage.ptj.c
            aucd r8 = r8.o()
            android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
            amzy r0 = defpackage.ptd.a(r0)
            boolean r12 = r8.c
            if (r12 != 0) goto L_0x02a9
            goto L_0x02af
        L_0x02a9:
            r8.c()
            r12 = 0
            r8.c = r12
        L_0x02af:
            aucj r12 = r8.b
            ptj r12 = (defpackage.ptj) r12
            aucx r14 = r12.b
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x02c3
            aucx r14 = r12.b
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r12.b = r14
        L_0x02c3:
            aucx r12 = r12.b
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r12)
            aucj r0 = r8.i()
            ptj r0 = (defpackage.ptj) r0
        L_0x02ce:
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x02d3
            goto L_0x02d9
        L_0x02d3:
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x02d9:
            aucj r8 = r11.b
            ptk r8 = (defpackage.ptk) r8
            r0.getClass()
            r8.e = r0
            int r0 = r8.a
            r12 = 4
            r0 = r0 | r12
            r8.a = r0
            goto L_0x0332
        L_0x02e9:
            r12 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r12)
            int r8 = r0.versionCode
            long r14 = (long) r8
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x02f7
            goto L_0x02fd
        L_0x02f7:
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x02fd:
            aucj r8 = r11.b
            ptk r8 = (defpackage.ptk) r8
            int r12 = r8.a
            r12 = r12 | r13
            r8.a = r12
            r8.c = r14
            android.content.pm.Signature[] r0 = r0.signatures
            amzy r0 = defpackage.ptd.a(r0)
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x0313
            goto L_0x0319
        L_0x0313:
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x0319:
            aucj r8 = r11.b
            ptk r8 = (defpackage.ptk) r8
            aucx r12 = r8.d
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x032d
            aucx r12 = r8.d
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)
            r8.d = r12
        L_0x032d:
            aucx r8 = r8.d
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r8)
        L_0x0332:
            aucj r0 = r11.i()
            ptk r0 = (defpackage.ptk) r0
            boolean r8 = r10.c
            if (r8 != 0) goto L_0x033d
            goto L_0x0343
        L_0x033d:
            r10.c()
            r8 = 0
            r10.c = r8
        L_0x0343:
            aucj r8 = r10.b
            pth r8 = (defpackage.pth) r8
            r0.getClass()
            r8.c = r0
            int r0 = r8.a
            r0 = r0 | r13
            r8.a = r0
            ovc r0 = r3.a
            java.lang.String r0 = r0.b
            oqo r8 = r3.b()
            java.lang.String r8 = r8.c
            axsp r11 = defpackage.axsp.a
            axsq r11 = r11.a()
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x0373
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            ovc r12 = r3.a
            long r14 = r12.g
            long r11 = r11.toSeconds(r14)
            r14 = r11
            goto L_0x0378
        L_0x0373:
            ovc r11 = r3.a
            long r11 = r11.g
            r14 = r11
        L_0x0378:
            java.util.Locale r11 = java.util.Locale.US
            r12 = 4
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r12 = 0
            r9[r12] = r0
            r12 = 1
            r9[r12] = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r9[r13] = r0
            r0 = 3
            long r14 = r5.a
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r9[r0] = r5
            java.lang.String r0 = "%s-%s-%d-%d"
            java.lang.String r0 = java.lang.String.format(r11, r0, r9)
            byte[] r0 = r0.getBytes()
            java.util.UUID r0 = java.util.UUID.nameUUIDFromBytes(r0)
            r5 = 16
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            long r8 = r0.getMostSignificantBits()
            java.nio.ByteBuffer r5 = r5.putLong(r8)
            long r8 = r0.getLeastSignificantBits()
            java.nio.ByteBuffer r0 = r5.putLong(r8)
            byte[] r0 = r0.array()
            auay r0 = defpackage.auay.a((byte[]) r0)
            boolean r5 = r10.c
            if (r5 != 0) goto L_0x03c3
            goto L_0x03c9
        L_0x03c3:
            r10.c()
            r5 = 0
            r10.c = r5
        L_0x03c9:
            aucj r5 = r10.b
            pth r5 = (defpackage.pth) r5
            r0.getClass()
            int r8 = r5.a
            r8 = r8 | 8
            r5.a = r8
            r5.e = r0
            ovc r0 = r3.a
            oqo r3 = r3.b()
            ptf r5 = new ptf
            r5.<init>(r3)
            avqi r8 = defpackage.avqi.f
            aucd r8 = r8.o()
            avqh r8 = (defpackage.avqh) r8
            java.lang.String r3 = r3.c
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x03f2
            goto L_0x03f8
        L_0x03f2:
            r8.c()
            r9 = 0
            r8.c = r9
        L_0x03f8:
            aucj r9 = r8.b
            avqi r9 = (defpackage.avqi) r9
            r3.getClass()
            int r11 = r9.a
            r11 = r11 | r13
            r9.a = r11
            r9.c = r3
            java.lang.String r3 = "url"
            java.lang.String r3 = r5.b(r3)
            java.lang.String r9 = "sameAs"
            defpackage.ptd.a((defpackage.avqh) r8, (java.lang.String) r9, (java.lang.String) r3)
            avqi r3 = defpackage.avqi.f
            aucd r3 = r3.o()
            avqh r3 = (defpackage.avqh) r3
            java.lang.String r9 = "intent_action"
            java.lang.String r9 = r5.a(r9)
            java.lang.String r11 = "action"
            defpackage.ptd.a((defpackage.avqh) r3, (java.lang.String) r11, (java.lang.String) r9)
            java.lang.String r9 = "intent_data"
            java.lang.String r9 = r5.a(r9)
            java.lang.String r11 = "data"
            defpackage.ptd.a((defpackage.avqh) r3, (java.lang.String) r11, (java.lang.String) r9)
            java.lang.String r9 = "intent_activity"
            java.lang.String r9 = r5.a(r9)
            java.lang.String r14 = "activity"
            defpackage.ptd.a((defpackage.avqh) r3, (java.lang.String) r14, (java.lang.String) r9)
            avqi r9 = defpackage.avqi.f
            aucd r9 = r9.o()
            avqh r9 = (defpackage.avqh) r9
            java.lang.String r14 = "intent_extra_data"
            java.lang.String r14 = r5.a(r14)
            defpackage.ptd.a((defpackage.avqh) r9, (java.lang.String) r11, (java.lang.String) r14)
            aucj r9 = r9.i()
            avqi r9 = (defpackage.avqi) r9
            java.lang.String r11 = "extra"
            defpackage.ptd.a((defpackage.avqh) r3, (java.lang.String) r11, (defpackage.avqi) r9)
            aucj r3 = r3.i()
            avqi r3 = (defpackage.avqi) r3
            java.lang.String r9 = "intent"
            defpackage.ptd.a((defpackage.avqh) r8, (java.lang.String) r9, (defpackage.avqi) r3)
            java.lang.String r3 = "name"
            java.lang.String r9 = r5.b(r3)
            defpackage.ptd.a((defpackage.avqh) r8, (java.lang.String) r3, (java.lang.String) r9)
            long r14 = r0.g
            ovc r3 = defpackage.ovc.m
            long r12 = r3.g
            java.lang.String r19 = "timestampMs"
            r18 = r8
            r20 = r14
            r22 = r12
            defpackage.ptd.a(r18, r19, r20, r22)
            int r3 = r0.h
            ovg r3 = defpackage.ovg.a(r3)
            if (r3 == 0) goto L_0x0484
            goto L_0x0486
        L_0x0484:
            ovg r3 = defpackage.ovg.GENERAL_USE
        L_0x0486:
            int r3 = r3.g
            long r11 = (long) r3
            ovc r3 = defpackage.ovc.m
            int r3 = r3.h
            ovg r3 = defpackage.ovg.a(r3)
            if (r3 == 0) goto L_0x0494
            goto L_0x0496
        L_0x0494:
            ovg r3 = defpackage.ovg.GENERAL_USE
        L_0x0496:
            int r3 = r3.g
            long r13 = (long) r3
            java.lang.String r19 = "usageType"
            r18 = r8
            r20 = r11
            r22 = r13
            defpackage.ptd.a(r18, r19, r20, r22)
            int r0 = r0.l
            otk r0 = defpackage.otk.a(r0)
            if (r0 == 0) goto L_0x04ad
            goto L_0x04af
        L_0x04ad:
            otk r0 = defpackage.otk.UNKNOWN
        L_0x04af:
            int r0 = r0.d
            long r11 = (long) r0
            ovc r0 = defpackage.ovc.m
            int r0 = r0.l
            otk r0 = defpackage.otk.a(r0)
            if (r0 == 0) goto L_0x04bd
            goto L_0x04bf
        L_0x04bd:
            otk r0 = defpackage.otk.UNKNOWN
        L_0x04bf:
            int r0 = r0.d
            long r13 = (long) r0
            java.lang.String r19 = "eventStatus"
            r18 = r8
            r20 = r11
            r22 = r13
            defpackage.ptd.a(r18, r19, r20, r22)
            auay r0 = r5.c(r7)
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x052c }
            bazc r5 = defpackage.bazc.d     // Catch:{ auda -> 0x052c }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x052a }
            r7 = 4
            java.lang.Object r5 = r5.c(r7)     // Catch:{ auda -> 0x052a }
            aucj r5 = (defpackage.aucj) r5     // Catch:{ auda -> 0x052a }
            aueh r7 = defpackage.aueh.a     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x04ff }
            aueq r7 = r7.a((java.lang.Object) r5)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x04ff }
            aubd r11 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x04ff }
            r7.a(r5, r11, r3)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x04ff }
            r7.d(r5)     // Catch:{ IOException -> 0x0510, RuntimeException -> 0x04ff }
            r3 = 0
            r0.a((int) r3)     // Catch:{ auda -> 0x04fc }
            defpackage.aucj.b((defpackage.aucj) r5)     // Catch:{ auda -> 0x052c }
            bazc r5 = (defpackage.bazc) r5     // Catch:{ auda -> 0x052c }
            goto L_0x0532
        L_0x04fc:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ auda -> 0x052a }
        L_0x04ff:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ auda -> 0x052a }
            boolean r3 = r3 instanceof defpackage.auda     // Catch:{ auda -> 0x052a }
            if (r3 == 0) goto L_0x050f
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x052a }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x052a }
            throw r0     // Catch:{ auda -> 0x052a }
        L_0x050f:
            throw r0     // Catch:{ auda -> 0x052a }
        L_0x0510:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ auda -> 0x052a }
            boolean r3 = r3 instanceof defpackage.auda     // Catch:{ auda -> 0x052a }
            if (r3 != 0) goto L_0x0523
            auda r3 = new auda     // Catch:{ auda -> 0x052a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x052a }
            r3.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x052a }
            throw r3     // Catch:{ auda -> 0x052a }
        L_0x0523:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x052a }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x052a }
            throw r0     // Catch:{ auda -> 0x052a }
        L_0x052a:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x052c }
        L_0x052c:
            r0 = move-exception
            defpackage.oso.b(r6)
            bazc r5 = defpackage.bazc.d
        L_0x0532:
            java.lang.String r0 = r5.b
            java.lang.String r3 = "additionalType"
            defpackage.ptd.a((defpackage.avqh) r8, (java.lang.String) r3, (java.lang.String) r0)
            avqi r0 = defpackage.pte.a(r5)
            aucx r0 = r0.d
            r8.a((java.lang.Iterable) r0)
            aucj r0 = r8.i()
            avqi r0 = (defpackage.avqi) r0
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x054d
            goto L_0x0553
        L_0x054d:
            r10.c()
            r3 = 0
            r10.c = r3
        L_0x0553:
            aucj r3 = r10.b
            pth r3 = (defpackage.pth) r3
            r0.getClass()
            r3.b = r0
            int r0 = r3.a
            r5 = 1
            r0 = r0 | r5
            r3.a = r0
            aucj r0 = r10.i()
            pth r0 = (defpackage.pth) r0
            pta r3 = r2.c
            atix r5 = defpackage.atix.e
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0575
            goto L_0x057b
        L_0x0575:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x057b:
            aucj r6 = r5.b
            atix r6 = (defpackage.atix) r6
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r8 = 2099(0x833, float:2.941E-42)
            r6.b = r8
            r8 = 2
            r7 = r7 | r8
            r6.a = r7
            r7 = 220671791(0xd272f2f, float:5.1517643E-31)
            r6.c = r7
            aujv r6 = defpackage.aujv.a
            aucd r6 = r6.o()
            aucf r6 = (defpackage.aucf) r6
            auci r7 = defpackage.pth.g
            r6.a(r7, r0)
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x05a4
            goto L_0x05aa
        L_0x05a4:
            r5.c()
            r7 = 0
            r5.c = r7
        L_0x05aa:
            aucj r7 = r5.b
            atix r7 = (defpackage.atix) r7
            aucj r6 = r6.i()
            aujv r6 = (defpackage.aujv) r6
            r6.getClass()
            r7.d = r6
            int r6 = r7.a
            r6 = r6 | 32
            r7.a = r6
            aucj r5 = r5.i()
            atix r5 = (defpackage.atix) r5
            java.util.List r6 = r3.a
            r6.add(r5)
            int r5 = r3.b
            int r6 = r0.U
            r7 = -1
            if (r6 != r7) goto L_0x05de
            aueh r6 = defpackage.aueh.a
            aueq r6 = r6.a((java.lang.Object) r0)
            int r6 = r6.b(r0)
            r0.U = r6
            goto L_0x05df
        L_0x05de:
        L_0x05df:
            int r5 = r5 + r6
            r3.b = r5
            pta r0 = r2.c
            java.util.List r3 = r0.a
            int r3 = r3.size()
            r5 = 10
            if (r3 < r5) goto L_0x05ef
            goto L_0x05fc
        L_0x05ef:
            int r0 = r0.b
            r3 = 50000(0xc350, float:7.0065E-41)
            if (r0 >= r3) goto L_0x05fc
            r2 = 0
            aorr r0 = defpackage.aorl.a((java.lang.Object) r2)
            goto L_0x060c
        L_0x05fc:
            aorr r0 = r2.a(r4)
            goto L_0x060c
        L_0x0601:
            java.lang.String r0 = "Report is ineligible for upload. Skipping"
            defpackage.oso.a(r0)
            r2 = 0
            aorr r0 = defpackage.aorl.a((java.lang.Object) r2)
        L_0x060c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psx.a(java.lang.Object):aorr");
    }
}
