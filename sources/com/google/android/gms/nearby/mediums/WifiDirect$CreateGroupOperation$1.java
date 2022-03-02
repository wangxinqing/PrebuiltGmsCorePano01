package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiDirect$CreateGroupOperation$1 extends nla {
    final /* synthetic */ aosh a;
    final /* synthetic */ unc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirect$CreateGroupOperation$1(unc unc, String str, aosh aosh) {
        super(str);
        this.b = unc;
        this.a = aosh;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            if (wifiP2pGroup == null) {
                jjg jjg = ulh.a;
            } else if (!wifiP2pGroup.isGroupOwner()) {
                jjg jjg2 = ulh.a;
            } else {
                this.b.c = wifiP2pGroup.getFrequency();
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.WifiDirect$CreateGroupOperation$1", "a", 619, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct group created on frequency %s", this.b.c);
                this.a.b((Object) null);
            }
        }
    }
}
