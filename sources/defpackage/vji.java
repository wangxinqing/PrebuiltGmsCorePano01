package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vji implements acvv {
    private final NearbySharingChimeraService a;

    public vji(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void a(Object obj) {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        if (!((Boolean) obj).booleanValue()) {
            nearbySharingChimeraService.a((Runnable) new vjh(nearbySharingChimeraService));
        }
    }
}
