package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: agtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agtd {
    public static SQLiteDatabase a(File file, agtc agtc) {
        if (!file.exists()) {
            return b(file, agtc);
        }
        SQLiteDatabase c = c(file, agtc);
        if (c != null) {
            return c;
        }
        SQLiteDatabase.deleteDatabase(file);
        return b(file, agtc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.database.sqlite.SQLiteDatabase b(java.io.File r3, defpackage.agtc r4) {
        /*
            r0 = 0
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r3, r0)     // Catch:{ Exception -> 0x002a }
            r0.beginTransaction()     // Catch:{ Exception -> 0x0028 }
            int r1 = r0.getVersion()     // Catch:{ all -> 0x0023 }
            int r2 = r4.a     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            defpackage.amrl.b(r1)     // Catch:{ all -> 0x0023 }
            r4.a(r0)     // Catch:{ all -> 0x0023 }
            r0.setVersion(r2)     // Catch:{ all -> 0x0023 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0023 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0023:
            r4 = move-exception
            r0.endTransaction()     // Catch:{ Exception -> 0x0028 }
            throw r4     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            r4 = move-exception
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            java.lang.String r1 = "SQLiteDatabaseCreator"
            java.lang.String r2 = "Failed to create database"
            android.util.Log.w(r1, r2, r4)
            if (r0 == 0) goto L_0x0038
            r0.close()
        L_0x0038:
            android.database.sqlite.SQLiteDatabase.deleteDatabase(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtd.b(java.io.File, agtc):android.database.sqlite.SQLiteDatabase");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004d A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004f A[ExcHandler: SQLiteDatabaseCorruptException | SQLiteDiskIOException | SQLiteFullException (e java.lang.Throwable), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.database.sqlite.SQLiteDatabase c(java.io.File r8, defpackage.agtc r9) {
        /*
            java.lang.String r0 = "Failed to open/migrate database"
            long r1 = r8.length()
            java.lang.String r3 = "SQLiteDatabaseCreator"
            r4 = 0
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x008c
            int r9 = r9.a
            r1 = 1
            r2 = 0
            r5 = -1
            android.database.sqlite.SQLiteDatabase r8 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r8, r4)     // Catch:{ agtb -> 0x006a, SQLiteDatabaseCorruptException -> 0x0062, SQLiteDiskIOException -> 0x0060, SQLiteFullException -> 0x005e, Exception -> 0x0057 }
            r8.beginTransaction()     // Catch:{ agtb -> 0x0055, SQLiteDatabaseCorruptException -> 0x0053, SQLiteDiskIOException -> 0x0051, SQLiteFullException -> 0x004f, Exception -> 0x004d }
            int r5 = r8.getVersion()     // Catch:{ all -> 0x0046 }
            if (r5 <= 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            defpackage.amrl.b(r6)     // Catch:{ all -> 0x0044 }
            if (r5 != r9) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            if (r5 < r9) goto L_0x003e
            if (r5 > r9) goto L_0x0038
            r8.setVersion(r9)     // Catch:{ all -> 0x0044 }
        L_0x0031:
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x0044 }
            r8.endTransaction()     // Catch:{ agtb -> 0x004b, SQLiteDatabaseCorruptException -> 0x0053, SQLiteDiskIOException -> 0x0051, SQLiteFullException -> 0x004f, Exception -> 0x004d }
            return r8
        L_0x0038:
            agtb r6 = new agtb     // Catch:{ all -> 0x0044 }
            r6.<init>()     // Catch:{ all -> 0x0044 }
            throw r6     // Catch:{ all -> 0x0044 }
        L_0x003e:
            agtb r6 = new agtb     // Catch:{ all -> 0x0044 }
            r6.<init>()     // Catch:{ all -> 0x0044 }
            throw r6     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r6 = move-exception
            goto L_0x0047
        L_0x0046:
            r6 = move-exception
        L_0x0047:
            r8.endTransaction()     // Catch:{ agtb -> 0x004b, SQLiteDatabaseCorruptException -> 0x0053, SQLiteDiskIOException -> 0x0051, SQLiteFullException -> 0x004f, Exception -> 0x004d }
            throw r6     // Catch:{ agtb -> 0x004b, SQLiteDatabaseCorruptException -> 0x0053, SQLiteDiskIOException -> 0x0051, SQLiteFullException -> 0x004f, Exception -> 0x004d }
        L_0x004b:
            r0 = move-exception
            goto L_0x006c
        L_0x004d:
            r9 = move-exception
            goto L_0x0059
        L_0x004f:
            r9 = move-exception
            goto L_0x0065
        L_0x0051:
            r9 = move-exception
            goto L_0x0065
        L_0x0053:
            r9 = move-exception
            goto L_0x0065
        L_0x0055:
            r0 = move-exception
            goto L_0x006c
        L_0x0057:
            r9 = move-exception
            r8 = r4
        L_0x0059:
            android.util.Log.e(r3, r0, r9)
            goto L_0x0086
        L_0x005e:
            r8 = move-exception
            goto L_0x0063
        L_0x0060:
            r8 = move-exception
            goto L_0x0063
        L_0x0062:
            r8 = move-exception
        L_0x0063:
            r9 = r8
            r8 = r4
        L_0x0065:
            android.util.Log.w(r3, r0, r9)
            goto L_0x0086
        L_0x006a:
            r0 = move-exception
            r8 = r4
        L_0x006c:
            java.util.Locale r6 = java.util.Locale.US
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r2] = r5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r1] = r9
            java.lang.String r9 = "Cannot migrate database from version %d to %d"
            java.lang.String r9 = java.lang.String.format(r6, r9, r7)
            android.util.Log.w(r3, r9, r0)
        L_0x0086:
            if (r8 == 0) goto L_0x008b
            r8.close()
        L_0x008b:
            return r4
        L_0x008c:
            java.lang.String r8 = "Database file is empty"
            android.util.Log.w(r3, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtd.c(java.io.File, agtc):android.database.sqlite.SQLiteDatabase");
    }
}
