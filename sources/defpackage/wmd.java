package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.google.android.gms.R;
import java.io.InputStream;

/* renamed from: wmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmd implements ComponentCallbacks2 {
    private static wmd b;
    wlz a;
    private final Application c;

    public wmd(Application application) {
        this.c = application;
    }

    public static synchronized wmd a(Context context) {
        wmd wmd;
        synchronized (wmd.class) {
            if (b == null) {
                wmd wmd2 = new wmd((Application) context.getApplicationContext());
                b = wmd2;
                context.registerComponentCallbacks(wmd2);
            }
            wmd = b;
        }
        return wmd;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 5 || i == 10 || i == 15 || i == 60 || i == 80) {
            synchronized (this) {
                this.a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized wlz a() {
        if (this.a == null) {
            InputStream openRawResource = this.c.getResources().openRawResource(R.raw.third_party_account_categories);
            try {
                wlz wlz = (wlz) aucj.a((aucj) wlz.d, openRawResource, aubs.c());
                if (openRawResource != null) {
                    openRawResource.close();
                }
                this.a = wlz;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return this.a;
        throw th;
    }
}
