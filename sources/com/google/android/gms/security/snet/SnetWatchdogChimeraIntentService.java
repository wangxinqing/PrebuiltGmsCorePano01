package com.google.android.gms.security.snet;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetWatchdogChimeraIntentService extends IntentOperation {
    public static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final long b = TimeUnit.MINUTES.toMillis(10);
    private static final String c = SnetWatchdogChimeraIntentService.class.getSimpleName();

    public static long a(String str) {
        return "com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(str) ? b : a;
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", -1);
            long longExtra = intent.getLongExtra("snet.watchdog.intent.extra.TIMEOUT", -1);
            String stringExtra = intent.getStringExtra("snet.watchdog.intent.extra.SESSION_UUID");
            String stringExtra2 = intent.getStringExtra("snet.watchdog.intent.extra.DEVICE_UUID");
            aaww aaww = new aaww(this, intExtra);
            aaww.m = stringExtra;
            aaww.n = stringExtra2;
            if (!azfv.p() || !"com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(intent.getAction())) {
                stopService(aann.a((Context) this, SnetLaunchChimeraIntentService.class));
                String valueOf = String.valueOf(getApplicationContext().getPackageName());
                String valueOf2 = String.valueOf(getString(R.string.common_snet_process));
                String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                ActivityManager activityManager = (ActivityManager) getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                        if (str.equals(next.processName)) {
                            a(aaww, longExtra);
                            Process.killProcess(next.pid);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            stopService(aann.a((Context) this, SnetLaunchInProcessChimeraIntentService.class));
            a(aaww, longExtra);
        }
    }

    private static PendingIntent a(Context context, int i, long j, String str, String str2, String str3) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetWatchdogChimeraIntentService.class, str3);
        startIntent.putExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.watchdog.intent.extra.TIMEOUT", j);
        startIntent.putExtra("snet.watchdog.intent.extra.SESSION_UUID", str);
        startIntent.putExtra("snet.watchdog.intent.extra.DEVICE_UUID", str2);
        return PendingIntent.getService(context, 0, startIntent, 0);
    }

    private static final void a(aaww aaww, long j) {
        aaww.d = true;
        aaww.h = j;
        if (azfv.o()) {
            ArrayList<EventLog.Event> arrayList = new ArrayList<>();
            String str = null;
            try {
                EventLog.readEvents(new int[]{1397638484}, arrayList);
                String str2 = null;
                for (EventLog.Event data : arrayList) {
                    Object[] objArr = (Object[]) data.getData();
                    if (objArr.length == 3 && "do-not-log-execution-checkpoint-tag".equals(objArr[0])) {
                        str2 = (String) objArr[2];
                    }
                }
                str = str2;
            } catch (IOException | ClassCastException e) {
            }
            if (!TextUtils.isEmpty(str)) {
                aaww.i = str;
                EventLog.writeEvent(1397638484, new Object[]{"do-not-log-execution-checkpoint-tag", -1, "done"});
            }
        }
        aaww.a(4);
    }

    public static void a(Context context, int i, String str, String str2, String str3) {
        jbs jbs = new jbs(context);
        long a2 = a(str3);
        long currentTimeMillis = System.currentTimeMillis();
        jbs.a(c, 0, currentTimeMillis + a2, a(context, i, a2, str, str2, str3), "com.google.android.gms");
    }

    public static void a(Context context, String str) {
        if (str != null) {
            new jbs(context).a(a(context, -1, -1, "", "", str));
        }
    }
}
