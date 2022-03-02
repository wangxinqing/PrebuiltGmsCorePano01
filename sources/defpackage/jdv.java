package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: jdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdv extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network_raw_entry_androidN");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 > i) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network_raw_entry_androidN");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
        }
    }

    public jdv(Context context) {
        super(context, "NetworkUsageAndroidNPlus.db", "NetworkUsageAndroidNPlus.db", 2);
    }
}
