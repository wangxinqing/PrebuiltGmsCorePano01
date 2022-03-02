package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

/* renamed from: vkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkl implements Runnable {
    private final vmt a;
    private final RegisterReceiveSurfaceParams b;
    private final vtx c;
    private final int d;

    public vkl(vmt vmt, RegisterReceiveSurfaceParams registerReceiveSurfaceParams, vtx vtx, int i) {
        this.a = vmt;
        this.b = registerReceiveSurfaceParams;
        this.c = vtx;
        this.d = i;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "registerReceiveSurface", this.b.c, new vlq(vmt, this.c, this.d));
    }
}
