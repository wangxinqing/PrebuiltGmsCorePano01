package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: cpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cpi implements cpj {
    static final cpj a = new cpi();

    private cpi() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = cpk.b;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
