package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: be  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class be implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        bf.a(activity, ac.ON_CREATE);
    }

    public final void onActivityPostResumed(Activity activity) {
        bf.a(activity, ac.ON_RESUME);
    }

    public final void onActivityPostStarted(Activity activity) {
        bf.a(activity, ac.ON_START);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        bf.a(activity, ac.ON_DESTROY);
    }

    public final void onActivityPrePaused(Activity activity) {
        bf.a(activity, ac.ON_PAUSE);
    }

    public final void onActivityPreStopped(Activity activity) {
        bf.a(activity, ac.ON_STOP);
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
