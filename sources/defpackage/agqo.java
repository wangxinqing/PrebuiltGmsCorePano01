package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agqo implements Runnable {
    private final SQLiteDatabase a;

    public agqo(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.a;
        for (String delete : agqr.b) {
            sQLiteDatabase.delete(delete, (String) null, (String[]) null);
        }
    }
}
