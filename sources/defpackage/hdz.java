package defpackage;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.SliceProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: hdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdz extends bne {
    private ihh e;
    private njy f = null;

    public hdz(String str) {
        super(str);
        hem.a();
    }

    private final amky a(String str) {
        if (this.f == null && axda.e()) {
            a();
        }
        if (axda.c()) {
            return njy.a(this.f, str, Binder.getCallingUid());
        }
        return njy.a(this.f, str);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!ihs.b().getInSafeBoot()) {
            Context context = getContext();
            amtf.a((Object) context);
            bne.d.a(context, this, this.a);
        }
    }

    public final boolean c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, name), 128);
            if (!(providerInfo.metaData == null || (string = providerInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
                hem a = hem.a();
                StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
                sb.append(string);
                sb.append(" ");
                sb.append(name);
                a.a(context, 82, sb.toString());
                hey.a();
                hey.a(context, string);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public final void d() {
        hey.a(true);
    }

    public final Slice onBindSlice(Uri uri, Set set) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        amky a = a("onBindSlice");
        try {
            SliceProvider a2 = a();
            if (a2 != null) {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                Slice onBindSlice = a2.onBindSlice(uri, set);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a != null) {
                    a.close();
                }
                return onBindSlice;
            }
            throw new IllegalStateException("ChimeraSlicePrvdrProxy: Provider proxy missing implementation");
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        SliceProvider sliceProvider;
        ihh ihh = this.e;
        if (ihh != null) {
            ihh.a(configuration);
        }
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

    public final PendingIntent onCreatePermissionRequest(Uri uri) {
        amky a = a("onCreatePermissionRequest");
        try {
            PendingIntent onCreatePermissionRequest = super.onCreatePermissionRequest(uri);
            if (a != null) {
                a.close();
            }
            return onCreatePermissionRequest;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Collection onGetSliceDescendants(Uri uri) {
        Collection collection;
        amky a = a("onGetSliceDescendants");
        try {
            SliceProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
                collection = Collections.emptyList();
            } else {
                collection = a2.onGetSliceDescendants(uri);
            }
            if (a != null) {
                a.close();
            }
            return collection;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Uri onMapIntentToUri(Intent intent) {
        amky a = a("onMapIntentToUri");
        try {
            Uri onMapIntentToUri = super.onMapIntentToUri(intent);
            if (a != null) {
                a.close();
            }
            return onMapIntentToUri;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onSlicePinned(Uri uri) {
        amky a = a("onSlicePinned");
        try {
            SliceProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
            } else {
                a2.onSlicePinned(uri);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onSliceUnpinned(Uri uri) {
        amky a = a("onSliceUnpinned");
        try {
            SliceProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
            } else {
                a2.onSliceUnpinned(uri);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public hdz(String str, String... strArr) {
        super(str, strArr);
        hem.a();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        njy njy;
        SliceProvider sliceProvider = (SliceProvider) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            ihh ihh = new ihh(context);
            this.e = ihh;
            context = ihh;
        }
        if (axda.e()) {
            njy = new njy(context, (Class) sliceProvider.getClass(), 22);
        } else {
            njy = null;
        }
        this.f = njy;
        super.a(sliceProvider, njw.a(context));
    }
}
