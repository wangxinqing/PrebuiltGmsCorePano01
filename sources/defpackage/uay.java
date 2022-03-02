package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: uay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uay extends arwm {
    final /* synthetic */ DiscoveryChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uay(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.a = discoveryChimeraService;
    }

    public final void run() {
        this.a.a.a();
    }
}
