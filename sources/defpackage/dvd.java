package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: dvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dvd {
    public static String a(SQLiteDatabase sQLiteDatabase, dvj dvj) {
        Cursor query;
        if (sQLiteDatabase == null || (query = sQLiteDatabase.query("incarnation_appdatasearch", new String[]{"incarnation"}, "corpus_name = ?", new String[]{dvj.a}, (String) null, (String) null, (String) null)) == null) {
            return null;
        }
        try {
            if (query.moveToNext()) {
                return query.getString(query.getColumnIndex("incarnation"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    static void a(SQLiteDatabase sQLiteDatabase) {
        if (!dvk.c(sQLiteDatabase, "version_appdatasearch")) {
            sQLiteDatabase.execSQL(String.format("CREATE TABLE [%s] ([%s] INTEGER)", new Object[]{"version_appdatasearch", "version"}));
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("version", 6);
            sQLiteDatabase.insert("version_appdatasearch", (String) null, contentValues);
        }
        if (!dvk.c(sQLiteDatabase, "incarnation_appdatasearch")) {
            sQLiteDatabase.execSQL(String.format("CREATE TABLE [%s] ([%s] STRING PRIMARY KEY, [%s] STRING, [%s] INTEGER)", new Object[]{"incarnation_appdatasearch", "corpus_name", "incarnation", "seqno_table_complete"}));
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, dvj dvj, boolean z) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("seqno_table_complete", Integer.valueOf(z ? 1 : 0));
        sQLiteDatabase.update("incarnation_appdatasearch", contentValues, "corpus_name = ?", new String[]{dvj.a});
    }
}
