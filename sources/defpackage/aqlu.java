package defpackage;

import java.util.List;

/* renamed from: aqlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqlu extends aucd implements audy {
    public aqlu() {
        super((aucj) aqlv.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqlv aqlv = (aqlv) this.b;
        aqlv aqlv2 = aqlv.h;
        if (!aqlv.b.a()) {
            aqlv.b = aucj.a(aqlv.b);
        }
        auab.a(iterable, (List) aqlv.b);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqlv aqlv = (aqlv) this.b;
        aqlv aqlv2 = aqlv.h;
        if (!aqlv.c.a()) {
            aqlv.c = aucj.a(aqlv.c);
        }
        auab.a(iterable, (List) aqlv.c);
    }
}
