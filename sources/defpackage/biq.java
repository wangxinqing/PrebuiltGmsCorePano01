package defpackage;

import android.net.wifi.ScanResult;

/* renamed from: biq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class biq {
    public final ScanResult a;
    public int b = 0;
    public double c = 1000.0d;

    public biq(ScanResult scanResult) {
        this.a = scanResult;
        this.b = scanResult.level;
    }

    public final String a() {
        return this.a.BSSID;
    }
}
