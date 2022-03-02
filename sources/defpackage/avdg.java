package defpackage;

import java.util.List;

/* renamed from: avdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdg extends aucd implements audy {
    public avdg() {
        super((aucj) avdi.h);
    }

    public final void a(int i, avdd avdd) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdi avdi = (avdi) this.b;
        avdf avdf = (avdf) avdd.i();
        avdi avdi2 = avdi.h;
        avdf.getClass();
        avdi.c();
        avdi.b.set(i, avdf);
    }

    public final avdf m() {
        return (avdf) ((avdi) this.b).b.get(0);
    }

    public final void a(avdd avdd) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdi avdi = (avdi) this.b;
        avdf avdf = (avdf) avdd.i();
        avdi avdi2 = avdi.h;
        avdf.getClass();
        avdi.c();
        avdi.b.add(avdf);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdi avdi = (avdi) this.b;
        avdi avdi2 = avdi.h;
        if (!avdi.d.a()) {
            avdi.d = aucj.a(avdi.d);
        }
        auab.a(iterable, (List) avdi.d);
    }
}
