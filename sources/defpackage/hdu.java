package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;

/* renamed from: hdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdu extends bky {
    private ihh e;
    private njy f = null;

    protected hdu() {
        hem.a();
    }

    private final amky a(String str) {
        if (this.f == null) {
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
            bky.d.a(context, this);
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

    public final int delete(Uri uri, String str, String[] strArr) {
        int i;
        amky a = a("delete");
        try {
            ContentProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                i = 0;
            } else {
                i = a2.delete(uri, str, strArr);
            }
            if (a != null) {
                a.close();
            }
            return i;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2;
        amky a = a("insert");
        try {
            ContentProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                uri2 = null;
            } else {
                uri2 = a2.insert(uri, contentValues);
            }
            if (a != null) {
                a.close();
            }
            return uri2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ContentProvider contentProvider;
        ihh ihh = this.e;
        if (ihh != null) {
            ihh.a(configuration);
        }
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

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor;
        amky a = a("query");
        try {
            ContentProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                if (strArr == null) {
                    strArr = bky.a;
                }
                cursor = new MatrixCursor(strArr);
            } else {
                cursor = a2.query(uri, strArr, str, strArr2, str2);
            }
            if (a != null) {
                a.close();
            }
            return cursor;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        amky a = a("update");
        try {
            ContentProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                i = 0;
            } else {
                i = a2.update(uri, contentValues, str, strArr);
            }
            if (a != null) {
                a.close();
            }
            return i;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        ContentProvider contentProvider = (ContentProvider) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            ihh ihh = new ihh(context);
            this.e = ihh;
            context = ihh;
        }
        this.f = new njy(context, (Class) contentProvider.getClass(), 5);
        super.a(contentProvider, njw.a(context));
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Cursor cursor;
        amky a = a("queryWithSignal");
        try {
            ContentProvider a2 = a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                if (strArr == null) {
                    strArr = bky.a;
                }
                cursor = new MatrixCursor(strArr);
            } else {
                cursor = a2.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
            if (a != null) {
                a.close();
            }
            return cursor;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
