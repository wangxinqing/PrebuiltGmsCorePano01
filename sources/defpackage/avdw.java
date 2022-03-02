package defpackage;

import java.util.List;

/* renamed from: avdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdw extends aucd implements audy {
    public avdw() {
        super((aucj) avdx.f);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdx avdx = (avdx) this.b;
        avdx avdx2 = avdx.f;
        if (!avdx.d.a()) {
            avdx.d = aucj.a(avdx.d);
        }
        auab.a(iterable, (List) avdx.d);
    }
}
