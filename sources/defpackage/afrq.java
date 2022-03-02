package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrq {
    public final afqw a;
    public bapu b;
    public bapu c;
    public bapu d;
    public bapu e;
    public bapu f;
    public bapu g;
    private bapu h;
    private bapu i;
    private bapu j;
    private bapu k;
    private bapu l;
    private bapu m;

    public afrq() {
    }

    public final afqu a() {
        return new afqu(afqx.a(this.a), (afmh) this.c.a(), (amri) this.d.a());
    }

    public final afpi b() {
        return new afpi(afqx.a(this.a), (aekn) this.g.a(), (afmh) this.c.a(), (amri) this.d.a(), (Executor) this.f.a());
    }

    public final afqr c() {
        return new afqr(afqx.a(this.a), (afmh) this.c.a(), a(), (agzs) this.e.a(), new afrz(afqx.a(this.a), (amsv) this.i.a(), (agzs) this.e.a(), (afsz) this.j.a(), (amri) this.k.a(), (Executor) this.f.a()), (amri) this.l.a(), (amri) this.k.a(), (afsb) this.b.a(), b(), (amri) this.d.a(), (Executor) this.f.a());
    }

    public final afpf d() {
        return new afpf(afqx.a(this.a), (afsb) this.b.a(), (afmh) this.c.a(), b(), c(), (aekn) this.g.a(), (amri) this.m.a(), (Executor) this.f.a(), (amri) this.d.a());
    }

    public afrq(afqw afqw, afqz afqz, afrc afrc, afrg afrg) {
        this.a = afqw;
        afqx afqx = new afqx(afqw);
        this.h = afqx;
        this.b = awds.a(new afrl(afrg, afqx));
        this.c = awds.a(new afrp(afrg));
        this.d = awds.a(new afrm(afrg));
        this.e = awds.a(new afro(afrg));
        this.i = awds.a(new afrb(afqz));
        this.j = awds.a(new afrn(afrg));
        this.k = awds.a(new afrk(afrg));
        this.f = awds.a(new afrd(afrc));
        this.l = awds.a(new afra(afqz));
        this.g = awds.a(afri.a);
        this.m = awds.a(new afrh(this.h));
    }
}
