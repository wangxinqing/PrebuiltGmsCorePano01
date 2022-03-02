package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: uhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uhh implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ uhi a;
    private final WeakReference b;

    public uhh(uhi uhi, WeakReference weakReference) {
        this.a = uhi;
        this.b = weakReference;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (activity == this.b.get()) {
            uhi uhi = this.a;
            uhi.b = true;
            uhi.a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.b.get()) {
            uhi uhi = this.a;
            uhi.b = false;
            uhi.a();
        }
    }
}
