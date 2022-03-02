package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SafeBrowsingUpdateChimeraIntentService extends IntentOperation {
    public static final long a = TimeUnit.HOURS.toMillis(20);

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_XLB_UPDATE"));
    }

    public static void b(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_XLB_PERIODIC_UPDATE"));
    }

    private static void c(Context context) {
        aarq aarq = new aarq(context);
        if (System.currentTimeMillis() >= Math.max(aarq.c(), aarq.b() + a)) {
            try {
                acws.a(zzo.a(context).a((ihb) new zzq()), 60, TimeUnit.SECONDS);
                acws.a(zzo.b(context).a((ihb) new zzt()), 60, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            } catch (Throwable th) {
                zzo.a(context).l();
                throw th;
            }
            zzo.a(context).l();
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_XLB_UPDATE".equals(action)) {
                c(this);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_XLB_PERIODIC_UPDATE".equals(action)) {
                long j = a / 1000;
                qxi qxi = new qxi();
                qxi.i = aann.a(SafeBrowsingUpdateTaskChimeraService.class);
                qxi.k = "snet_safe_browsing_periodic_updater";
                qxi.n = true;
                qxi.b(1);
                qxi.a(0);
                qxi.a(0, axcc.b() ? 1 : 0);
                if (axcc.i()) {
                    qxi.a(qxe.EVERY_20_HOURS);
                } else {
                    qxi.a = j;
                }
                qwq a2 = qwq.a((Context) this);
                if (a2 != null) {
                    a2.a((qxx) qxi.b());
                }
            }
        }
    }
}
