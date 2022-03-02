package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: yfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yfh {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private static final Object b = new Object();
    private static long c = 0;

    public static long a(yfw yfw) {
        Cursor query;
        Throwable th;
        synchronized (b) {
            if (c == 0) {
                SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    query = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 1", (String[]) null, (String) null, (String) null, (String) null);
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        c = query.getLong(0);
                    } else {
                        ((anih) ((anih) a.d()).a("yfh", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No Heterodyne serving version in database");
                        c = -1;
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (query != null) {
                        query.close();
                    }
                    writableDatabase.endTransaction();
                    long j = c;
                    return j;
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } else {
                long j2 = c;
                return j2;
            }
        }
        throw th;
    }

    public static void a() {
        synchronized (b) {
            c = 0;
        }
    }
}
