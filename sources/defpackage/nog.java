package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: nog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nog {
    public static final /* synthetic */ int c = 0;
    private static nog d;
    private static nof e;
    private static final Object f = new Object();
    private static int g = 0;
    public final nnx a = new nnx(this);
    public final nnq b = new nnq(this);

    static {
        nog.class.getSimpleName();
    }

    private nog(Context context) {
        e = nof.a(context);
    }

    public static synchronized nog a(Context context) {
        nog nog;
        synchronized (nog.class) {
            synchronized (f) {
                if (d == null) {
                    d = new nog(context);
                }
                g++;
                nog = d;
            }
        }
        return nog;
    }

    public static final SQLiteDatabase b() {
        SQLiteDatabase readableDatabase;
        synchronized (f) {
            readableDatabase = e.getReadableDatabase();
        }
        return readableDatabase;
    }

    public static final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase;
        synchronized (f) {
            try {
                writableDatabase = e.getWritableDatabase();
            } catch (SQLiteException e2) {
                throw new noh("Could not open the database for writing.");
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    public final void a() {
        synchronized (f) {
            int i = g - 1;
            g = i;
            if (i == 0) {
                e.close();
                d = null;
            }
        }
    }
}
