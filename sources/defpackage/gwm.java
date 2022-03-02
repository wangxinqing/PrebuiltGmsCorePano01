package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.CountDownLatch;

/* renamed from: gwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gwm extends ConnectivityManager.NetworkCallback {
    public final CountDownLatch a = new CountDownLatch(1);
    final /* synthetic */ gwn b;
    private final Object c = new Object();

    public gwm(gwn gwn) {
        this.b = gwn;
        gwn.d = ampu.a;
    }

    public final void onAvailable(Network network) {
        synchronized (this.c) {
            gwn gwn = this.b;
            iwd iwd = gwn.a;
            synchronized (gwn.c) {
                if (!gwn.d.a()) {
                    gwn.a.c("Network acquired.", new Object[0]);
                    gwn.d = amri.b(network);
                } else if (!((Network) gwn.d.b()).equals(network)) {
                    gwn.a.d("Releasing the network because a different network is available.", new Object[0]);
                    gwn.b();
                }
            }
            this.a.countDown();
        }
    }

    public final void onLost(Network network) {
        synchronized (this.c) {
            this.b.b();
            this.a.countDown();
        }
    }
}
