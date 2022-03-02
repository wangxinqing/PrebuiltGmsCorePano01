package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.Set;

/* renamed from: jit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jit {
    public static long a(Context context, String str) {
        try {
            File databasePath = context.getDatabasePath(str);
            if (databasePath != null) {
                return databasePath.length();
            }
            return 0;
        } catch (SecurityException e) {
            Log.w("DbUtils", str.length() == 0 ? new String("Failed to get db size for ") : "Failed to get db size for ".concat(str));
            return 0;
        }
    }

    public static Long b(Cursor cursor, int i) {
        return a(cursor, i, (Long) null);
    }

    public static String c(Cursor cursor, int i) {
        return a(cursor, i, (String) null);
    }

    public static Integer a(Cursor cursor, int i) {
        return a(cursor, i, (Integer) null);
    }

    public static Integer a(Cursor cursor, int i, Integer num) {
        return !cursor.isNull(i) ? Integer.valueOf(cursor.getInt(i)) : num;
    }

    public static Long a(Cursor cursor, int i, Long l) {
        return !cursor.isNull(i) ? Long.valueOf(cursor.getLong(i)) : l;
    }

    public static String a(Cursor cursor, int i, String str) {
        return !cursor.isNull(i) ? cursor.getString(i) : str;
    }

    public static void a(ContentValues contentValues, String str, Integer num) {
        if (num == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, num);
        }
    }

    public static void a(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, "table", "sqlite_sequence", "android_metadata");
        a(sQLiteDatabase, "trigger", new String[0]);
        a(sQLiteDatabase, "view", new String[0]);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        boolean z;
        if ("table".equals(str) || "view".equals(str) || "trigger".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == ?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            Set a = jir.a((Object[]) strArr);
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!a.contains(string)) {
                    StringBuilder sb = new StringBuilder(str.length() + 8 + String.valueOf(string).length());
                    sb.append("DROP ");
                    sb.append(str);
                    sb.append(" '");
                    sb.append(string);
                    sb.append("'");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
            if (query != null) {
                query.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
