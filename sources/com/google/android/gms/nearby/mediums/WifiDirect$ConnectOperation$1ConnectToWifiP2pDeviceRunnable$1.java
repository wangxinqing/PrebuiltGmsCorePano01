package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 extends nla {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1(String str, aosh aosh) {
        super(str);
        this.a = aosh;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (wifiP2pGroup == null || wifiP2pInfo == null || networkInfo == null) {
                jjg jjg = ulh.a;
            } else if (!networkInfo.isConnected()) {
                jjg jjg2 = ulh.a;
            } else {
                this.a.b((Object) wifiP2pInfo.groupOwnerAddress);
            }
        }
    }
}
