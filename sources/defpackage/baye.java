package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.PeerConnectionFactory;

/* renamed from: baye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baye extends BroadcastReceiver {
    public final Context a;
    public final ConnectivityManager.NetworkCallback b;
    public final ConnectivityManager.NetworkCallback c;
    public final baxy d;
    public bayc e;
    public boolean f;
    public final baxv g;
    private final IntentFilter h = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private final bayd i;
    private NetworkMonitorAutoDetect$ConnectionType j;
    private String k;

    public baye(baxv baxv, Context context) {
        this.g = baxv;
        this.a = context;
        this.d = new baxy(context);
        this.i = new bayd(context);
        baxz a2 = this.d.a();
        this.j = a(a2);
        this.k = b(a2);
        if (PeerConnectionFactory.a("IncludeWifiDirect").equals("Enabled")) {
            this.e = new bayc(baxv, context);
        }
        if (!this.f) {
            this.f = true;
            this.a.registerReceiver(this, this.h);
        }
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (this.d.b()) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
            try {
                baxy baxy = this.d;
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12).addTransportType(0);
                baxy.a.requestNetwork(builder.build(), networkCallback2);
                networkCallback = networkCallback2;
            } catch (SecurityException e2) {
                Logging.c("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
            }
            this.b = networkCallback;
            baya baya = new baya(this);
            this.c = baya;
            this.d.a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), baya);
            return;
        }
        this.b = null;
        this.c = null;
    }

    public static long a(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    private final String b(baxz baxz) {
        Intent registerReceiver;
        WifiInfo wifiInfo;
        String ssid;
        if (a(baxz) != NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI || (registerReceiver = this.i.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.net.wifi.STATE_CHANGE"))) == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) {
            return "";
        }
        return ssid;
    }

    public final void onReceive(Context context, Intent intent) {
        baxz a2 = a();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkMonitorAutoDetect$ConnectionType a3 = a(a2);
            String b2 = b(a2);
            if (a3 != this.j || !b2.equals(this.k)) {
                this.j = a3;
                this.k = b2;
                String valueOf = String.valueOf(a3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Network connectivity changed, type is: ");
                sb.append(valueOf);
                Logging.a("NetworkMonitorAutoDetect", sb.toString());
                NetworkMonitor networkMonitor = this.g.a;
                networkMonitor.a = a3;
                networkMonitor.b();
            }
        }
    }

    public static NetworkMonitorAutoDetect$ConnectionType a(baxz baxz) {
        return a(baxz.a, baxz.b, baxz.c);
    }

    public static NetworkMonitorAutoDetect$ConnectionType a(boolean z, int i2, int i3) {
        if (!z) {
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
        }
        if (i2 == 0) {
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                case Service.START_CONTINUATION_MASK:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_3G;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
                default:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
            }
        } else if (i2 == 1) {
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI;
        } else {
            if (i2 == 6) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
            }
            if (i2 == 7) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_BLUETOOTH;
            }
            if (i2 == 9) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_ETHERNET;
            }
            if (i2 != 17) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN;
            }
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_VPN;
        }
    }

    public final baxz a() {
        return this.d.a();
    }
}
