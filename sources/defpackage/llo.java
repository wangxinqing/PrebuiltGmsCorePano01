package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: llo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llo extends kql {
    public static final llo d = new llo();
    public static final String[] e = {lln.MUTATION.name()};
    private static final lsb f = new llm();
    private static final kqk g;

    static {
        kqk kqk = new kqk(f);
        kqk.a(2, "RedoStack");
        g = kqk;
    }

    private llo() {
        super(6, g);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(lln.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(b(), (String) null, contentValues);
    }

    public llo(int i) {
        super(i, g);
    }
}
