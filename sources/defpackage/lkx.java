package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: lkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkx extends lka {
    public boolean b;

    public lkx(lkk lkk) {
        super("UpdateInitialLoadResultOperation", lkk);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        lla.d.a(sQLiteDatabase, this.b);
    }
}
