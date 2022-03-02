package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

/* renamed from: vkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkq implements Runnable {
    private final vmt a;
    private final CancelParams b;

    public vkq(vmt vmt, CancelParams cancelParams) {
        this.a = vmt;
        this.b = cancelParams;
    }

    public final void run() {
        vmt vmt = this.a;
        CancelParams cancelParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "cancel", cancelParams.b, new vlk(vmt, cancelParams));
    }
}
