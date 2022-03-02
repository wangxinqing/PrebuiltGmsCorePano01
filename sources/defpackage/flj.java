package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: flj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class flj implements flb {
    private final String a;
    private final Object b;
    private final flf c;

    public flj(flf flf, String str, Object obj) {
        this.c = flf;
        this.a = str;
        this.b = obj;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        flf flf = this.c;
        String str = this.a;
        Object obj = this.b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", "---");
        contentValues.put("app", fbx.b(str));
        contentValues.put("key", flf.a);
        contentValues.put("value", (String) flf.c.a().d(obj));
        return sQLiteDatabase.replace("credential_app_setting", (String) null, contentValues) != -1;
    }
}
