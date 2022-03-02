package com.google.android.gms.drive.metadata.sync.syncadapter;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StubChimeraContentProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
