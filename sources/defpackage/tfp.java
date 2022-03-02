package defpackage;

import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;

/* renamed from: tfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfp implements Runnable {
    final /* synthetic */ DisconnectRequest a;
    final /* synthetic */ tfq b;

    public tfp(tfq tfq, DisconnectRequest disconnectRequest) {
        this.b = tfq;
        this.a = disconnectRequest;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            teb teb = this.a.c;
            tdk d = a2.d();
            if (d == null) {
                a2.a(teb, 2982);
                return;
            }
            a2.j.a(11, d);
            d.m();
            if (a2.c()) {
                a2.d.k();
                a2.d = null;
            }
            a2.b(teb);
        }
    }
}
