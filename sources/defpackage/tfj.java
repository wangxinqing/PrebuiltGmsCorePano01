package defpackage;

import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: tfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfj implements Runnable {
    final /* synthetic */ StopScanRequest a;
    final /* synthetic */ tfq b;

    public tfj(tfq tfq, StopScanRequest stopScanRequest) {
        this.b = tfq;
        this.a = stopScanRequest;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            teb teb = this.a.b;
            if (!a2.a()) {
                a2.a(teb, -1);
                return;
            }
            a2.c.a();
            a2.j.a(5, a2.c);
            a2.b(teb);
        }
    }
}
