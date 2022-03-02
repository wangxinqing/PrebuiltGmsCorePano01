package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;

/* renamed from: uas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uas implements Runnable {
    private final DiscoveryChimeraService a;
    private final List b;

    public uas(DiscoveryChimeraService discoveryChimeraService, List list) {
        this.a = discoveryChimeraService;
        this.b = list;
    }

    public final void run() {
        DiscoveryChimeraService discoveryChimeraService = this.a;
        List list = this.b;
        if (((tvg) thl.a((Context) discoveryChimeraService, tvg.class)).b()) {
            if (discoveryChimeraService.l == null) {
                discoveryChimeraService.l = aoe.a((Context) discoveryChimeraService);
            }
            aryo.a(discoveryChimeraService.l, !list.isEmpty());
        }
    }
}
