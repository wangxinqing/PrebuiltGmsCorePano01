package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: acur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acur extends jjj {
    public static final Uri a = Uri.parse("content://com.google.android.gms.subscribedfeeds/feeds/");

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS feeds (_id INTEGER PRIMARY KEY,_sync_account TEXT,_sync_account_type TEXT,_sync_id TEXT,_sync_time TEXT,_sync_version TEXT,_sync_local_id INTEGER,_sync_dirty INTEGER,_sync_mark INTEGER,feed TEXT,authority TEXT,service TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS _deleted_feeds (_sync_version TEXT,_sync_id TEXT,_sync_account TEXT,_sync_account_type TEXT,_sync_mark INTEGER, UNIQUE(_sync_id))");
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS feed_cleanup DELETE ON feeds WHEN old._sync_id is not null BEGIN INSERT INTO _deleted_feeds (_sync_id, _sync_account, _sync_account_type, _sync_version) VALUES (old._sync_id, old._sync_account, old._sync_account_type, old._sync_version);END");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS feed_cleanup");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS _deleted_feeds");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS feeds");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
        ContentResolver.requestSync((Account) null, acun.b(), Bundle.EMPTY);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(93);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("GmsSubscribedFeeds", sb.toString());
        d(sQLiteDatabase);
        c(sQLiteDatabase);
        ContentResolver.requestSync((Account) null, acun.b(), Bundle.EMPTY);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(91);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("GmsSubscribedFeeds", sb.toString());
        d(sQLiteDatabase);
        c(sQLiteDatabase);
        ContentResolver.requestSync((Account) null, acun.b(), Bundle.EMPTY);
    }

    public acur(Context context, String str) {
        super(context, str, str, 11);
    }
}
