package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlm implements Callable {
    private final vmt a;
    private final AcceptParams b;

    public vlm(vmt vmt, AcceptParams acceptParams) {
        this.a = vmt;
        this.b = acceptParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        AcceptParams acceptParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        ShareTarget shareTarget = acceptParams.a;
        Charset charset = NearbySharingChimeraService.a;
        int a2 = nearbySharingChimeraService.a(shareTarget).a(shareTarget);
        nearbySharingChimeraService.r.a(vvb.a(2));
        ((anih) vvj.a.d()).a("Client accepted incoming file from %s", (Object) shareTarget);
        return Integer.valueOf(a2);
    }
}
