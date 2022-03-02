package defpackage;

import java.util.List;

/* renamed from: avdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdd extends aucd implements audy {
    public avdd() {
        super((aucj) avdf.q);
    }

    public final void a(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdf avdf = (avdf) this.b;
        avdz avdz = (avdz) aucd.i();
        avdf avdf2 = avdf.q;
        avdz.getClass();
        avdf.g();
        avdf.k.add(avdz);
    }

    public final void a(avdr avdr) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdf avdf = (avdf) this.b;
        avds avds = (avds) avdr.i();
        avdf avdf2 = avdf.q;
        avds.getClass();
        avdf.e();
        avdf.g.add(avds);
    }

    public final void a(avdu avdu) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdf avdf = (avdf) this.b;
        avdv avdv = (avdv) avdu.i();
        avdf avdf2 = avdf.q;
        avdv.getClass();
        avdf.c();
        avdf.f.add(avdv);
    }

    public final void a(avdw avdw) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdf avdf = (avdf) this.b;
        avdx avdx = (avdx) avdw.i();
        avdf avdf2 = avdf.q;
        avdx.getClass();
        avdf.f();
        avdf.h.add(avdx);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdf avdf = (avdf) this.b;
        avdf avdf2 = avdf.q;
        if (!avdf.d.a()) {
            avdf.d = aucj.a(avdf.d);
        }
        auab.a(iterable, (List) avdf.d);
    }
}
