package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppMeasurementService extends Service implements syi {
    private syj a;

    private final syj a() {
        if (this.a == null) {
            this.a = new syj(this);
        }
        return this.a;
    }

    public final IBinder onBind(Intent intent) {
        return a().a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        a().a(intent, i2);
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        a().c(intent);
        return true;
    }

    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        ks.a(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }
}
