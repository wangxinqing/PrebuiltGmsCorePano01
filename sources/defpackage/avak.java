package defpackage;

import java.util.List;

/* renamed from: avak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avak extends aucd implements audy {
    public avak() {
        super((aucj) aval.d);
    }

    public final void a(avam avam) {
        if (this.c) {
            c();
            this.c = false;
        }
        aval aval = (aval) this.b;
        aval aval2 = aval.d;
        avam.getClass();
        aval.c();
        aval.c.add(avam);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aval aval = (aval) this.b;
        aval aval2 = aval.d;
        aval.c();
        auab.a(iterable, (List) aval.c);
    }
}
