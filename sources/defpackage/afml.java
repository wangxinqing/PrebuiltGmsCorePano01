package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: afml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afml implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private final bapu i;
    private final bapu j;
    private final bapu k;

    public afml(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7, bapu bapu8, bapu bapu9, bapu bapu10, bapu bapu11) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
        this.e = bapu5;
        this.f = bapu6;
        this.g = bapu7;
        this.h = bapu8;
        this.i = bapu9;
        this.j = bapu10;
        this.k = bapu11;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Executor executor = (Executor) this.b.a();
        aflj aflj = new aflj();
        aflj.b = ((Context) this.a.a()).getApplicationContext();
        amrl.a((Object) executor);
        aflj.c = aosd.a(executor);
        aflj.d.addAll((amzy) this.c.a());
        aflj.e = amri.c((Object) null);
        aflj.f = (agzs) this.d.a();
        aflj.g = (afsz) this.e.a();
        aflj.h = (amri) this.f.a();
        aflj.i = (amsv) this.g.a();
        aflj.j = (amri) ((awdu) this.h).a;
        aflj.k = amri.b((afsu) this.i.a());
        aflj.l = amri.b((afmh) this.j.a());
        aflj.m = (amri) this.k.a();
        amrl.a((Object) aflj.b);
        amrl.a((Object) aflj.e);
        amrl.a((Object) aflj.f);
        amrl.a((Object) aflj.g);
        amrl.a((Object) aflj.h);
        amrl.a((Object) aflj.i);
        if (aflj.m.a()) {
            aflj.g.b = aflj.m;
        }
        afqy afqy = aflj.a;
        afqw afqw = new afqw(aflj.b);
        awdx.a(afqw);
        afqy.a = afqw;
        afqy afqy2 = aflj.a;
        afrc afrc = new afrc(aflj.c);
        awdx.a(afrc);
        afqy2.c = afrc;
        afqy afqy3 = aflj.a;
        afqz afqz = new afqz(aflj.j, aflj.i);
        awdx.a(afqz);
        afqy3.b = afqz;
        afqy afqy4 = aflj.a;
        afrg afrg = new afrg(aflj.f, aflj.g, aflj.h, aflj.k, aflj.l, aflj.m);
        awdx.a(afrg);
        afqy4.d = afrg;
        afqy afqy5 = aflj.a;
        awdx.a((Object) afqy5.a, afqw.class);
        awdx.a((Object) afqy5.b, afqz.class);
        awdx.a((Object) afqy5.c, afrc.class);
        awdx.a((Object) afqy5.d, afrg.class);
        afrq afrq = new afrq(afqy5.a, afqy5.b, afqy5.c, afqy5.d);
        afso afso = new afso(afqx.a(afrq.a), afrq.b(), afrq.c(), (agzs) afrq.e.a(), (afsb) afrq.b.a(), (afmh) afrq.c.a(), (amri) afrq.d.a(), (Executor) afrq.f.a());
        afsg afsg = new afsg(afrq.d(), afrq.b(), (afsb) afrq.b.a(), (Executor) afrq.f.a());
        afme afme = new afme(aflj.b, (afsb) afrq.b.a(), new afqn(afqx.a(afrq.a), (afsb) afrq.b.a(), afrq.c(), afrq.a(), afrq.d(), afrq.b(), new afnt(afqx.a(afrq.a), afrq.b(), afrq.c(), afrq.a(), (afsb) afrq.b.a(), (aekn) afrq.g.a(), (agzs) afrq.e.a(), (amri) afrq.d.a(), (afmh) afrq.c.a(), (Executor) afrq.f.a()), (afmh) afrq.c.a(), afso, afsg, new afsi(afqx.a(afrq.a), (afsb) afrq.b.a(), (amri) afrq.d.a()), (amri) afrq.d.a(), (Executor) afrq.f.a()), aflj.c, aflj.f, aflj.h);
        awdx.a((Object) afme, "Cannot return null from a non-@Nullable @Provides method");
        return afme;
    }
}
