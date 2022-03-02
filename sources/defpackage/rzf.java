package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: rzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rzf implements Runnable {
    private final sac a;
    private final ige b;
    private final rzw c;
    private final LatestFootprintFilter d;
    private final igc e;
    private final acwd f;
    private final afil g;

    public rzf(sac sac, ige ige, rzw rzw, afil afil, LatestFootprintFilter latestFootprintFilter, igc igc, acwd acwd) {
        this.a = sac;
        this.b = ige;
        this.c = rzw;
        this.g = afil;
        this.d = latestFootprintFilter;
        this.e = igc;
        this.f = acwd;
    }

    public final void run() {
        sac sac = this.a;
        ige ige = this.b;
        rzw rzw = this.c;
        sac.d.a((igi) new rzo(sac, ige, rzw, this.g, this.d), (ihg) new rzq(sac, this.e, rzw)).a(sac.a, (acvp) new rzg(this.f));
    }
}
