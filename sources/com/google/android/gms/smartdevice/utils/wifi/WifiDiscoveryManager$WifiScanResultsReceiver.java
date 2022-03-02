package com.google.android.gms.smartdevice.utils.wifi;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiDiscoveryManager$WifiScanResultsReceiver extends nla {
    final /* synthetic */ acqn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDiscoveryManager$WifiScanResultsReceiver(acqn acqn) {
        super("smartdevice");
        this.a = acqn;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            acqn acqn = this.a;
            acqn.a(acqn.c.getScanResults());
        }
    }
}
