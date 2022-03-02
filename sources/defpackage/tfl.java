package defpackage;

import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;

/* renamed from: tfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfl implements Runnable {
    final /* synthetic */ DisableTargetRequest a;
    final /* synthetic */ tfq b;

    public tfl(tfq tfq, DisableTargetRequest disableTargetRequest) {
        this.b = tfq;
        this.a = disableTargetRequest;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            a2.a(this.a.b);
        }
    }
}
