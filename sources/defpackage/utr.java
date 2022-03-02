package defpackage;

import android.net.wifi.aware.DiscoverySession;

/* renamed from: utr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utr implements Runnable {
    private final uts a;
    private final DiscoverySession b;

    public utr(uts uts, DiscoverySession discoverySession) {
        this.a = uts;
        this.b = discoverySession;
    }

    public final void run() {
        this.a.g(this.b);
    }
}
