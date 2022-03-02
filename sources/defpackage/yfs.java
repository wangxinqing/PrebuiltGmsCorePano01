package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: yfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfs {
    public static Integer a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query = sQLiteDatabase.query("MultiCommitApplicationStates", new String[]{"version"}, "packageName = ? AND user = ?", new String[]{str, str2}, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                Integer valueOf = Integer.valueOf(query.getInt(0));
                if (query != null) {
                    query.close();
                }
                return valueOf;
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
