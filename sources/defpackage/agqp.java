package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agqp extends agtc {
    public agqp() {
        super(2);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        for (String execSQL : agqr.a) {
            sQLiteDatabase.execSQL(execSQL);
        }
        agsz.a(sQLiteDatabase);
    }
}
