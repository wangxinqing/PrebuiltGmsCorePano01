package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OpenParams;

/* renamed from: vkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkr implements Runnable {
    private final vmt a;
    private final OpenParams b;

    public vkr(vmt vmt, OpenParams openParams) {
        this.a = vmt;
        this.b = openParams;
    }

    public final void run() {
        vmt vmt = this.a;
        OpenParams openParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "open", openParams.b, new vlj(vmt, openParams));
    }
}
