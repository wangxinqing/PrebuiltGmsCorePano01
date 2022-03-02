package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: fu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fu implements Application.ActivityLifecycleCallbacks {
    Object a;
    private Activity b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    public fu(Activity activity) {
        this.b = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.d = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.d && !this.e && !this.c && fv.a(this.a, activity)) {
            this.e = true;
            this.a = null;
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            this.c = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
