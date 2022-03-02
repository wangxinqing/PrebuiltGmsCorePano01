package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: rzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rzc implements Runnable {
    private final sac a;
    private final LatestFootprintFilter b;
    private final acwd c;

    public rzc(sac sac, LatestFootprintFilter latestFootprintFilter, acwd acwd) {
        this.a = sac;
        this.b = latestFootprintFilter;
        this.c = acwd;
    }

    public final void run() {
        sac sac = this.a;
        sac.c.a((ihb) new rzl(sac, this.b)).a(sac.a, (acvp) new rzk(this.c));
    }
}
