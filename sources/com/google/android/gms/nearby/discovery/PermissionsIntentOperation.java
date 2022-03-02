package com.google.android.gms.nearby.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PermissionsIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        jjg jjg = tsp.a;
        if (action != null) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                if (intExtra != 10 && intExtra != 12) {
                    return;
                }
                if (aymw.aa()) {
                    startService(DiscoveryChimeraService.a((Context) this).setAction("android.bluetooth.adapter.action.STATE_CHANGED"));
                }
            }
            startService(DiscoveryChimeraService.a((Context) this).setAction("com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE"));
        }
    }
}
