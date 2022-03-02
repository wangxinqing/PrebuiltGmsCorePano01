package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: lld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lld extends kql {
    public static final lld d = new lld();
    public static final String[] e = {llc.MUTATION.name()};
    private static final lsb f = new llb();
    private static final kqk g;

    static {
        kqk kqk = new kqk(f);
        kqk.a(1, "MutationHistory");
        g = kqk;
    }

    private lld() {
        super(6, g);
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        return (int) DatabaseUtils.queryNumEntries(sQLiteDatabase, b());
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(llc.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(b(), (String) null, contentValues);
    }
}
