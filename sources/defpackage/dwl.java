package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: dwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwl extends jjj {
    private static dwl a;

    public static synchronized dwl a(Context context) {
        dwl dwl;
        synchronized (dwl.class) {
            if (a == null) {
                a = new dwl(context);
            }
            dwl = a;
        }
        return dwl;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private dwl(Context context) {
        super(context, "appinvite.db", "appinvite.db", 1);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sms (invitation_id TEXT PRIMARY KEY,operation_id TEXT,status INT DEFAULT(0) );");
    }
}
