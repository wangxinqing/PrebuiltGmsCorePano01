package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: zai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zai extends jjj {
    private static final String a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s);", new Object[]{"offline_frames", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "packageName STRING", "accountName STRING", "payload STRING", "url STRING"});
    private static final String b = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", new Object[]{"offline_logs", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "accountName TEXT NOT NULL", "type TEXT NOT NULL", "payload TEXT NOT NULL", "timestamp INTEGER NOT NULL", "onBehalfOf TEXT"});
    private static final String c = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", new Object[]{"plus_accounts", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "updated INTEGER NOT NULL", "display_name STRING", "account_name STRING", "profile_image_url STRING", "signedUp BOOLEAN"});
    private static final String d = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s);", new Object[]{"plus_profiles", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "updated INTEGER NOT NULL", "accountName STRING", "packageName STRING", "profileJson STRING"});
    private final Context e;

    public zai(Context context, String str) {
        super(context, str, str, 9, axbh.b());
        this.e = context;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
        sQLiteDatabase.execSQL(b);
        sQLiteDatabase.execSQL(c);
        sQLiteDatabase.execSQL(d);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(91);
        sb.append("Resetting the database due to downgrade. Old version: ");
        sb.append(i);
        sb.append(", new version: ");
        sb.append(i2);
        Log.e("PlusOpenHelper", sb.toString());
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{"offline_frames"}));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{"offline_logs"}));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{"plus_accounts"}));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{"plus_profiles"}));
        onCreate(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 5) {
            Cursor query = sQLiteDatabase.query("default_account", new String[]{"packageName", "accountName"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                try {
                    jgu.a(this.e, query.getString(0), query.getString(1));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS default_account");
        }
        if (i <= 6) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS plus_profiles", new Object[0]));
            sQLiteDatabase.execSQL(d);
        }
        if (i == 7) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS plus_profiles", new Object[0]));
            sQLiteDatabase.execSQL(d);
        }
        if (i < 9) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", new Object[]{"offline_logs"}));
            sQLiteDatabase.execSQL(b);
        }
    }
}
