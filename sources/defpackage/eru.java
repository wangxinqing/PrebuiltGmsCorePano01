package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: eru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eru extends jjj {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public eru(Context context) {
        super(context, "otp_counters.db", "otp_counters.db", 1);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE otp_counters (otp_secret_hash STRING NOT NULL PRIMARY KEY, account_name STRING NOT NULL, counter INTEGER NOT NULL, otp_secret_creation_time_millis INTEGER NOT NULL, creation_time_millis INTEGER NOT NULL, modification_time_millis INTEGER NOT NULL )");
    }
}
