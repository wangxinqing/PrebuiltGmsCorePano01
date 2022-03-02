package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import java.nio.charset.Charset;

/* renamed from: vmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vmi extends vym {
    final /* synthetic */ vsh a;
    final /* synthetic */ vmm b;

    public vmi(vmm vmm, vsh vsh) {
        this.b = vmm;
        this.a = vsh;
    }

    public final void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        vmm vmm = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmm.b.c;
        vmg vmg = new vmg(this, onShareTargetDiscoveredParams, vmm.a, this.a);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vmg);
    }

    public final void a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
    }

    public final void a(OnShareTargetLostParams onShareTargetLostParams) {
        NearbySharingChimeraService nearbySharingChimeraService = this.b.b.c;
        vmh vmh = new vmh(this, onShareTargetLostParams, this.a);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vmh);
    }
}
