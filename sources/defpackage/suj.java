package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: suj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class suj extends sot {
    private final sui b = new sui(this, z(), q());
    private boolean c;

    public suj(svv svv) {
        super(svv);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9 A[SYNTHETIC, Splitter:B:49:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.i()
            r16.h()
            boolean r0 = r1.c
            r2 = 0
            if (r0 != 0) goto L_0x013d
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r16.v()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x0131
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.o()     // Catch:{ SQLiteFullException -> 0x0102, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00c5, all -> 0x00c1 }
            if (r9 == 0) goto L_0x00af
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00bb, SQLiteException -> 0x00b7, all -> 0x00b4 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00bb, SQLiteException -> 0x00b7, all -> 0x00b4 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            goto L_0x0055
        L_0x004a:
            r0 = move-exception
            goto L_0x0125
        L_0x004d:
            r0 = move-exception
            goto L_0x00b9
        L_0x004f:
            r0 = move-exception
            goto L_0x00ad
        L_0x0051:
            r0 = move-exception
            goto L_0x00bf
        L_0x0054:
        L_0x0055:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
            goto L_0x0099
        L_0x005f:
            sut r15 = r16.E()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            sur r15 = r15.c     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            sut r4 = r16.E()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            sur r4 = r4.c     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            r4.a(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
        L_0x0099:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x004f, SQLiteException -> 0x004d, all -> 0x004a }
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            r9.close()
            r2 = 1
            return r2
        L_0x00ad:
            r8 = r10
            goto L_0x00ef
        L_0x00af:
            r2 = 1
            r1.c = r2     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00bb, SQLiteException -> 0x00b7, all -> 0x00b4 }
            r2 = 0
            return r2
        L_0x00b4:
            r0 = move-exception
            goto L_0x0126
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c7
        L_0x00bb:
            r0 = move-exception
            goto L_0x00ef
        L_0x00bd:
            r0 = move-exception
            r10 = r8
        L_0x00bf:
            r8 = r9
            goto L_0x0104
        L_0x00c1:
            r0 = move-exception
            r9 = r8
            goto L_0x0126
        L_0x00c5:
            r0 = move-exception
            r10 = r8
        L_0x00c7:
            if (r8 == 0) goto L_0x00d3
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x00e9 }
            if (r2 != 0) goto L_0x00d0
            goto L_0x00d3
        L_0x00d0:
            r8.endTransaction()     // Catch:{ all -> 0x00e9 }
        L_0x00d3:
            sut r2 = r16.E()     // Catch:{ all -> 0x00e9 }
            sur r2 = r2.c     // Catch:{ all -> 0x00e9 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.a(r4, r0)     // Catch:{ all -> 0x00e9 }
            r2 = 1
            r1.c = r2     // Catch:{ all -> 0x00e9 }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x011d
            goto L_0x011a
        L_0x00e9:
            r0 = move-exception
            r9 = r8
            r8 = r10
            goto L_0x0126
        L_0x00ed:
            r0 = move-exception
            r9 = r8
        L_0x00ef:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0100 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00fa
            r8.close()
        L_0x00fa:
            if (r9 == 0) goto L_0x011d
            r9.close()
            goto L_0x011d
        L_0x0100:
            r0 = move-exception
            goto L_0x0126
        L_0x0102:
            r0 = move-exception
            r10 = r8
        L_0x0104:
            sut r2 = r16.E()     // Catch:{ all -> 0x0123 }
            sur r2 = r2.c     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.a(r4, r0)     // Catch:{ all -> 0x0123 }
            r2 = 1
            r1.c = r2     // Catch:{ all -> 0x0123 }
            if (r10 == 0) goto L_0x0117
            r10.close()
        L_0x0117:
            if (r8 != 0) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r8.close()
        L_0x011d:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x0123:
            r0 = move-exception
            r9 = r8
        L_0x0125:
            r8 = r10
        L_0x0126:
            if (r8 == 0) goto L_0x012b
            r8.close()
        L_0x012b:
            if (r9 == 0) goto L_0x0130
            r9.close()
        L_0x0130:
            throw r0
        L_0x0131:
            sut r0 = r16.E()
            sur r0 = r0.k
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
        L_0x013d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.a(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase o() {
        if (this.c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.c = true;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return z().getDatabasePath(q()).exists();
    }

    /* access modifiers changed from: package-private */
    public final String q() {
        v();
        return "google_app_measurement_local.db";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v50, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v53, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v54, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v58, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v64, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v102, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v103, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v104, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v105, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v106, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v107, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v108, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v109, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0200 A[SYNTHETIC, Splitter:B:130:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x023f A[SYNTHETIC, Splitter:B:164:0x023f] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0203 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0288 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0288 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0288 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List r() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "Error reading entries from local database"
            r26.h()
            r26.i()
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x02a8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r26.p()
            if (r0 == 0) goto L_0x02a7
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x001d:
            if (r7 >= r5) goto L_0x029a
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r26.o()     // Catch:{ SQLiteFullException -> 0x0273, SQLiteDatabaseLockedException -> 0x025c, SQLiteException -> 0x023a, all -> 0x0236 }
            if (r15 == 0) goto L_0x0220
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            spg r0 = r26.v()     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            suc r10 = defpackage.sud.ao     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            boolean r0 = r0.a((defpackage.suc) r10)     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            r19 = 100
            java.lang.String r20 = "entry"
            java.lang.String r21 = "type"
            java.lang.String r22 = "rowid"
            r14 = 3
            r23 = -1
            r13 = 2
            if (r0 != 0) goto L_0x006e
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            r12[r6] = r22     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            r12[r9] = r21     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            r12[r13] = r20     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            java.lang.String r11 = "messages"
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r20 = "rowid asc"
            java.lang.String r19 = java.lang.Integer.toString(r19)     // Catch:{ SQLiteFullException -> 0x021d, SQLiteDatabaseLockedException -> 0x021a, SQLiteException -> 0x0217, all -> 0x0214 }
            r10 = r15
            r5 = 2
            r13 = r0
            r3 = 3
            r14 = r16
            r25 = r15
            r15 = r17
            r16 = r18
            r17 = r20
            r18 = r19
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r10 = r0
            goto L_0x00d1
        L_0x006e:
            r25 = r15
            r3 = 3
            r5 = 2
            java.lang.String r0 = "3"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ all -> 0x01fa }
            r12[r6] = r22     // Catch:{ all -> 0x01fa }
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ all -> 0x01fa }
            r14[r6] = r0     // Catch:{ all -> 0x01fa }
            java.lang.String r11 = "messages"
            java.lang.String r13 = "type=?"
            r15 = 0
            r16 = 0
            java.lang.String r17 = "rowid desc"
            java.lang.String r18 = "1"
            r10 = r25
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01fa }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x009d
            long r11 = r10.getLong(r6)     // Catch:{ all -> 0x01f6 }
            if (r10 == 0) goto L_0x00a4
            r10.close()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            goto L_0x00a4
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
        L_0x00a2:
            r11 = r23
        L_0x00a4:
            int r0 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r10[r6] = r11     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r13 = r0
            r14 = r10
            goto L_0x00b7
        L_0x00b5:
            r13 = 0
            r14 = 0
        L_0x00b7:
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r12[r6] = r22     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r12[r9] = r21     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r12[r5] = r20     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            java.lang.String r11 = "messages"
            r15 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            java.lang.String r18 = java.lang.Integer.toString(r19)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r10 = r25
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x020c, SQLiteException -> 0x0208, all -> 0x0204 }
            r10 = r0
        L_0x00d1:
        L_0x00d2:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x01f0, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e4, all -> 0x01dd }
            if (r0 != 0) goto L_0x010a
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x01f0, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e4, all -> 0x01dd }
            java.lang.String r3 = java.lang.Long.toString(r23)     // Catch:{ SQLiteFullException -> 0x01f0, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e4, all -> 0x01dd }
            r0[r6] = r3     // Catch:{ SQLiteFullException -> 0x01f0, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e4, all -> 0x01dd }
            java.lang.String r3 = "messages"
            java.lang.String r5 = "rowid <= ?"
            r11 = r25
            int r0 = r11.delete(r3, r5, r0)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            int r3 = r4.size()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            if (r0 >= r3) goto L_0x00fb
            sut r0 = r26.E()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            sur r0 = r0.c     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            java.lang.String r3 = "Fewer entries removed from local database than expected"
            r0.a(r3)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x00fb:
            r11.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            r11.endTransaction()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            if (r10 == 0) goto L_0x0106
            r10.close()
        L_0x0106:
            r11.close()
            return r4
        L_0x010a:
            r11 = r25
            long r23 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            byte[] r12 = r10.getBlob(r5)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            if (r0 != 0) goto L_0x014e
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            int r0 = r12.length     // Catch:{ ivv -> 0x0139 }
            r13.unmarshall(r12, r6, r0)     // Catch:{ ivv -> 0x0139 }
            r13.setDataPosition(r6)     // Catch:{ ivv -> 0x0139 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ ivv -> 0x0139 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ivv -> 0x0139 }
            com.google.android.gms.measurement.internal.EventParcel r0 = (com.google.android.gms.measurement.internal.EventParcel) r0     // Catch:{ ivv -> 0x0139 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            if (r0 == 0) goto L_0x0135
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x0135:
            goto L_0x01d1
        L_0x0137:
            r0 = move-exception
            goto L_0x014a
        L_0x0139:
            r0 = move-exception
            sut r0 = r26.E()     // Catch:{ all -> 0x0137 }
            sur r0 = r0.c     // Catch:{ all -> 0x0137 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x0137 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            goto L_0x01d1
        L_0x014a:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x014e:
            if (r0 != r9) goto L_0x0183
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            int r0 = r12.length     // Catch:{ ivv -> 0x0169 }
            r13.unmarshall(r12, r6, r0)     // Catch:{ ivv -> 0x0169 }
            r13.setDataPosition(r6)     // Catch:{ ivv -> 0x0169 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.measurement.internal.UserAttributeParcel.CREATOR     // Catch:{ ivv -> 0x0169 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ivv -> 0x0169 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = (com.google.android.gms.measurement.internal.UserAttributeParcel) r0     // Catch:{ ivv -> 0x0169 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            goto L_0x0179
        L_0x0167:
            r0 = move-exception
            goto L_0x017f
        L_0x0169:
            r0 = move-exception
            sut r0 = r26.E()     // Catch:{ all -> 0x0167 }
            sur r0 = r0.c     // Catch:{ all -> 0x0167 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x0167 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            r0 = 0
        L_0x0179:
            if (r0 == 0) goto L_0x017e
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x017e:
            goto L_0x01d1
        L_0x017f:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x0183:
            if (r0 != r5) goto L_0x01b8
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            int r0 = r12.length     // Catch:{ ivv -> 0x019e }
            r13.unmarshall(r12, r6, r0)     // Catch:{ ivv -> 0x019e }
            r13.setDataPosition(r6)     // Catch:{ ivv -> 0x019e }
            android.os.Parcelable$Creator r0 = com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel.CREATOR     // Catch:{ ivv -> 0x019e }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ivv -> 0x019e }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r0 = (com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r0     // Catch:{ ivv -> 0x019e }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            goto L_0x01ae
        L_0x019c:
            r0 = move-exception
            goto L_0x01b4
        L_0x019e:
            r0 = move-exception
            sut r0 = r26.E()     // Catch:{ all -> 0x019c }
            sur r0 = r0.c     // Catch:{ all -> 0x019c }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x019c }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01b3
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x01b3:
            goto L_0x01d1
        L_0x01b4:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x01b8:
            if (r0 == r3) goto L_0x01c6
            sut r0 = r26.E()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            sur r0 = r0.c     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            java.lang.String r12 = "Unknown record type in local database"
            r0.a(r12)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            goto L_0x01d1
        L_0x01c6:
            sut r0 = r26.E()     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            sur r0 = r0.f     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
            java.lang.String r12 = "Skipping app launch break"
            r0.a(r12)     // Catch:{ SQLiteFullException -> 0x01db, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d7, all -> 0x01d5 }
        L_0x01d1:
            r25 = r11
            goto L_0x00d2
        L_0x01d5:
            r0 = move-exception
            goto L_0x01e0
        L_0x01d7:
            r0 = move-exception
            goto L_0x01e7
        L_0x01d9:
            r0 = move-exception
            goto L_0x01ed
        L_0x01db:
            r0 = move-exception
            goto L_0x01f3
        L_0x01dd:
            r0 = move-exception
            r11 = r25
        L_0x01e0:
            r3 = r10
            r15 = r11
            goto L_0x028f
        L_0x01e4:
            r0 = move-exception
            r11 = r25
        L_0x01e7:
            r15 = r11
            goto L_0x023d
        L_0x01ea:
            r0 = move-exception
            r11 = r25
        L_0x01ed:
            r15 = r11
            goto L_0x025f
        L_0x01f0:
            r0 = move-exception
            r11 = r25
        L_0x01f3:
            r15 = r11
            goto L_0x0276
        L_0x01f6:
            r0 = move-exception
            r11 = r25
            goto L_0x01fe
        L_0x01fa:
            r0 = move-exception
            r11 = r25
            r10 = 0
        L_0x01fe:
            if (r10 == 0) goto L_0x0203
            r10.close()     // Catch:{ SQLiteFullException -> 0x0232, SQLiteDatabaseLockedException -> 0x022e, SQLiteException -> 0x022a, all -> 0x0225 }
        L_0x0203:
            throw r0     // Catch:{ SQLiteFullException -> 0x0232, SQLiteDatabaseLockedException -> 0x022e, SQLiteException -> 0x022a, all -> 0x0225 }
        L_0x0204:
            r0 = move-exception
            r11 = r25
            goto L_0x0226
        L_0x0208:
            r0 = move-exception
            r11 = r25
            goto L_0x022b
        L_0x020c:
            r0 = move-exception
            r11 = r25
            goto L_0x022f
        L_0x0210:
            r0 = move-exception
            r11 = r25
            goto L_0x0233
        L_0x0214:
            r0 = move-exception
            r11 = r15
            goto L_0x0226
        L_0x0217:
            r0 = move-exception
            r11 = r15
            goto L_0x022b
        L_0x021a:
            r0 = move-exception
            r11 = r15
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
            r11 = r15
            goto L_0x0233
        L_0x0220:
            r11 = r15
            r1.c = r9     // Catch:{ SQLiteFullException -> 0x0232, SQLiteDatabaseLockedException -> 0x022e, SQLiteException -> 0x022a, all -> 0x0225 }
            r2 = 0
            return r2
        L_0x0225:
            r0 = move-exception
        L_0x0226:
            r15 = r11
            r3 = 0
            goto L_0x028f
        L_0x022a:
            r0 = move-exception
        L_0x022b:
            r15 = r11
            r10 = 0
            goto L_0x023d
        L_0x022e:
            r0 = move-exception
        L_0x022f:
            r15 = r11
            r10 = 0
            goto L_0x025f
        L_0x0232:
            r0 = move-exception
        L_0x0233:
            r15 = r11
            r10 = 0
            goto L_0x0276
        L_0x0236:
            r0 = move-exception
            r3 = 0
            r15 = 0
            goto L_0x028f
        L_0x023a:
            r0 = move-exception
            r10 = 0
            r15 = 0
        L_0x023d:
            if (r15 == 0) goto L_0x0249
            boolean r3 = r15.inTransaction()     // Catch:{ all -> 0x0270 }
            if (r3 != 0) goto L_0x0246
            goto L_0x0249
        L_0x0246:
            r15.endTransaction()     // Catch:{ all -> 0x0270 }
        L_0x0249:
            sut r3 = r26.E()     // Catch:{ all -> 0x0270 }
            sur r3 = r3.c     // Catch:{ all -> 0x0270 }
            r3.a(r2, r0)     // Catch:{ all -> 0x0270 }
            r1.c = r9     // Catch:{ all -> 0x0270 }
            if (r10 == 0) goto L_0x0259
            r10.close()
        L_0x0259:
            if (r15 == 0) goto L_0x0288
            goto L_0x026c
        L_0x025c:
            r0 = move-exception
            r10 = 0
            r15 = 0
        L_0x025f:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0270 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x026a
            r10.close()
        L_0x026a:
            if (r15 == 0) goto L_0x0288
        L_0x026c:
            r15.close()
            goto L_0x0288
        L_0x0270:
            r0 = move-exception
            r3 = r10
            goto L_0x028f
        L_0x0273:
            r0 = move-exception
            r10 = 0
            r15 = 0
        L_0x0276:
            sut r3 = r26.E()     // Catch:{ all -> 0x028d }
            sur r3 = r3.c     // Catch:{ all -> 0x028d }
            r3.a(r2, r0)     // Catch:{ all -> 0x028d }
            r1.c = r9     // Catch:{ all -> 0x028d }
            if (r10 == 0) goto L_0x0286
            r10.close()
        L_0x0286:
            if (r15 != 0) goto L_0x026c
        L_0x0288:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x001d
        L_0x028d:
            r0 = move-exception
            r3 = r10
        L_0x028f:
            if (r3 == 0) goto L_0x0294
            r3.close()
        L_0x0294:
            if (r15 == 0) goto L_0x0299
            r15.close()
        L_0x0299:
            throw r0
        L_0x029a:
            sut r0 = r26.E()
            sur r0 = r0.f
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            r2 = 0
            return r2
        L_0x02a7:
            return r4
        L_0x02a8:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.r():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[SYNTHETIC, Splitter:B:24:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0065, SQLiteException -> 0x004a, all -> 0x0048, all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.h()
            r10.i()
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.p()
            if (r1 == 0) goto L_0x0096
            r1 = 0
            r2 = 5
            r3 = 0
            r4 = 5
        L_0x0016:
            if (r3 >= r2) goto L_0x008b
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.o()     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0065, SQLiteException -> 0x004a, all -> 0x0048 }
            if (r5 == 0) goto L_0x003d
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            r7[r1] = r8     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            r5.close()
            return
        L_0x003d:
            r10.c = r6     // Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0044, SQLiteException -> 0x0042 }
            return
        L_0x0040:
            r0 = move-exception
            goto L_0x0085
        L_0x0042:
            r7 = move-exception
            goto L_0x004b
        L_0x0044:
            r6 = move-exception
            goto L_0x0066
        L_0x0046:
            r7 = move-exception
            goto L_0x0075
        L_0x0048:
            r0 = move-exception
            goto L_0x0085
        L_0x004a:
            r7 = move-exception
        L_0x004b:
            if (r5 == 0) goto L_0x0057
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x0072 }
            if (r8 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r5.endTransaction()     // Catch:{ all -> 0x0072 }
        L_0x0057:
            sut r8 = r10.E()     // Catch:{ all -> 0x0072 }
            sur r8 = r8.c     // Catch:{ all -> 0x0072 }
            r8.a(r0, r7)     // Catch:{ all -> 0x0072 }
            r10.c = r6     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x0082
            goto L_0x006e
        L_0x0065:
            r6 = move-exception
        L_0x0066:
            long r6 = (long) r4     // Catch:{ all -> 0x0072 }
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0072 }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x0082
        L_0x006e:
            r5.close()
            goto L_0x0082
        L_0x0072:
            r0 = move-exception
            goto L_0x0085
        L_0x0074:
            r7 = move-exception
        L_0x0075:
            sut r8 = r10.E()     // Catch:{ all -> 0x0040 }
            sur r8 = r8.c     // Catch:{ all -> 0x0040 }
            r8.a(r0, r7)     // Catch:{ all -> 0x0040 }
            r10.c = r6     // Catch:{ all -> 0x0040 }
            if (r5 != 0) goto L_0x006e
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0085:
            if (r5 == 0) goto L_0x008a
            r5.close()
        L_0x008a:
            throw r0
        L_0x008b:
            sut r0 = r10.E()
            sur r0 = r0.f
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.s():void");
    }
}
