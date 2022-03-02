package defpackage;

import android.app.Application;

/* renamed from: aggk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aggk {
    private final agdz a;

    public aggk(Application application, agdz agdz) {
        awdx.a(application);
        agdz.a = application;
        agdz.a((amsv) new aggh(application));
        agdz.a(aghs.i().a());
        amsv amsv = aggi.a;
        awdx.a(amsv);
        agdz.e = amsv;
        agjh agjh = new agjh();
        awdx.a(agjh);
        agdz.f = agjh;
        this.a = agdz;
    }

    public final agft a() {
        agdz agdz = this.a;
        awdx.a((Object) agdz.a, Application.class);
        awdx.a((Object) agdz.b, amsv.class);
        awdx.a((Object) agdz.c, amsv.class);
        awdx.a((Object) agdz.d, aghs.class);
        awdx.a((Object) agdz.e, amsv.class);
        awdx.a((Object) agdz.f, agit.class);
        return new agea(agdz.a, agdz.b, agdz.c, agdz.d, agdz.e, agdz.f);
    }

    public final void a(aghs aghs) {
        this.a.a(aghs);
    }

    public final void a(amsv amsv) {
        this.a.a(amsv);
    }

    public final void a(bapu bapu) {
        agdz agdz = this.a;
        bapu.getClass();
        aggj aggj = new aggj(bapu);
        awdx.a(aggj);
        agdz.b = aggj;
    }
}
