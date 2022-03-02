package defpackage;

/* renamed from: gxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxp {
    private static final iwd a = gzk.a("ServiceDumpSys");

    private gxp() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0 A[SYNTHETIC, Splitter:B:41:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102 A[SYNTHETIC, Splitter:B:47:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Map r9, android.os.DropBoxManager r10, java.io.File r11) {
        /*
            java.lang.String r0 = "Cannot close"
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x000a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "dumpsys:"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x010f
            r3 = 8
            java.lang.String r3 = r2.substring(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "\\s+"
            java.lang.String[] r1 = r1.split(r4)
            goto L_0x0046
        L_0x0044:
            java.lang.String[] r1 = new java.lang.String[r5]
        L_0x0046:
            r4 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d0, all -> 0x00ce }
            r6.<init>(r11)     // Catch:{ IOException -> 0x00d0, all -> 0x00ce }
            iwd r4 = a     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            int r7 = r7.length()     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            int r7 = r7 + 18
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.String r7 = "dumping service ["
            r8.append(r7)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            r8.append(r3)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.String r7 = "]"
            r8.append(r7)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.String r7 = r8.toString()     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            r4.c(r7, r8)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            java.io.FileDescriptor r4 = r6.getFD()     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            boolean r1 = android.os.Debug.dumpService(r3, r4, r1)     // Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
            if (r1 != 0) goto L_0x008a
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x000a
        L_0x0081:
            r1 = move-exception
            iwd r2 = a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r2.e(r0, r1, r3)
            goto L_0x000a
        L_0x008a:
            r6.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0096
        L_0x008e:
            r1 = move-exception
            iwd r3 = a
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r3.e(r0, r1, r4)
        L_0x0096:
            r1 = 2
            r10.addFile(r2, r11, r1)     // Catch:{ IOException -> 0x009f }
            r11.delete()     // Catch:{ IOException -> 0x009f }
            goto L_0x000a
        L_0x009f:
            r1 = move-exception
            iwd r2 = a
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 24
            r6.<init>(r4)
            java.lang.String r4 = "Can't log service dump: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r2.e(r3, r1, r4)
            goto L_0x000a
        L_0x00c8:
            r9 = move-exception
            r4 = r6
            goto L_0x0100
        L_0x00cb:
            r1 = move-exception
            r4 = r6
            goto L_0x00d1
        L_0x00ce:
            r9 = move-exception
            goto L_0x0100
        L_0x00d0:
            r1 = move-exception
        L_0x00d1:
            iwd r2 = a     // Catch:{ all -> 0x00ff }
            java.lang.String r6 = "Can't dump service: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ff }
            int r7 = r3.length()     // Catch:{ all -> 0x00ff }
            if (r7 != 0) goto L_0x00e5
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00ff }
            r3.<init>(r6)     // Catch:{ all -> 0x00ff }
            goto L_0x00e9
        L_0x00e5:
            java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x00ff }
        L_0x00e9:
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ff }
            r2.e(r3, r1, r6)     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x000a
            r4.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x000a
        L_0x00f5:
            r1 = move-exception
            iwd r2 = a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r2.e(r0, r1, r3)
            goto L_0x000a
        L_0x00ff:
            r9 = move-exception
        L_0x0100:
            if (r4 == 0) goto L_0x010e
            r4.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010e
        L_0x0106:
            r10 = move-exception
            iwd r11 = a
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r11.e(r0, r10, r1)
        L_0x010e:
            throw r9
        L_0x010f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r2)
            java.lang.String r11 = "Bad service key: "
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0123
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            goto L_0x0127
        L_0x0123:
            java.lang.String r10 = r11.concat(r10)
        L_0x0127:
            r9.<init>(r10)
            throw r9
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxp.a(java.util.Map, android.os.DropBoxManager, java.io.File):void");
    }
}
