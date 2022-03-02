package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* renamed from: fkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fkz extends jjj {
    private static void a(SQLiteDatabase sQLiteDatabase, fln fln) {
        fla.a.b(String.format("Creating table %s", new Object[]{fln.a()}), new Object[0]);
        fzn.a(sQLiteDatabase, fln.a(), fln.b(), fln.c(), fln.d());
        for (String[] a : fln.e()) {
            fzn.a(sQLiteDatabase, fln.a(), a);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        fla.a.b(String.format("Opening database %s...", new Object[]{"auth.credentials.credential_store"}), new Object[0]);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        fla.a.b(String.format(Locale.US, "Upgrading from version %d to version %s...", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), new Object[0]);
        if (i2 == 8) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential_affiliation");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phone_numbers");
        }
    }

    public fkz(Context context) {
        super(context, "auth.credentials.credential_store", "auth.credentials.credential_store", 8);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        fla.a.b(String.format("Creating database %s...", new Object[]{"auth.credentials.credential_store"}), new Object[0]);
        a(sQLiteDatabase, fkx.a);
        a(sQLiteDatabase, fky.a);
    }
}
