package com.google.android.chimera;

import android.content.ComponentCallbacks;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ContentProvider implements ComponentCallbacks, bnu {
    private android.content.ContentProvider Di;
    private ProxyCallbacks Dj;
    private Context c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks {
        ContentProviderResult[] superApplyBatch(ArrayList arrayList);

        int superBulkInsert(Uri uri, ContentValues[] contentValuesArr);

        Bundle superCall(String str, String str2, Bundle bundle);

        Uri superCanonicalize(Uri uri);

        void superDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        String[] superGetStreamTypes(Uri uri, String str);

        boolean superIsTemporary();

        void superOnConfigurationChanged(Configuration configuration);

        AssetFileDescriptor superOpenAssetFile(Uri uri, String str);

        AssetFileDescriptor superOpenAssetFile(Uri uri, String str, CancellationSignal cancellationSignal);

        ParcelFileDescriptor superOpenFile(Uri uri, String str);

        ParcelFileDescriptor superOpenFile(Uri uri, String str, CancellationSignal cancellationSignal);

        ParcelFileDescriptor superOpenFileHelper(Uri uri, String str);

        AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle);

        AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal);

        Cursor superQuery(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal);

        Cursor superQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void superSetPathPermissions(PathPermission[] pathPermissionArr);

        void superSetReadPermission(String str);

        void superSetWritePermission(String str);

        void superShutdown();

        Uri superUncanonicalize(Uri uri);
    }

    public static ContentProvider getLocalContentProvider(ContentProviderClient contentProviderClient) {
        android.content.ContentProvider localContentProvider = contentProviderClient.getLocalContentProvider();
        if (localContentProvider instanceof bky) {
            return ((bky) localContentProvider).a();
        }
        return null;
    }

    public ContentProviderResult[] applyBatch(ArrayList arrayList) {
        return this.Dj.superApplyBatch(arrayList);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (this.c == null) {
            this.c = context;
            onCreate();
        }
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return this.Dj.superBulkInsert(uri, contentValuesArr);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        return this.Dj.superCall(str, str2, bundle);
    }

    public Uri canonicalize(Uri uri) {
        return this.Dj.superCanonicalize(uri);
    }

    public abstract int delete(Uri uri, String str, String[] strArr);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.Dj.superDump(fileDescriptor, printWriter, strArr);
    }

    public final String getCallingPackage() {
        return this.Di.getCallingPackage();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.content.ContentProvider getContainerContentProvider() {
        return this.Di;
    }

    public final Context getContext() {
        return this.c;
    }

    public final PathPermission[] getPathPermissions() {
        return this.Di.getPathPermissions();
    }

    public final String getReadPermission() {
        return this.Di.getReadPermission();
    }

    public String[] getStreamTypes(Uri uri, String str) {
        return this.Dj.superGetStreamTypes(uri, str);
    }

    public abstract String getType(Uri uri);

    public final String getWritePermission() {
        return this.Di.getWritePermission();
    }

    public abstract Uri insert(Uri uri, ContentValues contentValues);

    /* access modifiers changed from: protected */
    public boolean isTemporary() {
        return this.Dj.superIsTemporary();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.Dj.superOnConfigurationChanged(configuration);
    }

    public abstract boolean onCreate();

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        return this.Dj.superOpenAssetFile(uri, str);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return this.Dj.superOpenFile(uri, str);
    }

    /* access modifiers changed from: protected */
    public final ParcelFileDescriptor openFileHelper(Uri uri, String str) {
        return this.Dj.superOpenFileHelper(uri, str);
    }

    public ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, Object obj, ContentProvider.PipeDataWriter pipeDataWriter) {
        return this.Di.openPipeHelper(uri, str, bundle, obj, pipeDataWriter);
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return this.Dj.superOpenTypedAssetFile(uri, str, bundle);
    }

    public boolean publicIsTemporary() {
        return isTemporary();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.Dj.superQuery(uri, strArr, bundle, cancellationSignal);
    }

    public abstract Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* access modifiers changed from: protected */
    public final void setPathPermissions(PathPermission[] pathPermissionArr) {
        this.Dj.superSetPathPermissions(pathPermissionArr);
    }

    public void setProxy(android.content.ContentProvider contentProvider) {
        this.Di = contentProvider;
        this.Dj = (ProxyCallbacks) contentProvider;
    }

    /* access modifiers changed from: protected */
    public final void setReadPermission(String str) {
        this.Dj.superSetReadPermission(str);
    }

    /* access modifiers changed from: protected */
    public final void setWritePermission(String str) {
        this.Dj.superSetWritePermission(str);
    }

    public void shutdown() {
        this.Dj.superShutdown();
    }

    public Uri uncanonicalize(Uri uri) {
        return this.Dj.superUncanonicalize(uri);
    }

    public abstract int update(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.Dj.superOpenAssetFile(uri, str, cancellationSignal);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.Dj.superOpenFile(uri, str, cancellationSignal);
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.Dj.superOpenTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.Dj.superQuery(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
