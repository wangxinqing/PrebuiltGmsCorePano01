package defpackage;

import java.util.Collection;

/* renamed from: alvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvz extends alvf {
    private final alww a = new alww();
    private final alwe b = new alwe(new alwk());
    private final alwd c = new alvy();

    public alvz() {
        super(5);
    }

    /* renamed from: b */
    public final amiw a(alze alze) {
        amiw amiw;
        String g = alze.g();
        int b2 = alze.b();
        alze.c();
        if (alze.b() == 0) {
            amiq d = amir.d();
            d.a = b2;
            this.c.b(alze, d);
            amiw = aluv.a(g, d.a());
        } else {
            amiw = aluv.a(g, b2, alze.g());
        }
        alze.d();
        return amiw;
    }

    public final void a(alzd alzd, amiw amiw) {
        amir b2 = amiw.b();
        a(alzd);
        if (b2.a() > 0) {
            alzd.b(amiw.c);
            alzd.a(b2.b);
            this.b.a(alzd, (Collection) b2.b());
        } else if (!b2.d.isEmpty()) {
            alzd.b(amiw.c);
            alzd.a(b2.b);
            this.a.a(alzd, b2.d);
        } else {
            throw new IllegalArgumentException();
        }
        alzd.b();
    }
}
