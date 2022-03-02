package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: hvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvv {
    public static final int[] a = new int[0];

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS test_codes (_id INTEGER PRIMARY KEY AUTOINCREMENT, log_source STRING NOT NULL, test_code INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS log_source ON test_codes(log_source)");
    }
}
