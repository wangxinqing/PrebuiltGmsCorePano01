package com.google.android.gms.lockbox;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockboxAlarmChimeraReceiver extends BroadcastReceiver {
    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.lockbox.LockboxAlarmReceiver");
    }

    public final void onReceive(Context context, Intent intent) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.lockbox.LockboxService"));
    }
}
