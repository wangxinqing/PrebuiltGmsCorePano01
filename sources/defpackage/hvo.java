package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: hvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvo {
    public static final String[] a = {"_id", "storage_size", "reason"};

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log_drop_counts (_id STRING NOT NULL, storage_size INTEGER NOT NULL, reason STRING NOT NULL, PRIMARY KEY(_id, reason));");
    }
}
