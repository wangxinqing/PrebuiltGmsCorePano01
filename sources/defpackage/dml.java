package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dml extends SQLiteOpenHelper {
    final /* synthetic */ dmm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dml(dmm dmm, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = dmm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
            java.lang.String r3 = "name"
            r5[r2] = r3     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
            r7[r2] = r13     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
            java.lang.String r4 = "SQLITE_MASTER"
            java.lang.String r6 = "name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r12
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
            boolean r12 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0023 }
            if (r0 == 0) goto L_0x0022
            r0.close()
        L_0x0022:
            return r12
        L_0x0023:
            r12 = move-exception
            goto L_0x0028
        L_0x0025:
            r12 = move-exception
            goto L_0x0036
        L_0x0027:
            r12 = move-exception
        L_0x0028:
            dmm r1 = r11.a     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "Error querying for table"
            r1.c(r3, r13, r12)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            r0.close()
        L_0x0034:
            return r2
        L_0x0035:
            r12 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dml.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    private static final Set b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        dmm dmm = this.a;
        String str = dmm.a;
        if (dmm.e.a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.a.e.a();
                this.a.e("Opening the database failed, dropping the table and recreating it");
                this.a.d().getDatabasePath(this.a.w()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.a.e.b();
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    this.a.e("Failed to open freshly created database", e2);
                    throw e2;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException e) {
            dph.a("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = Build.VERSION.SDK_INT;
        if (!a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(dmm.a);
        } else {
            Set b = b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (!b.remove(str)) {
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() == 0 ? new String("Database hits2 is missing required column: ") : "Database hits2 is missing required column: ".concat(valueOf));
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (a(sQLiteDatabase, "properties")) {
            Set b2 = b(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            for (int i3 = 0; i3 < 6; i3++) {
                String str2 = strArr2[i3];
                if (!b2.remove(str2)) {
                    String valueOf2 = String.valueOf(str2);
                    throw new SQLiteException(valueOf2.length() == 0 ? new String("Database properties is missing required column: ") : "Database properties is missing required column: ".concat(valueOf2));
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
