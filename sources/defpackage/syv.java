package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: syv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class syv extends syx {
    public final AlarmManager a = ((AlarmManager) z().getSystemService("alarm"));
    public final spm b;
    private Integer c;

    public syv(sze sze) {
        super(sze);
        this.b = new syu(this, sze.g, sze);
    }

    private final void g() {
        JobScheduler jobScheduler = (JobScheduler) z().getSystemService("jobscheduler");
        int d = d();
        if (!f()) {
            E().k.a("Cancelling job. JobID", Integer.valueOf(d));
        }
        jobScheduler.cancel(d);
    }

    public void a(long j) {
        throw new UnsupportedOperationException();
    }

    public void b() {
        q();
        if (f()) {
            E().k.a("Unscheduling upload");
        }
        this.a.cancel(e());
        this.b.c();
        if (Build.VERSION.SDK_INT >= 24) {
            g();
        }
    }

    public final int d() {
        if (this.c == null) {
            String valueOf = String.valueOf(z().getPackageName());
            this.c = Integer.valueOf((valueOf.length() == 0 ? new String("measurement") : "measurement".concat(valueOf)).hashCode());
        }
        return this.c.intValue();
    }

    public final PendingIntent e() {
        Context z = z();
        return PendingIntent.getBroadcast(z, 0, new Intent().setClassName(z, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final boolean f() {
        return ayjn.b() && v().a(sud.aJ);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        this.a.cancel(e());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        g();
        return false;
    }
}
