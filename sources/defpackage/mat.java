package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: mat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mat extends jjj {
    public mat(mau mau) {
        super(mau.a, "dg.db", "dg.db", 2);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE main (a TEXT NOT NULL, b LONG NOT NULL, c LONG NOT NULL, d TEXT NON NULL, e TEXT NON NULL,f BLOB NOT NULL,g BLOB NOT NULL);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main;");
        onCreate(sQLiteDatabase);
    }
}
