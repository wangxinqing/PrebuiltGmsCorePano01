package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: oxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxw extends jjj {
    private final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS [errors]");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS [user_actions]");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS [errors] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime('%s', 'now')))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS [user_actions] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime('%s', 'now')))");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    public oxw(Context context) {
        super(context, "icing-indexapi-errors.db", "icing-indexapi-errors.db", 4);
    }
}
