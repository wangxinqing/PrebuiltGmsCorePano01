package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: vlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlp implements Callable {
    private final vmt a;
    private final vmr b;

    public vlp(vmt vmt, vmr vmr) {
        this.a = vmt;
        this.b = vmr;
    }

    public final Object call() {
        oq oqVar;
        oq oqVar2;
        vmt vmt = this.a;
        vmr vmr = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        vtx vtx = vmr.a;
        Charset charset = NearbySharingChimeraService.a;
        if (nearbySharingChimeraService.p() && (oqVar2 = nearbySharingChimeraService.t) != null && ((TransferMetadata) oqVar2.b).e) {
            nearbySharingChimeraService.t = null;
        }
        nearbySharingChimeraService.l.remove(vtx);
        if (!nearbySharingChimeraService.p() && (oqVar = nearbySharingChimeraService.t) != null) {
            ShareTarget shareTarget = (ShareTarget) oqVar.a;
            TransferMetadata transferMetadata = (TransferMetadata) oqVar.b;
            List b2 = nearbySharingChimeraService.b(0);
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                ((vtx) b2.get(i)).a(shareTarget, transferMetadata);
            }
        }
        ((anih) vvj.a.d()).a("A receive surface has been unregistered");
        nearbySharingChimeraService.g();
        nearbySharingChimeraService.v();
        return 0;
    }
}
