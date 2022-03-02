package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: vlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlj implements Callable {
    private final vmt a;
    private final OpenParams b;

    public vlj(vmt vmt, OpenParams openParams) {
        this.a = vmt;
        this.b = openParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        OpenParams openParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        ShareTarget shareTarget = openParams.a;
        Charset charset = NearbySharingChimeraService.a;
        int c = nearbySharingChimeraService.a(shareTarget).c(shareTarget);
        nearbySharingChimeraService.t = null;
        vva vva = nearbySharingChimeraService.r;
        List b2 = shareTarget.b();
        aucd d = vvb.d(22);
        aucd o = aslk.c.o();
        asld a2 = vvb.a(b2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslk aslk = (aslk) o.b;
        a2.getClass();
        aslk.b = a2;
        aslk.a |= 1;
        aslk aslk2 = (aslk) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslk2.getClass();
        asmc.u = aslk2;
        asmc.a |= 4194304;
        vva.a(new vut((asmc) d.i()));
        ((anih) vvj.a.d()).a("Client opened incoming file from %s", (Object) shareTarget);
        return Integer.valueOf(c);
    }
}
