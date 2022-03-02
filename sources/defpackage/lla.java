package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: lla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lla extends kql {
    public static final lla d = new lla();
    private static final lsb e = new lky();
    private static final kqk f;

    static {
        kqk kqk = new kqk(e);
        kqk.a(1, "DocumentStore");
        f = kqk;
    }

    private lla() {
        super(6, f);
    }

    public final alxk a(SQLiteDatabase sQLiteDatabase) {
        String a = a(sQLiteDatabase, "meSessionId");
        if (a == null) {
            return null;
        }
        return alxk.a(a, a(sQLiteDatabase, "meUserId"), a(sQLiteDatabase, "meDisplayName"), a(sQLiteDatabase, "meColor"), true, a(sQLiteDatabase, "mePhotoUrl"), a(sQLiteDatabase, "mePermissionId"));
    }

    public final void b(SQLiteDatabase sQLiteDatabase, int i) {
        a(sQLiteDatabase, "snapshotLength", String.valueOf(i));
    }

    public final String a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(b(), new String[]{lkz.VALUE.name()}, String.valueOf(lkz.KEY.name()).concat(" = ?"), new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.getCount() == 1) {
                query.moveToFirst();
                return query.getString(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i) {
        a(sQLiteDatabase, "revision", String.valueOf(i));
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (str2 == null) {
            sQLiteDatabase.delete(b(), String.valueOf(lkz.KEY.name()).concat(" = ?"), new String[]{str});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(lkz.KEY.name(), str);
        contentValues.put(lkz.VALUE.name(), str2);
        sQLiteDatabase.replaceOrThrow(b(), (String) null, contentValues);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        a(sQLiteDatabase, "isReadOnly", Boolean.toString(z));
    }
}
