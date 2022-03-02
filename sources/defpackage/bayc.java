package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect$IPAddress;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: bayc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayc extends BroadcastReceiver {
    public final Context a;
    public NetworkMonitorAutoDetect$NetworkInformation b;
    private final baxv c;

    public bayc(baxv baxv, Context context) {
        this.a = context;
        this.c = baxv;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        context.registerReceiver(this, intentFilter);
        if (Build.VERSION.SDK_INT > 28) {
            WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
            wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), (WifiP2pManager.ChannelListener) null), new bayb(this));
        }
    }

    public final void a(WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
            try {
                ArrayList<T> list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr = new NetworkMonitorAutoDetect$IPAddress[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    networkMonitorAutoDetect$IPAddressArr[i] = new NetworkMonitorAutoDetect$IPAddress(((InetAddress) list.get(i)).getAddress());
                }
                NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation = new NetworkMonitorAutoDetect$NetworkInformation(wifiP2pGroup.getInterface(), NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI, NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE, 0, networkMonitorAutoDetect$IPAddressArr);
                this.b = networkMonitorAutoDetect$NetworkInformation;
                this.c.a(networkMonitorAutoDetect$NetworkInformation);
            } catch (SocketException e) {
                Logging.a("NetworkMonitorAutoDetect", "Unable to get WifiP2p network interface", (Throwable) e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            a((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
        } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("wifi_p2p_state", 0) == 1) {
            this.b = null;
            this.c.a(0);
        }
    }
}
