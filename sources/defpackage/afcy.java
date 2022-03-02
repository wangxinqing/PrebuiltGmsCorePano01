package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: afcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcy implements DatabaseErrorHandler {
    private final afca a;

    public afcy(afca afca) {
        this.a = afca;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        this.a.a();
    }
}
