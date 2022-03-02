package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;

/* renamed from: sab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sab extends ihb {
    final /* synthetic */ sac a;
    private final SyncPolicy b;
    private final LatestFootprintFilter c;

    public sab(sac sac, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.a = sac;
        this.b = syncPolicy;
        this.c = latestFootprintFilter;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        saa saa = new saa(acwd);
        sac sac = this.a;
        ((sav) ((sbc) ibf).x()).a((ifu) saa, sac.e, sac.f, sac.g, this.b, this.c);
    }
}
