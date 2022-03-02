package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: cph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cph implements cpj {
    static final cpj a = new cph();

    private cph() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = cpk.b;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
