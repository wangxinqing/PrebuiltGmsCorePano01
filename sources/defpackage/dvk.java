package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvk {
    private static Set a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        agyu a = agyu.a();
        a.a("type");
        a.a(" = '");
        a.a(str);
        a.a("'");
        if (strArr.length > 0) {
            a.a(" AND (");
            a.a("name LIKE '%' || ?");
            for (int i = 1; i < strArr.length; i++) {
                a.a(" OR ");
                a.a("name LIKE '%' || ?");
            }
            a.a(")");
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("sqlite_master", new String[]{"name"}, ((agys) a.b()).a, strArr, (String) null, (String) null, (String) null);
        HashSet hashSet = new HashSet();
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("name");
                while (query.moveToNext()) {
                    hashSet.add(query.getString(columnIndex));
                }
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    public static Set b(SQLiteDatabase sQLiteDatabase, String... strArr) {
        return a(sQLiteDatabase, "trigger", strArr);
    }

    public static boolean c(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ? AND name == ?", new String[]{"table", str}, (String) null, (String) null, (String) null);
        if (query == null) {
            return false;
        }
        try {
            return query.moveToNext();
        } finally {
            query.close();
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("DROP TRIGGER IF EXISTS [");
        sb.append(str);
        sb.append("]");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static Set a(SQLiteDatabase sQLiteDatabase, String... strArr) {
        return a(sQLiteDatabase, "table", strArr);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("DROP TABLE IF EXISTS [");
        sb.append(str);
        sb.append("]");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
