package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: vlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlr implements Callable {
    private final vmt a;
    private final vms b;

    public vlr(vmt vmt, vms vms) {
        this.a = vmt;
        this.b = vms;
    }

    public final Object call() {
        oq oqVar;
        oq oqVar2;
        vmt vmt = this.a;
        vms vms = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        vtx vtx = vms.a;
        Charset charset = NearbySharingChimeraService.a;
        if (nearbySharingChimeraService.a(1, 3) && (oqVar2 = nearbySharingChimeraService.u) != null && ((TransferMetadata) oqVar2.b).e) {
            nearbySharingChimeraService.u = null;
        }
        nearbySharingChimeraService.m.remove(vtx);
        if (!nearbySharingChimeraService.a(1, 3) && (oqVar = nearbySharingChimeraService.u) != null) {
            ShareTarget shareTarget = (ShareTarget) oqVar.a;
            TransferMetadata transferMetadata = (TransferMetadata) oqVar.b;
            List b2 = nearbySharingChimeraService.b(0);
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                ((vtx) ((oq) b2.get(i)).a).a(shareTarget, transferMetadata);
            }
        }
        ((anih) vvj.a.d()).a("A share sheet has been unregistered");
        nearbySharingChimeraService.h();
        nearbySharingChimeraService.v();
        return 0;
    }
}
