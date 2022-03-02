package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

@Deprecated
/* renamed from: afdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdj implements afdl {
    private static final String[] a = {"name"};
    private final awdn b;

    public afdj(awdn awdn) {
        this.b = awdn;
    }

    public final void a() {
        afcx afcx = (afcx) this.b.a();
        synchronized (afcx.a) {
            if (!afcx.d) {
                if (afcx.e) {
                    afcx.f.close();
                }
                afcx.d = true;
                try {
                    afcx.f.getWritableDatabase().close();
                    if (!afcx.b.deleteDatabase(afcx.c)) {
                        throw new afdm("Database delete failed.");
                    }
                } catch (SQLiteException e) {
                    throw new afdm("Database clear failed.", e);
                }
            }
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        sQLiteDatabase.beginTransaction();
        try {
            query = sQLiteDatabase.query("sqlite_master", a, "type='table'", (String[]) null, (String) null, (String) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    String a2 = afdi.a.a(query.getString(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
                    sb.append('\"');
                    sb.append(a2);
                    sb.append('\"');
                    String valueOf = String.valueOf(sb.toString());
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE ") : "DROP TABLE ".concat(valueOf));
                }
                query.close();
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return;
            }
            throw new afdm("SQLite Cursor is null");
        } catch (afdm | SQLiteException e) {
            try {
                throw new RuntimeException("Error clearing SQLite storage", e);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
