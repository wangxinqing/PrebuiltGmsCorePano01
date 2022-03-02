package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pkw extends jjj {
    private final afdg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pkw(Context context, afdg afdg, aeri aeri, DatabaseErrorHandler databaseErrorHandler) {
        super(context, "icing-mdh.db", "icing-mdh.db", !aeri.f() ? new DefaultDatabaseErrorHandler() : databaseErrorHandler);
        this.a = afdg;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        this.a.a(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        for (afdf b : this.a.a) {
            b.b();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        afdg afdg = this.a;
        ((pia) afdg.b.a()).c("Downgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        afdg.a(sQLiteDatabase);
        for (afdf a2 : afdg.a) {
            a2.a();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        afdg afdg = this.a;
        ((pia) afdg.b.a()).c("Upgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != 2) {
            for (afdf a2 : afdg.a) {
                a2.a(sQLiteDatabase, i, i2);
            }
            return;
        }
        afdg.a(sQLiteDatabase);
    }
}
