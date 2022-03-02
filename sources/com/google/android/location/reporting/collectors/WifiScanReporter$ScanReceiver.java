package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.location.WifiScan;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WifiScanReporter$ScanReceiver extends nla {
    final /* synthetic */ ajhp a;
    private long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiScanReporter$ScanReceiver(ajhp ajhp) {
        super("location");
        this.a = ajhp;
    }

    public final void a(Context context, Intent intent) {
        WifiScan wifiScan;
        byte[] byteArrayExtra = intent.getByteArrayExtra("location.WIFI_SCAN");
        if (byteArrayExtra != null) {
            wifiScan = WifiScan.a(byteArrayExtra);
        } else {
            wifiScan = null;
        }
        if (wifiScan != null) {
            ajhp ajhp = this.a;
            if (ajhp.d) {
                synchronized (ajhp.c) {
                    if (this.a.e != null && aztb.a.a().aA()) {
                        ajho ajho = this.a.e;
                        ((ajme) ajho).k.sendMessage(((ajme) ajho).k.obtainMessage(5, wifiScan));
                    }
                }
                if (this.b != 0) {
                    jiq jiq = this.a.b;
                    if (SystemClock.elapsedRealtime() - this.b <= aztb.a.a().bO()) {
                        return;
                    }
                }
                synchronized (this.a.c) {
                    this.a.a.add(wifiScan);
                }
                jiq jiq2 = this.a.b;
                this.b = SystemClock.elapsedRealtime();
                int a2 = wifiScan.a();
                StringBuilder sb = new StringBuilder(35);
                sb.append("Saved wifi scan of size ");
                sb.append(a2);
                sb.toString();
            }
        }
    }
}
