package defpackage;

import android.app.job.JobParameters;
import android.util.Log;

/* renamed from: aadh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aadh implements Runnable {
    private final aadl a;
    private final JobParameters b;

    public aadh(aadl aadl, JobParameters jobParameters) {
        this.a = aadl;
        this.b = jobParameters;
    }

    public final void run() {
        aadl aadl = this.a;
        JobParameters jobParameters = this.b;
        int jobId = jobParameters.getJobId();
        StringBuilder sb = new StringBuilder(38);
        sb.append("nts:jobscheduler:onStopJob:");
        sb.append(jobId);
        qye qye = new qye(sb.toString());
        try {
            synchronized (aadl.a) {
                qyl a2 = aadl.a(jobParameters);
                if (a2 == null) {
                    aadl.b.a(jobParameters.getJobId());
                } else {
                    aabq c = aadl.a.c(a2);
                    if (c == null) {
                        int jobId2 = jobParameters.getJobId();
                        StringBuilder sb2 = new StringBuilder(63);
                        sb2.append("Received onStopJob for unknown task (jid=");
                        sb2.append(jobId2);
                        sb2.append("), ignoring");
                        Log.w("NetworkScheduler", sb2.toString());
                        aadl.b.a(jobParameters.getJobId());
                    } else {
                        aadk aadk = (aadk) aadl.g.get(c);
                        if (aadk == null) {
                            int jobId3 = jobParameters.getJobId();
                            StringBuilder sb3 = new StringBuilder(65);
                            sb3.append("Received onStopJob for untracked task (jid=");
                            sb3.append(jobId3);
                            sb3.append("), ignoring");
                            Log.w("NetworkScheduler", sb3.toString());
                            aadl.b.a(jobParameters.getJobId());
                        } else if (!c.p) {
                            aadl.d.a(c, 3);
                            if (aadl.c.a(aadk.c, 4)) {
                                aadl.g.remove(c);
                            } else {
                                aadk.a = false;
                            }
                        }
                    }
                }
            }
            qye.close();
        } catch (Throwable th) {
            try {
                qye.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
    }
}
