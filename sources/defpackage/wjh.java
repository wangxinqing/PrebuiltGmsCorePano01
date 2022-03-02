package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* renamed from: wjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjh extends jjj {
    private static final jjg a = jjg.a(iyc.GUNS);
    private static wjh b = null;

    public static synchronized SQLiteDatabase a(Context context) {
        SQLiteDatabase readableDatabase;
        synchronized (wjh.class) {
            try {
                readableDatabase = c(context).getReadableDatabase();
            } catch (Exception e) {
                anih anih = (anih) a.b();
                anih.a((Throwable) e);
                anih.a("Error getting readable DB.");
                return null;
            }
        }
        return readableDatabase;
    }

    public static synchronized SQLiteDatabase b(Context context) {
        SQLiteDatabase writableDatabase;
        synchronized (wjh.class) {
            try {
                writableDatabase = c(context).getWritableDatabase();
            } catch (Exception e) {
                anih anih = (anih) a.b();
                anih.a((Throwable) e);
                anih.a("Error getting writable DB.");
                return null;
            }
        }
        return writableDatabase;
    }

    private static synchronized wjh c(Context context) {
        wjh wjh;
        synchronized (wjh.class) {
            if (b == null) {
                b = new wjh(context.getApplicationContext());
            }
            wjh = b;
        }
        return wjh;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    private wjh(Context context) {
        super(context, "gms.notifications.db", "gms.notifications.db", 3);
    }

    private final void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notifications");
        } catch (Exception e) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            anih.a("Error dropping tables from DB.");
        }
        onCreate(sQLiteDatabase);
    }

    public static synchronized void a(SQLiteDatabase sQLiteDatabase, long j) {
        synchronized (wjh.class) {
            try {
                sQLiteDatabase.execSQL(String.format((Locale) null, "DELETE FROM %s WHERE %s <= %d;", new Object[]{"notifications", "creation_time_usec", Long.valueOf(j)}));
            } catch (Exception e) {
                anih anih = (anih) a.b();
                anih.a((Throwable) e);
                anih.a("Failed to delete old notifications.");
            }
            try {
                sQLiteDatabase.execSQL(String.format((Locale) null, "DELETE FROM %s WHERE %s NOT IN (SELECT %s FROM %s ORDER BY %s DESC LIMIT %d);", new Object[]{"notifications", "_id", "_id", "notifications", "insertion_time_ms", Long.valueOf(aynt.a.a().p())}));
            } catch (Exception e2) {
                anih anih2 = (anih) a.b();
                anih2.a((Throwable) e2);
                anih2.a("Failed to delete excess notifications.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE notifications(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, payload BLOB, insertion_time_ms INTEGER NOT NULL DEFAULT(0), creation_time_usec INTEGER NOT NULL DEFAULT(0) );");
        } catch (Exception e) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            anih.a("Error creating DB.");
        }
    }
}
