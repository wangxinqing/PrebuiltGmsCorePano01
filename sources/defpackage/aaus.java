package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aaus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaus {
    private static final String[] a = {"hash", "find_threat_matches_response_proto", "time_cached_ms"};
    private final aauv b;
    private SQLiteDatabase c;

    static {
        aaus.class.getSimpleName();
    }

    public aaus(aauv aauv) {
        this.b = aauv;
    }

    private final void a() {
        aauv aauv = this.b;
        if (aauv != null) {
            try {
                this.c = aauv.getWritableDatabase();
                return;
            } catch (SQLException e) {
            }
        }
        this.c = null;
    }

    private final void b() {
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[Catch:{ auda | NullPointerException -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f A[Catch:{ auda | NullPointerException -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aauz r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.a()     // Catch:{ all -> 0x0093 }
            android.database.sqlite.SQLiteDatabase r0 = r9.c     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0072
            r8 = 0
            java.lang.String r1 = "cache"
            java.lang.String[] r2 = a     // Catch:{ SQLException -> 0x008c, IllegalArgumentException -> 0x008a, all -> 0x0080 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLException -> 0x008c, IllegalArgumentException -> 0x008a, all -> 0x0080 }
        L_0x0016:
            boolean r0 = r8.moveToNext()     // Catch:{ SQLException -> 0x007e, IllegalArgumentException -> 0x007c, all -> 0x007a }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "hash"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            byte[] r0 = r8.getBlob(r0)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            java.lang.String r1 = "find_threat_matches_response_proto"
            int r1 = r8.getColumnIndexOrThrow(r1)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            byte[] r1 = r8.getBlob(r1)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            java.lang.String r2 = "time_cached_ms"
            int r2 = r8.getColumnIndexOrThrow(r2)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            long r2 = r8.getLong(r2)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aauy r4 = new aauy     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            r4.<init>()     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aubs r5 = defpackage.aubs.c()     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aavs r6 = defpackage.aavs.e     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r1, (defpackage.aubs) r5)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aavs r1 = (defpackage.aavs) r1     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            r4.a = r1     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            r4.b = r2     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            aaae r1 = new aaae     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            java.util.Map r0 = r10.a     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            r10.a(r0, r1, r4)     // Catch:{ NullPointerException -> 0x005c, auda -> 0x005a }
            goto L_0x0016
        L_0x005a:
            r0 = move-exception
            goto L_0x005d
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            java.util.Map r10 = r10.a     // Catch:{ SQLException -> 0x007e, IllegalArgumentException -> 0x007c, all -> 0x007a }
            if (r10 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r10.clear()     // Catch:{ SQLException -> 0x007e, IllegalArgumentException -> 0x007c, all -> 0x007a }
        L_0x0065:
            android.database.sqlite.SQLiteDatabase r10 = r9.c     // Catch:{ SQLException -> 0x007e, IllegalArgumentException -> 0x007c, all -> 0x007a }
            defpackage.aauv.c(r10)     // Catch:{ SQLException -> 0x007e, IllegalArgumentException -> 0x007c, all -> 0x007a }
            if (r8 == 0) goto L_0x006f
            r8.close()     // Catch:{ all -> 0x0093 }
        L_0x006f:
            r9.b()     // Catch:{ all -> 0x0093 }
        L_0x0072:
            monitor-exit(r9)
            return
        L_0x0074:
            if (r8 == 0) goto L_0x006f
            r8.close()     // Catch:{ all -> 0x0093 }
            goto L_0x006f
        L_0x007a:
            r10 = move-exception
            goto L_0x0081
        L_0x007c:
            r10 = move-exception
            goto L_0x008d
        L_0x007e:
            r10 = move-exception
            goto L_0x008d
        L_0x0080:
            r10 = move-exception
        L_0x0081:
            if (r8 == 0) goto L_0x0086
            r8.close()     // Catch:{ all -> 0x0093 }
        L_0x0086:
            r9.b()     // Catch:{ all -> 0x0093 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x008a:
            r10 = move-exception
            goto L_0x008d
        L_0x008c:
            r10 = move-exception
        L_0x008d:
            if (r8 == 0) goto L_0x006f
            r8.close()     // Catch:{ all -> 0x0093 }
            goto L_0x006f
        L_0x0093:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0097
        L_0x0096:
            throw r10
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaus.a(aauz):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0140=Splitter:B:56:0x0140, B:42:0x0119=Splitter:B:42:0x0119, B:46:0x011e=Splitter:B:46:0x011e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(defpackage.aauz r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 == 0) goto L_0x0121
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x016f }
            r1.<init>()     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.ReadWriteLock r2 = r8.b     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.Lock r2 = r2.readLock()     // Catch:{ all -> 0x016f }
            r2.lock()     // Catch:{ all -> 0x016f }
            java.util.Map r2 = r8.a     // Catch:{ all -> 0x0164 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0164 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0164 }
        L_0x001c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0164 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0164 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0164 }
            aaux r3 = (defpackage.aaux) r3     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x001c
            java.util.Map r4 = r3.a     // Catch:{ all -> 0x0164 }
            if (r4 == 0) goto L_0x0058
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0164 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0164 }
        L_0x003c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0164 }
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0164 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0164 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ all -> 0x0164 }
            aaae r6 = (defpackage.aaae) r6     // Catch:{ all -> 0x0164 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0164 }
            aauy r5 = (defpackage.aauy) r5     // Catch:{ all -> 0x0164 }
            r1.put(r6, r5)     // Catch:{ all -> 0x0164 }
            goto L_0x003c
        L_0x0058:
            java.util.Map r3 = r3.b     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x001c
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0164 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0164 }
        L_0x0064:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0164 }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0164 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0164 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x0164 }
            aaae r5 = (defpackage.aaae) r5     // Catch:{ all -> 0x0164 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0164 }
            aauy r4 = (defpackage.aauy) r4     // Catch:{ all -> 0x0164 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0164 }
            goto L_0x0064
        L_0x0080:
            java.util.concurrent.locks.ReadWriteLock r8 = r8.b     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.Lock r8 = r8.readLock()     // Catch:{ all -> 0x016f }
            r8.unlock()     // Catch:{ all -> 0x016f }
            boolean r8 = r1.isEmpty()     // Catch:{ all -> 0x016f }
            if (r8 != 0) goto L_0x0121
            r8 = 1
            r7.a()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            android.database.sqlite.SQLiteDatabase r2 = r7.c     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            if (r2 == 0) goto L_0x011e
            r2.beginTransaction()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            android.database.sqlite.SQLiteDatabase r2 = r7.c     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r4 = "cache"
            r3[r0] = r4     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r4 = "DELETE FROM %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r2.execSQL(r3)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
        L_0x00b3:
            boolean r2 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r1.next()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            aauy r3 = (defpackage.aauy) r3     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            if (r3 == 0) goto L_0x00b3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r5 = "hash"
            java.lang.Object r2 = r2.getKey()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            aaae r2 = (defpackage.aaae) r2     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            byte[] r2 = r2.a     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r4.put(r5, r2)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r2 = "find_threat_matches_response_proto"
            aavs r5 = r3.a     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            byte[] r5 = r5.k()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r4.put(r2, r5)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r2 = "time_cached_ms"
            long r5 = r3.b     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r4.put(r2, r3)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            android.database.sqlite.SQLiteDatabase r2 = r7.c     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            java.lang.String r3 = "cache"
            r5 = 0
            r2.replace(r3, r5, r4)     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            goto L_0x00b3
        L_0x00f8:
            android.database.sqlite.SQLiteDatabase r1 = r7.c     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            r1.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x0146, SQLException -> 0x0144, all -> 0x0123 }
            android.database.sqlite.SQLiteDatabase r1 = r7.c     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            if (r1 == 0) goto L_0x0119
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            android.database.sqlite.SQLiteDatabase r1 = r7.c     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            java.lang.String r3 = "cache"
            r2[r0] = r3     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            java.lang.String r0 = "VACUUM %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            r1.execSQL(r0)     // Catch:{ IllegalStateException -> 0x0118, SQLException -> 0x0116 }
            goto L_0x0119
        L_0x0116:
            r0 = move-exception
            goto L_0x0119
        L_0x0118:
            r0 = move-exception
        L_0x0119:
            r7.b()     // Catch:{ all -> 0x016f }
            monitor-exit(r7)
            return r8
        L_0x011e:
            r7.b()     // Catch:{ all -> 0x016f }
        L_0x0121:
            monitor-exit(r7)
            return r0
        L_0x0123:
            r1 = move-exception
            android.database.sqlite.SQLiteDatabase r2 = r7.c     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            if (r2 == 0) goto L_0x0140
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            android.database.sqlite.SQLiteDatabase r2 = r7.c     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            java.lang.String r3 = "cache"
            r8[r0] = r3     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            java.lang.String r0 = "VACUUM %s"
            java.lang.String r8 = java.lang.String.format(r0, r8)     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            r2.execSQL(r8)     // Catch:{ IllegalStateException -> 0x013f, SQLException -> 0x013d }
            goto L_0x0140
        L_0x013d:
            r8 = move-exception
            goto L_0x0140
        L_0x013f:
            r8 = move-exception
        L_0x0140:
            r7.b()     // Catch:{ all -> 0x016f }
            throw r1     // Catch:{ all -> 0x016f }
        L_0x0144:
            r1 = move-exception
            goto L_0x0147
        L_0x0146:
            r1 = move-exception
        L_0x0147:
            android.database.sqlite.SQLiteDatabase r1 = r7.c     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            if (r1 == 0) goto L_0x011e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            android.database.sqlite.SQLiteDatabase r1 = r7.c     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            java.lang.String r2 = "cache"
            r8[r0] = r2     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            java.lang.String r2 = "VACUUM %s"
            java.lang.String r8 = java.lang.String.format(r2, r8)     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            r1.execSQL(r8)     // Catch:{ IllegalStateException -> 0x0162, SQLException -> 0x0160 }
            goto L_0x011e
        L_0x0160:
            r8 = move-exception
            goto L_0x011e
        L_0x0162:
            r8 = move-exception
            goto L_0x011e
        L_0x0164:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r8 = r8.b     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.Lock r8 = r8.readLock()     // Catch:{ all -> 0x016f }
            r8.unlock()     // Catch:{ all -> 0x016f }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0173
        L_0x0172:
            throw r8
        L_0x0173:
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaus.b(aauz):boolean");
    }
}
