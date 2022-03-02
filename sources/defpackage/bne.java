package defpackage;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.SliceProvider;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bne extends SliceProvider implements SliceProvider.ProxyCallbacks, bou, bku {
    public static final bnd d = new bnd();
    public final String a;
    public com.google.android.chimera.SliceProvider b = null;
    public boolean c = false;
    private final anax e;
    private ProviderInfo f = null;

    public bne(String str) {
        this.a = str;
        this.e = anfv.a;
    }

    public final synchronized com.google.android.chimera.SliceProvider a() {
        com.google.android.chimera.SliceProvider sliceProvider;
        sliceProvider = this.b;
        if (sliceProvider == null) {
            b();
            sliceProvider = this.b;
        }
        return sliceProvider;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.applyBatch(arrayList);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new OperationApplicationException("Provider proxy missing implementation");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f = providerInfo;
        super.attachInfo(context, providerInfo);
        bkv.a(context).a((bku) this);
    }

    /* access modifiers changed from: protected */
    public void b() {
        throw null;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.bulkInsert(uri, contentValuesArr);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.call(str, str2, bundle);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final Uri canonicalize(Uri uri) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.canonicalize(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        com.google.android.chimera.SliceProvider a2;
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
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.getStreamTypes(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean isTemporary() {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.publicIsTemporary();
        }
        return super.isTemporary();
    }

    public Slice onBindSlice(Uri uri, Set set) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                return a2.onBindSlice(uri, set);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } else {
            throw new IllegalStateException("ChimeraSlicePrvdrProxy: Provider proxy missing implementation");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.b;
        }
        if (sliceProvider != null) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(sliceProvider.getContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            sliceProvider.onConfigurationChanged(configuration);
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public PendingIntent onCreatePermissionRequest(Uri uri) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.onCreatePermissionRequest(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return super.onCreatePermissionRequest(uri);
    }

    public Collection onGetSliceDescendants(Uri uri) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.onGetSliceDescendants(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return Collections.emptyList();
    }

    public final void onLowMemory() {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.b;
        }
        if (sliceProvider != null) {
            sliceProvider.onLowMemory();
        }
    }

    public Uri onMapIntentToUri(Intent intent) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.onMapIntentToUri(intent);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return super.onMapIntentToUri(intent);
    }

    public void onSlicePinned(Uri uri) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            a2.onSlicePinned(uri);
        } else {
            Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        }
    }

    public void onSliceUnpinned(Uri uri) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            a2.onSliceUnpinned(uri);
        } else {
            Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        }
    }

    public final void onTrimMemory(int i) {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.b;
        }
        if (sliceProvider != null) {
            sliceProvider.onTrimMemory(i);
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openAssetFile(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openFile(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openTypedAssetFile(uri, str, bundle);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final void shutdown() {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.b;
            if (sliceProvider != null) {
                this.b = null;
            }
        }
        if (sliceProvider != null) {
            sliceProvider.shutdown();
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

    public final Slice superOnBindSlice(Uri uri, Set set) {
        return super.onBindSlice(uri, set);
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final PendingIntent superOnCreatePermissionRequest(Uri uri) {
        return super.onCreatePermissionRequest(uri);
    }

    public final Collection superOnGetSliceDescendants(Uri uri) {
        return super.onGetSliceDescendants(uri);
    }

    public final Uri superOnMapIntentToUri(Intent intent) {
        return super.onMapIntentToUri(intent);
    }

    public final void superOnSlicePinned(Uri uri) {
        super.onSlicePinned(uri);
    }

    public final void superOnSliceUnpinned(Uri uri) {
        super.onSliceUnpinned(uri);
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
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.uncanonicalize(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final synchronized void a(com.google.android.chimera.SliceProvider sliceProvider, Context context) {
        this.b = sliceProvider;
        sliceProvider.setProxy(this);
        amtf.a((Object) this.f, "attachInfo() has not been called", new Object[0]);
        sliceProvider.attachInfo(context, this.f);
        this.f = null;
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

    public bne(String str, String... strArr) {
        super(strArr);
        this.a = str;
        this.e = anax.a((Object[]) strArr);
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openAssetFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a2 = a();
        if (a2 != null) {
            return a2.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r0 >= r6.f()) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r5.e.contains(r6.a(r0)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0007, code lost:
        r6 = r6.f().d(defpackage.brt.a(r6.f().F(), getClass().getName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r6 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r6.f() != r5.e.size()) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.boz r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.chimera.SliceProvider r0 = r5.b     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 != 0) goto L_0x004a
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            apxg r0 = r6.f()
            apxg r6 = r6.f()
            java.lang.String r6 = r6.F()
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = defpackage.brt.a((java.lang.String) r6, (java.lang.String) r2)
            bsc r6 = r0.d((java.lang.String) r6)
            if (r6 == 0) goto L_0x0049
            int r0 = r6.f()
            anax r2 = r5.e
            int r2 = r2.size()
            r3 = 1
            if (r0 != r2) goto L_0x0048
            r0 = 0
        L_0x0033:
            int r2 = r6.f()
            if (r0 >= r2) goto L_0x0049
            anax r2 = r5.e
            java.lang.String r4 = r6.a(r0)
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0048
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0048:
            return r3
        L_0x0049:
            return r1
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            return r1
        L_0x004c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004f:
            throw r6
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bne.a(boz):boolean");
    }
}
