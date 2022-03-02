package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: nnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnx extends npf {
    public static final /* synthetic */ int a = 0;

    public nnx(nog nog) {
    }

    public static final synchronized Cursor c(String str, String str2) {
        synchronized (nnx.class) {
            Cursor query = nog.b().query("app_info", new String[]{"_id", "pb", "package_name", "version_code", "digest_sha256"}, "package_name = ? AND version_code = ?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (query.getCount() > 1) {
                new Object[1][0] = Integer.valueOf(query.getCount());
                query.close();
                int count = query.getCount();
                StringBuilder sb = new StringBuilder(47);
                sb.append("Expect one result returned, but got ");
                sb.append(count);
                throw new noh(sb.toString());
            } else if (query.getCount() <= 0) {
                Object[] objArr = {str, str2};
                query.close();
                return null;
            } else {
                query.moveToFirst();
                return query;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[SYNTHETIC, Splitter:B:16:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(java.lang.String r1, java.lang.String r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            android.database.Cursor r1 = c(r1, r2)     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0017
            r1.moveToFirst()     // Catch:{ all -> 0x0015 }
            r2 = 0
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x0015 }
            r1.close()     // Catch:{ all -> 0x0022 }
            long r1 = (long) r2
        L_0x0013:
            monitor-exit(r0)
            return r1
        L_0x0015:
            r2 = move-exception
            goto L_0x001c
        L_0x0017:
            r1 = -1
            goto L_0x0013
        L_0x001a:
            r2 = move-exception
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0021:
            throw r2     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0026
        L_0x0025:
            throw r1
        L_0x0026:
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnx.a(java.lang.String, java.lang.String):long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nqc} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[SYNTHETIC, Splitter:B:22:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.nqc b(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            android.database.Cursor r5 = c(r5, r6)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x001f
            r5.moveToFirst()     // Catch:{ all -> 0x0040 }
            r6 = 1
            byte[] r0 = r5.getBlob(r6)     // Catch:{ auda -> 0x0021 }
            aubs r1 = defpackage.aubs.c()     // Catch:{ auda -> 0x0021 }
            nqc r2 = defpackage.nqc.g     // Catch:{ auda -> 0x0021 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0, (defpackage.aubs) r1)     // Catch:{ auda -> 0x0021 }
            nqc r0 = (defpackage.nqc) r0     // Catch:{ auda -> 0x0021 }
            r5.close()     // Catch:{ all -> 0x004a }
        L_0x001f:
            monitor-exit(r4)
            return r0
        L_0x0021:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0040 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0040 }
            noh r1 = new noh     // Catch:{ all -> 0x0040 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0040 }
            r6[r3] = r0     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "Failed to get app info pb, error: %s"
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x0040 }
            r1.<init>(r6)     // Catch:{ all -> 0x0040 }
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r6 = move-exception
            r0 = r5
            goto L_0x0044
        L_0x0043:
            r6 = move-exception
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ all -> 0x004a }
        L_0x0049:
            throw r6     // Catch:{ all -> 0x004a }
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnx.b(java.lang.String, java.lang.String):nqc");
    }

    public final synchronized void a(nqc nqc) {
        long j;
        String str;
        String str2;
        String str3;
        try {
            j = a(nqc.b, nqc.d);
        } catch (noh e) {
            j = -1;
        }
        ContentValues contentValues = new ContentValues();
        if (j > -1) {
            contentValues.put("_id", Long.valueOf(j));
        }
        contentValues.put("pb", nqc.k());
        if ((nqc.a & 1) != 0) {
            str = nqc.b;
        } else {
            str = null;
        }
        contentValues.put("package_name", str);
        if ((nqc.a & 4) != 0) {
            str2 = nqc.d;
        } else {
            str2 = null;
        }
        contentValues.put("version_code", str2);
        if ((nqc.a & 8) != 0) {
            str3 = nqc.e;
        } else {
            str3 = null;
        }
        contentValues.put("digest_sha256", str3);
        if (nog.c().insertWithOnConflict("app_info", (String) null, contentValues, 5) <= 0) {
            throw new noh("Failed to add app info to sql table.");
        }
    }
}
