package defpackage;

import java.util.List;

/* renamed from: attr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class attr extends aucd implements audy {
    public attr() {
        super((aucj) atts.s);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atts atts = (atts) this.b;
        auct auct = atts.o;
        if (!atts.r.a()) {
            atts.r = aucj.a(atts.r);
        }
        auab.a(iterable, (List) atts.r);
    }
}
