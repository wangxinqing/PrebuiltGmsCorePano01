package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfv {
    public static final byte[] a = new byte[0];

    public static Set a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("RequestTags", new String[]{"user"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            HashSet hashSet = new HashSet(query.getCount());
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return hashSet;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
