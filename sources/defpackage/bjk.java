package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;

/* renamed from: bjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjk extends JobService {
    final /* synthetic */ com.google.android.chimera.JobService a;

    public bjk(com.google.android.chimera.JobService jobService) {
        this.a = jobService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return this.a.onStartJob(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return this.a.onStopJob(jobParameters);
    }
}
