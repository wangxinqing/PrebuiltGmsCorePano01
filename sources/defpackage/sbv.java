package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: sbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbv {
    public static final Object a = new Object();
    public static volatile sbv b;
    public bapu c;
    public bapu d;
    private bapu e;
    private bapu f;
    private bapu g;
    private bapu h;
    private bapu i;
    private bapu j;
    private bapu k;
    private bapu l;
    private bapu m;

    public sbv() {
    }

    private final afqu b() {
        return new afqu((Context) this.e.a(), (afmh) this.f.a(), (amri) this.g.a());
    }

    private final afpi c() {
        return new afpi((Context) this.e.a(), (aekn) this.l.a(), (afmh) this.f.a(), (amri) this.g.a(), (Executor) this.d.a());
    }

    private final afqr d() {
        return new afqr((Context) this.e.a(), (afmh) this.f.a(), b(), (agzs) this.i.a(), new afrz((Context) this.e.a(), (amsv) this.j.a(), (agzs) this.i.a(), (afsz) this.h.a(), (amri) this.k.a(), (Executor) this.d.a()), ampu.a, (amri) this.k.a(), (afsb) this.c.a(), c(), (amri) this.g.a(), (Executor) this.d.a());
    }

    private final afpf e() {
        return new afpf((Context) this.e.a(), (afsb) this.c.a(), (afmh) this.f.a(), c(), d(), (aekn) this.l.a(), (amri) this.m.a(), (Executor) this.d.a(), (amri) this.g.a());
    }

    public final afqn a() {
        return new afqn((Context) this.e.a(), (afsb) this.c.a(), d(), b(), e(), c(), new afnt((Context) this.e.a(), c(), d(), b(), (afsb) this.c.a(), (aekn) this.l.a(), (agzs) this.i.a(), (amri) this.g.a(), (afmh) this.f.a(), (Executor) this.d.a()), (afmh) this.f.a(), new afso((Context) this.e.a(), c(), d(), (agzs) this.i.a(), (afsb) this.c.a(), (afmh) this.f.a(), (amri) this.g.a(), (Executor) this.d.a()), new afsg(e(), c(), (afsb) this.c.a(), (Executor) this.d.a()), new afsi((Context) this.e.a(), (afsb) this.c.a(), (amri) this.g.a()), (amri) this.g.a(), (Executor) this.d.a());
    }

    public sbv(sbh sbh) {
        bapu a2 = awds.a(ird.a);
        this.e = a2;
        this.c = awds.a(new sbo(a2));
        this.f = awds.a(new sbu(this.e));
        this.g = awds.a(sbp.a);
        bapu a3 = awds.a(new sbr(this.e));
        this.h = a3;
        bapu a4 = awds.a(new sbt(this.e, a3));
        this.i = a4;
        this.j = awds.a(new scc(this.e, a4));
        this.k = awds.a(sbm.a);
        this.d = awds.a(new sbs(sbh));
        this.l = awds.a(sbk.a);
        this.m = awds.a(sbi.a);
    }
}
