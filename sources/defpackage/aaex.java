package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aaex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaex {
    static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (a(sQLiteDatabase, str, str2)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, (String) null);
            sQLiteDatabase.update(str, contentValues, (String) null, (String[]) null);
            return;
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s;", new Object[]{str, str2, str3}));
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            boolean z = true;
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM %s", new Object[]{str2, str}), (String[]) null);
            if (rawQuery == null) {
                z = false;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return z;
        } catch (SQLException e) {
            return false;
        }
    }
}
