package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: cit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cit extends jjj {
    private final Context a;
    private final String b;

    protected cit(Context context, String str) {
        super(context, str, "context_feature", 2);
        this.a = context;
        this.b = str;
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        civ.a(sQLiteDatabase, "feature", cjk.c);
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        String[][] strArr = cjk.c;
        for (String[] a2 : strArr) {
            String a3 = civ.a("feature", a2);
            cji.b();
            sQLiteDatabase.execSQL(new cje(a3).a.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cit", "getReadableDatabase", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDbFileManager] Could not get readable feature database.  Re-creating.");
            String str = this.b;
            if (str != null) {
                this.a.getDatabasePath(str).delete();
            }
            return super.getReadableDatabase();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cit", "getWritableDatabase", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDbFileManager] Could not get writable feature database.  Re-creating.");
            String str = this.b;
            if (str != null) {
                this.a.getDatabasePath(str).delete();
            }
            return super.getWritableDatabase();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            d(sQLiteDatabase);
            c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            d(sQLiteDatabase);
            c(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        civ.a(sQLiteDatabase, "feature", cjk.a, cjk.b);
        c(sQLiteDatabase);
    }
}
