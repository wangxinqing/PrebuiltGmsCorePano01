package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: nuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nuz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ nva a;

    public nuz(nva nva) {
        this.a = nva;
    }

    public final void onAvailable(Network network) {
        NetworkCapabilities networkCapabilities;
        if (axlc.n() && !axlc.c() && (networkCapabilities = this.a.b.getNetworkCapabilities(network)) != null && networkCapabilities.hasTransport(1)) {
            this.a.t.a(1).b(this.a.a);
        }
        if (axlc.u()) {
            this.a.a(network, 1);
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (axlc.n() && axlc.c() && networkCapabilities.hasTransport(1)) {
            num num = this.a.t.a(1).e;
            if (num.a() == null) {
                num.a(network);
                this.a.t.a(1).b(this.a.a);
            }
        }
        if (this.a.e.b() && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            this.a.b();
        }
    }

    public final void onLost(Network network) {
        if (axlc.n()) {
            if (axlc.c()) {
                num num = this.a.t.a(1).e;
                if (num.a().equals(network)) {
                    num.b();
                    this.a.t.a(1).b();
                }
            } else {
                NetworkCapabilities networkCapabilities = this.a.b.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    this.a.t.a(1).b();
                }
            }
        }
        if (axlc.u()) {
            this.a.a(network, 2);
        }
    }
}
