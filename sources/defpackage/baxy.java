package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect$IPAddress;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: baxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxy {
    public final ConnectivityManager a;

    baxy() {
        this.a = null;
    }

    private static final baxz a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            return new baxz(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }
        return new baxz(false, -1, -1, -1, -1);
    }

    public final boolean b() {
        int i = Build.VERSION.SDK_INT;
        return this.a != null;
    }

    public baxy(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* access modifiers changed from: package-private */
    public final baxz a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return new baxz(false, -1, -1, -1, -1);
        }
        return a(connectivityManager.getActiveNetworkInfo());
    }

    public final NetworkMonitorAutoDetect$NetworkInformation a(Network network) {
        ConnectivityManager connectivityManager;
        baxz baxz;
        NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType;
        NetworkInfo activeNetworkInfo;
        Network network2 = network;
        if (network2 == null || (connectivityManager = this.a) == null) {
            return null;
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(network2);
        if (linkProperties == null) {
            String valueOf = String.valueOf(network.toString());
            Logging.c("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("Detected unknown network: ") : "Detected unknown network: ".concat(valueOf));
            return null;
        } else if (linkProperties.getInterfaceName() == null) {
            String valueOf2 = String.valueOf(network.toString());
            Logging.c("NetworkMonitorAutoDetect", valueOf2.length() == 0 ? new String("Null interface name for network ") : "Null interface name for network ".concat(valueOf2));
            return null;
        } else {
            ConnectivityManager connectivityManager2 = this.a;
            if (connectivityManager2 == null) {
                baxz = new baxz(false, -1, -1, -1, -1);
            } else {
                NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network2);
                if (networkInfo == null) {
                    String valueOf3 = String.valueOf(network.toString());
                    Logging.c("NetworkMonitorAutoDetect", valueOf3.length() == 0 ? new String("Couldn't retrieve information from network ") : "Couldn't retrieve information from network ".concat(valueOf3));
                    baxz = new baxz(false, -1, -1, -1, -1);
                } else if (networkInfo.getType() != 17) {
                    NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network2);
                    if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                        baxz = a(networkInfo);
                    } else {
                        baxz = new baxz(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                    }
                } else if (networkInfo.getType() != 17) {
                    baxz = a(networkInfo);
                } else if (Build.VERSION.SDK_INT < 23 || !network2.equals(this.a.getActiveNetwork()) || (activeNetworkInfo = this.a.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                    baxz = new baxz(networkInfo.isConnected(), 17, -1, -1, -1);
                } else {
                    baxz = new baxz(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                }
            }
            NetworkMonitorAutoDetect$ConnectionType a2 = baye.a(baxz);
            if (a2 == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE) {
                String network3 = network.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(network3).length() + 24);
                sb.append("Network ");
                sb.append(network3);
                sb.append(" is disconnected");
                Logging.a("NetworkMonitorAutoDetect", sb.toString());
                return null;
            }
            if (a2 == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN || a2 == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                String network4 = network.toString();
                String valueOf4 = String.valueOf(a2);
                int i = baxz.b;
                int i2 = baxz.c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(network4).length() + 84 + String.valueOf(valueOf4).length());
                sb2.append("Network ");
                sb2.append(network4);
                sb2.append(" connection type is ");
                sb2.append(valueOf4);
                sb2.append(" because it has type ");
                sb2.append(i);
                sb2.append(" and subtype ");
                sb2.append(i2);
                Logging.a("NetworkMonitorAutoDetect", sb2.toString());
            }
            if (baxz.b == 17) {
                networkMonitorAutoDetect$ConnectionType = baye.a(baxz.a, baxz.d, baxz.e);
            } else {
                networkMonitorAutoDetect$ConnectionType = NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
            }
            String interfaceName = linkProperties.getInterfaceName();
            long a3 = baye.a(network);
            NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr = new NetworkMonitorAutoDetect$IPAddress[linkProperties.getLinkAddresses().size()];
            int i3 = 0;
            for (LinkAddress address : linkProperties.getLinkAddresses()) {
                networkMonitorAutoDetect$IPAddressArr[i3] = new NetworkMonitorAutoDetect$IPAddress(address.getAddress().getAddress());
                i3++;
            }
            return new NetworkMonitorAutoDetect$NetworkInformation(interfaceName, a2, networkMonitorAutoDetect$ConnectionType, a3, networkMonitorAutoDetect$IPAddressArr);
        }
    }

    public final void a(ConnectivityManager.NetworkCallback networkCallback) {
        if (b()) {
            Logging.a("NetworkMonitorAutoDetect", "Unregister network callback");
            this.a.unregisterNetworkCallback(networkCallback);
        }
    }
}
