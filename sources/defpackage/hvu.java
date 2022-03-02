package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: hvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvu {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"storage_size"};

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS storage_size (_id INTEGER PRIMARY KEY, storage_size LONG NOT NULL);");
    }

    /* access modifiers changed from: package-private */
    public final long b(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("storage_size", b, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                return query.getLong(0);
            }
            query.close();
            return 0;
        } finally {
            query.close();
        }
    }

    static void a(SQLiteDatabase sQLiteDatabase, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", 1);
        contentValues.put("storage_size", Long.valueOf(j));
        if (sQLiteDatabase.replace("storage_size", (String) null, contentValues) < 0) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Failed to write storage of size ");
            sb.append(j);
            throw new hvm(sb.toString());
        }
    }
}
