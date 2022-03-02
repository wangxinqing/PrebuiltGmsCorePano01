package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vll implements Callable {
    private final vmt a;
    private final RejectParams b;

    public vll(vmt vmt, RejectParams rejectParams) {
        this.a = vmt;
        this.b = rejectParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        RejectParams rejectParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        ShareTarget shareTarget = rejectParams.a;
        Charset charset = NearbySharingChimeraService.a;
        int b2 = nearbySharingChimeraService.a(shareTarget).b(shareTarget);
        nearbySharingChimeraService.t = null;
        nearbySharingChimeraService.r.a(vvb.a(3));
        ((anih) vvj.a.d()).a("Client rejected incoming file from %s", (Object) shareTarget);
        return Integer.valueOf(b2);
    }
}
