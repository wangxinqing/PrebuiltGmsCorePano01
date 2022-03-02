package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

/* renamed from: yfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfl {
    public static Pair a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("ApplicationStates", new String[]{"user", "version"}, "packageName = ?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                Pair create = Pair.create(query.getString(0), Integer.valueOf(query.getInt(1)));
                if (query != null) {
                    query.close();
                }
                return create;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
