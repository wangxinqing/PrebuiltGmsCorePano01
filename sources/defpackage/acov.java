package defpackage;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;

/* renamed from: acov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acov {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public acov(ScanResult scanResult, int i) {
        this.a = scanResult.SSID;
        this.b = WifiManager.calculateSignalLevel(scanResult.level, 4);
        this.c = !scanResult.capabilities.contains("WEP") ? !scanResult.capabilities.contains("PSK") ? scanResult.capabilities.contains("EAP") ? 3 : 0 : 2 : 1;
        this.d = i;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append("AccessPoint<");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
