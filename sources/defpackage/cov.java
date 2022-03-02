package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: cov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cov implements cpb {
    private final String a;

    public cov(String str) {
        this.a = str;
    }

    public final Object a(Object obj) {
        String str = this.a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        clo clo = cpe.a;
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }
}
