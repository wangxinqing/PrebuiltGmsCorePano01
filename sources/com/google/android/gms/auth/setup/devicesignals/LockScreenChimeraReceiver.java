package com.google.android.gms.auth.setup.devicesignals;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockScreenChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            gkv.a(context).a(true);
            if (!LockScreenChimeraService.a) {
                context.startService(LockScreenChimeraService.a(context));
            }
        }
    }
}
