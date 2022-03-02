package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraAnalyticsTaskService extends qwf implements dpu {
    private dpv a;

    private final dpv b() {
        if (this.a == null) {
            this.a = new dpv(this);
        }
        return this.a;
    }

    public final int a(qxz qxz) {
        char c;
        String str = qxz.a;
        if (str.hashCode() == 563533826 && str.equals("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        dpk a2 = dmd.a((Context) this).a();
        a2.b("Device ChimeraAnalyticsTaskService called.");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (atomicBoolean) {
            b().a((Runnable) new dkf(a2, atomicBoolean));
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 30000 + currentTimeMillis;
                while (!atomicBoolean.get() && currentTimeMillis < j) {
                    atomicBoolean.wait(j - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            } catch (InterruptedException e) {
                a2.d("Interrupted while uploading from task", e);
                return 0;
            }
        }
        return 0;
    }

    public final void onCreate() {
        super.onCreate();
        b().a();
    }

    public final void onDestroy() {
        b().b();
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }
}
