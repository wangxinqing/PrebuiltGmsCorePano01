package defpackage;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: uof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uof implements WifiP2pManager.ActionListener {
    final /* synthetic */ CountDownLatch a;

    public uof(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void onFailure(int i) {
        ((anih) ((anih) ulh.a.b()).a("uof", "onFailure", 1649, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set Wifi Direct channels: %s.", (Object) ulg.a(i));
        this.a.countDown();
    }

    public final void onSuccess() {
        this.a.countDown();
    }
}
