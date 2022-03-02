package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: jep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jep extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS radio_activity (_id INTEGER PRIMARY KEY, event_time_ms INTEGER, network_type INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS radio_activity");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS radio_activity (_id INTEGER PRIMARY KEY, event_time_ms INTEGER, network_type INTEGER)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public jep(Context context) {
        super(context, "wradio.db", "wradio.db", 1);
    }
}
