package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: dnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dnd extends dma {
    public boolean a;
    public boolean b;
    public final AlarmManager c = ((AlarmManager) d().getSystemService("alarm"));
    private Integer e;

    protected dnd(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public void a() {
        try {
            s();
            f();
            if (dmy.c() > 0) {
                Context d = d();
                ActivityInfo receiverInfo = d.getPackageManager().getReceiverInfo(new ComponentName(d, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    b("Receiver registered for local dispatch.");
                    this.a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
    }

    public final PendingIntent b() {
        Context d = d();
        return PendingIntent.getBroadcast(d, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(d, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
    }

    public void s() {
        this.b = false;
        this.c.cancel(b());
        if (Build.VERSION.SDK_INT >= 24) {
            int t = t();
            a("Cancelling job. JobID", Integer.valueOf(t));
            ((JobScheduler) d().getSystemService("jobscheduler")).cancel(t);
        }
    }

    public final int t() {
        if (this.e == null) {
            String valueOf = String.valueOf(d().getPackageName());
            this.e = Integer.valueOf((valueOf.length() == 0 ? new String("analytics") : "analytics".concat(valueOf)).hashCode());
        }
        return this.e.intValue();
    }

    public void a(long j) {
        throw new UnsupportedOperationException();
    }
}
