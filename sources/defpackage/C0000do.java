package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: do  reason: invalid class name and default package and case insensitive filesystem */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class C0000do extends dn implements df {
    private final SQLiteStatement b;

    public C0000do(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final void a() {
        this.b.executeInsert();
    }

    public final void b() {
        this.b.executeUpdateDelete();
    }
}
