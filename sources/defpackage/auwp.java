package defpackage;

import java.util.List;

/* renamed from: auwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwp extends aucd implements audy {
    public auwp() {
        super((aucj) auwq.d);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        auwq auwq = (auwq) this.b;
        auwq auwq2 = auwq.d;
        if (!auwq.c.a()) {
            auwq.c = aucj.a(auwq.c);
        }
        auab.a(iterable, (List) auwq.c);
    }
}
