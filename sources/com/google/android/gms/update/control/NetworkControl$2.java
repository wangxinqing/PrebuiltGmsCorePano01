package com.google.android.gms.update.control;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkControl$2 extends ActiveStateTrackingBroadcastReceiver {
    public final void a(Intent intent) {
        adle.a.c("Received intent: %s.", intent);
        if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction())) {
            ((adkv) adkv.b.b()).a(3);
        }
    }
}
