package com.google.android.gms.scheduler;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.chimera.JobService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TaskExecutionChimeraService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        aadl aadl = aabg.a().b;
        if (aadl == null) {
            Log.w("NetworkScheduler", String.format("Dropping incoming job (jid=%d) because JobServiceRegistry is null", new Object[]{Integer.valueOf(jobParameters.getJobId())}));
            return false;
        }
        aadl.e.execute(new aadg(aadl, this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        aadl aadl = aabg.a().b;
        if (aadl == null) {
            return false;
        }
        aadl.e.execute(new aadh(aadl, jobParameters));
        return true;
    }
}
