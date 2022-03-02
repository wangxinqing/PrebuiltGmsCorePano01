package defpackage;

import java.util.List;

/* renamed from: avdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdr extends aucd implements audy {
    public avdr() {
        super((aucj) avds.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avds avds = (avds) this.b;
        avds avds2 = avds.h;
        if (!avds.d.a()) {
            avds.d = aucj.a(avds.d);
        }
        auab.a(iterable, (List) avds.d);
    }
}
