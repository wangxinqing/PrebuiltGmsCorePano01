package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlu implements Callable {
    private final vmt a;
    private final vmq b;

    public vlu(vmt vmt, vmq vmq) {
        this.a = vmt;
        this.b = vmq;
    }

    public final Object call() {
        int i;
        vmt vmt = this.a;
        vmq vmq = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        wbv wbv = vmq.a;
        Charset charset = NearbySharingChimeraService.a;
        if (nearbySharingChimeraService.w.a((wbx) wbv) == null) {
            ((anih) vvj.a.c()).a("Failed to unregister %s", (Object) wbv);
            i = 13;
        } else {
            jjg jjg = vvj.a;
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
