package defpackage;

/* renamed from: ioz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioz implements ipi {
    public final bapu a;
    public final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;

    public ioz() {
        awdt a2 = awdu.a(this);
        this.c = a2;
        bapu a3 = awds.a(new ipj(a2));
        this.a = a3;
        this.d = awds.a(new iqy(a3));
        bapu a4 = awds.a(new nip(this.a));
        this.e = a4;
        this.f = awds.a(new niq(a4));
        bapu a5 = awds.a(new nir(this.e));
        this.g = a5;
        this.b = awds.a(new niy(this.d, this.f, a5));
    }

    public final ioy a(ira ira) {
        awdx.a(ira);
        return new ioy(this, ira);
    }
}
