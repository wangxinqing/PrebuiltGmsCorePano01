package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

/* renamed from: vkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkm implements Runnable {
    private final vmt a;
    private final UnregisterReceiveSurfaceParams b;
    private final vmr c;

    public vkm(vmt vmt, UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams, vmr vmr) {
        this.a = vmt;
        this.b = unregisterReceiveSurfaceParams;
        this.c = vmr;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "unregisterReceiveSurface", this.b.b, new vlp(vmt, this.c));
    }
}
