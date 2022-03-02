package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vly implements Callable {
    private final vmt a;

    public vly(vmt vmt) {
        this.a = vmt;
    }

    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a.c;
        Charset charset = NearbySharingChimeraService.a;
        int i = 0;
        if (!nearbySharingChimeraService.d().getBoolean("opt_in", false)) {
            nearbySharingChimeraService.d().edit().putBoolean("opt_in", true).apply();
            nearbySharingChimeraService.v();
            vva vva = nearbySharingChimeraService.r;
            aucd d = vvb.d(2);
            if (d.c) {
                d.c();
                d.c = false;
            }
            asmc asmc = (asmc) d.b;
            asmc asmc2 = asmc.B;
            asmc.b = 1;
            asmc.a = 1 | asmc.a;
            askz askz = askz.a;
            if (d.c) {
                d.c();
                d.c = false;
            }
            asmc asmc3 = (asmc) d.b;
            askz.getClass();
            asmc3.c = askz;
            asmc3.a |= 4;
            vva.a(new vuv((asmc) d.i()));
            ((anih) vvj.a.d()).a("NearbySharing was opted in");
        } else {
            i = 35500;
        }
        return Integer.valueOf(i);
    }
}
