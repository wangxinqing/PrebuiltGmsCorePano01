package defpackage;

import java.util.List;

/* renamed from: aqwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwy extends aucd implements audy {
    public aqwy() {
        super((aucj) aqwz.d);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqwz aqwz = (aqwz) this.b;
        aqwz aqwz2 = aqwz.d;
        if (!aqwz.b.a()) {
            aqwz.b = aucj.a(aqwz.b);
        }
        auab.a(iterable, (List) aqwz.b);
    }
}
