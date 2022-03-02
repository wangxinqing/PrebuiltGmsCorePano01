package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: fla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fla {
    public static final iwd a = ehv.b("DatabaseManager");
    private static fla b;
    private final fkz c;

    private fla(Context context) {
        this.c = new fkz(context);
    }

    public static synchronized fla a(Context context) {
        fla fla;
        synchronized (fla.class) {
            if (b == null) {
                b = new fla(context.getApplicationContext());
            }
            fla = b;
        }
        return fla;
    }

    public final SQLiteDatabase a() {
        try {
            return qbd.a(this.c, "auth.credentials.credential_store", awnm.a.a().a());
        } catch (SQLiteException e) {
            qbe a2 = qbf.a();
            a2.b = e;
            a2.c = 8;
            a2.a = e.getMessage();
            throw a2.a();
        }
    }

    public final Object a(String str, String[] strArr, flc flc, Object obj) {
        Cursor rawQuery = a().rawQuery(str, strArr);
        try {
            if (rawQuery.moveToFirst()) {
                return flc.a(rawQuery);
            }
            rawQuery.close();
            return obj;
        } finally {
            rawQuery.close();
        }
    }

    public final void a(flb flb) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            if (flb.a(a2)) {
                a2.setTransactionSuccessful();
            }
        } finally {
            a2.endTransaction();
        }
    }
}
