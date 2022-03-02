package defpackage;

/* renamed from: akmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akmh implements Runnable {
    private final akmn a;
    private final auac[] b;

    public akmh(akmn akmn, auac[] auacArr) {
        this.a = akmn;
        this.b = auacArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            akmn r0 = r8.a
            auac[] r1 = r8.b
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = defpackage.azcf.b()
            long r4 = r4.toMillis(r5)
            long r2 = r2 + r4
            r0.c = r2
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            java.io.File r5 = r0.g     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006e, all -> 0x006b }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0067, all -> 0x0065 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0067, all -> 0x0065 }
            r3 = 3
            r5.write(r3)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            long r6 = r0.c     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.writeLong(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r3 = 1
            r5.writeInt(r3)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r1 = r1[r2]     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r3 = r1
            aucj r3 = (defpackage.aucj) r3     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            int r3 = r3.U     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r6 = -1
            if (r3 != r6) goto L_0x0049
            aueh r3 = defpackage.aueh.a     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            aueq r3 = r3.a((java.lang.Object) r1)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            int r3 = r3.b(r1)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r6 = r1
            aucj r6 = (defpackage.aucj) r6     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r6.U = r3     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
        L_0x0049:
            byte[] r6 = new byte[r3]     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            aubk r7 = defpackage.aubk.a((byte[]) r6)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r1.a((defpackage.aubk) r7)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.writeInt(r3)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.write(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            defpackage.akmn.a((java.io.Closeable) r5)
            defpackage.akmn.a((java.io.Closeable) r4)
        L_0x005e:
            r0.b = r2
            return
        L_0x0061:
            r1 = move-exception
            goto L_0x0082
        L_0x0063:
            r1 = move-exception
            goto L_0x0069
        L_0x0065:
            r1 = move-exception
            goto L_0x0083
        L_0x0067:
            r1 = move-exception
            r5 = r3
        L_0x0069:
            r3 = r4
            goto L_0x0070
        L_0x006b:
            r1 = move-exception
            r4 = r3
            goto L_0x0083
        L_0x006e:
            r1 = move-exception
            r5 = r3
        L_0x0070:
            akof r1 = defpackage.aklz.a()     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "Failed to write model weights to disk"
            r1.b(r4)     // Catch:{ all -> 0x0080 }
            defpackage.akmn.a((java.io.Closeable) r5)
            defpackage.akmn.a((java.io.Closeable) r3)
            goto L_0x005e
        L_0x0080:
            r1 = move-exception
            r4 = r3
        L_0x0082:
            r3 = r5
        L_0x0083:
            defpackage.akmn.a((java.io.Closeable) r3)
            defpackage.akmn.a((java.io.Closeable) r4)
            r0.b = r2
            goto L_0x008d
        L_0x008c:
            throw r1
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmh.run():void");
    }
}
