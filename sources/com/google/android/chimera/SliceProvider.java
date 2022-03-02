package com.google.android.chimera;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Collection;
import java.util.Set;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class SliceProvider extends ContentProvider {
    private android.app.slice.SliceProvider a;
    private ProxyCallbacks b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks extends ContentProvider.ProxyCallbacks {
        Slice superOnBindSlice(Uri uri, Set set);

        PendingIntent superOnCreatePermissionRequest(Uri uri);

        Collection superOnGetSliceDescendants(Uri uri);

        Uri superOnMapIntentToUri(Intent intent);

        void superOnSlicePinned(Uri uri);

        void superOnSliceUnpinned(Uri uri);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        return this.b.superCall(str, str2, bundle);
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

    public Slice onBindSlice(Uri uri, Set set) {
        return this.b.superOnBindSlice(uri, set);
    }

    public PendingIntent onCreatePermissionRequest(Uri uri) {
        return this.b.superOnCreatePermissionRequest(uri);
    }

    public Collection onGetSliceDescendants(Uri uri) {
        return this.b.superOnGetSliceDescendants(uri);
    }

    public Uri onMapIntentToUri(Intent intent) {
        return this.b.superOnMapIntentToUri(intent);
    }

    public void onSlicePinned(Uri uri) {
        this.b.superOnSlicePinned(uri);
    }

    public void onSliceUnpinned(Uri uri) {
        this.b.superOnSliceUnpinned(uri);
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.a.query(uri, strArr, bundle, cancellationSignal);
    }

    public void setProxy(android.content.ContentProvider contentProvider) {
        this.a = (android.app.slice.SliceProvider) contentProvider;
        this.b = (ProxyCallbacks) contentProvider;
        super.setProxy(contentProvider);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.update(uri, contentValues, str, strArr);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.a.query(uri, strArr, str, strArr2, str2);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.a.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
