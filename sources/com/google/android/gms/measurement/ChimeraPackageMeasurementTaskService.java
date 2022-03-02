package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraPackageMeasurementTaskService extends qwf implements syi {
    private syj a;

    private final syj b() {
        if (this.a == null) {
            this.a = new syj(this);
        }
        return this.a;
    }

    public final int a(qxz qxz) {
        char c;
        String str = qxz.a;
        if (str.hashCode() == 1395561816 && str.equals("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        svv a2 = svv.a((Context) this);
        sut E = a2.E();
        if (a2.f.a) {
            E.k.a("Device ChimeraPackageMeasurementTaskService called.");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            synchronized (atomicBoolean) {
                b().a((Runnable) new som(a2, E, atomicBoolean));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = 30000 + currentTimeMillis;
                    while (!atomicBoolean.get() && currentTimeMillis < j) {
                        atomicBoolean.wait(j - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                } catch (InterruptedException e) {
                    E.f.a("Interrupted in onRunTask while uploading");
                    return 0;
                }
            }
            return 0;
        }
        E.c.a("TaskService called on client side.");
        return 2;
    }

    public final void onCreate() {
        super.onCreate();
        b().a();
    }

    public final void onDestroy() {
        b().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        b().b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        b().c(intent);
        return super.onUnbind(intent);
    }

    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }
}
