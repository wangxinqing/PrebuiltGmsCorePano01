package defpackage;

import android.net.wifi.WifiConfiguration;

/* renamed from: uny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uny implements Runnable {
    private final uoa a;
    private final WifiConfiguration b;

    public uny(uoa uoa, WifiConfiguration wifiConfiguration) {
        this.a = uoa;
        this.b = wifiConfiguration;
    }

    public final void run() {
        if (!this.a.a(this.b, 11)) {
            throw new RuntimeException("Failed to stop the Wifi hotspot because setting the AP state failed.");
        }
    }
}
