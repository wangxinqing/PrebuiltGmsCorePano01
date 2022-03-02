package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* renamed from: sui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sui extends SQLiteOpenHelper {
    final /* synthetic */ suj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sui(suj suj, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = suj;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException e2) {
            this.a.E().c.a("Opening the local database failed, dropping and recreating it");
            String q = this.a.q();
            if (!this.a.z().getDatabasePath(q).delete()) {
                this.a.E().c.a("Failed to delete corrupted local db file", q);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.a.E().c.a("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        spk.a(this.a.E(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = Build.VERSION.SDK_INT;
        spk.a(this.a.E(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
