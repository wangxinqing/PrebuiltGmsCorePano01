package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: umu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class umu implements WifiP2pManager.ActionListener {
    private final aosh a;

    public umu(aosh aosh) {
        this.a = aosh;
    }

    public final void onFailure(int i) {
        this.a.a((Throwable) new Exception(ulg.a(i)));
    }

    public void onSuccess() {
        this.a.b((Object) null);
    }
}
