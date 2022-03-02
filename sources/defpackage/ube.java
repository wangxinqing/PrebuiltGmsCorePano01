package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ube  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ube extends arwm {
    final /* synthetic */ DiscoveryChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ube(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.a = discoveryChimeraService;
    }

    public final void run() {
        for (ttg a2 : this.a.c.c()) {
            a2.a(true);
        }
        udc udc = this.a.g;
        for (ttg i : ((ttf) thl.a(udc.a, ttf.class)).c()) {
            udc.e.a(i.i());
        }
        udc.e.a("notification_id_beacon_opt_in");
        udc.e.a("notification_group_beacon");
        udc.e.a("notification_group_device");
        udc.e.a("notification_group_heads_up_device");
    }
}
