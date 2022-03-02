package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: hll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hll {
    public static final iwd a = hir.b("SQLiteUtils");

    public static void a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        sQLiteDatabase.replace(str, (String) null, contentValues);
    }

    public static boolean b(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    public static int c(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static String d(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CREATE INDEX IF NOT EXISTS idx_");
        sb.append(str);
        for (String append : strArr) {
            sb.append('_');
            sb.append(append);
        }
        sb.append(" ON ");
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(strArr[i]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static byte[] a(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
