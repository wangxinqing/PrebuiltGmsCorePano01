package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: rzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rzo extends igi {
    final /* synthetic */ rzw c;
    final /* synthetic */ LatestFootprintFilter d;
    final /* synthetic */ sac e;
    final /* synthetic */ afil f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rzo(sac sac, ige ige, rzw rzw, afil afil, LatestFootprintFilter latestFootprintFilter) {
        super(ige);
        this.e = sac;
        this.c = rzw;
        this.f = afil;
        this.d = latestFootprintFilter;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        sag sag;
        sbf sbf = (sbf) ibf;
        rzw rzw = this.c;
        afil afil = this.f;
        synchronized (rzw.b.i) {
            if (rzw.a) {
                if (rzw.c == null) {
                    rzw.c = new sag(rzw.b.b, afil);
                }
                sag sag2 = rzw.c;
                sag = sag2;
            } else {
                sag = null;
            }
        }
        if (sag != null) {
            sas A = sbf.A();
            rzr rzr = new rzr(acwd);
            sac sac = this.e;
            A.a(rzr, sac.e, sac.f, sac.g, this.d, sag);
            return;
        }
        acwd.a((Object) null);
    }
}
