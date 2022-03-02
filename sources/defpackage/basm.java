package defpackage;

import java.util.List;

/* renamed from: basm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class basm extends aucd implements audy {
    public basm() {
        super((aucj) baso.k);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        baso baso = (baso) this.b;
        baso baso2 = baso.k;
        baso.c();
        auab.a(iterable, (List) baso.j);
    }
}
