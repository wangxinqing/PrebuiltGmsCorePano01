package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubb extends arwm {
    final /* synthetic */ DiscoveryChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubb(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.a = discoveryChimeraService;
    }

    public final void run() {
        jjg jjg = tsp.a;
        tsm tsm = this.a.b;
        synchronized (tsm.e) {
            tsm.f.add(tsl.UNSUBSCRIBE_BACKGROUND);
        }
        tsm.b.c(tsm.c);
        this.a.c.a();
        this.a.d.a(1);
    }
}
