package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aguu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aguu extends agtc {
    public aguu() {
        super(1);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        agsz.a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE queue (_id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, timestamp INTEGER NOT NULL)");
    }
}
