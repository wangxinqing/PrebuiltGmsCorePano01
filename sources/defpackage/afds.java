package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: afds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afds implements afdf {
    private final awdn a;

    public afds(awdn awdn) {
        this.a = awdn;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        ((pia) this.a.a()).c("Creating MDH subscription table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE subscription (app_id TEXT,account TEXT,channel TEXT,value BLOB NOT NULL,PRIMARY KEY (app_id,account,channel))");
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS subscription");
        a(sQLiteDatabase);
    }
}
