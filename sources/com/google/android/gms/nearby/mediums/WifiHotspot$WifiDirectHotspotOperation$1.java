package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiHotspot$WifiDirectHotspotOperation$1 extends nla {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiHotspot$WifiDirectHotspotOperation$1(String str, aosh aosh) {
        super(str);
        this.a = aosh;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null && wifiP2pInfo != null) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1", "a", 1322, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully created a Wifi Direct hotspot. SSID=%s, IP address=%s", (Object) wifiP2pGroup.getNetworkName(), (Object) wifiP2pInfo.groupOwnerAddress.getHostAddress());
                try {
                    this.a.b((Object) new unu(wifiP2pGroup.getNetworkName(), wifiP2pGroup.getPassphrase(), InetAddress.getByName(wifiP2pInfo.groupOwnerAddress.getHostAddress()), "192.168.49.1"));
                } catch (UnknownHostException e) {
                    anih anih = (anih) ulh.a.b();
                    anih.a((Throwable) e);
                    ((anih) anih.a("com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1", "a", 1334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse IP address.");
                    this.a.a((Throwable) e);
                }
            }
        }
    }
}
