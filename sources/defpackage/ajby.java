package defpackage;

/* renamed from: ajby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajby implements Runnable {
    final /* synthetic */ ajbz a;
    private final long b;

    public ajby(ajbz ajbz, long j) {
        this.a = ajbz;
        this.b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0 A[Catch:{ all -> 0x00b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            ajbz r1 = r7.a
            ajaa r1 = r1.f
            java.io.File r1 = r1.i()
            java.lang.String r2 = "cp_state"
            r0.<init>(r1, r2)
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0090, SecurityException -> 0x0066, IOException -> 0x0046, all -> 0x0043 }
            if (r2 == 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r0.createNewFile()     // Catch:{ FileNotFoundException -> 0x0090, SecurityException -> 0x0066, IOException -> 0x0046, all -> 0x0043 }
        L_0x001a:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0090, SecurityException -> 0x0066, IOException -> 0x0046, all -> 0x0043 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0090, SecurityException -> 0x0066, IOException -> 0x0046, all -> 0x0043 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            ajbz r3 = r7.a     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            long r4 = r7.b     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            r3.a(r4, r1)     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            byte[] r1 = r1.toByteArray()     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            r2.write(r1)     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            r2.flush()     // Catch:{ FileNotFoundException -> 0x0041, SecurityException -> 0x003f, IOException -> 0x003c }
            defpackage.ajbz.a((java.io.Closeable) r2)
            return
        L_0x003c:
            r1 = move-exception
            r1 = r2
            goto L_0x0047
        L_0x003f:
            r1 = move-exception
            goto L_0x006a
        L_0x0041:
            r1 = move-exception
            goto L_0x0094
        L_0x0043:
            r0 = move-exception
            goto L_0x00b9
        L_0x0046:
            r2 = move-exception
        L_0x0047:
            java.lang.String r2 = "Failed to save collection policy state."
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0064 }
            int r3 = r0.length()     // Catch:{ all -> 0x0064 }
            if (r3 != 0) goto L_0x005d
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0064 }
            r0.<init>(r2)     // Catch:{ all -> 0x0064 }
            goto L_0x0060
        L_0x005d:
            r2.concat(r0)     // Catch:{ all -> 0x0064 }
        L_0x0060:
            defpackage.ajbz.a((java.io.Closeable) r1)
            return
        L_0x0064:
            r0 = move-exception
            goto L_0x00b9
        L_0x0066:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x006a:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008d }
            int r3 = r0.length()     // Catch:{ all -> 0x008d }
            if (r3 != 0) goto L_0x0086
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x008d }
            r0.<init>(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0089
        L_0x0086:
            r1.concat(r0)     // Catch:{ all -> 0x008d }
        L_0x0089:
            defpackage.ajbz.a((java.io.Closeable) r2)
            return
        L_0x008d:
            r0 = move-exception
            r1 = r2
            goto L_0x00b9
        L_0x0090:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0094:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            int r3 = r0.length()     // Catch:{ all -> 0x00b7 }
            if (r3 != 0) goto L_0x00b0
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00b7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b3
        L_0x00b0:
            r1.concat(r0)     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            defpackage.ajbz.a((java.io.Closeable) r2)
            return
        L_0x00b7:
            r0 = move-exception
            r1 = r2
        L_0x00b9:
            defpackage.ajbz.a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajby.run():void");
    }
}
