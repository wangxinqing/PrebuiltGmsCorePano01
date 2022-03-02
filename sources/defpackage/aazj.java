package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aazj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aazj extends jjj {
    private final void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE upload_queue");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE upload_queue (id INTEGER PRIMARY KEY AUTOINCREMENT, package_name STRING, version_code INTEGER, sha256_digest BLOB, token BLOB, timestamp INTEGER, state INTEGER, last_update_time INTEGER, upload_attempts INTEGER, upload_reason);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    public aazj(Context context) {
        super(context, "upload_queue.db", "upload_queue.db", 3);
    }
}
