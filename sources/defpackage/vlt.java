package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlt implements Callable {
    private final vmt a;
    private final vtx b;
    private final vsh c;
    private final int d;

    public vlt(vmt vmt, vtx vtx, vsh vsh, int i) {
        this.a = vmt;
        this.b = vtx;
        this.c = vsh;
        this.d = i;
    }

    public final Object call() {
        vmt vmt = this.a;
        vtx vtx = this.b;
        vsh vsh = this.c;
        int i = this.d;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.a(vtx, vsh, i));
    }
}
