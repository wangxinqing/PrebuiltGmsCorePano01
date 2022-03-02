package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjc implements Runnable {
    private final NearbySharingChimeraService a;

    public vjc(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        if (nearbySharingChimeraService.r() == null) {
            nearbySharingChimeraService.e();
        }
        nearbySharingChimeraService.k.c(nearbySharingChimeraService.n());
        nearbySharingChimeraService.b.a(nearbySharingChimeraService.m());
        if (nearbySharingChimeraService.k()) {
            nearbySharingChimeraService.a();
        }
        nearbySharingChimeraService.v();
    }
}
