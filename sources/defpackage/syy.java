package defpackage;

/* renamed from: syy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syy implements Runnable {
    final /* synthetic */ szf a;
    final /* synthetic */ sze b;

    public syy(sze sze, szf szf) {
        this.b = sze;
        this.a = szf;
    }

    public final void run() {
        sze sze = this.b;
        szf szf = this.a;
        sze.r();
        spj spj = new spj(sze);
        spj.r();
        sze.b = spj;
        sze.d().a = sze.a;
        spb spb = new spb(sze);
        spb.r();
        sze.e = spb;
        sxi c = szf.c(sze);
        c.r();
        sze.f = c;
        syv b2 = szf.b(sze);
        b2.r();
        sze.d = b2;
        sze.c = new suz(sze);
        if (sze.k != sze.l) {
            sze.E().c.a("Not all upload components initialized", Integer.valueOf(sze.k), Integer.valueOf(sze.l));
        }
        sze.h = true;
        sze sze2 = this.b;
        sze2.r();
        sze2.h().k();
        if (sze2.e().d.a() == 0) {
            sze2.e().d.a(sze2.o().a());
        }
        sze2.w();
    }
}
