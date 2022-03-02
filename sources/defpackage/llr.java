package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: llr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llr extends kql {
    public static final llr d = new llr();
    public static final String[] e = {llq.MUTATION.name()};
    private static final lsb f = new llp();
    private static final kqk g;

    static {
        kqk kqk = new kqk(f);
        kqk.a(2, "UndoStack");
        g = kqk;
    }

    private llr() {
        super(6, g);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(llq.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(b(), (String) null, contentValues);
    }

    public llr(int i) {
        super(i, g);
    }
}
