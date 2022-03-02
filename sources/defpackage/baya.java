package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: baya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baya extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ baye a;

    public baya(baye baye) {
        this.a = baye;
    }

    private final void a(Network network) {
        NetworkMonitorAutoDetect$NetworkInformation a2 = this.a.d.a(network);
        if (a2 != null) {
            this.a.g.a(a2);
        }
    }

    public final void onAvailable(Network network) {
        String valueOf = String.valueOf(network.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("Network becomes available: ") : "Network becomes available: ".concat(valueOf));
        a(network);
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String valueOf = String.valueOf(networkCapabilities.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("capabilities changed: ") : "capabilities changed: ".concat(valueOf));
        a(network);
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        String valueOf = String.valueOf(linkProperties.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("link properties changed: ") : "link properties changed: ".concat(valueOf));
        a(network);
    }

    public final void onLosing(Network network, int i) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 42);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is about to lose in ");
        sb.append(i);
        sb.append("ms");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
    }

    public final void onLost(Network network) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is disconnected");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
        this.a.g.a(baye.a(network));
    }
}
