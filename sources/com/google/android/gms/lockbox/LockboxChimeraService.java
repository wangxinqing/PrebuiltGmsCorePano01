package com.google.android.gms.lockbox;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockboxChimeraService extends TracingIntentService {
    public ror a;
    final aoru b = new jfz(1, 10);
    public iby c;
    private jbs d;
    private jiq e;

    public LockboxChimeraService() {
        super("LockboxService");
    }

    public final void a(long j) {
        this.d.a("LockboxService", 3, SystemClock.elapsedRealtime() + j, PendingIntent.getBroadcast(this, 0, LockboxAlarmChimeraReceiver.a(this), 0), "com.google.android.gms");
    }

    public final void onCreate() {
        super.onCreate();
        this.e = jiu.a;
        this.a = new ror(this);
        this.d = new jbs(this);
        ibq ibq = rou.a;
        this.c = adrz.a(this, new adry());
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        ror ror = this.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ror.a < 0 || elapsedRealtime - ror.a > ayfz.a.a().b()) {
            ror.a = elapsedRealtime;
            if (ror.a()) {
                new roq(ror.b).a("");
            }
        }
        try {
            rpa rpa = new rpa(this);
            rpa.a.c.f("LB_AS").a((Executor) rpa.a.b, (acvp) new roz(rpa));
        } catch (IllegalStateException e2) {
        }
    }
}
