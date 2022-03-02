package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: lhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lhl extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ lhn a;

    public lhl(lhn lhn) {
        this.a = lhn;
    }

    private final void a() {
        lhn lhn = this.a;
        ith ith = lhn.a;
        for (lhe a2 : lhn.e) {
            a2.a();
        }
    }

    public final void onAvailable(Network network) {
        lhn lhn = this.a;
        ith ith = lhn.a;
        synchronized (lhn.c) {
            this.a.d.add(network);
            a();
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        lhn lhn = this.a;
        ith ith = lhn.a;
        synchronized (lhn.c) {
            a();
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
    }

    public final void onLosing(Network network, int i) {
    }

    public final void onLost(Network network) {
        lhn lhn = this.a;
        ith ith = lhn.a;
        synchronized (lhn.c) {
            this.a.d.remove(network);
            lhn.a.a("Lost %s", network);
            a();
        }
    }
}
