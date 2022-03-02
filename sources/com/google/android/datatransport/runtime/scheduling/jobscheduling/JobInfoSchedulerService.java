package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JobInfoSchedulerService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        cmn.a(getApplicationContext());
        cml d = cmm.d();
        d.a(string);
        d.a(cpu.a(i));
        if (string2 != null) {
            d.a = Base64.decode(string2, 0);
        }
        cmn.a().a.a(d.a(), i2, new cnn(this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
