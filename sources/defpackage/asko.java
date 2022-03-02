package defpackage;

import java.util.List;

/* renamed from: asko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asko extends aucd implements audy {
    public asko() {
        super((aucj) askp.k);
    }

    public final void a(asoj asoj) {
        if (this.c) {
            c();
            this.c = false;
        }
        askp askp = (askp) this.b;
        auct auct = askp.e;
        asoj.getClass();
        if (!askp.d.a()) {
            askp.d = aucj.a(askp.d);
        }
        askp.d.d(asoj.d);
    }

    public final void a(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        askp askp = (askp) this.b;
        askh askh = (askh) aucd.i();
        auct auct = askp.e;
        askh.getClass();
        if (!askp.h.a()) {
            askp.h = aucj.a(askp.h);
        }
        askp.h.add(askh);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        askp askp = (askp) this.b;
        auct auct = askp.e;
        if (!askp.i.a()) {
            askp.i = aucj.a(askp.i);
        }
        auab.a(iterable, (List) askp.i);
    }
}
