package defpackage;

import java.util.List;

/* renamed from: aqxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxa extends aucd implements audy {
    public aqxa() {
        super((aucj) aqxb.c);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqxb aqxb = (aqxb) this.b;
        aqxb aqxb2 = aqxb.c;
        if (!aqxb.a.a()) {
            aqxb.a = aucj.a(aqxb.a);
        }
        auab.a(iterable, (List) aqxb.a);
    }
}
