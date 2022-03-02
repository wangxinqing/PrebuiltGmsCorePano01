package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ServiceChimeraAutoStarter extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (!aekv.a(context) || (axkn.e() && nrq.a(context))) {
            nqw.a(context);
            if (nqw.c()) {
                if (intent == null) {
                    intent = new Intent();
                }
                intent.setClassName(context, "com.google.android.gms.gcm.GcmService");
                context.startService(intent);
            }
        }
    }
}
