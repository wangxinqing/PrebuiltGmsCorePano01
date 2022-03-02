package defpackage;

import java.util.List;

/* renamed from: avss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avss extends aucd implements audy {
    public avss() {
        super((aucj) avst.m);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avst avst = (avst) this.b;
        avst avst2 = avst.m;
        avst.c();
        auab.a(iterable, (List) avst.d);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avst avst = (avst) this.b;
        avst avst2 = avst.m;
        if (!avst.e.a()) {
            avst.e = aucj.a(avst.e);
        }
        auab.a(iterable, (List) avst.e);
    }
}
