package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlk implements Callable {
    private final vmt a;
    private final CancelParams b;

    public vlk(vmt vmt, CancelParams cancelParams) {
        this.a = vmt;
        this.b = cancelParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        CancelParams cancelParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        ShareTarget shareTarget = cancelParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.b(shareTarget));
    }
}
