package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.scheduler.TaskExecutionChimeraService;
import java.util.concurrent.Executor;

/* renamed from: aadg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aadg implements Runnable {
    private final aadl a;
    private final TaskExecutionChimeraService b;
    private final JobParameters c;

    public aadg(aadl aadl, TaskExecutionChimeraService taskExecutionChimeraService, JobParameters jobParameters) {
        this.a = aadl;
        this.b = taskExecutionChimeraService;
        this.c = jobParameters;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        aabq aabq;
        Uri[] triggeredContentUris;
        aadl aadl = this.a;
        TaskExecutionChimeraService taskExecutionChimeraService = this.b;
        JobParameters jobParameters = this.c;
        int jobId = jobParameters.getJobId();
        StringBuilder sb = new StringBuilder(39);
        sb.append("nts:jobscheduler:onStartJob:");
        sb.append(jobId);
        qye qye = new qye(sb.toString());
        try {
            synchronized (aadl.a) {
                qyl a2 = aadl.a(jobParameters);
                if (a2 == null) {
                    int jobId2 = jobParameters.getJobId();
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("unable to extract a task from job with ID = ");
                    sb2.append(jobId2);
                    Log.w("NetworkScheduler", sb2.toString());
                    taskExecutionChimeraService.jobFinished(jobParameters, false);
                    aabq = null;
                } else if (aadl.a.e) {
                    aabq c2 = aadl.a.c(a2);
                    if (c2 == null) {
                        Log.w("NetworkScheduler", "unknown task request received, aborting");
                        taskExecutionChimeraService.jobFinished(jobParameters, false);
                        aabq = null;
                    } else {
                        if (jkr.c() && c2.q() && jobParameters.getTriggeredContentUris() != null && (triggeredContentUris = jobParameters.getTriggeredContentUris()) != null) {
                            for (Uri a3 : triggeredContentUris) {
                                c2.a(a3);
                            }
                        }
                        aabq = c2;
                    }
                } else {
                    taskExecutionChimeraService.jobFinished(jobParameters, true);
                    aabq = null;
                }
                if (aabq != null) {
                    if (!aabq.p) {
                        synchronized (aadl.a) {
                            aadk aadk = (aadk) aadl.g.get(aabq);
                            if (aadk != null) {
                                int i = aadk.b;
                                if (i != -1) {
                                    aadl.a(aabq, taskExecutionChimeraService, jobParameters, i);
                                    aadl.g.remove(aabq);
                                } else {
                                    aadk.a = true;
                                }
                            }
                        }
                    }
                    aabq.a(false);
                    Context applicationContext = taskExecutionChimeraService.getApplicationContext();
                    PackageManager c3 = aadl.a.d.c((int) aabq.a.e);
                    if (c3 != null) {
                        aabx aabx = new aabx(aabq, applicationContext, new aadj(aadl, taskExecutionChimeraService), aadl.e, c3, aadl.d, aabx.a(), nxn.CAUSE_UNKNOWN, 0);
                        aadi aadi = new aadi(aadl, aabq, taskExecutionChimeraService, jobParameters, aabx);
                        aadl.f.put(aabq, jobParameters);
                        aadl.c.a(applicationContext, aabx).a((Executor) aadl.e, (acvp) aadi);
                    } else {
                        taskExecutionChimeraService.jobFinished(jobParameters, true);
                    }
                }
            }
            qye.close();
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                qye.close();
            } catch (Throwable th3) {
                apev.a(th2, th3);
            }
            throw th2;
        }
    }
}
