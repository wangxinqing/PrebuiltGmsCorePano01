package defpackage;

/* renamed from: arso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arso implements Runnable {
    final /* synthetic */ arqf a;
    final /* synthetic */ arqj b;
    final /* synthetic */ arrs c;
    final /* synthetic */ arqv d;
    final /* synthetic */ arqo e;
    final /* synthetic */ arsq f;

    public arso(arsq arsq, arqf arqf, arqj arqj, arrs arrs, arqv arqv, arqo arqo) {
        this.f = arsq;
        this.a = arqf;
        this.b = arqj;
        this.c = arrs;
        this.d = arqv;
        this.e = arqo;
    }

    public final void run() {
        try {
            this.f.p.clear();
            this.f.o.clear();
            arqf arqf = this.f.d;
            arqf arqf2 = this.a;
            arqf.clear();
            if (arqf2 != null) {
                arqc a2 = arqf2.entrySet().iterator();
                while (a2.hasNext()) {
                    a2.f();
                    arqf.a(((Long) a2.b.b()).longValue(), a2.h(), a2.a.a[a2.g()], a2.a.b[a2.g()], a2.a.e[a2.g()], a2.a.f[a2.g()], a2.a.g[a2.g()]);
                }
            }
            this.f.e.a(this.b);
            arsq arsq = this.f;
            arrs arrs = arsq.f;
            arrs arrs2 = this.c;
            short s = arsq.b;
            arrs.clear();
            if (arrs2 != null) {
                arrp a3 = arrs2.entrySet().iterator();
                while (a3.hasNext()) {
                    a3.f();
                    short h = a3.h();
                    arrs.a(h, a3.a.b[a3.g()], a3.i(), a3.a.f[a3.g()], a3.a.g[a3.g()], a3.j());
                    s = h;
                }
            }
            arsq.b = s;
            arqv arqv = this.f.g;
            arqv arqv2 = this.d;
            arqv.clear();
            if (arqv2 != null) {
                arqs a4 = arqv2.entrySet().iterator();
                while (a4.hasNext()) {
                    a4.f();
                    arqv.a(a4.h(), arsc.c(((Integer) a4.b.b()).intValue()), a4.a.a(a4.g()), a4.a.b[a4.g()], a4.a.e[a4.g()], a4.a.f[a4.g()], a4.a.g[a4.g()]);
                }
            }
            arqo arqo = this.f.n;
            arqo arqo2 = this.e;
            arqo.clear();
            if (arqo2 != null) {
                arql a5 = arqo2.entrySet().iterator();
                while (a5.hasNext()) {
                    a5.f();
                    arqo.a(a5.h(), arsc.c(((Integer) a5.b.b()).intValue()), a5.a.a[a5.g()], a5.a.b[a5.g()]);
                }
            }
            arsq arsq2 = this.f;
            arqc a6 = arsq2.d.entrySet().iterator();
            while (a6.hasNext()) {
                a6.f();
                if (!arsq2.f.a(a6.h())) {
                    a6.remove();
                }
            }
            arqh a7 = arsq2.e.iterator();
            while (a7.hasNext()) {
                a7.c();
                if (!arsq2.f.a(a7.f())) {
                    a7.remove();
                }
            }
            arqs a8 = arsq2.g.entrySet().iterator();
            while (a8.hasNext()) {
                a8.f();
                if (!arsq2.f.a(a8.h())) {
                    a8.remove();
                }
            }
            arql a9 = arsq2.n.entrySet().iterator();
            while (a9.hasNext()) {
                a9.f();
                if (!arsq2.f.a(a9.h())) {
                    a9.remove();
                }
            }
        } catch (Exception e2) {
            this.f.c();
            throw e2;
        }
    }
}
