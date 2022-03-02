package defpackage;

import java.util.List;

/* renamed from: aqdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdr extends aucd implements audy {
    public aqdr() {
        super((aucj) aqds.j);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqds aqds = (aqds) this.b;
        aqds aqds2 = aqds.j;
        if (!aqds.b.a()) {
            aqds.b = aucj.a(aqds.b);
        }
        auab.a(iterable, (List) aqds.b);
    }
}
