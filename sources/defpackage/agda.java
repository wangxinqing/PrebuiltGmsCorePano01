package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agda implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public final List a = new CopyOnWriteArrayList();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private Boolean h;
    private volatile String i;
    private volatile Activity j;

    private final void a(Activity activity) {
        a(Boolean.valueOf(agjs.b(activity.getApplicationContext())), activity);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.c.incrementAndGet();
        this.j = null;
        for (agcy agcy : this.a) {
            if (agcy instanceof agco) {
                ((agco) agcy).a();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.g.incrementAndGet();
        this.j = null;
        for (agcy agcy : this.a) {
            if (agcy instanceof agcp) {
                ((agcp) agcy).a();
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.e.incrementAndGet();
        this.i = null;
        for (agcy agcy : this.a) {
            if (agcy instanceof agcq) {
                ((agcq) agcy).a(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.b.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (agcy agcy : this.a) {
            if (agcy instanceof agcr) {
                ((agcr) agcy).b(activity);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (agcy agcy : this.a) {
            if (agcy instanceof agcs) {
                ((agcs) agcy).a();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (agcy agcy : this.a) {
            if (agcy instanceof agct) {
                ((agct) agcy).a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.f.incrementAndGet();
        this.j = activity;
        for (agcy agcy : this.a) {
            if (agcy instanceof agcu) {
                ((agcu) agcy).a();
            }
        }
        a(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        for (agcy agcy : this.a) {
            if (agcy instanceof agcx) {
                ((agcx) agcy).a();
            }
        }
        if (i2 >= 20 && this.j != null) {
            a(false, this.j);
        }
        this.j = null;
    }

    private final void a(Boolean bool, Activity activity) {
        if (bool.equals(this.h)) {
            ((anhn) ((anhn) agdb.a.d()).a("agda", "a", 245, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("App foreground state unchanged: inForeground ? %b", (Object) bool);
            return;
        }
        this.h = bool;
        if (bool.booleanValue()) {
            ((anhn) ((anhn) agdb.a.d()).a("agda", "a", 250, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("App transition to foreground");
            for (agcy agcy : this.a) {
                if (agcy instanceof agcw) {
                    ((agcw) agcy).a(activity);
                }
            }
            return;
        }
        ((anhn) ((anhn) agdb.a.d()).a("agda", "a", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("App transition to background");
        for (agcy agcy2 : this.a) {
            if (agcy2 instanceof agcv) {
                ((agcv) agcy2).b(activity);
            }
        }
    }
}
