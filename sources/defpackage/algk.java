package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;

/* renamed from: algk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algk extends Fragment {
    private static final String a = algk.class.getSimpleName();
    private MetricKey b;
    private long c;
    private long d = 0;

    public algk() {
        setRetainInstance(true);
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager;
        if (alht.a(activity.getIntent())) {
            algp a2 = algp.a(activity.getApplicationContext());
            String a3 = algj.a(activity);
            Bundle bundle = new Bundle();
            bundle.putString("screenName", algj.a(activity));
            bundle.putString("intentAction", activity.getIntent().getAction());
            a2.a(a3, bundle);
            if (Build.VERSION.SDK_INT > 23 && (fragmentManager = activity.getFragmentManager()) != null && !fragmentManager.isDestroyed()) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
                if (findFragmentByTag == null) {
                    algk algk = new algk();
                    try {
                        fragmentManager.beginTransaction().add(algk, "lifecycle_monitor").commitNow();
                        findFragmentByTag = algk;
                    } catch (IllegalStateException e) {
                        String str = a;
                        String valueOf = String.valueOf(activity.getComponentName());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Error occurred when attach to Activity:");
                        sb.append(valueOf);
                        Log.e(str, sb.toString(), e);
                    }
                } else if (!(findFragmentByTag instanceof algk)) {
                    Log.wtf(a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
                    return;
                }
                algk algk2 = (algk) findFragmentByTag;
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b = MetricKey.a("ScreenDuration", getActivity());
    }

    public final void onDetach() {
        boolean z;
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.d);
        algm.a((Object) activity, "Context cannot be null.");
        algm.a((Object) metricKey, "Timer name cannot be null.");
        if (millis >= 0) {
            z = true;
        } else {
            z = false;
        }
        algm.a(z, "Duration cannot be negative.");
        algp a2 = algp.a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.a(metricKey));
        bundle.putLong("timeMillis", millis);
        a2.a(2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.d += System.nanoTime() - this.c;
    }

    public final void onResume() {
        super.onResume();
        this.c = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            algy.a(getActivity(), CustomEvent.a(MetricKey.a("ScreenActivity", getActivity()), persistableBundle));
        }
    }
}
