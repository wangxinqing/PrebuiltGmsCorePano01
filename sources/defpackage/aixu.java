package defpackage;

import android.location.Location;
import android.net.wifi.ScanResult;

/* renamed from: aixu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aixu extends aiyk {
    public final int a(String str) {
        if (!"android.intent.action.USER_FOREGROUND".equals(str)) {
            return "android.intent.action.USER_BACKGROUND".equals(str) ? 1 : 0;
        }
        return 2;
    }

    public final long a(Location location) {
        try {
            return location.getElapsedRealtimeNanos() / 1000000;
        } catch (NoSuchMethodError e) {
            return 0;
        }
    }

    public aixs a(ScanResult scanResult) {
        ScanResult scanResult2 = scanResult;
        return new aixs(scanResult2.timestamp / 1000, scanResult2.BSSID != null ? arvy.a(scanResult2.BSSID) : 0, scanResult2.SSID, scanResult2.capabilities, -1, false, scanResult2.frequency, scanResult2.level, -1, -1, scanResult);
    }

    public final void a(Location location, long j) {
        location.setElapsedRealtimeNanos(j * 1000000);
    }
}
