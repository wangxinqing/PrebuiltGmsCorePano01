package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsz {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE account (name TEXT NOT NULL, type TEXT NOT NULL)");
    }
}
