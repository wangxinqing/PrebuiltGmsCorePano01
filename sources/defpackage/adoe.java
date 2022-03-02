package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.CountDownLatch;

/* renamed from: adoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adoe extends ConnectivityManager.NetworkCallback {
    public final CountDownLatch a = new CountDownLatch(1);
    final /* synthetic */ adog b;
    private final Object c = new Object();

    public adoe(adog adog) {
        this.b = adog;
        adog.e = ampu.a;
    }

    public final void onAvailable(Network network) {
        synchronized (this.c) {
            adog adog = this.b;
            iwd iwd = adog.a;
            amrl.a(adod.b(adog.b));
            adod adod = new adod(amri.b(network));
            synchronized (adog.c) {
                if (!adog.e.a()) {
                    adog.a.c("Network acquired.", new Object[0]);
                    adog.e = amri.b(adod);
                } else if (!((adod) adog.e.b()).equals(adod)) {
                    adog.a.d("Releasing the network because a different network is available.", new Object[0]);
                    adog.b();
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
