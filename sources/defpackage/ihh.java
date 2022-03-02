package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.lang.ref.WeakReference;

/* renamed from: ihh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihh extends ContextThemeWrapper {
    private final BaseApplicationContext a;
    private final Resources b;
    private Resources c;
    private WeakReference d;

    public ihh(Context context) {
        this(context, context.getResources());
    }

    public final synchronized void a(Configuration configuration) {
        if (this.c != null) {
            getResources().updateConfiguration(configuration, this.c.getDisplayMetrics());
        }
    }

    public final Context createCredentialProtectedStorageContext() {
        return new ihh(super.createCredentialProtectedStorageContext(), this.b);
    }

    public final Context createDeviceProtectedStorageContext() {
        return new ihh(super.createDeviceProtectedStorageContext(), this.b);
    }

    public final Context createDisplayContext(Display display) {
        return new ihh(super.createDisplayContext(display), this.b);
    }

    public final Context createFeatureContext(String str) {
        return new ihh(super.createFeatureContext(str), this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = (android.content.res.AssetManager) r3.d.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.Resources getResources() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = defpackage.jkr.c()     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r1 = r3.c     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0023
            com.google.android.gms.common.app.BaseApplicationContext r1 = r3.a     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r2 = r3.b     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r1 = r1.getResourcesWithLanguageAssets(r2)     // Catch:{ all -> 0x0047 }
            r3.c = r1     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0043
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r1 = r3.c     // Catch:{ all -> 0x0047 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ all -> 0x0047 }
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            r3.d = r0     // Catch:{ all -> 0x0047 }
            goto L_0x0043
        L_0x0023:
            if (r0 == 0) goto L_0x0043
            java.lang.ref.WeakReference r0 = r3.d     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0047 }
            android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r1 = r3.c     // Catch:{ all -> 0x0047 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ all -> 0x0047 }
            if (r1 == r0) goto L_0x0043
            com.google.android.gms.common.app.BaseApplicationContext r0 = r3.a     // Catch:{ all -> 0x0047 }
            android.content.res.Resources r2 = r3.b     // Catch:{ all -> 0x0047 }
            android.content.res.Resources unused = r0.getResourcesWithLanguageAssets(r2)     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            r3.d = r0     // Catch:{ all -> 0x0047 }
        L_0x0043:
            android.content.res.Resources r0 = r3.c     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return r0
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihh.getResources():android.content.res.Resources");
    }

    public ihh(Context context, Resources resources) {
        super(context, (Resources.Theme) null);
        this.a = ihs.b();
        this.b = resources;
    }
}
