package com.google.android.gms.common.download.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadsChimeraProvider extends iyh {
    private static final Map b = new HashMap(13);
    private static final UriMatcher c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.download", "download", 100);
        c.addURI("com.google.android.gms.download", "download/*", 101);
        String[] strArr = {"_id", "filename", "url", "sizeBytes", "sha1", "destination", "minVersion", "maxVersion", "notificationTitle", "notificationDescription", "enabled", "retries", "dm_id"};
        for (int i = 0; i < 13; i++) {
            String str = strArr[i];
            Map map = b;
            String valueOf = String.valueOf(str);
            map.put(str, valueOf.length() == 0 ? new String("downloads.") : "downloads.".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = c.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "filename=?";
            }
            return sQLiteDatabase.update("downloads", contentValues, str, strArr);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final AssetFileDescriptor a(Uri uri, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "downloads.db";
    }

    public final String getType(Uri uri) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ SQLiteOpenHelper c() {
        Context context = getContext();
        if (iqd.a == null) {
            synchronized (iqd.b) {
                if (iqd.a == null) {
                    iqd.a = new iqd(context, "downloads.db");
                }
            }
        }
        return iqd.a;
    }

    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        int match = c.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "filename=?";
            }
            return sQLiteDatabase.delete("downloads", str, strArr);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Cursor a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        String str3;
        int match = c.match(uri);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setStrict(true);
        if (match == 100 || match == 101) {
            if (match == 101) {
                str3 = "filename=?";
                strArr3 = new String[]{uri.getLastPathSegment()};
            } else {
                str3 = str;
                strArr3 = strArr2;
            }
            sQLiteQueryBuilder.setTables("downloads");
            sQLiteQueryBuilder.setProjectionMap(b);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str3, strArr3, (String) null, (String) null, str2);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final Uri a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        if (c.match(uri) != 100) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid Uri: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (sQLiteDatabase.insert("downloads", (String) null, contentValues) != -1) {
            return Uri.withAppendedPath(uri, contentValues.getAsString("filename"));
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        getContext().getContentResolver().notifyChange(iqf.a, (ContentObserver) null, true);
    }
}
