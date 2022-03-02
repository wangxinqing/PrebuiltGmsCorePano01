package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.io.Closeable;

/* renamed from: hvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvn extends jjj implements Closeable {
    private final ahei a;
    private final Context b;

    private static final void c(SQLiteDatabase sQLiteDatabase) {
        if (awtf.c()) {
            sQLiteDatabase.disableWriteAheadLogging();
        } else if (sQLiteDatabase.enableWriteAheadLogging()) {
            sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        hvt.a(sQLiteDatabase);
        hvq.a(sQLiteDatabase);
        hvu.a(sQLiteDatabase);
        hvo.a(sQLiteDatabase);
        hvv.a(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        c(sQLiteDatabase);
        String[] strArr = hvt.a;
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        hvq.b(sQLiteDatabase);
        hvt.b(sQLiteDatabase);
        int i3 = hvu.a;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS storage_size");
        hvu.a(sQLiteDatabase);
        String[] strArr = hvo.a;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_drop_counts");
        hvo.a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS test_codes");
        hvv.a(sQLiteDatabase);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: avsf} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017d, code lost:
        if (r1 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018e, code lost:
        if (r1 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0197, code lost:
        if (r12.isEmpty() != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        r0 = defpackage.avsf.c.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        if (r0.c != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a4, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a9, code lost:
        r13 = (defpackage.avsf) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b3, code lost:
        if (r13.a.a() == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b6, code lost:
        r13.a = defpackage.aucj.a(r13.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01be, code lost:
        defpackage.auab.a((java.lang.Iterable) r12, (java.util.List) r13.a);
        r3 = (defpackage.avsf) r0.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cc, code lost:
        if (r3 == 0) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ce, code lost:
        defpackage.hwo.a((android.content.Context) defpackage.ihs.b(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d5, code lost:
        r11.execSQL("DROP TABLE IF EXISTS log_source_qos_tier");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 63
            r0.<init>(r1)
            java.lang.String r1 = "Upgrade database: oldVersion="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " newVersion="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SqliteDatabaseHelper"
            android.util.Log.i(r1, r0)
            r0 = 2
            if (r12 < r0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            if (r13 < r0) goto L_0x0030
            java.lang.String r2 = "Adding qos_tier column to SqlitePlayLoggerContextTable."
            android.util.Log.i(r1, r2)
            java.lang.String r2 = "ALTER TABLE play_logger_context ADD COLUMN qos_tier INTEGER DEFAULT 0"
            r11.execSQL(r2)
        L_0x0030:
            r2 = 5
            r3 = 0
            if (r12 < r2) goto L_0x0035
            goto L_0x0056
        L_0x0035:
            if (r13 < r2) goto L_0x0056
            java.lang.String r2 = "Adding storage size table"
            android.util.Log.i(r1, r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS storage_size (_id INTEGER PRIMARY KEY, storage_size LONG NOT NULL);"
            r11.execSQL(r2)
            java.lang.String r2 = "SELECT SUM(LENGTH(log_event)) FROM log_event"
            long r4 = android.database.DatabaseUtils.longForQuery(r11, r2, r3)     // Catch:{ hvm -> 0x004b }
            defpackage.hvu.a(r11, r4)     // Catch:{ hvm -> 0x004b }
            goto L_0x0056
        L_0x004b:
            r11 = move-exception
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException
            java.lang.String r13 = r11.getMessage()
            r12.<init>(r13, r11)
            throw r12
        L_0x0056:
            r2 = 4
            if (r12 < r2) goto L_0x005a
            goto L_0x00b6
        L_0x005a:
            if (r13 < r2) goto L_0x00b6
            java.lang.String r2 = "Indexing LogEvents by PlayLoggerContext id"
            android.util.Log.i(r1, r2)
            hvs r2 = new hvs     // Catch:{ IOException -> 0x00a6, all -> 0x00a4 }
            long r6 = defpackage.awtf.e()     // Catch:{ IOException -> 0x00a6, all -> 0x00a4 }
            ahei r8 = r10.a     // Catch:{ IOException -> 0x00a6, all -> 0x00a4 }
            android.content.Context r9 = r10.b     // Catch:{ IOException -> 0x00a6, all -> 0x00a4 }
            r4 = r2
            r5 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ IOException -> 0x00a6, all -> 0x00a4 }
            boolean r4 = r2.a((android.database.sqlite.SQLiteDatabase) r11)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r4 == 0) goto L_0x0097
            long r4 = r2.b((android.database.sqlite.SQLiteDatabase) r11)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r7 = 54
            r6.<init>(r7)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.String r7 = "database is too large - dropping: "
            r6.append(r7)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r6.append(r4)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            android.util.Log.i(r1, r4)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            defpackage.hvq.b((android.database.sqlite.SQLiteDatabase) r11)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            defpackage.hvt.b(r11)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x009a
        L_0x0097:
            defpackage.hvq.a((android.database.sqlite.SQLiteDatabase) r11)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
        L_0x009a:
            defpackage.jjt.b((java.io.Closeable) r2)
            goto L_0x00b6
        L_0x009e:
            r11 = move-exception
            r3 = r2
            goto L_0x00b2
        L_0x00a1:
            r11 = move-exception
            r3 = r2
            goto L_0x00a7
        L_0x00a4:
            r11 = move-exception
            goto L_0x00b2
        L_0x00a6:
            r11 = move-exception
        L_0x00a7:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00b1 }
            java.lang.String r13 = r11.getMessage()     // Catch:{ all -> 0x00b1 }
            r12.<init>(r13, r11)     // Catch:{ all -> 0x00b1 }
            throw r12     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r11 = move-exception
        L_0x00b2:
            defpackage.jjt.b((java.io.Closeable) r3)
            throw r11
        L_0x00b6:
            r1 = 6
            if (r12 < r1) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            if (r13 < r1) goto L_0x00c1
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS log_drop_counts (_id STRING PRIMARY KEY, storage_size INTEGER NOT NULL);"
            r11.execSQL(r1)
        L_0x00c1:
            r1 = 7
            if (r12 < r1) goto L_0x00c5
            goto L_0x00ff
        L_0x00c5:
            if (r13 < r1) goto L_0x00ff
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS log_drop_counts_copy (_id STRING NOT NULL, storage_size INTEGER NOT NULL, reason STRING NOT NULL, PRIMARY KEY(_id, reason));"
            r11.execSQL(r1)
            hvc r1 = defpackage.hvc.OVERFLOW
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 108
            r4.<init>(r2)
            java.lang.String r2 = "INSERT INTO log_drop_counts_copy(_id, storage_size, reason)SELECT _id, storage_size, \""
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = "\" FROM log_drop_counts"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r11.execSQL(r1)
            java.lang.String r1 = "DROP TABLE log_drop_counts"
            r11.execSQL(r1)
            java.lang.String r1 = "ALTER TABLE log_drop_counts_copy RENAME TO log_drop_counts"
            r11.execSQL(r1)
        L_0x00ff:
            r1 = 8
            if (r12 < r1) goto L_0x0104
            goto L_0x0110
        L_0x0104:
            if (r13 < r1) goto L_0x0110
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS test_codes (_id INTEGER PRIMARY KEY AUTOINCREMENT, log_source STRING NOT NULL, test_code INTEGER NOT NULL);"
            r11.execSQL(r1)
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS log_source ON test_codes(log_source)"
            r11.execSQL(r1)
        L_0x0110:
            r1 = 9
            if (r12 >= r1) goto L_0x01dc
            if (r13 < r1) goto L_0x01dc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 0
            java.lang.String r1 = "SELECT log_source,qos_tier FROM log_source_qos_tier"
            android.database.Cursor r1 = r11.rawQuery(r1, r3)     // Catch:{ SQLiteException -> 0x018c, all -> 0x0185 }
        L_0x0122:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            if (r2 == 0) goto L_0x017d
            avse r2 = defpackage.avse.d     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            aucd r2 = r2.o()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            java.lang.String r4 = r1.getString(r13)     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            if (r5 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r2.c()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r2.c = r13     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
        L_0x013c:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            avse r5 = (defpackage.avse) r5     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r7 = 1
            r6 = r6 | r7
            r5.a = r6     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r5.b = r4     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            java.lang.String r4 = r1.getString(r7)     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            avsd r4 = defpackage.avsd.a(r4)     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            if (r4 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            avsd r4 = defpackage.avsd.DEFAULT     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
        L_0x015c:
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            if (r5 != 0) goto L_0x0161
            goto L_0x0166
        L_0x0161:
            r2.c()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r2.c = r13     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
        L_0x0166:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            avse r5 = (defpackage.avse) r5     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            int r4 = r4.f     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r5.c = r4     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            int r4 = r5.a     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r4 = r4 | r0
            r5.a = r4     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            aucj r2 = r2.i()     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            avse r2 = (defpackage.avse) r2     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0183, all -> 0x0180 }
            goto L_0x0122
        L_0x017d:
            if (r1 != 0) goto L_0x0190
            goto L_0x0193
        L_0x0180:
            r11 = move-exception
            r3 = r1
            goto L_0x0186
        L_0x0183:
            r0 = move-exception
            goto L_0x018e
        L_0x0185:
            r11 = move-exception
        L_0x0186:
            if (r3 == 0) goto L_0x018b
            r3.close()
        L_0x018b:
            throw r11
        L_0x018c:
            r0 = move-exception
            r1 = r3
        L_0x018e:
            if (r1 == 0) goto L_0x0193
        L_0x0190:
            r1.close()
        L_0x0193:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01cb
            avsf r0 = defpackage.avsf.c
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            r0.c()
            r0.c = r13
        L_0x01a9:
            aucj r13 = r0.b
            avsf r13 = (defpackage.avsf) r13
            aucx r1 = r13.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01b6
            goto L_0x01be
        L_0x01b6:
            aucx r1 = r13.a
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r13.a = r1
        L_0x01be:
            aucx r13 = r13.a
            defpackage.auab.a((java.lang.Iterable) r12, (java.util.List) r13)
            aucj r12 = r0.i()
            r3 = r12
            avsf r3 = (defpackage.avsf) r3
            goto L_0x01cc
        L_0x01cb:
        L_0x01cc:
            if (r3 == 0) goto L_0x01d5
            ihs r12 = defpackage.ihs.b()
            defpackage.hwo.a((android.content.Context) r12, (defpackage.avsf) r3)
        L_0x01d5:
            java.lang.String r12 = "DROP TABLE IF EXISTS log_source_qos_tier"
            r11.execSQL(r12)
            return
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvn.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hvn(Context context, ahei ahei) {
        super(context, "playlog.db", "playlog.db", 9);
        iva.a((Object) context);
        this.b = context;
        this.a = ahei;
        int i = Build.VERSION.SDK_INT;
        if (!awtf.c()) {
            setWriteAheadLoggingEnabled(true);
        }
    }
}
