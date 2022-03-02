package defpackage;

import android.net.Network;
import android.net.wifi.aware.WifiAwareNetworkInfo;
import java.net.InetSocketAddress;

/* renamed from: uuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class uuz {
    public static uuz a(Network network, WifiAwareNetworkInfo wifiAwareNetworkInfo) {
        InetSocketAddress inetSocketAddress = null;
        if (!(wifiAwareNetworkInfo == null || wifiAwareNetworkInfo.getPeerIpv6Addr() == null || wifiAwareNetworkInfo.getPort() == 0)) {
            inetSocketAddress = new InetSocketAddress(wifiAwareNetworkInfo.getPeerIpv6Addr(), wifiAwareNetworkInfo.getPort());
        }
        return new uto(network, inetSocketAddress);
    }

    public abstract Network a();

    public abstract InetSocketAddress b();
}
