package defpackage;

import com.google.android.cast.JGCastService;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlf implements Callable {
    private final vmt a;
    private final SetDataUsageParams b;

    public vlf(vmt vmt, SetDataUsageParams setDataUsageParams) {
        this.a = vmt;
        this.b = setDataUsageParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SetDataUsageParams setDataUsageParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        int i = setDataUsageParams.a;
        Charset charset = NearbySharingChimeraService.a;
        int l = nearbySharingChimeraService.l();
        int i2 = 0;
        if (l == i) {
            i2 = 35500;
        } else if (i == 1 || i == 2 || i == 3) {
            nearbySharingChimeraService.d().edit().putInt("data_usage", i).apply();
            vva vva = nearbySharingChimeraService.r;
            aucd d = vvb.d(29);
            aucd o = aslx.d.o();
            int c = vvb.c(l);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aslx aslx = (aslx) o.b;
            aslx.b = c - 1;
            aslx.a |= 1;
            int c2 = vvb.c(i);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aslx aslx2 = (aslx) o.b;
            aslx2.c = c2 - 1;
            aslx2.a |= 2;
            if (d.c) {
                d.c();
                d.c = false;
            }
            asmc asmc = (asmc) d.b;
            aslx aslx3 = (aslx) o.i();
            asmc asmc2 = asmc.B;
            aslx3.getClass();
            asmc.z = aslx3;
            asmc.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
            vva.a(new vuv((asmc) d.i()));
            ((anih) vvj.a.d()).a("Data usage preference state changed to %s", (Object) nearbySharingChimeraService.c(i));
            nearbySharingChimeraService.g();
            nearbySharingChimeraService.v();
        } else {
            ((anih) vvj.a.c()).a("Invalid Data Usage Preference. Refer to SharingClient to see all valid cases.");
            i2 = 13;
        }
        return Integer.valueOf(i2);
    }
}
