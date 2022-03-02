package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjb implements pkb {
    private final pkd a;
    private final bapu b = awds.a(pke.a);
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private final bapu i;
    private final bapu j;
    private final bapu k;
    private final bapu l;
    private final bapu m;
    private final bapu n;
    private final bapu o;
    private final bapu p;
    private final bapu q;
    private final bapu r;

    public pjb(pkd pkd) {
        this.a = pkd;
        this.c = new pir(pkd);
        this.d = new pis();
        this.e = new pit(pkd);
        pja pja = new pja(pkd);
        this.f = pja;
        this.g = aexu.a(this.c, this.d, this.e, pja);
        this.h = new piw(pkd);
        this.i = new piu(pkd);
        this.j = new piq(pkd);
        this.k = new aeya(this.c, this.d, this.i, this.f);
        this.l = new piv(pkd);
        this.m = new piy(pkd);
        this.n = new pip(pkd);
        this.o = new pio(pkd);
        this.p = new piz(pkd);
        this.q = new pix(pkd);
        this.r = new pin(pkd);
    }

    public final pdd A() {
        pdd c2 = ((pbx) this.a).c();
        awdx.a((Object) c2, "Cannot return null from a non-@Nullable component method");
        return c2;
    }

    public final pia B() {
        pia G = this.a.G();
        awdx.a((Object) G, "Cannot return null from a non-@Nullable component method");
        return G;
    }

    public final Executor a() {
        return (Executor) this.b.a();
    }

    public final aorr b() {
        aorr k2 = ((pbx) this.a).k();
        awdx.a((Object) k2, "Cannot return null from a non-@Nullable component method");
        return k2;
    }

    public final aetj c() {
        aetj q2 = this.a.q();
        awdx.a((Object) q2, "Cannot return null from a non-@Nullable component method");
        return q2;
    }

    public final Map d() {
        Map p2 = this.a.p();
        awdx.a((Object) p2, "Cannot return null from a non-@Nullable component method");
        return p2;
    }

    public final aeri e() {
        aeri n2 = this.a.n();
        awdx.a((Object) n2, "Cannot return null from a non-@Nullable component method");
        return n2;
    }

    public final pha f() {
        return new pha(this.c, this.g);
    }

    public final pkz g() {
        return new pkz(this.f);
    }

    public final phc h() {
        return new phc(this.h);
    }

    public final pht i() {
        return new pht(awdy.a(this.d), this.e);
    }

    public final phf j() {
        return new phf(this.c, awdy.a(this.d), this.i, this.f);
    }

    public final phv k() {
        return new phv(awdy.a(this.d), this.i, this.j);
    }

    public final phh l() {
        return new phh(this.k);
    }

    public final pgx m() {
        return new pgx(this.l);
    }

    public final pcx n() {
        aepx aepx = new aepx(((pbx) this.a).j);
        awdx.a((Object) aepx, "Cannot return null from a non-@Nullable component method");
        return new pcx(aepx);
    }

    public final pcv o() {
        aepv aepv = new aepv(((pbx) this.a).j);
        awdx.a((Object) aepv, "Cannot return null from a non-@Nullable component method");
        return new pcv(aepv);
    }

    public final peg p() {
        return new peg(this.m);
    }

    public final pdx q() {
        return new pdx(this.n);
    }

    public final pdv r() {
        return new pdv(this.o);
    }

    public final pdz s() {
        return new pdz(this.p);
    }

    public final peb t() {
        return new peb(this.q);
    }

    public final ped u() {
        return new ped(this.n);
    }

    public final pek v() {
        return new pek(this.i);
    }

    public final pem w() {
        return new pem(this.r, this.i);
    }

    public final pei x() {
        return new pei(this.r, this.e);
    }

    public final pia y() {
        pia G = this.a.G();
        awdx.a((Object) G, "Cannot return null from a non-@Nullable component method");
        return G;
    }

    public final pia z() {
        pia b2 = pdj.b();
        awdx.a((Object) b2, "Cannot return null from a non-@Nullable component method");
        return b2;
    }
}
