package defpackage;

import android.database.sqlite.SQLiteQueryBuilder;

/* renamed from: cji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cji extends SQLiteQueryBuilder {
    private static cji a = null;

    private cji() {
    }

    public static final cjh a() {
        return new cjh();
    }

    public static synchronized void b() {
        synchronized (cji.class) {
            if (a == null) {
                a = new cji();
            }
        }
    }
}
