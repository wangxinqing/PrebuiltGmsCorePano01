package com.google.android.gms.update.control;

import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BatteryControl$2 extends ActiveStateTrackingBroadcastReceiver {
    public final void a(Intent intent) {
        adkm.a.c("Received intent: %s.", intent);
        if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            String action = intent.getAction();
            int i2 = Build.VERSION.SDK_INT;
            amrl.a(true);
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
                ((adkv) adkv.b.b()).a(8);
                return;
            }
            return;
        }
        ((adkv) adkv.b.b()).a(4);
    }
}
