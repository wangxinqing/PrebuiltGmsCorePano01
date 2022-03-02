package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;

/* renamed from: vkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkj implements Runnable {
    private final vmt a;
    private final UnregisterSendSurfaceParams b;
    private final vms c;

    public vkj(vmt vmt, UnregisterSendSurfaceParams unregisterSendSurfaceParams, vms vms) {
        this.a = vmt;
        this.b = unregisterSendSurfaceParams;
        this.c = vms;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "unregisterSendSurface", this.b.b, new vlr(vmt, this.c));
    }
}
