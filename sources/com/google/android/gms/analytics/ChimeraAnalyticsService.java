package com.google.android.gms.analytics;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChimeraAnalyticsService extends Service implements dpu {
    private dpv a;

    private final dpv a() {
        if (this.a == null) {
            this.a = new dpv(this);
        }
        return this.a;
    }

    public final IBinder onBind(Intent intent) {
        a();
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        dpv a2 = a();
        try {
            synchronized (dpr.a) {
                acrz acrz = dpr.b;
                if (acrz != null && acrz.e()) {
                    acrz.c();
                }
            }
        } catch (SecurityException e) {
        }
        dpk a3 = dmd.a(a2.b).a();
        if (intent == null) {
            a3.d("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a3.a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return 2;
        }
        a2.a((Runnable) new dps(a2, i2, a3));
        return 2;
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }
}
