package defpackage;

import java.util.List;

/* renamed from: aqdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdw extends aucd implements audy {
    public aqdw() {
        super((aucj) aqdx.d);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqdx aqdx = (aqdx) this.b;
        aqdx aqdx2 = aqdx.d;
        if (!aqdx.b.a()) {
            aqdx.b = aucj.a(aqdx.b);
        }
        auab.a(iterable, (List) aqdx.b);
    }
}
