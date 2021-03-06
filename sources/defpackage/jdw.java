package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: jdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdw extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry (_id INTEGER PRIMARY KEY, datetime_updated INTEGER, iface TEXT, tag INTEGER, uid INTEGER, counter_set INTEGER, device_state INTEGER, transport_type INTEGER, rxbytes INTEGER, rxpackets INTEGER, txbytes INTEGER, txpackets INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network_raw_entry");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry (_id INTEGER PRIMARY KEY, datetime_updated INTEGER, iface TEXT, tag INTEGER, uid INTEGER, counter_set INTEGER, device_state INTEGER, transport_type INTEGER, rxbytes INTEGER, rxpackets INTEGER, txbytes INTEGER, txpackets INTEGER)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE network_raw_entry ADD COLUMN device_state INTEGER DEFAULT 7");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("ALTER TABLE network_raw_entry ADD COLUMN transport_type INTEGER DEFAULT -1");
            sQLiteDatabase.execSQL("UPDATE network_raw_entry SET transport_type = (CASE WHEN iface LIKE '%wlan%' THEN 1 WHEN iface LIKE '%rmnet%' THEN 0 WHEN iface LIKE '%eth%' THEN 3 ELSE -1 END) WHERE transport_type = -1");
        }
    }

    public jdw(Context context) {
        super(context, "NetworkUsage.db", "NetworkUsage.db", 3);
    }
}
