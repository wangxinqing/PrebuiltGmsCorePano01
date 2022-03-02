package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: unf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class unf implements WifiP2pManager.ChannelListener {
    private final uoh a;

    public unf(uoh uoh) {
        this.a = uoh;
    }

    public final void onChannelDisconnected() {
        uoh uoh = this.a;
        uoh.a((Runnable) new unl(uoh));
    }
}
