package com.google.android.gms.tron;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AlarmChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        azqq.c();
        Intent a = CollectionChimeraService.a(context);
        a.putExtra("com.google.android.gms.tron.extra.reason", 1);
        context.startService(a);
    }
}
