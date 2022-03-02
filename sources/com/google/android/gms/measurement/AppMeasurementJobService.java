package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppMeasurementJobService extends JobService implements syi {
    private syj a;

    private final syj a() {
        if (this.a == null) {
            this.a = new syj(this);
        }
        return this.a;
    }

    public final void a(Intent intent) {
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

    public final boolean onStartJob(JobParameters jobParameters) {
        syj a2 = a();
        svv a3 = svv.a(a2.a);
        sut E = a3.E();
        String string = jobParameters.getExtras().getString("action");
        if (a3.f.a) {
            E.k.a("Device PackageMeasurementJobService called. action", string);
        } else {
            E.k.a("Local AppMeasurementJobService called. action", string);
        }
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a2.a((Runnable) new syg(a2, E, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        a().c(intent);
        return true;
    }

    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }
}
