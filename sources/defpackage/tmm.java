package defpackage;

/* renamed from: tmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmm implements Runnable {
    private final tmz a;
    private final String b;
    private final auta c;
    private final String d;
    private final byte[] e;

    public tmm(tmz tmz, String str, auta auta, String str2, byte[] bArr) {
        this.a = tmz;
        this.b = str;
        this.c = auta;
        this.d = str2;
        this.e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146 A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149 A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016f A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ad A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01af A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0201 A[Catch:{ all -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021a A[Catch:{ all -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            tmz r2 = r1.a
            java.lang.String r15 = r1.b
            auta r0 = r1.c
            java.lang.String r11 = r1.d
            byte[] r12 = r1.e
            java.util.Map r3 = r2.h
            java.lang.Object r3 = r3.get(r15)
            r14 = r3
            tmv r14 = (defpackage.tmv) r14
            if (r14 == 0) goto L_0x0257
            r13 = 0
            r14.l = r0     // Catch:{ all -> 0x0247 }
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x0247 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0247 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0247 }
            java.lang.String r3 = "Completed UKEY2 with endpoint %s and obtained authentication token %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r15, (java.lang.Object) r11)     // Catch:{ all -> 0x0247 }
            boolean r0 = defpackage.aymi.w()     // Catch:{ all -> 0x0247 }
            r10 = 1
            if (r0 == 0) goto L_0x0139
            tlh r0 = r14.a     // Catch:{ all -> 0x0247 }
            tnm r3 = r14.c     // Catch:{ all -> 0x0247 }
            byte[] r4 = r0.c(r15)     // Catch:{ all -> 0x0247 }
            if (r4 == 0) goto L_0x0139
            tlj r4 = r0.h     // Catch:{ IOException -> 0x0126 }
            java.lang.String r5 = r0.c()     // Catch:{ IOException -> 0x0126 }
            byte[] r4 = r4.a(r5, r12)     // Catch:{ IOException -> 0x0126 }
            asav r5 = defpackage.asav.PAIRED_KEY_ENCRYPTION     // Catch:{ IOException -> 0x011d }
            asaj r6 = defpackage.asaj.c     // Catch:{ IOException -> 0x011d }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x011d }
            auay r4 = defpackage.auay.a((byte[]) r4)     // Catch:{ IOException -> 0x011d }
            boolean r7 = r6.c     // Catch:{ IOException -> 0x011d }
            if (r7 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r6.c()     // Catch:{ IOException -> 0x011d }
            r6.c = r13     // Catch:{ IOException -> 0x011d }
        L_0x0058:
            aucj r7 = r6.b     // Catch:{ IOException -> 0x011d }
            asaj r7 = (defpackage.asaj) r7     // Catch:{ IOException -> 0x011d }
            r4.getClass()     // Catch:{ IOException -> 0x011d }
            int r8 = r7.a     // Catch:{ IOException -> 0x011d }
            r8 = r8 | r10
            r7.a = r8     // Catch:{ IOException -> 0x011d }
            r7.b = r4     // Catch:{ IOException -> 0x011d }
            aucj r4 = r6.i()     // Catch:{ IOException -> 0x011d }
            asai r4 = defpackage.tpk.a((defpackage.asav) r5, (defpackage.audx) r4)     // Catch:{ IOException -> 0x011d }
            byte[] r4 = r4.k()     // Catch:{ IOException -> 0x011d }
            r3.a((byte[]) r4)     // Catch:{ IOException -> 0x011d }
            if (r3 == 0) goto L_0x0102
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x010a }
            com.google.android.gms.nearby.connection.Strategy r5 = r2.g()     // Catch:{ IOException -> 0x010a }
            java.lang.String r5 = r5.a()     // Catch:{ IOException -> 0x010a }
            r4[r13] = r5     // Catch:{ IOException -> 0x010a }
            tme r4 = new tme     // Catch:{ IOException -> 0x010a }
            r4.<init>(r3)     // Catch:{ IOException -> 0x010a }
            long r5 = defpackage.aymi.J()     // Catch:{ IOException -> 0x010a }
            java.util.concurrent.ScheduledExecutorService r7 = r2.f     // Catch:{ IOException -> 0x010a }
            tfu r4 = defpackage.tfu.b(r4, r5, r7)     // Catch:{ IOException -> 0x010a }
            byte[] r5 = r3.e()     // Catch:{ IOException -> 0x00e9 }
            asai r3 = defpackage.tpk.a((byte[]) r5)     // Catch:{ IOException -> 0x00e9 }
            r4.b()     // Catch:{ IOException -> 0x010a }
            asav r4 = defpackage.tpk.a((defpackage.asai) r3)     // Catch:{ IOException -> 0x010a }
            asav r5 = defpackage.asav.PAIRED_KEY_ENCRYPTION     // Catch:{ IOException -> 0x010a }
            if (r4 != r5) goto L_0x00cf
            asaw r3 = r3.c     // Catch:{ IOException -> 0x010a }
            if (r3 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            asaw r3 = defpackage.asaw.j     // Catch:{ IOException -> 0x010a }
        L_0x00ac:
            asaj r3 = r3.i     // Catch:{ IOException -> 0x010a }
            if (r3 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            asaj r3 = defpackage.asaj.c     // Catch:{ IOException -> 0x010a }
        L_0x00b3:
            auay r3 = r3.b     // Catch:{ IOException -> 0x010a }
            byte[] r3 = r3.k()     // Catch:{ IOException -> 0x010a }
            java.util.Map r4 = r0.g     // Catch:{ IOException -> 0x010a }
            java.lang.Object r4 = r4.get(r15)     // Catch:{ IOException -> 0x010a }
            byte[] r4 = (byte[]) r4     // Catch:{ IOException -> 0x010a }
            if (r4 == 0) goto L_0x00cd
            tlj r0 = r0.h     // Catch:{ IOException -> 0x010a }
            boolean r0 = r0.a(r4, r12, r3)     // Catch:{ IOException -> 0x010a }
            if (r0 == 0) goto L_0x00cd
            r0 = 1
            goto L_0x013a
        L_0x00cd:
            r0 = 0
            goto L_0x013a
        L_0x00cf:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x010a }
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x010a }
            asav r3 = defpackage.tpk.a((defpackage.asai) r3)     // Catch:{ IOException -> 0x010a }
            java.lang.String r3 = r3.name()     // Catch:{ IOException -> 0x010a }
            r4[r13] = r3     // Catch:{ IOException -> 0x010a }
            java.lang.String r3 = "In readPairedKeyEncryptionFrame, expected a PAIRED_KEY_ENCRYPTION v1 OfflineFrame but got a %s frame instead"
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x010a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x010a }
            throw r0     // Catch:{ IOException -> 0x010a }
        L_0x00e7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00e9:
            r0 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x00e7 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ all -> 0x00e7 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x00e7 }
            r6[r13] = r3     // Catch:{ all -> 0x00e7 }
            java.lang.String r3 = "In readConnectionRequestFrame, attempted to read a PairedKeyEncryptionFrame from EndpointChannel %s but was unable to obtain any OfflineFrame."
            java.lang.String r3 = java.lang.String.format(r3, r6)     // Catch:{ all -> 0x00e7 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x00e7 }
            throw r5     // Catch:{ all -> 0x00e7 }
        L_0x00fe:
            r4.b()     // Catch:{ IOException -> 0x010a }
            throw r0     // Catch:{ IOException -> 0x010a }
        L_0x0102:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x010a }
            java.lang.String r3 = "Unable to read from a null EndpointChannel"
            r0.<init>(r3)     // Catch:{ IOException -> 0x010a }
            throw r0     // Catch:{ IOException -> 0x010a }
        L_0x010a:
            r0 = move-exception
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x0247 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0247 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0247 }
            r3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0247 }
            java.lang.String r0 = "Failed to read paired key encryption frame."
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0247 }
            r0 = 0
            goto L_0x013a
        L_0x011d:
            r0 = move-exception
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0126 }
            java.lang.String r4 = "Failed to write PairedKeyEncryptionFrame"
            r3.<init>(r4, r0)     // Catch:{ IOException -> 0x0126 }
            throw r3     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x0247 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0247 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0247 }
            r3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0247 }
            java.lang.String r0 = "Failed to write paired key encryption frame."
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0247 }
            r0 = 0
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x0247 }
            anie r3 = r3.d()     // Catch:{ all -> 0x0247 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "%s the authentication token with endpoint %s using a preshared public key"
            if (r0 != 0) goto L_0x0149
            java.lang.String r5 = "Unable to verify"
            goto L_0x014b
        L_0x0149:
            java.lang.String r5 = "Successfully verified"
        L_0x014b:
            r3.a((java.lang.String) r4, (java.lang.Object) r5, (java.lang.Object) r15)     // Catch:{ all -> 0x0247 }
            tob r3 = r2.b     // Catch:{ all -> 0x0247 }
            asav r4 = defpackage.asav.CONNECTION_RESPONSE     // Catch:{ all -> 0x0247 }
            r3.a((defpackage.asav) r4, (defpackage.tny) r2)     // Catch:{ all -> 0x0247 }
            tob r9 = r2.b     // Catch:{ all -> 0x0247 }
            tlh r5 = r14.a     // Catch:{ all -> 0x0247 }
            byte[] r8 = r14.b     // Catch:{ all -> 0x0247 }
            byte[] r7 = r14.i     // Catch:{ all -> 0x0247 }
            boolean r6 = r14.e     // Catch:{ all -> 0x0247 }
            tnm r4 = r14.c     // Catch:{ all -> 0x0247 }
            ob r3 = new ob     // Catch:{ all -> 0x0247 }
            java.util.List r13 = r14.j     // Catch:{ all -> 0x0247 }
            r3.<init>((java.util.Collection) r13)     // Catch:{ all -> 0x0247 }
            boolean r13 = r3.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r13 != 0) goto L_0x016f
            goto L_0x0177
        L_0x016f:
            asoe r3 = r2.e()     // Catch:{ all -> 0x0247 }
            anax r3 = defpackage.anax.a((java.lang.Object) r3)     // Catch:{ all -> 0x0247 }
        L_0x0177:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0247 }
            r13.<init>()     // Catch:{ all -> 0x0247 }
            java.util.List r17 = r2.f()     // Catch:{ all -> 0x0247 }
            java.util.Iterator r17 = r17.iterator()     // Catch:{ all -> 0x0247 }
        L_0x0184:
            boolean r18 = r17.hasNext()     // Catch:{ all -> 0x0247 }
            if (r18 == 0) goto L_0x019f
            java.lang.Object r18 = r17.next()     // Catch:{ all -> 0x0247 }
            r10 = r18
            asoe r10 = (defpackage.asoe) r10     // Catch:{ all -> 0x0247 }
            boolean r18 = r3.contains(r10)     // Catch:{ all -> 0x0247 }
            if (r18 == 0) goto L_0x019d
            r13.add(r10)     // Catch:{ all -> 0x0247 }
            r10 = 1
            goto L_0x0184
        L_0x019d:
            r10 = 1
            goto L_0x0184
        L_0x019f:
            ugh r10 = r14.g     // Catch:{ all -> 0x0247 }
            boolean r3 = r14.h     // Catch:{ all -> 0x0247 }
            if (r3 == 0) goto L_0x01af
            tph r2 = r2.c     // Catch:{ all -> 0x0247 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0247 }
            if (r2 == 0) goto L_0x01af
            r2 = 1
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0247 }
            r1 = 1
            r3.<init>(r1)     // Catch:{ all -> 0x0247 }
            tnu r1 = new tnu     // Catch:{ all -> 0x0247 }
            r18 = r3
            r3 = r1
            r17 = r4
            r4 = r9
            r20 = r6
            r6 = r15
            r21 = r7
            r7 = r17
            r17 = r8
            r8 = r13
            r13 = r9
            r9 = r17
            r17 = r10
            r10 = r21
            r19 = r1
            r1 = r13
            r21 = 0
            r13 = r20
            r22 = r14
            r14 = r0
            r23 = r15
            r15 = r17
            r16 = r2
            r17 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0243 }
            r0 = r19
            r1.a(r0)     // Catch:{ all -> 0x0243 }
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0243 }
            r1 = r23
            r0[r21] = r1     // Catch:{ all -> 0x0243 }
            java.lang.String r2 = "registerEndpoint(%s)"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x0243 }
            r2 = r18
            defpackage.thr.a((java.lang.String) r0, (java.util.concurrent.CountDownLatch) r2)     // Catch:{ all -> 0x0243 }
            r2 = r22
            boolean r0 = r2.e     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x021a
            tlh r0 = r2.a     // Catch:{ all -> 0x0241 }
            tkx r3 = r0.f     // Catch:{ all -> 0x0241 }
            tnm r0 = r2.c     // Catch:{ all -> 0x0241 }
            asoe r5 = r0.l()     // Catch:{ all -> 0x0241 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0241 }
            long r6 = r2.f     // Catch:{ all -> 0x0241 }
            r4 = 2
            r8 = 2
            long r0 = r0 - r6
            r6 = r8
            r7 = r0
            r3.a((int) r4, (defpackage.asoe) r5, (int) r6, (long) r7)     // Catch:{ all -> 0x0241 }
            goto L_0x0235
        L_0x021a:
            tlh r0 = r2.a     // Catch:{ all -> 0x0241 }
            tkx r3 = r0.f     // Catch:{ all -> 0x0241 }
            tnm r0 = r2.c     // Catch:{ all -> 0x0241 }
            asoe r6 = r0.l()     // Catch:{ all -> 0x0241 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0241 }
            long r7 = r2.f     // Catch:{ all -> 0x0241 }
            r0 = 2
            r9 = 2
            long r10 = r4 - r7
            r4 = r1
            r5 = r0
            r7 = r9
            r8 = r10
            r3.a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0241 }
        L_0x0235:
            aosh r0 = r2.k
            if (r0 == 0) goto L_0x0240
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0.b((java.lang.Object) r1)
        L_0x0240:
            return
        L_0x0241:
            r0 = move-exception
            goto L_0x024b
        L_0x0243:
            r0 = move-exception
            r2 = r22
            goto L_0x024b
        L_0x0247:
            r0 = move-exception
            r2 = r14
            r21 = 0
        L_0x024b:
            aosh r1 = r2.k
            if (r1 == 0) goto L_0x0256
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r1.b((java.lang.Object) r2)
        L_0x0256:
            throw r0
        L_0x0257:
            r1 = r15
            jjg r0 = defpackage.tky.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "onEncryptionSuccess() for endpoint %s, but the connection was already removed."
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmm.run():void");
    }
}
