package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ValidatorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        jjg jjg = tsp.a;
        intent.getAction();
        startService(DiscoveryChimeraService.a((Context) this).setAction(intent.getAction()).putExtras(intent));
    }
}
