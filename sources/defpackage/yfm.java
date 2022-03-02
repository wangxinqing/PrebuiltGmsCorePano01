package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: yfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfm {
    public static long a(SQLiteDatabase sQLiteDatabase) {
        return a(sQLiteDatabase, "__sync");
    }

    public static long b(SQLiteDatabase sQLiteDatabase, String str) {
        long a = a(sQLiteDatabase, str) + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("packageName", str);
        contentValues.put("count", Long.valueOf(a));
        if (sQLiteDatabase.insertWithOnConflict("ChangeCounts", (String) null, contentValues, 5) >= 0) {
            return a;
        }
        String valueOf = String.valueOf(str);
        throw new SQLiteException(valueOf.length() == 0 ? new String("Failed to increment change count for ") : "Failed to increment change count for ".concat(valueOf));
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        long j;
        Cursor query = sQLiteDatabase.query("ChangeCounts", new String[]{"count"}, "packageName = ?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst()) {
                j = query.getLong(0);
            } else {
                j = 0;
            }
            if (query != null) {
                query.close();
            }
            return j;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
