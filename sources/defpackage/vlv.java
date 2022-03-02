package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlv implements Callable {
    private final vmt a;
    private final wbv b;
    private final String c;

    public vlv(vmt vmt, wbv wbv, String str) {
        this.a = vmt;
        this.b = wbv;
        this.c = str;
    }

    public final Object call() {
        vmt vmt = this.a;
        wbv wbv = this.b;
        String str = this.c;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        vmv vmv = new vmv(str, vmt.a);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.w.a((wbx) wbv, vmv);
        jjg jjg = vvj.a;
        return 0;
    }
}
