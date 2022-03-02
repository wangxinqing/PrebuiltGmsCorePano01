package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ubj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ubj extends arxy {
    public final void a() {
        jjg jjg = tsp.a;
        DiscoveryChimeraService discoveryChimeraService = this.a;
        if (!arxk.a((Context) discoveryChimeraService, tfx.a(discoveryChimeraService))) {
            discoveryChimeraService.c.a();
        }
        this.a.d.d.a();
        this.a.a(1);
    }

    public final void b() {
        jjg jjg = tsp.a;
        this.a.a(0);
    }

    public ubj(DiscoveryChimeraService discoveryChimeraService, arwg arwg) {
        super(discoveryChimeraService, arwg);
    }
}
