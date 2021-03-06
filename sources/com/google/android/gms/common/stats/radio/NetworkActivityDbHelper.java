package com.google.android.gms.common.stats.radio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkActivityDbHelper extends SQLiteOpenHelper {
    public NetworkActivityDbHelper(Context context) {
        super(context, NetworkActivityContract.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(NetworkActivityContract.CREATE_NETWORK_ACTIVITY_TABLE);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(NetworkActivityContract.DROP_NETWORK_ACTIVITY_TABLE);
        sQLiteDatabase.execSQL(NetworkActivityContract.CREATE_NETWORK_ACTIVITY_TABLE);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
