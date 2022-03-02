package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.List;

/* renamed from: ilw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilw extends SQLiteOpenHelper implements AutoCloseable {
    public ilw() {
        super(aekv.d(ihs.b()), "com.google.android.gms.devicedoctor.db", (SQLiteDatabase.CursorFactory) null, 201216);
    }

    public static final void d() {
        if (null == null) {
            long j = ilt.a;
        }
    }

    public static final List e() {
        return amzy.a(new ilt(), new ima(), new imc());
    }

    private static final void f() {
        if (null == null) {
            int i = imc.b;
        }
    }

    public final List a() {
        f();
        return imc.a(getWritableDatabase(), (String) null, (String[]) null);
    }

    public final List b() {
        f();
        return imc.e(getWritableDatabase());
    }

    public final ilu c() {
        ilu ilu;
        d();
        Cursor query = getWritableDatabase().query("crash_count", new String[]{"crash_hash", "stack_trace", "count", "start_time", "latest_tme", "latest_error_dialog_time", "latest_notification_time"}, (String) null, (String[]) null, (String) null, (String) null, "latest_tme DESC", "1");
        try {
            if (query.moveToFirst()) {
                if (query != null) {
                    ilu = ilt.a(query, query.getString(query.getColumnIndexOrThrow("crash_hash")));
                } else {
                    ilu = null;
                }
                if (query != null) {
                    query.close();
                    return ilu;
                }
            } else if (query != null) {
                query.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        iva.a((Object) sQLiteDatabase, (Object) "db cannot be null");
        Log.i("DeviceDrDatabaseHelper", "Creating databases!");
        List e = e();
        for (int i = 0; i < e.size(); i++) {
            ((ily) e.get(i)).a(sQLiteDatabase);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        iva.a((Object) sQLiteDatabase, (Object) "db cannot be null");
        StringBuilder sb = new StringBuilder(65);
        sb.append("Downgrade database: oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.i("DeviceDrDatabaseHelper", sb.toString());
        List e = e();
        for (int i3 = 0; i3 < e.size(); i3++) {
            ((ily) e.get(i3)).c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        iva.a((Object) sQLiteDatabase, (Object) "db cannot be null");
        StringBuilder sb = new StringBuilder(63);
        sb.append("Upgrade database: oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.i("DeviceDrDatabaseHelper", sb.toString());
        List e = e();
        for (int i3 = 0; i3 < e.size(); i3++) {
            ((ily) e.get(i3)).d(sQLiteDatabase);
        }
    }

    public final void a(imb imb) {
        int a = aogv.a((int) imb.g);
        int i = a == 0 ? 1 : a;
        f();
        imc.a(getWritableDatabase(), imb.a, imb.b, imb.c, imb.d, imb.e, imb.f, i, imb.h, imb.i);
    }
}
