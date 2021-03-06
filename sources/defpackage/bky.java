package defpackage;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: bky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bky extends ContentProvider implements ContentProvider.ProxyCallbacks, bou {
    public static final String[] a = new String[0];
    public static final bkx d = new bkx();
    public com.google.android.chimera.ContentProvider b = null;
    public boolean c = false;
    private ProviderInfo e = null;

    public final synchronized com.google.android.chimera.ContentProvider a() {
        com.google.android.chimera.ContentProvider contentProvider;
        contentProvider = this.b;
        if (contentProvider == null) {
            b();
            contentProvider = this.b;
        }
        return contentProvider;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.applyBatch(arrayList);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new OperationApplicationException("Provider proxy missing implementation");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.e = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    /* access modifiers changed from: protected */
    public void b() {
        throw null;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.bulkInsert(uri, contentValuesArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                return a2.call(str, str2, bundle);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } else {
            Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
            return null;
        }
    }

    public final Uri canonicalize(Uri uri) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.canonicalize(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.delete(uri, str, strArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        com.google.android.chimera.ContentProvider a2;
        synchronized (this) {
            try {
                this.c = true;
                a2 = a();
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        if (a2 != null) {
            a2.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.getStreamTypes(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final String getType(Uri uri) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.getType(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.insert(uri, contentValues);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean isTemporary() {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.publicIsTemporary();
        }
        return super.isTemporary();
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.b;
        }
        if (contentProvider != null) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(contentProvider.getContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            contentProvider.onConfigurationChanged(configuration);
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public final void onLowMemory() {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.b;
        }
        if (contentProvider != null) {
            contentProvider.onLowMemory();
        }
    }

    public final void onTrimMemory(int i) {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.b;
        }
        if (contentProvider != null) {
            contentProvider.onTrimMemory(i);
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openAssetFile(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openFile(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openTypedAssetFile(uri, str, bundle);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.query(uri, strArr, bundle, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = a;
        }
        return new MatrixCursor(strArr);
    }

    public final void shutdown() {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.b;
            if (contentProvider != null) {
                this.b = null;
            }
        }
        if (contentProvider != null) {
            contentProvider.shutdown();
        }
    }

    public final ContentProviderResult[] superApplyBatch(ArrayList arrayList) {
        return super.applyBatch(arrayList);
    }

    public final int superBulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return super.bulkInsert(uri, contentValuesArr);
    }

    public final Bundle superCall(String str, String str2, Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    public final Uri superCanonicalize(Uri uri) {
        return super.canonicalize(uri);
    }

    public final void superDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public final String[] superGetStreamTypes(Uri uri, String str) {
        return super.getStreamTypes(uri, str);
    }

    public final boolean superIsTemporary() {
        return super.isTemporary();
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final AssetFileDescriptor superOpenAssetFile(Uri uri, String str) {
        return super.openAssetFile(uri, str);
    }

    public final ParcelFileDescriptor superOpenFile(Uri uri, String str) {
        return super.openFile(uri, str);
    }

    public final ParcelFileDescriptor superOpenFileHelper(Uri uri, String str) {
        return super.openFileHelper(uri, str);
    }

    public final AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return super.openTypedAssetFile(uri, str, bundle);
    }

    public final Cursor superQuery(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    public final void superSetPathPermissions(PathPermission[] pathPermissionArr) {
        super.setPathPermissions(pathPermissionArr);
    }

    public final void superSetReadPermission(String str) {
        super.setReadPermission(str);
    }

    public final void superSetWritePermission(String str) {
        super.setWritePermission(str);
    }

    public final void superShutdown() {
        super.shutdown();
    }

    public final Uri superUncanonicalize(Uri uri) {
        return super.uncanonicalize(uri);
    }

    public final Uri uncanonicalize(Uri uri) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.uncanonicalize(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.update(uri, contentValues, str, strArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final synchronized void a(com.google.android.chimera.ContentProvider contentProvider, Context context) {
        this.b = contentProvider;
        contentProvider.setProxy(this);
        amtf.a((Object) this.e, "attachInfo() has not been called", new Object[0]);
        contentProvider.attachInfo(context, this.e);
        this.e = null;
    }

    public final AssetFileDescriptor superOpenAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openAssetFile(uri, str, cancellationSignal);
    }

    public final ParcelFileDescriptor superOpenFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openFile(uri, str, cancellationSignal);
    }

    public final AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    public final Cursor superQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openAssetFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.query(uri, strArr, str, strArr2, str2);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = a;
        }
        return new MatrixCursor(strArr);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a2 = a();
        if (a2 != null) {
            return a2.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = a;
        }
        return new MatrixCursor(strArr);
    }
}
