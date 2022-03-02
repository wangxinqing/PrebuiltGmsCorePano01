package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

/* renamed from: hld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hld extends jjj {
    private static void a(SQLiteDatabase sQLiteDatabase, hlu hlu) {
        boolean z = true;
        hll.a.b("Creating table: %s...", hlu.a());
        Pair[] b = hlu.b();
        String[] c = hlu.c();
        if (c == null || c.length <= 0) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(hlu.a());
        sb.append('(');
        int i = 0;
        while (true) {
            int length = b.length;
            if (i >= length) {
                break;
            }
            sb.append((String) b[i].first);
            sb.append(' ');
            sb.append((String) b[i].second);
            if (z || i + 1 < length) {
                sb.append(',');
            }
            i++;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                int length2 = c.length;
                if (i2 >= length2) {
                    break;
                }
                sb.append(c[i2]);
                i2++;
                if (i2 < length2) {
                    sb.append(',');
                }
            }
        }
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
        for (String[] a : hlu.d()) {
            hll.a(sQLiteDatabase, hlu.a(), a);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        hle.a.b("Opening database %s...", "chromesync.data_store");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        hle.a.b("Upgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            a(sQLiteDatabase, hlt.a);
            i = 2;
        }
        if (i < 3) {
            a(sQLiteDatabase, hlk.a);
            i = 3;
        }
        if (i < 4) {
            a(sQLiteDatabase, hlc.a);
            a(sQLiteDatabase, hkz.a);
            i = 4;
        }
        if (i < 6) {
            hll.a.b("Dropping table: %s...", "password_index");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS password_index");
            a(sQLiteDatabase, hlk.a);
        } else if (i >= 7) {
            return;
        }
        a(sQLiteDatabase, hli.a);
        a(sQLiteDatabase, hlf.a);
    }

    public hld(Context context) {
        super(context, "chromesync.data_store", "chromesync.data_store", 7);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        hle.a.b("Creating database %s...", "chromesync.data_store");
        a(sQLiteDatabase, hky.a);
        a(sQLiteDatabase, hlt.a);
        a(sQLiteDatabase, hlk.a);
        a(sQLiteDatabase, hlc.a);
        a(sQLiteDatabase, hkz.a);
        a(sQLiteDatabase, hli.a);
        a(sQLiteDatabase, hlf.a);
    }
}
