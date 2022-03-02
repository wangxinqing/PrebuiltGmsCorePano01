package defpackage;

import java.util.List;

/* renamed from: atjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atjq extends aucd implements audy {
    public atjq() {
        super((aucj) atjt.z);
    }

    public final void a(atjt atjt) {
        if (this.c) {
            c();
            this.c = false;
        }
        atjt atjt2 = (atjt) this.b;
        auct auct = atjt.v;
        atjt.getClass();
        atjt2.a();
        atjt2.c.add(atjt);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atjt atjt = (atjt) this.b;
        auct auct = atjt.v;
        atjt.a();
        auab.a(iterable, (List) atjt.c);
    }
}
