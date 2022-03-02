package defpackage;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.chimera.JobService;
import java.lang.ref.WeakReference;

/* renamed from: aadj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aadj implements aabw {
    final /* synthetic */ aadl a;
    private final WeakReference b;

    public aadj(aadl aadl, JobService jobService) {
        this.a = aadl;
        this.b = new WeakReference(jobService);
    }

    public final void a(aabx aabx, int i) {
        aadl aadl = this.a;
        JobService jobService = (JobService) this.b.get();
        aabq aabq = aabx.a;
        String valueOf = String.valueOf(aabq.e());
        qye qye = new qye(valueOf.length() == 0 ? new String("nts:jobscheduler:onJobResult:") : "nts:jobscheduler:onJobResult:".concat(valueOf));
        try {
            synchronized (aadl.a) {
                aadk aadk = (aadk) aadl.g.remove(aabq);
                if (aadk != null) {
                    aadl.d.a(aadl.a.c(), aadk.c, aadn.e(i));
                    if (!aabq.p) {
                        if (aadk.a) {
                            if (jobService != null) {
                                JobParameters jobParameters = (JobParameters) aadl.f.get(aabq);
                                if (jobParameters == null) {
                                    Log.w("NetworkScheduler", "Received result for job with no associated jobParams");
                                } else {
                                    aadl.a(aabq, jobService, jobParameters, i);
                                }
                            }
                        }
                        aadk.b = i;
                        aadl.g.put(aabq, aadk);
                    }
                } else {
                    String e = aabq.e();
                    int i2 = aabq.i;
                    StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 55);
                    sb.append("received result for unknown job (tag=");
                    sb.append(e);
                    sb.append(", jid=");
                    sb.append(i2);
                    sb.append(")");
                    Log.w("NetworkScheduler", sb.toString());
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
