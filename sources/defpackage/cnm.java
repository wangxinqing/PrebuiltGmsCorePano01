package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: cnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cnm implements coe {
    private final Context a;
    private final coh b;
    private final cns c;

    public cnm(Context context, coh coh, cns cns) {
        this.a = context;
        this.b = coh;
        this.c = cns;
    }

    public final void a(cmm cmm, int i) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(cmm.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(cpu.a(cmm.c())).array());
        if (cmm.b() != null) {
            adler32.update(cmm.b());
        }
        int value = (int) adler32.getValue();
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i2 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == value) {
                if (i2 >= i) {
                    cne.a("JobInfoScheduler", (Object) cmm);
                    return;
                }
            }
        }
        long a2 = this.b.a(cmm);
        cns cns = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        clp c2 = cmm.c();
        builder.setMinimumLatency(cns.a(c2, a2, i));
        Set c3 = ((cnq) ((cnk) cns).a.get(c2)).c();
        if (c3.contains(cnr.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c3.contains(cnr.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c3.contains(cnr.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", cmm.a());
        persistableBundle.putInt("priority", cpu.a(cmm.c()));
        if (cmm.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(cmm.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {cmm, Integer.valueOf(value), Long.valueOf(this.c.a(cmm.c(), a2, i)), Long.valueOf(a2), Integer.valueOf(i)};
        cne.a("JobInfoScheduler");
        jobScheduler.schedule(builder.build());
    }
}
