package defpackage;

/* renamed from: qht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qht extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qht(qij qij) {
        super("getInstantAppCookie");
        this.b = qij;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(defpackage.qfc r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            qij r6 = r4.b
            android.content.pm.PackageInfo r5 = r5.b
            java.lang.String r5 = r5.packageName
            java.io.File r5 = r6.a(r5)
            r6 = 0
            if (r5 == 0) goto L_0x0056
            boolean r7 = r5.exists()
            if (r7 == 0) goto L_0x0056
            r7 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0033 }
            r0.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0033 }
            int r5 = r0.available()     // Catch:{ FileNotFoundException -> 0x002e, IOException -> 0x0029, all -> 0x0026 }
            byte[] r6 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x002e, IOException -> 0x0029, all -> 0x0026 }
            r0.read(r6)     // Catch:{ FileNotFoundException -> 0x002e, IOException -> 0x0029, all -> 0x0026 }
            defpackage.jjt.a((java.io.Closeable) r0)
            goto L_0x0057
        L_0x0026:
            r5 = move-exception
            r6 = r0
            goto L_0x0052
        L_0x0029:
            r5 = move-exception
            r3 = r0
            r0 = r6
            r6 = r3
            goto L_0x0037
        L_0x002e:
            r5 = move-exception
            r3 = r0
            r0 = r6
            r6 = r3
            goto L_0x0043
        L_0x0033:
            r5 = move-exception
            goto L_0x0052
        L_0x0035:
            r5 = move-exception
            r0 = r6
        L_0x0037:
            qfn r1 = defpackage.qij.a     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Unable to read cookie file"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0051 }
            r1.a(r5, r2, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x004c
        L_0x0041:
            r5 = move-exception
            r0 = r6
        L_0x0043:
            qfn r1 = defpackage.qij.a     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Cookie file does not exist"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0051 }
            r1.a(r5, r2, r7)     // Catch:{ all -> 0x0051 }
        L_0x004c:
            defpackage.jjt.a((java.io.Closeable) r6)
            r6 = r0
            goto L_0x0057
        L_0x0051:
            r5 = move-exception
        L_0x0052:
            defpackage.jjt.a((java.io.Closeable) r6)
            throw r5
        L_0x0056:
        L_0x0057:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "result"
            r5.putByteArray(r7, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qht.a(qfc, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
