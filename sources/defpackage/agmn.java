package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

/* renamed from: agmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agmn implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ agmp b;

    public agmn(agmp agmp, Application application) {
        this.b = agmp;
        this.a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        agmk agmk;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b.i.b != null) {
            agmk = this.b.j;
        } else {
            agmk = this.b.i;
        }
        agmk.a = activity.getClass().getSimpleName();
        agmk.b = Long.valueOf(elapsedRealtime);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        agmk agmk = this.b.j.b != null ? this.b.j : this.b.i;
        if (agmk.d == null) {
            agmk.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new agmm(this, findViewById));
        } catch (RuntimeException e) {
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        agmk agmk = this.b.j.b != null ? this.b.j : this.b.i;
        if (agmk.c == null) {
            agmk.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
