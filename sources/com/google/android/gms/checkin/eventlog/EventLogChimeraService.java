package com.google.android.gms.checkin.eventlog;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EventLogChimeraService extends qwf {
    private static final iwd a = gzk.a("EventLogChimeraService");
    private static final gxn b = new gxn();

    private static long a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getLong(str, 0);
        } catch (ClassCastException | NumberFormatException e) {
            a.e(str.length() == 0 ? new String("Non-long value in sharedPrefs. key: ") : "Non-long value in sharedPrefs. key: ".concat(str), new Object[0]);
            return 0;
        }
    }

    private static boolean b(Context context) {
        boolean z;
        try {
            z = ((ick) acws.a(adrz.b(context).o(), 5, TimeUnit.SECONDS)).p();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.b("Unable to get opted in result. Defaults to false", new Object[0]);
            z = false;
        }
        a.c("Opted in for usage reporting: %s", Boolean.valueOf(z));
        return z;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        return 1;
    }

    public static void a(Context context, boolean z) {
        if (!jgu.f(context)) {
            a.c("Event logging disabled. Logs will not be captured for imminent checkin.", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("EventLogChimeraService", 0);
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        synchronized (b) {
            long a2 = a(sharedPreferences, "lastLog");
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(44);
            sb.append("Accumulating logs since ");
            sb.append(a2);
            iwd.c(sb.toString(), new Object[0]);
            try {
                sharedPreferences.edit().putLong("lastLog", b.a(new hol(context, "ANDROID_CHECKIN_EVENT_LOG", (String) null), context, a2, -1, dropBoxManager, z)).apply();
            } catch (IOException e) {
                a.e("Can't capture logs", e, new Object[0]);
            }
        }
    }

    public static void a(SharedPreferences sharedPreferences, Context context) {
        long j = sharedPreferences.getLong("aggregation_interval", 0);
        long j2 = sharedPreferences.getLong("aggregation_flex", 0);
        long d = awrq.d();
        long c = awrq.c();
        if (j != d || j2 != c) {
            a(true, context);
        }
    }

    public static void a(boolean z, Context context) {
        if (!jgu.f(context)) {
            a.c("Event logging disabled. Aggregation task is not created.", new Object[0]);
            return;
        }
        long d = awrq.d();
        long c = awrq.c();
        SharedPreferences.Editor edit = gwk.l(context).edit();
        edit.putLong("aggregation_interval", d);
        edit.putLong("aggregation_flex", c);
        edit.apply();
        qxi qxi = new qxi();
        qxi.k = "AggregationTaskTag";
        qxi.b(z);
        qxi.i = "com.google.android.gms.checkin.EventLogService";
        qxi.n = true;
        qxi.b(2, 2);
        qxi.a(0, 0);
        qxi.a(false);
        qxi.a = d;
        qxi.b = c;
        qwq.a(context).a((qxx) qxi.b());
    }

    public static boolean a(Context context) {
        if (b(context)) {
            return true;
        }
        String a2 = aeeg.a(context.getContentResolver(), "checkin_optedin_for_usage_reporting");
        if (a2 == null || !aeeg.c.matcher(a2).matches()) {
            return false;
        }
        return true;
    }

    public final int a(qxz qxz) {
        if (!jgu.f(this)) {
            a.c("Event logging disabled. Aggregation will not run and aggregation task would be stopped.", new Object[0]);
            qwq.a((Context) this).a("AggregationTaskTag", "com.google.android.gms.checkin.EventLogService");
            return 0;
        }
        ContentResolver contentResolver = getContentResolver();
        SharedPreferences sharedPreferences = getSharedPreferences("EventLogChimeraService", 0);
        DropBoxManager dropBoxManager = (DropBoxManager) getSystemService("dropbox");
        boolean a2 = a((Context) this);
        synchronized (b) {
            long a3 = a(sharedPreferences, "lastLog");
            long a4 = a(sharedPreferences, "lastData");
            try {
                iwd iwd = a;
                StringBuilder sb = new StringBuilder(70);
                sb.append("Aggregate from ");
                sb.append(a3);
                sb.append(" (log), ");
                sb.append(a4);
                sb.append(" (data)");
                iwd.c(sb.toString(), new Object[0]);
                long a5 = b.a(new hol(this, "ANDROID_CHECKIN_EVENT_LOG", (String) null), this, a3, a4, dropBoxManager, a2);
                sharedPreferences.edit().putLong("lastLog", a5).putLong("lastData", a5).apply();
            } catch (IOException e) {
                a.e("Can't aggregate logs", e, new Object[0]);
            }
        }
        synchronized (gxp.class) {
            gxp.a(gxo.a(aeeg.a(contentResolver, "dumpsys:"), "dumpsys:", a2, aeeg.a(contentResolver, "checkin_dumpsys_whitelist")), dropBoxManager, getFileStreamPath("dump.tmp"));
        }
        return 0;
    }
}
