package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* renamed from: uur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uur extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ int a;
    final /* synthetic */ uvf b;
    final /* synthetic */ uue c;

    public uur(uvf uvf, int i, uue uue) {
        this.b = uvf;
        this.a = i;
        this.c = uue;
    }

    public final void onAvailable(Network network) {
        ((anih) ((anih) ulh.a.d()).a("uur", "onAvailable", 545, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully hosted WiFi Aware network.");
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.b.a((Runnable) new uuq(this, linkProperties, this.a, this.c));
    }

    public final void onLost(Network network) {
        ((anih) ((anih) ulh.a.d()).a("uur", "onLost", 558, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Lost connection to the WiFi Aware network.");
    }
}
