package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BistoPairingProgressHandler$2 extends nla {
    final /* synthetic */ ttz a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BistoPairingProgressHandler$2(ttz ttz, String str) {
        super(str);
        this.a = ttz;
    }

    public final void a(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP") || intent.getAction().equals("com.google.android.gms.nearby.discovery.ACTION_SUCCESS_BISTO_SETUP")) {
            jjg jjg = tsp.a;
            intent.setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
            context.startService(intent);
            try {
                if (this.a.a) {
                    context.unregisterReceiver(this);
                    this.a.a = false;
                }
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
