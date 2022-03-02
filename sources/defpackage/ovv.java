package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ovv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovv {
    public static Set a(SQLiteDatabase sQLiteDatabase, String str, oyb oyb) {
        Set<Pair> b = b(sQLiteDatabase, str, oyb);
        HashSet hashSet = new HashSet();
        for (Pair pair : b) {
            hashSet.add((oxe) pair.first);
        }
        return hashSet;
    }

    static Set b(SQLiteDatabase sQLiteDatabase, String str, oyb oyb) {
        Cursor query = sQLiteDatabase.query("type_indexapi", new String[]{"type"}, "app_name = ?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            HashSet hashSet = new HashSet();
            int columnIndex = query.getColumnIndex("type");
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                hashSet.add(new Pair(oxe.b(string, str, oyb), string));
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

    static void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.delete("type_indexapi", "app_name = ? AND type = ?", new String[]{str, str2});
    }
}
