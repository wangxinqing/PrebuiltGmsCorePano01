package defpackage;

import android.content.Context;
import android.net.wifi.WifiScanner;
import android.os.WorkSource;

/* renamed from: ahwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwh extends ahwf {
    private final aizx l;

    public ahwh(Context context, ahsr ahsr, ahyy ahyy, ahss ahss, ajrh ajrh, aizx aizx, long j, ahwc ahwc) {
        super(context, ahsr, ahyy, ahss, ajrh, j, ahwc);
        this.l = aizx;
    }

    public final void c() {
        WifiScanner wifiScanner = (WifiScanner) this.a.getSystemService("wifiscanner");
        ahwg ahwg = new ahwg(this);
        WifiScanner.ScanSettings scanSettings = new WifiScanner.ScanSettings();
        scanSettings.band = 3;
        scanSettings.reportEvents = 2;
        scanSettings.numBssidsPerScan = 100;
        scanSettings.periodInMs = 0;
        aizx aizx = this.l;
        if (aizx instanceof ajrb) {
            WorkSource a = ((ajrb) aizx).a();
            if (a != null) {
                wifiScanner.startScan(scanSettings, ahwg, a);
            } else {
                wifiScanner.startScan(scanSettings, ahwg);
            }
        } else {
            wifiScanner.startScan(scanSettings, ahwg);
        }
    }

    public final void d() {
    }

    public final void e() {
    }
}
