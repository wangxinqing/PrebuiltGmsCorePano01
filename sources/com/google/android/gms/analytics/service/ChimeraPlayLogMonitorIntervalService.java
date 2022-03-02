package com.google.android.gms.analytics.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraPlayLogMonitorIntervalService extends IntentOperation {
    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.internal.PlayLogReportingService"));
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        jbs jbs = new jbs(context);
        jbs.a(service);
        jbs.a("PlayLogMonitorIntervalService", 3, ((SystemClock.elapsedRealtime() / ((Long) doz.x.a()).longValue()) + 1) * ((Long) doz.x.a()).longValue(), ((Long) doz.x.a()).longValue(), service, "com.google.android.gms");
    }

    public final void onHandleIntent(Intent intent) {
        a(getBaseContext());
    }
}
