package defpackage;

import java.util.List;

/* renamed from: aspt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aspt extends aucd implements audy {
    public aspt() {
        super((aucj) aspu.d);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aspu aspu = (aspu) this.b;
        aspu aspu2 = aspu.d;
        if (!aspu.c.a()) {
            aspu.c = aucj.a(aspu.c);
        }
        auab.a(iterable, (List) aspu.c);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aspu aspu = (aspu) this.b;
        aspu aspu2 = aspu.d;
        if (!aspu.b.a()) {
            aspu.b = aucj.a(aspu.b);
        }
        auab.a(iterable, (List) aspu.b);
    }
}
