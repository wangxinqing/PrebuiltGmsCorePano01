package defpackage;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.JobService;
import java.util.concurrent.ExecutorService;

/* renamed from: aadl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadl {
    public final aade a;
    public final qvg b;
    public final aacr c;
    public final aabn d;
    public final ExecutorService e;
    public final ou f = new ou();
    public final ou g = new ou();

    public aadl(aade aade, qvg qvg, aacr aacr, ExecutorService executorService) {
        this.a = aade;
        this.b = qvg;
        this.c = aacr;
        this.e = executorService;
        this.d = aade.c;
    }

    public static final qyl a(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        if (extras != null) {
            String string = extras.getString("_nts.pkg");
            String string2 = extras.getString("_nts.cls");
            int i = extras.getInt("_nts.usr", -1);
            if (extras.containsKey("_nts.tag") && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && i != -1) {
                return qyl.a(i, new ComponentName(string, string2), extras.getString("_nts.tag"));
            }
        }
        return null;
    }

    public final void a(aabq aabq, JobService jobService, JobParameters jobParameters, int i) {
        if (i != 0) {
            if (i == 1) {
                jobService.jobFinished(jobParameters, true);
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown result code: ");
                sb.append(i);
                Log.e("NetworkScheduler", sb.toString());
                jobService.jobFinished(jobParameters, false);
            }
            this.a.a(aabq, i);
        }
        jobService.jobFinished(jobParameters, false);
        this.a.a(aabq, i);
    }
}
