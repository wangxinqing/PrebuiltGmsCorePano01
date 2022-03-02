package defpackage;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: uoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uoe implements WifiP2pManager.ActionListener {
    final /* synthetic */ CountDownLatch a;

    public uoe(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void onFailure(int i) {
        ((anih) ((anih) ulh.a.b()).a("uoe", "onFailure", 1464, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop Wifi Direct hotspot: %s.", (Object) ulg.a(i));
        this.a.countDown();
    }

    public final void onSuccess() {
        jjg jjg = ulh.a;
        this.a.countDown();
    }
}
