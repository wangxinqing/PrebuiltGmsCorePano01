package com.google.android.gms.nearby.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothDeviceIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (aymq.a.a().I()) {
            startService(DiscoveryChimeraService.a((Context) this).setAction(intent.getAction()).putExtras(intent));
        }
    }
}
