package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: cir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cir extends jjj {
    protected cir(Context context, String str) {
        super(context, str, "context", 1);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        civ.a(sQLiteDatabase, "context", cjj.c);
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new UnsupportedOperationException("This method is not currently supported");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        civ.a(sQLiteDatabase, "context", cjj.a, cjj.b);
        c(sQLiteDatabase);
    }
}
