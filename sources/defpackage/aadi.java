package defpackage;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.gms.scheduler.TaskExecutionChimeraService;

/* renamed from: aadi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aadi implements acvp {
    final /* synthetic */ aadl a;
    private final aabq b;
    private final TaskExecutionChimeraService c;
    private final JobParameters d;
    private final aabx e;

    public aadi(aadl aadl, aabq aabq, TaskExecutionChimeraService taskExecutionChimeraService, JobParameters jobParameters, aabx aabx) {
        this.a = aadl;
        this.b = aabq;
        this.c = taskExecutionChimeraService;
        this.d = jobParameters;
        this.e = aabx;
    }

    public final void a(acwa acwa) {
        int intValue = ((Integer) acwa.d()).intValue();
        if (aacr.b(intValue)) {
            aadl aadl = this.a;
            aabq aabq = this.b;
            aabx aabx = this.e;
            synchronized (aadl.a) {
                if (aadl.g.get(aabq) == null) {
                    aadk aadk = new aadk(aabx);
                    aadk.a = true;
                    aadl.g.put(aabq, aadk);
                }
                aadl.d.c(nxn.CAUSE_UNKNOWN);
                aabq.g = System.currentTimeMillis();
            }
            return;
        }
        if (aacr.a(intValue)) {
            Log.w("NetworkScheduler", "execution request failed for temporary reasons, rescheduling");
            this.c.jobFinished(this.d, true);
        } else {
            Log.e("NetworkScheduler", "execution request failed for permanent reasons, not rescheduling");
            this.c.jobFinished(this.d, false);
        }
        aadl aadl2 = this.a;
        aadl2.d.a(aadl2.a.c(), this.e, aadn.d(intValue));
    }
}
