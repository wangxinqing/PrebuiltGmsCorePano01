package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmt implements Callable {
    final /* synthetic */ dmv a;

    public dmt(dmv dmv) {
        this.a = dmv;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[SYNTHETIC, Splitter:B:40:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b A[SYNTHETIC, Splitter:B:45:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098 A[SYNTHETIC, Splitter:B:53:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8 A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            dmv r2 = r10.a
            dkw r3 = r2.g()
            android.content.Context r3 = r3.b
            java.lang.String r4 = "ClientId should be loaded from worker thread"
            defpackage.iva.b((java.lang.String) r4)
            r4 = 0
            java.io.FileInputStream r5 = r3.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0077, all -> 0x0075 }
            r6 = 36
            byte[] r7 = new byte[r6]     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r8 = 0
            int r6 = r5.read(r7, r8, r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            int r9 = r5.available()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r9 <= 0) goto L_0x003c
            java.lang.String r6 = "clientId file seems corrupted, deleting it."
            r2.d(r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x009b
        L_0x0037:
            r0 = move-exception
            goto L_0x009c
        L_0x003a:
            goto L_0x00a1
        L_0x003c:
            r9 = 14
            if (r6 < r9) goto L_0x005b
            r5.close()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            java.lang.String r9 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r9.<init>(r7, r8, r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            java.lang.String r6 = "Read client id from disk"
            r2.a(r6, r9)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r0 = move-exception
            r2.e(r1, r0)
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            r4 = r9
            goto L_0x00a1
        L_0x005b:
            java.lang.String r6 = "clientId file is empty, deleting it."
            r2.d(r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r5 == 0) goto L_0x009b
            r5.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x009b
        L_0x006c:
            r0 = move-exception
            goto L_0x009c
        L_0x006e:
            r0 = move-exception
            r4 = r5
            goto L_0x0089
        L_0x0071:
            r6 = move-exception
            goto L_0x0079
        L_0x0073:
            r0 = move-exception
            goto L_0x0096
        L_0x0075:
            r0 = move-exception
            goto L_0x0089
        L_0x0077:
            r6 = move-exception
            r5 = r4
        L_0x0079:
            java.lang.String r7 = "Error reading client id file, deleting it"
            r2.e(r7, r6)     // Catch:{ all -> 0x0087 }
            r3.deleteFile(r0)     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x009b
        L_0x0087:
            r0 = move-exception
            r4 = r5
        L_0x0089:
            if (r4 == 0) goto L_0x0093
            r4.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r3 = move-exception
            r2.e(r1, r3)
        L_0x0093:
            throw r0
        L_0x0094:
            r0 = move-exception
            r5 = r4
        L_0x0096:
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ IOException -> 0x006c }
        L_0x009b:
            goto L_0x00a1
        L_0x009c:
            r2.e(r1, r0)
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r4 != 0) goto L_0x00a8
            java.lang.String r0 = r2.s()
            return r0
        L_0x00a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmt.call():java.lang.Object");
    }
}
