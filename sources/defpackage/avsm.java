package defpackage;

import java.util.List;

/* renamed from: avsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsm extends aucd implements audy {
    public avsm() {
        super((aucj) avsn.b);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avsn avsn = (avsn) this.b;
        avsn avsn2 = avsn.b;
        if (!avsn.a.a()) {
            avsn.a = aucj.a(avsn.a);
        }
        auab.a(iterable, (List) avsn.a);
    }
}
