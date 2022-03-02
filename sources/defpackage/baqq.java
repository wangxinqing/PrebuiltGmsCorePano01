package defpackage;

import java.util.List;

/* renamed from: baqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baqq extends aucd implements audy {
    public baqq() {
        super((aucj) baqr.e);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        baqr baqr = (baqr) this.b;
        baqr baqr2 = baqr.e;
        if (!baqr.b.a()) {
            baqr.b = aucj.a(baqr.b);
        }
        auab.a(iterable, (List) baqr.b);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        baqr baqr = (baqr) this.b;
        baqr baqr2 = baqr.e;
        if (!baqr.c.a()) {
            baqr.c = aucj.a(baqr.c);
        }
        auab.a(iterable, (List) baqr.c);
    }
}
