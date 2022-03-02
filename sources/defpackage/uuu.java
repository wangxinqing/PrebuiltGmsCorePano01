package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.aware.WifiAwareNetworkInfo;

/* renamed from: uuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uuu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ aosh a;
    final /* synthetic */ uvy b;

    public uuu(aosh aosh, uvy uvy) {
        this.a = aosh;
        this.b = uvy;
    }

    public final void onAvailable(Network network) {
        if (!jkr.h()) {
            this.a.b((Object) uuz.a(network, (WifiAwareNetworkInfo) null));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (jkr.h()) {
            WifiAwareNetworkInfo wifiAwareNetworkInfo = (WifiAwareNetworkInfo) networkCapabilities.getTransportInfo();
            if (wifiAwareNetworkInfo != null) {
                ((anih) ((anih) ulh.a.d()).a("uuu", "onCapabilitiesChanged", 703, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received network info with ipAddr %s and port %s.", (Object) wifiAwareNetworkInfo.getPeerIpv6Addr(), wifiAwareNetworkInfo.getPort());
            }
            this.a.b((Object) uuz.a(network, wifiAwareNetworkInfo));
        }
    }

    public final void onLost(Network network) {
        ((anih) ((anih) ulh.a.d()).a("uuu", "onLost", 724, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Lost connection to the WiFi Aware network.");
    }

    public final void onUnavailable() {
        this.a.a((Throwable) new RuntimeException(String.format("Failed to join the WiFi Aware network with %s", new Object[]{this.b})));
    }
}
