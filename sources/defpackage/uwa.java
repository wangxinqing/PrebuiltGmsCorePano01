package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: uwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uwa implements WifiP2pManager.ChannelListener {
    private final uwc a;

    public uwa(uwc uwc) {
        this.a = uwc;
    }

    public final void onChannelDisconnected() {
        uwc uwc = this.a;
        ((anih) ((anih) ulh.a.d()).a("uwc", "c", 79, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct channel has disconnected.");
        uwc.a();
    }
}
