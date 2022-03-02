package defpackage;

import java.util.List;

/* renamed from: atzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzb extends aucd implements audy {
    public atzb() {
        super((aucj) atzc.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atzc atzc = (atzc) this.b;
        atzc atzc2 = atzc.h;
        if (!atzc.g.a()) {
            atzc.g = aucj.a(atzc.g);
        }
        auab.a(iterable, (List) atzc.g);
    }
}
