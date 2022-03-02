package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: bhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bhd implements Application.ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference b;
    private boolean c = false;

    public bhd(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference(activityLifecycleCallbacks);
        this.a = application;
    }

    /* access modifiers changed from: protected */
    public final void a(bhc bhc) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                bhc.a(activityLifecycleCallbacks);
            } else if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception e) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new bgv(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new bhb(activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new bgy(activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new bgx(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new bha(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new bgw(activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new bgz(activity));
    }
}
