package defpackage;

/* renamed from: alwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwi implements alvb {
    private final alvo a = new alvo();
    private final alvp b = new alvp();
    private final alvs c = new alvs();
    private final alvu d = new alvu();
    private final alvz e = new alvz();
    private final alwf f = new alwf();
    private final alvn g = new alvn(this);
    private final alwg h = new alwg();
    private final alwt i = new alwt();
    private final alwx j = new alwx();

    public final void a(alzd alzd, amiw amiw) {
        amiv amiv = amiv.KIND_NOT_SET;
        switch (amiw.b.ordinal()) {
            case 0:
                this.h.b(alzd);
                return;
            case 1:
                this.a.a(alzd, amiw);
                return;
            case 2:
                this.c.a(alzd, amiw);
                return;
            case 3:
                this.e.a(alzd, amiw);
                return;
            case 5:
                this.b.a(alzd, amiw);
                return;
            case 6:
                this.i.a(alzd, amiw);
                return;
            case 7:
                this.j.a(alzd, amiw);
                return;
            case 8:
                this.f.a(alzd, amiw);
                return;
            case 9:
                this.d.a(alzd, amiw);
                return;
            case 10:
                this.g.a(alzd, amiw);
                return;
            default:
                throw new IllegalArgumentException(amiw.toString());
        }
    }
}
