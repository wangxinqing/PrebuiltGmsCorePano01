package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RetryAfterAlarmChimeraReceiver extends acsb {
    public final void onReceive(Context context, Intent intent) {
        new jfz(1, 9).execute(new smp(context.getApplicationContext()));
    }
}
