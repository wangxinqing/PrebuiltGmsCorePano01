package defpackage;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: umr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class umr implements WifiP2pManager.DeviceInfoListener {
    private final aosh a;

    public umr(aosh aosh) {
        this.a = aosh;
    }

    public final void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice) {
        this.a.b((Object) wifiP2pDevice);
    }
}
