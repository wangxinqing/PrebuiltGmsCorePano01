package defpackage;

/* renamed from: ahrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrc {
    private final String a;
    private int b = 0;
    private String c;
    private final aiab d;

    public ahrc(String str, aiab aiab) {
        this.a = str;
        this.d = aiab;
        int i = ahvx.b;
    }

    private final void a() {
        this.b = 0;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[SYNTHETIC, Splitter:B:35:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[SYNTHETIC, Splitter:B:42:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[SYNTHETIC, Splitter:B:47:0x00ab] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0086=Splitter:B:32:0x0086, B:39:0x0099=Splitter:B:39:0x0099} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ahul a(defpackage.aqek r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 6
            aqek r0 = r12.e(r0)     // Catch:{ all -> 0x00b1 }
            r1 = 3
            int r0 = r0.b((int) r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = r11.c     // Catch:{ all -> 0x00b1 }
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0019
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            r11.c = r2     // Catch:{ all -> 0x00b1 }
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r11.a     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = r11.c     // Catch:{ all -> 0x00b1 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ all -> 0x00b1 }
            r7 = 0
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            r10.<init>(r5, r4)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            r9.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            r8.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0085, all -> 0x0083 }
            if (r2 != 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            r8.writeInt(r1)     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
        L_0x003e:
            aiab r1 = r11.d     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            byte[] r12 = r12.b()     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            byte[] r12 = defpackage.ahvx.a((byte[]) r12)     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r1.a((java.io.DataOutputStream) r8, (byte[]) r12)     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            java.util.Locale r12 = java.util.Locale.ENGLISH     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r12[r3] = r0     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            java.io.File r0 = r5.getAbsoluteFile()     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r12[r4] = r0     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            int r12 = r11.b     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            int r12 = r12 + r4
            r11.b = r12     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r0 = 50
            if (r12 >= r0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r11.a()     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
        L_0x0069:
            ahul r12 = new ahul     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            java.lang.String r0 = ""
            r12.<init>(r4, r6, r0)     // Catch:{ FileNotFoundException -> 0x007b, IOException -> 0x0079, all -> 0x0077 }
            r8.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
            r0 = move-exception
        L_0x0075:
            monitor-exit(r11)
            return r12
        L_0x0077:
            r12 = move-exception
            goto L_0x007d
        L_0x0079:
            r12 = move-exception
            goto L_0x007f
        L_0x007b:
            r12 = move-exception
            goto L_0x0081
        L_0x007d:
            r7 = r8
            goto L_0x00a9
        L_0x007f:
            r7 = r8
            goto L_0x0086
        L_0x0081:
            r7 = r8
            goto L_0x0099
        L_0x0083:
            r12 = move-exception
            goto L_0x00a9
        L_0x0085:
            r12 = move-exception
        L_0x0086:
            r11.a()     // Catch:{ all -> 0x00a8 }
            ahul r12 = new ahul     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "Failed to write data to file"
            r12.<init>(r3, r6, r0)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x0075
            r7.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x0075
        L_0x0096:
            r0 = move-exception
            goto L_0x0075
        L_0x0098:
            r12 = move-exception
        L_0x0099:
            ahul r12 = new ahul     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "File not found."
            r12.<init>(r3, r6, r0)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x0075
            r7.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x0075
        L_0x00a6:
            r0 = move-exception
            goto L_0x0075
        L_0x00a8:
            r12 = move-exception
        L_0x00a9:
            if (r7 == 0) goto L_0x00b0
            r7.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r0 = move-exception
        L_0x00b0:
            throw r12     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x00b5
        L_0x00b4:
            throw r12
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrc.a(aqek):ahul");
    }
}
