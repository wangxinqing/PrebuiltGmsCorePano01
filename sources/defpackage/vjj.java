package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjj implements Runnable {
    private final NearbySharingChimeraService a;

    public vjj(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        nearbySharingChimeraService.w();
        nearbySharingChimeraService.t();
        nearbySharingChimeraService.o.a();
    }
}
