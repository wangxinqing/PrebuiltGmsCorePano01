package com.google.android.gms.chimera;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.container.InitConfigOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Intent startIntent;
        if (awxp.a.a().g() && (startIntent = IntentOperation.getStartIntent(context, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK")) != null) {
            context.startService(startIntent);
        }
    }
}
