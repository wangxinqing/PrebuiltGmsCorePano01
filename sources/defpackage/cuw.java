package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: cuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cuw implements cuj {
    public final ctu a;
    public final csr b;
    public final ctj c;
    private final ExecutorService d;
    private final cub e;
    private final cvs f;
    private final amsv g;

    public cuw(ctu ctu, ExecutorService executorService, cub cub, csr csr, ctj ctj, amsv amsv, cvs cvs) {
        this.a = ctu;
        this.d = executorService;
        this.e = cub;
        this.b = csr;
        this.c = ctj;
        this.g = amsv;
        this.f = cvs;
        cub.getClass();
        acws.a((Executor) executorService, (Callable) new cuk(cub)).a((acvv) new cun(this));
        csr csr2 = this.b;
        csr2.getClass();
        acws.a((Executor) executorService, (Callable) new cuo(csr2)).a((acvv) new cup(this));
        ctj ctj2 = this.c;
        ctj2.getClass();
        acws.a((Executor) executorService, (Callable) new cuq(ctj2)).a((acvv) new cur(this));
    }

    public final as a() {
        return this.a.a();
    }

    public final as b(dih dih, aqsr aqsr, cvm cvm) {
        return this.a.b(new ctt(dih, aqsr, cvm));
    }

    public final void c() {
        for (aw b2 : this.a.b.values()) {
            b2.b(anfv.a);
        }
        csr csr = this.b;
        csr.getClass();
        a((Runnable) new cut(csr));
    }

    public final as d() {
        return this.a.b();
    }

    public final anax e() {
        return this.a.c;
    }

    public final void f() {
        this.a.c = anfv.a;
        ctj ctj = this.c;
        ctj.getClass();
        a((Runnable) new cuu(ctj));
    }

    public final as a(dih dih) {
        if (dio.a(dih)) {
            return this.a.a(dih.a);
        }
        aw awVar = new aw();
        awVar.b(anfv.a);
        return awVar;
    }

    public final void b() {
        ctu ctu = this.a;
        for (aw awVar : ctu.d.values()) {
            aqsr aqsr = ((csl) awVar.b()).a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            awVar.b(new csl(aqsr));
        }
        for (aw b2 : ctu.a.values()) {
            b2.b(new csn(false, false, (Throwable) null));
        }
        cub cub = this.e;
        cub.getClass();
        a((Runnable) new cus(cub));
    }

    public final as a(dih dih, aqsr aqsr, cvm cvm) {
        return this.a.a(new ctt(dih, aqsr, cvm));
    }

    public final void c(dih dih) {
        this.a.a(dih, dja.b(), true);
    }

    public final void a(dih dih, Long l) {
        if (dio.a(dih)) {
            csw csw = new csw(dih.a, l);
            aw a2 = this.a.a(dih.a);
            Iterable iterable = (anax) a2.b();
            if (iterable == null) {
                iterable = anfv.a;
            }
            anav anav = new anav();
            anav.b(iterable);
            anav.b(l);
            a2.b(anav.a());
            a((Runnable) new cuv(this, csw));
        }
    }

    public final void b(dih dih) {
        this.a.a(dih, dja.b(), false);
    }

    public final void c(dih dih, aqsr aqsr, cvm cvm) {
        cvk cvk = new cvk(dih, aqsr, cvm, this.a, this.d, this.e, (crr) this.g.a(), this.f);
        if (((csn) cvk.k.b()).a) {
            cvk.a.a("loadScreenGraph root request ongoing already for %s", Integer.valueOf(cvk.c.b));
            return;
        }
        cvk.a.a("loadScreenGraph root for %s", Integer.valueOf(cvk.c.b));
        cvk.j = null;
        if (dio.a(cvk.b)) {
            aqsr aqsr2 = cvk.c;
            if (!((aqsr2.b == 524 && csp.a(aqsr2) == 2) || aqsr2.b == 2004 || jkf.a(ihs.b()))) {
                cvk.j = new babk(babj.f);
            }
        }
        cvk.h = true;
        cvk.c();
        cvk.a();
        if (cvk.c(cvk.c)) {
            cvk.b();
            return;
        }
        acwa a2 = acws.a((Executor) cvk.e, (Callable) new cvb(cvk));
        a2.a((acvv) new cvc(cvk));
        a2.a((acvs) new cvd(cvk));
        a2.a((acvp) new cve(cvk));
    }

    public final void a(Long l) {
        this.a.a(l);
        a((Runnable) new cul(this, new cto(l)));
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        acws.a((Executor) this.d, (Callable) new cum(runnable));
    }
}
