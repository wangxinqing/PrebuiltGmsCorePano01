package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: elu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class elu extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        elv.a.c("creating database.", new Object[0]);
        sQLiteDatabase.execSQL(elv.b);
        sQLiteDatabase.execSQL(elv.c);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        elv.a.c("upgrading db from %s to %s", Integer.valueOf(i), Integer.valueOf(i2));
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AccountHistory");
        onCreate(sQLiteDatabase);
    }

    public elu(Context context, String str) {
        super(context, str, str, 1);
    }
}
