package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: rzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rzd implements Runnable {
    private final sac a;
    private final LatestFootprintFilter b;
    private final acwd c;

    public rzd(sac sac, LatestFootprintFilter latestFootprintFilter, acwd acwd) {
        this.a = sac;
        this.b = latestFootprintFilter;
        this.c = acwd;
    }

    public final void run() {
        sac sac = this.a;
        LatestFootprintFilter latestFootprintFilter = this.b;
        acwd acwd = this.c;
        sbb sbb = sac.c;
        iha b2 = ihb.b();
        b2.a = new rzi(sac, latestFootprintFilter);
        b2.b = new Feature[]{oqd.a};
        sbb.a(b2.a()).a(sac.a, (acvp) new rzj(acwd));
    }
}
