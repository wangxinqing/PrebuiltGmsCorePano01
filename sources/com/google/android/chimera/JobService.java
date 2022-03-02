package com.google.android.chimera;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class JobService extends Service {
    public static final String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
    private bjk a;

    public final void jobFinished(JobParameters jobParameters, boolean z) {
        this.a.jobFinished(jobParameters, z);
    }

    public final IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public abstract boolean onStartJob(JobParameters jobParameters);

    public abstract boolean onStopJob(JobParameters jobParameters);

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjk bjk = new bjk(this);
        this.a = bjk;
        bjk.attachBaseContext(context);
    }
}
