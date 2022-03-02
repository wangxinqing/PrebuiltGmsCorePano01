package com.google.android.gms.analytics.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraAnalyticsService extends Service {
    public dmd a;
    public dpq b;

    public final dpk a() {
        return this.a.a();
    }

    public final dly b() {
        return this.a.c();
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            a().a("onBind called. action", action);
            if ("com.google.android.gms.analytics.service.START".equals(action)) {
                return new dpe(this);
            }
            return null;
        }
        a().e("onBind called with null intent");
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.b = dpq.a(this);
        this.a = dmd.a((Context) this);
        a().b("AnalyticsService created");
    }

    public final void onDestroy() {
        a().b("AnalyticsService destroyed");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        if (intent != null) {
            a().a("onRebind called. action", intent.getAction());
            return;
        }
        a().e("onRebind called with null intent");
    }

    public final boolean onUnbind(Intent intent) {
        if (intent != null) {
            a().a("onUnbind called for intent. action", intent.getAction());
            return true;
        }
        a().e("onUnbind called with null intent");
        return true;
    }
}
