package defpackage;

import java.util.Collection;

/* renamed from: alvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvn extends alvf {
    private final alwe a;
    private final alwd b = new alvm();

    public alvn(alwi alwi) {
        super(4);
        this.a = new alwe(alwi);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        amid b2 = amie.b();
        this.b.a(alze, (Object) b2);
        String g = alze.g();
        if (g == null) {
            g = "";
        }
        b2.b = g;
        if (!alze.f()) {
            b2.c = alze.e();
        }
        return aluv.a(b2.b());
    }

    public final void a(alzd alzd, amiw amiw) {
        amie h = amiw.h();
        a(alzd);
        this.a.a(alzd, (Collection) h.a());
        alzd.b(h.b);
        alzd.a(h.c);
        alzd.a(true);
        alzd.b();
    }
}
