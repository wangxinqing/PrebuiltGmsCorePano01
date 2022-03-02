package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: llj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llj extends kql {
    public static final llj d = new llj();
    public static final String[] e = {lli.MUTATION.name()};
    private static final lsb f = new llh();
    private static final kqk g;

    static {
        kqk kqk = new kqk(f);
        kqk.a(3, "PendingUndoStackTable");
        g = kqk;
    }

    private llj() {
        super(6, g);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(lli.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(b(), (String) null, contentValues);
    }
}
