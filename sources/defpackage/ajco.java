package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: ajco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajco implements ajpi {
    private final ajat a;

    public ajco(ajat ajat) {
        this.a = ajat;
    }

    public final void a() {
    }

    public final void a(aqek aqek, long j) {
        aqek.g(14, this.a.bg());
        aqek.g(15, this.a.bh());
    }

    public final void a(aucd aucd, long j) {
        int bg = this.a.bg();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        artq artq = (artq) aucd.b;
        artq artq2 = artq.i;
        artq.a |= 2048;
        artq.g = bg;
        int bh = this.a.bh();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        artq artq3 = (artq) aucd.b;
        artq3.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        artq3.h = bh;
    }
}
