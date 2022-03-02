package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.setup.ui.AppInstallTrackerFragment$2;

/* renamed from: ackp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackp extends acmk {
    public acko a;
    public String b;
    public Runnable c;
    private Handler d;
    private BroadcastReceiver e;

    public final void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.c = null;
        }
    }

    public final void b() {
        Activity activity = getActivity();
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver != null && activity != null) {
            activity.unregisterReceiver(broadcastReceiver);
            this.e = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.a = (acko) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implement AppInstallTrackerFragment.Listener", e2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = new qvr(Looper.getMainLooper());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("smartdevice.appPackage") : null;
        amrl.a((Object) string);
        this.b = string;
    }

    public final void onPause() {
        a();
        b();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (new acpn(activity).a(this.b)) {
            this.a.a();
            return;
        }
        ackn ackn = new ackn(this);
        AppInstallTrackerFragment$2 appInstallTrackerFragment$2 = new AppInstallTrackerFragment$2(this, "smartdevice");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        this.c = ackn;
        this.e = appInstallTrackerFragment$2;
        activity.registerReceiver(appInstallTrackerFragment$2, intentFilter);
        this.d.postDelayed(ackn, 120000);
    }
}
