package defpackage;

import java.util.Collection;

/* renamed from: alwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwt extends alvf {
    private final alwe a = new alwe(new alwk());
    private final alwd b = new alws();

    public alwt() {
        super(11);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        amjk c = amjl.c();
        String g = alze.g();
        c.a = alze.b();
        this.b.a(alze, (Object) c);
        return aluv.a(g, c.a());
    }

    public final void a(alzd alzd, amiw amiw) {
        amjl d = amiw.d();
        a(alzd);
        alzd.b(amiw.c);
        alzd.a(d.b);
        this.a.a(alzd, (Collection) d.b());
        alzd.b();
    }
}
