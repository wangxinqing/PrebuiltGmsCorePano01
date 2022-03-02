package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        cmn.a(context);
        cml d = cmm.d();
        d.a(queryParameter);
        d.a(cpu.a(intValue));
        if (queryParameter2 != null) {
            d.a = Base64.decode(queryParameter2, 0);
        }
        cmn.a().a.a(d.a(), i, cnj.a);
    }
}
