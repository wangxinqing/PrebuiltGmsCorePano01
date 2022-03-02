package defpackage;

import java.util.List;

/* renamed from: avdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdk extends aucd implements audy {
    public avdk() {
        super((aucj) avdq.A);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdq avdq = (avdq) this.b;
        avdq avdq2 = avdq.A;
        if (!avdq.q.a()) {
            avdq.q = aucj.a(avdq.q);
        }
        auab.a(iterable, (List) avdq.q);
    }
}
