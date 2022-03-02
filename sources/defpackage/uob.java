package defpackage;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: uob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uob implements WifiP2pManager.GroupInfoListener {
    private final uog a;
    private final CountDownLatch b;
    private final WifiP2pManager.Channel c;

    public uob(uog uog, CountDownLatch countDownLatch, WifiP2pManager.Channel channel) {
        this.a = uog;
        this.b = countDownLatch;
        this.c = channel;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        uog uog = this.a;
        CountDownLatch countDownLatch = this.b;
        WifiP2pManager.Channel channel = this.c;
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            uog.a.removeGroup(channel, new uoe(countDownLatch));
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uog", "a", 1448, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }
}
