package defpackage;

/* renamed from: cnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cnv implements cpn {
    private final cny a;
    private final cmw b;
    private final Iterable c;
    private final cmm d;
    private final int e;

    public cnv(cny cny, cmw cmw, Iterable iterable, cmm cmm, int i) {
        this.a = cny;
        this.b = cmw;
        this.c = iterable;
        this.d = cmm;
        this.e = i;
    }

    public final Object a() {
        cny cny = this.a;
        cmw cmw = this.b;
        Iterable iterable = this.c;
        cmm cmm = this.d;
        int i = this.e;
        if (cmw.b() == 2) {
            cny.b.a(iterable);
            cny.c.a(cmm, i + 1);
            return null;
        }
        cny.b.b(iterable);
        if (cmw.b() == 1) {
            cny.b.a(cmm, System.currentTimeMillis() + cmw.a());
        }
        if (!cny.b.b(cmm)) {
            return null;
        }
        cny.c.a(cmm, 1);
        return null;
    }
}
