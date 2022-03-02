package defpackage;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: bayb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bayb implements WifiP2pManager.GroupInfoListener {
    private final bayc a;

    public bayb(bayc bayc) {
        this.a = bayc;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.a.a(wifiP2pGroup);
    }
}
