package defpackage;

import java.util.List;

/* renamed from: apgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apgq extends aucd implements audy {
    public apgq() {
        super((aucj) apgu.l);
    }

    public final void a(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        apgu apgu = (apgu) this.b;
        apgu apgu2 = apgu.l;
        apgu.a();
        apgu.g.d(i);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        apgu apgu = (apgu) this.b;
        apgu apgu2 = apgu.l;
        if (!apgu.f.a()) {
            apgu.f = aucj.a(apgu.f);
        }
        auab.a(iterable, (List) apgu.f);
    }
}
