package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: bf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bf extends Fragment {
    public static final /* synthetic */ int b = 0;
    public az a;

    private final void a(ac acVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), acVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(ac.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(ac.ON_DESTROY);
        this.a = null;
    }

    public final void onPause() {
        super.onPause();
        a(ac.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        az azVar = this.a;
        if (azVar != null) {
            azVar.a.b();
        }
        a(ac.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        az azVar = this.a;
        if (azVar != null) {
            azVar.a.a();
        }
        a(ac.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(ac.ON_STOP);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new be());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bf(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void a(Activity activity, ac acVar) {
        if (activity instanceof am) {
            ((am) activity).a().a(acVar);
        } else if (activity instanceof aj) {
            ae lifecycle = ((aj) activity).getLifecycle();
            if (lifecycle instanceof al) {
                ((al) lifecycle).a(acVar);
            }
        }
    }
}
