package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: bgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bgx implements bhc {
    final /* synthetic */ Activity a;

    public bgx(Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
