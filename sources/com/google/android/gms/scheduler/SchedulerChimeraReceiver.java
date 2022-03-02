package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerChimeraReceiver extends BroadcastReceiver {
    private static final aoru b = jfm.b(10);

    public final void onReceive(Context context, Intent intent) {
        b.execute(new aabh(context, intent));
    }
}
