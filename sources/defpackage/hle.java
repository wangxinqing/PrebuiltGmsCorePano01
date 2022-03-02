package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: hle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hle {
    public static final iwd a = hir.b("DatabaseManager");
    private static hle b;
    private final hld c;

    private hle(Context context) {
        this.c = new hld(context);
    }

    static synchronized hle a(Context context) {
        hle hle;
        synchronized (hle.class) {
            if (b == null) {
                b = new hle(context);
            }
            hle = b;
        }
        return hle;
    }

    public final SQLiteDatabase a() {
        try {
            return qbd.a(this.c, "chromesync.data_store", true);
        } catch (SQLiteException e) {
            throw new hjm(1025, "Failed to open the database.", e);
        }
    }
}
