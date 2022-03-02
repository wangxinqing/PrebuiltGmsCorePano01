package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: oni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oni extends jjj {
    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE suggestions(_id TEXT PRIMARY KEY,app_package_name TEXT,suggest_intent_query TEXT,date LONG,UNIQUE (app_package_name, suggest_intent_query) ON CONFLICT REPLACE);");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(94);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_SearchQueryHDb", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestions");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(92);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_SearchQueryHDb", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestions");
        onCreate(sQLiteDatabase);
    }

    public oni(Context context) {
        super(context, "search_query_history.db", "search_query_history.db", 1);
        new onh(context).start();
    }
}
