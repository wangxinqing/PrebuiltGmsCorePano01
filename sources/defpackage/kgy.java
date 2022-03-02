package defpackage;

/* renamed from: kgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgy implements kip {
    final /* synthetic */ kgz a;

    public kgy(kgz kgz) {
        this.a = kgz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Failed to start session"
            boolean r1 = defpackage.kiq.a(r13)
            if (r1 == 0) goto L_0x010a
            kgz r1 = r12.a
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x010a
            kgz r1 = r12.a
            r1.a(r13)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "Error downloading file"
            java.lang.String r4 = "StreamContentsOperation"
            switch(r13) {
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x003d;
                case 5: goto L_0x002e;
                case 6: goto L_0x003d;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                default: goto L_0x001e;
            }
        L_0x001e:
            ith r0 = defpackage.kgz.g
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r1] = r13
            java.lang.String r13 = "Invalid state here: %s"
            r0.b((java.lang.String) r4, (java.lang.String) r13, (java.lang.Object[]) r2)
            return
        L_0x002e:
            kgz r0 = r12.a
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            int r13 = defpackage.kiq.d(r13)
            r1.<init>(r13, r3)
            r0.b(r1)
            return
        L_0x003d:
            kgz r5 = r12.a
            lfq r5 = r5.c
            r6 = 3
            if (r13 != r6) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            r5.a((boolean) r1)
            kgz r6 = r12.a
            boolean r1 = r6.l
            r2 = 8
            if (r1 != 0) goto L_0x00bf
            kec r13 = r6.a     // Catch:{ nja -> 0x00b1 }
            com.google.android.gms.drive.internal.StreamContentsRequest r1 = r6.i     // Catch:{ nja -> 0x00b1 }
            com.google.android.gms.drive.DriveId r1 = r1.a     // Catch:{ nja -> 0x00b1 }
            kmp r13 = r13.b(r1)     // Catch:{ nja -> 0x00b1 }
            long r10 = r13.s()
            r1 = 0
            kei r3 = r6.h     // Catch:{ nja -> 0x0095, all -> 0x0093 }
            android.os.ParcelFileDescriptor r1 = r3.a(r13)     // Catch:{ nja -> 0x0095, all -> 0x0093 }
            java.lang.String r13 = r13.r()     // Catch:{ nja -> 0x0091, all -> 0x008f }
            r6.a(r1, r13)     // Catch:{ nja -> 0x0091, all -> 0x008f }
            boolean r13 = r6.l
            if (r13 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r1)
        L_0x0076:
            boolean r13 = r6.l
            if (r13 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            r7 = 1
            r8 = r10
            boolean r13 = r6.a(r7, r8, r10)
            if (r13 == 0) goto L_0x0087
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.a
            goto L_0x00f3
        L_0x0087:
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            java.lang.String r0 = "Failed to create session or communicate with client"
            r13.<init>(r2, r0)
            goto L_0x00f3
        L_0x008f:
            r13 = move-exception
            goto L_0x00a9
        L_0x0091:
            r13 = move-exception
            goto L_0x0096
        L_0x0093:
            r13 = move-exception
            goto L_0x00a9
        L_0x0095:
            r13 = move-exception
        L_0x0096:
            ith r3 = defpackage.kgz.g     // Catch:{ all -> 0x00a8 }
            r3.c(r4, r0, r13)     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00a8 }
            r13.<init>(r2, r0)     // Catch:{ all -> 0x00a8 }
            boolean r0 = r6.l
            if (r0 != 0) goto L_0x00f3
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r1)
            goto L_0x00f3
        L_0x00a8:
            r13 = move-exception
        L_0x00a9:
            boolean r0 = r6.l
            if (r0 != 0) goto L_0x00b0
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r1)
        L_0x00b0:
            throw r13
        L_0x00b1:
            r13 = move-exception
            ith r0 = defpackage.kgz.g
            java.lang.String r1 = "Failed to retrieve entry"
            r0.c(r4, r1, r13)
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r13.<init>(r2, r1)
            goto L_0x00f3
        L_0x00bf:
            r0 = 2
            if (r13 == r0) goto L_0x00c9
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r0 = 7
            r13.<init>(r0, r3)
            goto L_0x00f3
        L_0x00c9:
            kis r13 = r6.j     // Catch:{ IOException -> 0x00e6 }
            kie r13 = r13.b()     // Catch:{ IOException -> 0x00e6 }
            long r10 = r13.e()     // Catch:{ IOException -> 0x00e6 }
            r7 = 1
            r8 = r10
            boolean r13 = r6.a(r7, r8, r10)
            if (r13 != 0) goto L_0x00e3
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            java.lang.String r0 = "Failed to notify the client with completion"
            r13.<init>(r2, r0)
            goto L_0x00f3
        L_0x00e3:
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.a
            goto L_0x00f3
        L_0x00e6:
            r13 = move-exception
            ith r0 = defpackage.kgz.g
            java.lang.String r1 = "Could not access file"
            r0.c(r4, r1, r13)
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r13.<init>(r2, r1)
        L_0x00f3:
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x0104
            kgz r13 = r12.a
            lfq r13 = r13.c
            r13.h()
            r13.a()
            return
        L_0x0104:
            kgz r0 = r12.a
            r0.b(r13)
            return
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgy.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r2.l != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r2.l == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        defpackage.jjt.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r9, long r11) {
        /*
            r8 = this;
            java.lang.String r0 = "StreamContentsOperation"
            kgz r1 = r8.a
            r1.k = r11
            kgz r2 = r8.a
            kis r1 = r2.j
            if (r1 == 0) goto L_0x007c
            boolean r1 = r2.i()
            if (r1 != 0) goto L_0x007c
            boolean r1 = r2.l
            if (r1 != 0) goto L_0x0071
            kis r1 = r2.j
            kie r1 = r1.b()
            if (r1 == 0) goto L_0x0071
            r3 = 0
            kis r4 = r2.j     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            kit r4 = r4.a     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            if (r4 == 0) goto L_0x0034
            kie r5 = r4.f     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            if (r5 == 0) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r6 = "Download hasn't been started yet"
            defpackage.iva.a((boolean) r5, (java.lang.Object) r6)     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = r4.g     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            if (r4 != 0) goto L_0x003e
            ith r5 = defpackage.kgz.g     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            java.lang.String r6 = "Signature is null for a non-null pending content"
            r5.c((java.lang.String) r0, (java.lang.String) r6)     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
        L_0x003e:
            java.io.File r1 = r1.d()     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r1, r5)     // Catch:{ IOException -> 0x0058, nja -> 0x0056, all -> 0x0054 }
            r2.a(r3, r4)     // Catch:{ IOException -> 0x0052, nja -> 0x0050 }
            boolean r0 = r2.l
            if (r0 == 0) goto L_0x0064
            goto L_0x0071
        L_0x0050:
            r1 = move-exception
            goto L_0x0059
        L_0x0052:
            r1 = move-exception
            goto L_0x0059
        L_0x0054:
            r9 = move-exception
            goto L_0x0069
        L_0x0056:
            r1 = move-exception
            goto L_0x0059
        L_0x0058:
            r1 = move-exception
        L_0x0059:
            ith r4 = defpackage.kgz.g     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = "Exception while starting a session"
            r4.c(r0, r5, r1)     // Catch:{ all -> 0x0068 }
            boolean r0 = r2.l
            if (r0 != 0) goto L_0x0071
        L_0x0064:
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r3)
            goto L_0x0071
        L_0x0068:
            r9 = move-exception
        L_0x0069:
            boolean r10 = r2.l
            if (r10 != 0) goto L_0x0070
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r3)
        L_0x0070:
            throw r9
        L_0x0071:
            boolean r0 = r2.l
            if (r0 == 0) goto L_0x007c
            r3 = 0
            r4 = r9
            r6 = r11
            r2.a(r3, r4, r6)
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgy.a(long, long):void");
    }
}
