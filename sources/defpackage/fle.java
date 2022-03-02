package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: fle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fle implements flb {
    private final String a;
    private final Object b;
    private final flf c;

    public fle(flf flf, String str, Object obj) {
        this.c = flf;
        this.a = str;
        this.b = obj;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        flf flf = this.c;
        String str = this.a;
        Object obj = this.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str);
        contentValues.put("key", flf.a);
        contentValues.put("value", (String) flf.c.a().d(obj));
        return sQLiteDatabase.replace("credential_setting", (String) null, contentValues) != -1;
    }
}
