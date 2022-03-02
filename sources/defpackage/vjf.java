package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjf {
    private final NearbySharingChimeraService a;

    public vjf(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void a(int i, int i2, vwg vwg) {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        nearbySharingChimeraService.a((Runnable) new vjg(nearbySharingChimeraService, i, i2, vwg));
    }
}
