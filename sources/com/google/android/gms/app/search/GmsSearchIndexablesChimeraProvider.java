package com.google.android.gms.app.search;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsSearchIndexablesChimeraProvider extends ContentProvider {
    final drf a = new drf();

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.a.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return this.a.delete(uri, str, strArr);
    }

    public final String getType(Uri uri) {
        return this.a.getType(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return this.a.insert(uri, contentValues);
    }

    public final boolean onCreate() {
        this.a.onCreate();
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.a.query(uri, strArr, str, strArr2, str2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.update(uri, contentValues, str, strArr);
    }
}
