package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;
import java.nio.charset.Charset;

/* renamed from: vmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vmk extends vys {
    final /* synthetic */ vtx a;
    final /* synthetic */ vmm b;

    public vmk(vmm vmm, vtx vtx) {
        this.b = vmm;
        this.a = vtx;
    }

    public final void a(OnTransferUpdateParams onTransferUpdateParams) {
        vmm vmm = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmm.b.c;
        vmj vmj = new vmj(this, onTransferUpdateParams, vmm.a, this.a);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vmj);
    }
}
