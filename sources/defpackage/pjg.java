package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjg implements pkn {
    private final pkp a;
    private final bapu b = awds.a(pkq.a);
    private final bapu c;
    private final bapu d;
    private final bapu e;

    public pjg(pkp pkp) {
        this.a = pkp;
        this.c = new pjd(pkp);
        this.d = new pjf(pkp);
        this.e = new pje(pkp);
    }

    public final pdd A() {
        pdd c2 = ((pbx) this.a).c();
        awdx.a((Object) c2, "Cannot return null from a non-@Nullable component method");
        return c2;
    }

    public final Executor a() {
        return (Executor) this.b.a();
    }

    public final aorr b() {
        aorr k = ((pbx) this.a).k();
        awdx.a((Object) k, "Cannot return null from a non-@Nullable component method");
        return k;
    }

    public final aetj c() {
        aetj q = this.a.q();
        awdx.a((Object) q, "Cannot return null from a non-@Nullable component method");
        return q;
    }

    public final Map d() {
        Map p = this.a.p();
        awdx.a((Object) p, "Cannot return null from a non-@Nullable component method");
        return p;
    }

    public final phl e() {
        return new phl(this.c);
    }

    public final php f() {
        return new php(this.c);
    }

    public final phn g() {
        return new phn(this.d);
    }

    public final phr h() {
        return new phr(this.d);
    }

    public final phj i() {
        return new phj(this.c);
    }

    public final pge j() {
        return new pge(awdy.a(this.e));
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
