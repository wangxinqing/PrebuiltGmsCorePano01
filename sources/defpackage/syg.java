package defpackage;

import android.app.job.JobParameters;

/* renamed from: syg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class syg implements Runnable {
    private final syj a;
    private final sut b;
    private final JobParameters c;

    public syg(syj syj, sut sut, JobParameters jobParameters) {
        this.a = syj;
        this.b = sut;
        this.c = jobParameters;
    }

    public final void run() {
        syj syj = this.a;
        sut sut = this.b;
        JobParameters jobParameters = this.c;
        sut.k.a("AppMeasurementJobService processed last upload request.");
        ((syi) syj.a).a(jobParameters);
    }
}
