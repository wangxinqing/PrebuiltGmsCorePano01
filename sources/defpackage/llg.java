package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: llg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llg extends kql {
    public static final llg d = new llg();
    public static final String[] e = {llf.MUTATION.name()};
    private static final lsb f = new lle();
    private static final kqk g;

    static {
        kqk kqk = new kqk(f);
        kqk.a(1, "PendingMutation");
        g = kqk;
    }

    private llg() {
        super(6, g);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(llf.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(b(), (String) null, contentValues);
    }
}
