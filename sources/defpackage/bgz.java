package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: bgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bgz implements bhc {
    final /* synthetic */ Activity a;

    public bgz(Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
