package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: uoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uoc implements WifiP2pManager.ActionListener {
    final /* synthetic */ aosh a;

    public uoc(aosh aosh) {
        this.a = aosh;
    }

    public final void onFailure(int i) {
        aosh aosh = this.a;
        String valueOf = String.valueOf(ulg.a(i));
        aosh.a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to create Wifi Direct hotspot: ") : "Failed to create Wifi Direct hotspot: ".concat(valueOf)));
    }

    public final void onSuccess() {
        jjg jjg = ulh.a;
    }
}
