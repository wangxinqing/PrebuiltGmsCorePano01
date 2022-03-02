package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: umw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umw implements WifiP2pManager.ActionListener {
    final /* synthetic */ aosh a;
    final /* synthetic */ umx b;

    public umw(umx umx, aosh aosh) {
        this.b = umx;
        this.a = aosh;
    }

    public final void onFailure(int i) {
        this.a.a((Throwable) new Exception(String.format("WifiDirect failed to connect to %s: %s", new Object[]{this.b.c, ulg.a(i)})));
    }

    public final void onSuccess() {
        jjg jjg = ulh.a;
    }
}
