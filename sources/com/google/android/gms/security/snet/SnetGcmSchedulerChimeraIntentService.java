package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetGcmSchedulerChimeraIntentService extends IntentOperation {
    static {
        SnetGcmSchedulerChimeraIntentService.class.getSimpleName();
    }

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN"));
    }

    public static void b(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD"));
    }

    public static void c(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_IDLE_RUN"));
        if (azfv.q()) {
            context.startService(IntentOperation.getStartIntent(context, SnetDailyHygieneChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_CLEAN_PREFS"));
        }
    }

    public static void d(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD"));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN".equals(action)) {
                Intent a = aann.a((Context) this, SnetChimeraService.class);
                a.setAction("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
                startService(a);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD".equals(action)) {
                aarq aarq = new aarq(this);
                long millis = TimeUnit.HOURS.toMillis(azfv.a.a().o());
                aarq.a("snet_saved_wake_interval_ms", millis);
                long j = millis / 1000;
                qxi qxi = new qxi();
                qxi.i = aann.a(SnetNormalTaskChimeraService.class);
                qxi.k = "event_log_collector_runner";
                qxi.n = true;
                qxi.b(1);
                qxi.a(0, axcc.b() ? 1 : 0);
                qxi.a(0);
                if (axcc.i()) {
                    double h = axbn.h();
                    double d = (double) j;
                    Double.isNaN(d);
                    qxi.a(j, (long) (h * d), qxr.a);
                } else {
                    qxi.a = j;
                    qxi.b = TimeUnit.MINUTES.toSeconds(azfv.a.a().n());
                }
                qwq a2 = qwq.a((Context) this);
                if (a2 != null) {
                    a2.a((qxx) qxi.b());
                }
            } else if ("com.google.android.gms.security.snet.ACTION_IDLE_RUN".equals(action)) {
                Intent a3 = aann.a((Context) this, SnetChimeraService.class);
                a3.setAction("com.google.android.gms.security.snet.ACTION_IDLE_MODE");
                startService(a3);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD".equals(action)) {
                long millis2 = TimeUnit.HOURS.toMillis(azfv.a.a().u());
                new aarq(this).a("snet_idle_mode_gcm_interval_ms", millis2);
                long j2 = millis2 / 1000;
                qxi qxi2 = new qxi();
                qxi2.i = aann.a(SnetIdleTaskChimeraService.class);
                qxi2.k = "snet_idle_runner";
                qxi2.n = true;
                qxi2.b(1);
                qxi2.a(2);
                qxi2.a(1, 1);
                qxi2.a(true);
                if (axcc.i()) {
                    qxi2.a(qxe.a(j2));
                } else {
                    qxi2.a = j2;
                }
                qxj a4 = qxi2.b();
                qwq a5 = qwq.a((Context) this);
                if (a5 != null) {
                    a5.a((qxx) a4);
                }
            }
        }
    }
}
