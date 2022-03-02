package com.google.android.gms.stats.eastworld;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EastworldAlarmOperation extends IntentOperation {
    hph a;
    acsl b;
    private hol c;

    private final void a(Context context, long j) {
        long b2 = aznz.b();
        new jbs(context).a("EastworldAlarmOperation", 3, SystemClock.elapsedRealtime() + j, b2, IntentOperation.getPendingIntent(context, EastworldAlarmOperation.class, new Intent("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM"), 0, 134217728), "com.google.android.gms");
        this.a.c("EastworldPeriodicAlarmSetup").a();
        this.a.d();
    }

    public final void onCreate() {
        this.c = new hol(this, (String) null, (String) null);
        this.a = new hph(this.c, "PLATFORM_STATS_COUNTERS", 1024);
        this.b = acsl.a();
    }

    public final void onHandleIntent(Intent intent) {
        ihs b2 = ihs.b();
        this.a.c("EastworldPeridicAlarmFire").a();
        if (!azmn.b() && !acub.a()) {
            this.a.c("CancellNonDeviceOwnerTasksForEastworldAlarmOperation").a();
            this.a.d();
        } else if (!aznz.a.a().b()) {
            this.a.c("EastworldNotEnable").a();
            this.a.d();
            a(b2, aznq.c());
        } else if (a(this.a)) {
            ihs b3 = ihs.b();
            jhg.a((Context) b3, "com.google.android.gms.stats.eastworld.EastworldService", true);
            Intent intent2 = new Intent();
            intent2.setClassName(b3, "com.google.android.gms.stats.eastworld.EastworldService");
            b3.startService(intent2);
            this.a.c("EastworldChimeraServiceStart").a();
            if (acub.a()) {
                long currentTimeMillis = System.currentTimeMillis();
                long b4 = aznz.b();
                long a2 = acso.a((Context) b2);
                Calendar instance = Calendar.getInstance();
                instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                instance.add(5, 1);
                a(b2, ((instance.getTimeInMillis() + a2) - currentTimeMillis) % b4);
                if (!intent.getBooleanExtra("extra_for_init_intent", false)) {
                    this.b.a(intent);
                }
                this.a.d();
            }
        } else {
            this.a.c("EastworldNotOptIn").a();
            this.a.d();
            a(b2, aznq.c());
        }
    }

    public static boolean a(hph hph) {
        if (azoi.b()) {
            acwa f = adrz.a(ihs.b(), new adry()).f("EASTWORLD_STATS");
            try {
                acws.a(f, 10000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                hph.c("ConsentApiEastworldFailure").a();
            } catch (InterruptedException e2) {
                hph.c("ConsentApiEastworldFailure").a();
                Thread.currentThread().interrupt();
            }
            return f.b() && f.d() != null && ((Boolean) f.d()).booleanValue();
        }
        boolean b2 = aznh.b();
        ihs b3 = ihs.b();
        new acro();
        List a2 = acro.a(b3);
        boolean c2 = acub.c();
        return b2 || (!a2.isEmpty() && (!azmy.b() || c2)) || c2;
    }
}
