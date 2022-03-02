package defpackage;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: cnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class cnn implements Runnable {
    private final JobInfoSchedulerService a;
    private final JobParameters b;

    public cnn(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.a = jobInfoSchedulerService;
        this.b = jobParameters;
    }

    public final void run() {
        this.a.jobFinished(this.b, false);
    }
}
