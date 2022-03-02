package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiHotspot$ConnectOperation$1 extends nla {
    final /* synthetic */ String a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ unt c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiHotspot$ConnectOperation$1(unt unt, String str, String str2, CountDownLatch countDownLatch) {
        super(str);
        this.c = unt;
        this.a = str2;
        this.b = countDownLatch;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            for (ScanResult scanResult : this.c.a.getScanResults()) {
                if (uoh.a(this.a, scanResult.SSID)) {
                    this.b.countDown();
                    return;
                }
            }
            this.c.a.startScan();
        }
    }
}
