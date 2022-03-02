package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: bb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bb extends y {
    final /* synthetic */ bc a;

    public bb(bc bcVar) {
        this.a = bcVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = bf.b;
            ((bf) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }

    public final void onActivityPaused(Activity activity) {
        bc bcVar = this.a;
        int i = bcVar.b - 1;
        bcVar.b = i;
        if (i == 0) {
            bcVar.d.postDelayed(bcVar.f, 700);
        }
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new ba(this));
    }

    public final void onActivityStopped(Activity activity) {
        bc bcVar = this.a;
        bcVar.a--;
        bcVar.c();
    }
}
