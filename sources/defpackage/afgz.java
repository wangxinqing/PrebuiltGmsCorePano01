package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: afgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgz implements afdf {
    private final awdn a;

    public afgz(awdn awdn) {
        this.a = awdn;
    }

    public final void a() {
    }

    public final void b() {
        ((pia) this.a.a()).a("Opening MDH wipeout table.", new Object[0]);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        ((pia) this.a.a()).c("Creating MDH wipeout table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wipeout (account TEXT,channel_key TEXT,local_writes  INTEGER NOT NULL DEFAULT 0,last_sync_timestamp INTEGER,channel_id BLOB NOT NULL,PRIMARY KEY (account,channel_key))");
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((pia) this.a.a()).a("Upgrading MDH wipeout table from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
