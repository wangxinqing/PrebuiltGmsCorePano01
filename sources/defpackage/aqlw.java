package defpackage;

import java.util.List;

/* renamed from: aqlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqlw extends aucd implements audy {
    public aqlw() {
        super((aucj) aqlx.f);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqlx aqlx = (aqlx) this.b;
        aqlx aqlx2 = aqlx.f;
        if (!aqlx.b.a()) {
            aqlx.b = aucj.a(aqlx.b);
        }
        auab.a(iterable, (List) aqlx.b);
    }
}
