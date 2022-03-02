package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: nof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nof extends jjj {
    private static nof a;

    public static synchronized nof a(Context context) {
        nof nof;
        synchronized (nof.class) {
            if (a == null) {
                a = new nof(context);
            }
            nof = a;
        }
        return nof;
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{str}));
        } catch (SQLException e) {
            int i = nog.c;
            new Object[1][0] = str;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = nog.c;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            int i3 = nog.c;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            if (i <= 0) {
                c(sQLiteDatabase);
                new Object[1][0] = 1;
            } else if (i >= 2) {
                return;
            }
            int i4 = nnq.a;
            b(sQLiteDatabase, "ad_attestation");
            a(sQLiteDatabase, nnq.a());
            new Object[1][0] = 2;
        } catch (SQLException e) {
            int i5 = nog.c;
            new Object[1][0] = e;
            c(sQLiteDatabase);
        }
    }

    private nof(Context context) {
        super(context, "gass.db", "gass.db", 2);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLException e) {
            int i = nog.c;
            new Object[1][0] = str;
        }
    }

    private final void c(SQLiteDatabase sQLiteDatabase) {
        int i = nnx.a;
        b(sQLiteDatabase, "app_info");
        b(sQLiteDatabase, "ad_attestation");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = nnx.a;
        String format = String.format(" (%s INTEGER PRIMARY KEY AUTOINCREMENT, ", new Object[]{"_id"});
        String format2 = String.format("%s BLOB, ", new Object[]{"pb"});
        String format3 = String.format("%s STRING, ", new Object[]{"package_name"});
        String format4 = String.format("%s STRING, ", new Object[]{"version_code"});
        String format5 = String.format("%s BLOB)", new Object[]{"digest_sha256"});
        int length = String.valueOf(format).length();
        int length2 = String.valueOf(format2).length();
        int length3 = String.valueOf(format3).length();
        StringBuilder sb = new StringBuilder(length + 21 + length2 + length3 + String.valueOf(format4).length() + String.valueOf(format5).length());
        sb.append("CREATE TABLE app_info");
        sb.append(format);
        sb.append(format2);
        sb.append(format3);
        sb.append(format4);
        sb.append(format5);
        a(sQLiteDatabase, sb.toString());
        a(sQLiteDatabase, nnq.a());
    }
}
