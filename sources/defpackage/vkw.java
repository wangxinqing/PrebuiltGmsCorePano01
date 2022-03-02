package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;

/* renamed from: vkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkw implements Runnable {
    private final vmt a;
    private final UnmarkContactAsSelectedParams b;

    public vkw(vmt vmt, UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        this.a = vmt;
        this.b = unmarkContactAsSelectedParams;
    }

    public final void run() {
        vmt vmt = this.a;
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "unmarkContactAsSelected", unmarkContactAsSelectedParams.b, new vlh(vmt, unmarkContactAsSelectedParams));
    }
}
