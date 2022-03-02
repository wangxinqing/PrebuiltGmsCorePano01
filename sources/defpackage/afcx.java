package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: afcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcx implements afbz {
    public final Object a = new Object();
    public final Context b;
    public final String c;
    public boolean d;
    @Deprecated
    public boolean e;
    public final SQLiteOpenHelper f;

    public afcx(SQLiteOpenHelper sQLiteOpenHelper, Context context) {
        amrl.a((Object) sQLiteOpenHelper);
        this.f = sQLiteOpenHelper;
        this.b = context;
        this.c = sQLiteOpenHelper.getDatabaseName();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase readableDatabase;
        synchronized (this.a) {
            if (!this.d) {
                try {
                    readableDatabase = this.f.getReadableDatabase();
                    this.e = true;
                } catch (SQLiteException e2) {
                    throw new afdm("Failed to open SQLite database", e2);
                }
            } else {
                throw new afdm("SQLite database in lame duck mode");
            }
        }
        return readableDatabase;
    }

    public final void b() {
        synchronized (this.a) {
            if (!this.d) {
                this.f.close();
                this.b.deleteDatabase(this.c);
                this.d = true;
            }
        }
    }

    public final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.a) {
            if (!this.d) {
                try {
                    writableDatabase = this.f.getWritableDatabase();
                    this.e = true;
                } catch (SQLiteException e2) {
                    throw new afdm("Failed to open SQLite database", e2);
                }
            } else {
                throw new afdm("SQLite database in lame duck mode");
            }
        }
        return writableDatabase;
    }
}
