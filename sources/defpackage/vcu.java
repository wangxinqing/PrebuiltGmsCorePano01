package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: vcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vcu implements Application.ActivityLifecycleCallbacks {
    private final Activity a;
    private final vcv b;

    public vcu(Activity activity, vcv vcv) {
        this.a = activity;
        this.b = vcv;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.a) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.a) {
            try {
                this.b.b(1);
            } catch (RemoteException e) {
            }
        }
    }
}
