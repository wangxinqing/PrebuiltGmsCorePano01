package defpackage;

/* renamed from: abrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrj implements Runnable {
    final /* synthetic */ abrk a;

    public abrj(abrk abrk) {
        this.a = abrk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Connecting to %s failed %s"
            abrk r1 = r14.a
            absf r2 = r1.b
            abxe r3 = r1.a
            com.google.android.gms.smartdevice.d2d.D2DDevice r4 = r1.c
            java.lang.String r5 = r1.d
            abxb r1 = r1.e
            android.os.Handler r6 = r2.c
            defpackage.iva.a((android.os.Handler) r6)
            acah r6 = r2.b
            r7 = 2
            r6.e(r7)
            acah r6 = r2.b
            r8 = 4
            defpackage.acaj.a(r6, r8)
            abra r2 = r2.d
            java.lang.String r6 = "device cannot be null."
            defpackage.iva.a((java.lang.Object) r4, (java.lang.Object) r6)
            java.lang.String r6 = "connectionListener cannot be null."
            defpackage.iva.a((java.lang.Object) r1, (java.lang.Object) r6)
            int r6 = r4.b
            r9 = 1
            r10 = 0
            if (r6 != r9) goto L_0x0037
            acah r6 = r2.d
            r6.f(r7)
            goto L_0x0060
        L_0x0037:
            if (r6 == r7) goto L_0x005b
            iwd r6 = defpackage.abra.a
            int r8 = r4.b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 77
            r11.<init>(r12)
            java.lang.String r12 = "Unsupported device protocol ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") for logging device connection type!"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r6.d(r8, r11)
            goto L_0x0060
        L_0x005b:
            acah r6 = r2.d
            r6.f(r8)
        L_0x0060:
            abqd r6 = r2.k
            if (r6 != 0) goto L_0x018a
            boolean r6 = defpackage.azlf.f()
            if (r6 == 0) goto L_0x006f
            abvs r6 = r2.g
            r6.c()
        L_0x006f:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r8 = 8
            r6.<init>(r8)
            r2.m = r10
            r2.i = r4     // Catch:{ all -> 0x0168 }
            abob r8 = r2.f     // Catch:{ all -> 0x0168 }
            abpo r11 = r2.c     // Catch:{ all -> 0x0168 }
            abqd r8 = r8.a(r11, r2, r1)     // Catch:{ all -> 0x0168 }
            r2.k = r8     // Catch:{ all -> 0x0168 }
            int r8 = r4.b     // Catch:{ all -> 0x0168 }
            if (r8 != r9) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            if (r8 == r7) goto L_0x0094
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0168 }
            r5 = 10560(0x2940, float:1.4798E-41)
            r1.<init>(r5)     // Catch:{ all -> 0x0168 }
            goto L_0x0145
        L_0x0094:
            iwd r8 = defpackage.abra.a     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = "Connecting to: "
            java.lang.String r12 = r4.c     // Catch:{ all -> 0x0168 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0168 }
            int r13 = r12.length()     // Catch:{ all -> 0x0168 }
            if (r13 != 0) goto L_0x00aa
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0168 }
            r12.<init>(r11)     // Catch:{ all -> 0x0168 }
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r12 = r11.concat(r12)     // Catch:{ all -> 0x0168 }
        L_0x00ae:
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0168 }
            r8.b(r12, r11)     // Catch:{ all -> 0x0168 }
            iwd r8 = defpackage.abra.a     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = "Connecting using PIN: "
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0168 }
            int r13 = r12.length()     // Catch:{ all -> 0x0168 }
            if (r13 != 0) goto L_0x00c7
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0168 }
            r12.<init>(r11)     // Catch:{ all -> 0x0168 }
            goto L_0x00cb
        L_0x00c7:
            java.lang.String r12 = r11.concat(r12)     // Catch:{ all -> 0x0168 }
        L_0x00cb:
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0168 }
            r8.a(r12, r11)     // Catch:{ all -> 0x0168 }
            boolean r8 = defpackage.abra.b     // Catch:{ all -> 0x0168 }
            if (r8 != 0) goto L_0x00d5
            goto L_0x00d8
        L_0x00d5:
            r2.d()     // Catch:{ all -> 0x0168 }
        L_0x00d8:
            abqz r8 = new abqz     // Catch:{ all -> 0x0168 }
            abqd r11 = r2.k     // Catch:{ all -> 0x0168 }
            r8.<init>(r2, r11, r1)     // Catch:{ all -> 0x0168 }
            abqg r1 = r2.h     // Catch:{ all -> 0x0168 }
            int r11 = r4.b     // Catch:{ all -> 0x0168 }
            r12 = 3
            if (r11 == r9) goto L_0x0107
            if (r11 == r7) goto L_0x00f9
            ibr r1 = new ibr     // Catch:{ all -> 0x0168 }
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0168 }
            r8 = 13
            r5.<init>(r8)     // Catch:{ all -> 0x0168 }
            r1.<init>(r5)     // Catch:{ all -> 0x0168 }
            acwa r1 = defpackage.acws.a((java.lang.Exception) r1)     // Catch:{ all -> 0x0168 }
            goto L_0x0114
        L_0x00f9:
            r11 = r1
            abpx r11 = (defpackage.abpx) r11     // Catch:{ all -> 0x0168 }
            r11.c = r12     // Catch:{ all -> 0x0168 }
            abpx r1 = (defpackage.abpx) r1     // Catch:{ all -> 0x0168 }
            abqw r1 = r1.b     // Catch:{ all -> 0x0168 }
            acwa r1 = r1.a((com.google.android.gms.smartdevice.d2d.D2DDevice) r4, (defpackage.acau) r8, (java.lang.String) r5)     // Catch:{ all -> 0x0168 }
            goto L_0x0114
        L_0x0107:
            r11 = r1
            abpx r11 = (defpackage.abpx) r11     // Catch:{ all -> 0x0168 }
            r11.c = r7     // Catch:{ all -> 0x0168 }
            abpx r1 = (defpackage.abpx) r1     // Catch:{ all -> 0x0168 }
            abqg r1 = r1.a     // Catch:{ all -> 0x0168 }
            acwa r1 = r1.a(r4, r8, r5)     // Catch:{ all -> 0x0168 }
        L_0x0114:
            com.google.android.gms.common.api.Status r6 = defpackage.acqd.a((defpackage.acwa) r1)     // Catch:{ all -> 0x0168 }
            abpo r1 = r2.c     // Catch:{ all -> 0x0166 }
            abna r1 = r1.f     // Catch:{ all -> 0x0166 }
            int r5 = r4.b     // Catch:{ all -> 0x0166 }
            if (r5 == r9) goto L_0x0123
            java.lang.String r5 = "NearbyConnections"
            goto L_0x0125
        L_0x0123:
            java.lang.String r5 = "NearbyBootstrap"
        L_0x0125:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0166 }
            int r11 = r6.i     // Catch:{ all -> 0x0166 }
            amsv r1 = r1.c     // Catch:{ all -> 0x0166 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x0166 }
            ahgz r1 = (defpackage.ahgz) r1     // Catch:{ all -> 0x0166 }
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0166 }
            r12[r10] = r5     // Catch:{ all -> 0x0166 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0166 }
            r12[r9] = r5     // Catch:{ all -> 0x0166 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0166 }
            r12[r7] = r5     // Catch:{ all -> 0x0166 }
            r1.b(r12)     // Catch:{ all -> 0x0166 }
            r1 = r6
        L_0x0145:
            boolean r5 = r1.c()
            if (r5 != 0) goto L_0x0162
            iwd r5 = defpackage.abra.a
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r4 = r4.c
            r6[r10] = r4
            r6[r9] = r1
            r5.e(r0, r6)
            acah r0 = r2.d
            int r4 = r1.i
            r0.b((int) r4)
            r2.a()
        L_0x0162:
            defpackage.abra.c(r3, r1)
            return
        L_0x0166:
            r1 = move-exception
            goto L_0x0169
        L_0x0168:
            r1 = move-exception
        L_0x0169:
            boolean r5 = r6.c()
            if (r5 != 0) goto L_0x0186
            iwd r5 = defpackage.abra.a
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r4 = r4.c
            r7[r10] = r4
            r7[r9] = r6
            r5.e(r0, r7)
            acah r0 = r2.d
            int r4 = r6.i
            r0.b((int) r4)
            r2.a()
        L_0x0186:
            defpackage.abra.c(r3, r6)
            throw r1
        L_0x018a:
            iwd r0 = defpackage.abra.a
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = "Connection already in progress."
            r0.e(r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 10566(0x2946, float:1.4806E-41)
            r0.<init>(r1)
            defpackage.abra.c(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrj.run():void");
    }
}
