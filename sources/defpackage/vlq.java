package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlq implements Callable {
    private final vmt a;
    private final vtx b;
    private final int c;

    public vlq(vmt vmt, vtx vtx, int i) {
        this.a = vmt;
        this.b = vtx;
        this.c = i;
    }

    public final Object call() {
        oq oqVar;
        vmt vmt = this.a;
        vtx vtx = this.b;
        int i = this.c;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        Charset charset = NearbySharingChimeraService.a;
        if (i == 1 && (oqVar = nearbySharingChimeraService.t) != null) {
            vtx.a((ShareTarget) oqVar.a, (TransferMetadata) oqVar.b);
        }
        nearbySharingChimeraService.l.put(vtx, Integer.valueOf(i));
        ((anih) vvj.a.d()).a("A receive surface has been registered");
        nearbySharingChimeraService.g();
        nearbySharingChimeraService.v();
        return 0;
    }
}
