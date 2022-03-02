package defpackage;

/* renamed from: org  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class org implements Runnable {
    private final osf a;

    public org(osf osf) {
        this.a = osf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015d A[SYNTHETIC, Splitter:B:85:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0171 A[SYNTHETIC, Splitter:B:92:0x0171] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            osf r0 = r14.a
            ppp r1 = r0.c
            r2 = 2
            r1.b((int) r2)
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x01b4
            com.google.android.gms.icing.nativeindex.NativeIndex r1 = r0.n
            long r3 = r1.b
            com.google.android.gms.icing.nativeindex.NativeIndex.nativeOnSleep(r3)
            ozq r1 = r0.b()
            java.lang.Object r3 = r1.a()
            monitor-enter(r3)
            boolean r4 = r1.g     // Catch:{ all -> 0x01b1 }
            if (r4 == 0) goto L_0x01a8
            paq r4 = r1.b     // Catch:{ all -> 0x01b1 }
            java.util.Map r5 = r1.f     // Catch:{ all -> 0x01b1 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01b1 }
            int r7 = r5.size()     // Catch:{ all -> 0x01b1 }
            r6.<init>(r7)     // Catch:{ all -> 0x01b1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01b1 }
        L_0x0037:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x01b1 }
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x00d3
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x01b1 }
            ota r7 = (defpackage.ota) r7     // Catch:{ all -> 0x01b1 }
            if (r7 == 0) goto L_0x0037
            otg r10 = r7.c     // Catch:{ all -> 0x01b1 }
            if (r10 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            otg r10 = defpackage.otg.h     // Catch:{ all -> 0x01b1 }
        L_0x004e:
            int r10 = r10.c     // Catch:{ all -> 0x01b1 }
            int r10 = defpackage.otf.a(r10)     // Catch:{ all -> 0x01b1 }
            if (r10 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            if (r10 != r8) goto L_0x0037
        L_0x0059:
            otb r10 = defpackage.otb.e     // Catch:{ all -> 0x01b1 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x01b1 }
            osz r11 = r7.b     // Catch:{ all -> 0x01b1 }
            if (r11 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            osz r11 = defpackage.osz.s     // Catch:{ all -> 0x01b1 }
        L_0x0066:
            int r11 = r11.b     // Catch:{ all -> 0x01b1 }
            boolean r12 = r10.c     // Catch:{ all -> 0x01b1 }
            if (r12 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r10.c()     // Catch:{ all -> 0x01b1 }
            r10.c = r9     // Catch:{ all -> 0x01b1 }
        L_0x0072:
            aucj r12 = r10.b     // Catch:{ all -> 0x01b1 }
            otb r12 = (defpackage.otb) r12     // Catch:{ all -> 0x01b1 }
            int r13 = r12.a     // Catch:{ all -> 0x01b1 }
            r8 = r8 | r13
            r12.a = r8     // Catch:{ all -> 0x01b1 }
            r12.b = r11     // Catch:{ all -> 0x01b1 }
            otg r8 = r7.c     // Catch:{ all -> 0x01b1 }
            if (r8 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            otg r8 = defpackage.otg.h     // Catch:{ all -> 0x01b1 }
        L_0x0084:
            aucx r8 = r8.b     // Catch:{ all -> 0x01b1 }
            boolean r11 = r10.c     // Catch:{ all -> 0x01b1 }
            if (r11 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r10.c()     // Catch:{ all -> 0x01b1 }
            r10.c = r9     // Catch:{ all -> 0x01b1 }
        L_0x0090:
            aucj r11 = r10.b     // Catch:{ all -> 0x01b1 }
            otb r11 = (defpackage.otb) r11     // Catch:{ all -> 0x01b1 }
            aucx r12 = r11.d     // Catch:{ all -> 0x01b1 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x01b1 }
            if (r12 == 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            aucx r12 = r11.d     // Catch:{ all -> 0x01b1 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x01b1 }
            r11.d = r12     // Catch:{ all -> 0x01b1 }
        L_0x00a5:
            aucx r11 = r11.d     // Catch:{ all -> 0x01b1 }
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r11)     // Catch:{ all -> 0x01b1 }
            otg r7 = r7.c     // Catch:{ all -> 0x01b1 }
            if (r7 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            otg r7 = defpackage.otg.h     // Catch:{ all -> 0x01b1 }
        L_0x00b1:
            int r7 = r7.e     // Catch:{ all -> 0x01b1 }
            boolean r8 = r10.c     // Catch:{ all -> 0x01b1 }
            if (r8 != 0) goto L_0x00b8
            goto L_0x00bd
        L_0x00b8:
            r10.c()     // Catch:{ all -> 0x01b1 }
            r10.c = r9     // Catch:{ all -> 0x01b1 }
        L_0x00bd:
            aucj r8 = r10.b     // Catch:{ all -> 0x01b1 }
            otb r8 = (defpackage.otb) r8     // Catch:{ all -> 0x01b1 }
            int r9 = r8.a     // Catch:{ all -> 0x01b1 }
            r9 = r9 | r2
            r8.a = r9     // Catch:{ all -> 0x01b1 }
            r8.c = r7     // Catch:{ all -> 0x01b1 }
            aucj r7 = r10.i()     // Catch:{ all -> 0x01b1 }
            otb r7 = (defpackage.otb) r7     // Catch:{ all -> 0x01b1 }
            r6.add(r7)     // Catch:{ all -> 0x01b1 }
            goto L_0x0037
        L_0x00d3:
            par r4 = (defpackage.par) r4     // Catch:{ all -> 0x01b1 }
            pxn r4 = r4.b     // Catch:{ all -> 0x01b1 }
            java.nio.ByteBuffer r5 = defpackage.jkw.a(r6, r8)     // Catch:{ all -> 0x01b1 }
            if (r5 == 0) goto L_0x01a8
            int r6 = r5.limit()     // Catch:{ all -> 0x01b1 }
            if (r6 == 0) goto L_0x0182
            int r6 = r5.remaining()     // Catch:{ all -> 0x01b1 }
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = "Icing"
            boolean r2 = android.util.Log.isLoggable(r6, r2)     // Catch:{ all -> 0x01b1 }
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = "Writing out (up to) %s for file %s"
            int r6 = r5.remaining()     // Catch:{ all -> 0x01b1 }
            long r6 = (long) r6     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = defpackage.plc.a((long) r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String r7 = r4.c     // Catch:{ all -> 0x01b1 }
            defpackage.oso.d(r2, r6, r7)     // Catch:{ all -> 0x01b1 }
            goto L_0x0109
        L_0x0102:
            java.lang.String r2 = "Writing out file %s"
            java.lang.String r6 = r4.c     // Catch:{ all -> 0x01b1 }
            defpackage.oso.a((java.lang.String) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x01b1 }
        L_0x0109:
            r2 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x014f, all -> 0x014d }
            java.io.File r7 = r4.d     // Catch:{ IOException -> 0x014f, all -> 0x014d }
            r6.<init>(r7)     // Catch:{ IOException -> 0x014f, all -> 0x014d }
            java.nio.channels.FileChannel r2 = r6.getChannel()     // Catch:{ IOException -> 0x014a, all -> 0x0147 }
            int r2 = r2.write(r5)     // Catch:{ IOException -> 0x014a, all -> 0x0147 }
            if (r2 != 0) goto L_0x0135
            java.lang.String r1 = "No bytes actually written out for file %s"
            java.lang.String r2 = r4.c     // Catch:{ IOException -> 0x014a, all -> 0x0147 }
            defpackage.oso.e((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ IOException -> 0x014a, all -> 0x0147 }
            r6.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x01a8
        L_0x0127:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x01b1 }
            r2[r9] = r4     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r1, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ all -> 0x01b1 }
            goto L_0x01a8
        L_0x0135:
            r6.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x01a6
        L_0x013a:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x01b1 }
            r5[r9] = r4     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r2, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x01b1 }
            goto L_0x01a6
        L_0x0147:
            r0 = move-exception
            r2 = r6
            goto L_0x016f
        L_0x014a:
            r1 = move-exception
            r2 = r6
            goto L_0x0150
        L_0x014d:
            r0 = move-exception
            goto L_0x016f
        L_0x014f:
            r1 = move-exception
        L_0x0150:
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x016e }
            java.lang.String r6 = r4.c     // Catch:{ all -> 0x016e }
            r5[r9] = r6     // Catch:{ all -> 0x016e }
            java.lang.String r6 = "Error while writing to %s"
            defpackage.oso.b((java.lang.Throwable) r1, (java.lang.String) r6, (java.lang.Object[]) r5)     // Catch:{ all -> 0x016e }
            if (r2 == 0) goto L_0x01a8
            r2.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x01a8
        L_0x0161:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x01b1 }
            r2[r9] = r4     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r1, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ all -> 0x01b1 }
            goto L_0x01a8
        L_0x016e:
            r0 = move-exception
        L_0x016f:
            if (r2 == 0) goto L_0x0181
            r2.close()     // Catch:{ IOException -> 0x0175 }
            goto L_0x0181
        L_0x0175:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x01b1 }
            r2[r9] = r4     // Catch:{ all -> 0x01b1 }
            java.lang.String r4 = "Error while closing stream to %s"
            defpackage.oso.b((java.lang.Throwable) r1, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ all -> 0x01b1 }
        L_0x0181:
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x0182:
            boolean r2 = r4.b()     // Catch:{ all -> 0x01b1 }
            if (r2 == 0) goto L_0x019f
            java.lang.String r2 = "Asked to write no data, deleting file %s"
            java.lang.String r5 = r4.c     // Catch:{ all -> 0x01b1 }
            defpackage.oso.a((java.lang.String) r2, (java.lang.Object) r5)     // Catch:{ all -> 0x01b1 }
            java.io.File r2 = r4.d     // Catch:{ all -> 0x01b1 }
            boolean r2 = r2.delete()     // Catch:{ all -> 0x01b1 }
            if (r2 != 0) goto L_0x01a6
            java.lang.String r1 = "Failed to delete file %s"
            java.lang.String r2 = r4.c     // Catch:{ all -> 0x01b1 }
            defpackage.oso.b((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x01b1 }
            goto L_0x01a8
        L_0x019f:
            java.lang.String r2 = "Skipping write out of would be empty file %s"
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x01b1 }
            defpackage.oso.d((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x01b1 }
        L_0x01a6:
            r1.g = r9     // Catch:{ all -> 0x01b1 }
        L_0x01a8:
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            pxs r0 = r0.k
            if (r0 == 0) goto L_0x01b4
            r0.b()
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            throw r0
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.org.run():void");
    }
}
