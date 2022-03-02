package defpackage;

/* renamed from: arsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arsk implements Runnable {
    final /* synthetic */ arqa a;
    final /* synthetic */ arqj b;
    final /* synthetic */ arrn c;
    final /* synthetic */ arsm d;

    public arsk(arsm arsm, arqa arqa, arqj arqj, arrn arrn) {
        this.d = arsm;
        this.a = arqa;
        this.b = arqj;
        this.c = arrn;
    }

    public final void run() {
        try {
            this.d.n.clear();
            this.d.g.clear();
            arqa arqa = this.d.d;
            arqa arqa2 = this.a;
            arqa.clear();
            if (arqa2 != null) {
                arpx a2 = arqa2.entrySet().iterator();
                while (a2.hasNext()) {
                    a2.f();
                    arqa.a(((Long) a2.b.b()).longValue(), a2.h(), a2.a.a[a2.g()], a2.a.b[a2.g()], a2.a.e[a2.g()], a2.a.f[a2.g()]);
                }
            }
            this.d.e.a(this.b);
            arsm arsm = this.d;
            arrn arrn = arsm.f;
            arrn arrn2 = this.c;
            short s = arsm.b;
            arrn.clear();
            if (arrn2 != null) {
                arrk a3 = arrn2.entrySet().iterator();
                while (a3.hasNext()) {
                    a3.f();
                    short h = a3.h();
                    arrn.a(h, a3.a.b[a3.g()], a3.i(), a3.a.f[a3.g()], a3.j());
                    s = h;
                }
            }
            arsm.b = s;
            arsm arsm2 = this.d;
            arpx a4 = arsm2.d.entrySet().iterator();
            while (a4.hasNext()) {
                a4.f();
                if (!arsm2.f.a(a4.h())) {
                    a4.remove();
                }
            }
            arqh a5 = arsm2.e.iterator();
            while (a5.hasNext()) {
                a5.c();
                if (!arsm2.f.a(a5.f())) {
                    a5.remove();
                }
            }
        } catch (Exception e) {
            this.d.c();
            throw e;
        }
    }
}
