package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: jyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyt extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE " + "device_features (_id INTEGER PRIMARY KEY AUTOINCREMENT,last_connection_timestamp INTEGER NOT NULL,feature_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX " + "device_feature_index ON device_features (feature_name)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        iva.a(false, (Object) "Currently running V1, no upgrades should take place.");
    }

    public jyt(Context context) {
        super(context, "device_connections.db", "device_connections.db", 1);
    }
}
