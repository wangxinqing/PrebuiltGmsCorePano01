package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChimeraAnalyticsReceiver extends BroadcastReceiver {
    private dpr b;

    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new dpr();
        }
        dpk a = dmd.a(context).a();
        if (intent == null) {
            a.d("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        a.a("Device AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = dpv.a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (dpr.a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (dpr.b == null) {
                            dpr.b = new acrz(context, "Analytics WakeLock");
                            dpr.b.a(false);
                        }
                        dpr.b.a(1000);
                    } catch (SecurityException e) {
                        a.d("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
