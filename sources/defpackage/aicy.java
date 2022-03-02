package defpackage;

/* renamed from: aicy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicy {
    public final iby a;
    private final ajpn b;

    public aicy(ajpn ajpn) {
        this.b = ajpn;
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(anzs anzs, anyo anyo) {
        aucd o = aoaa.m.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoaa aoaa = (aoaa) o.b;
        aoaa.g = 4;
        int i = aoaa.a | 16;
        aoaa.a = i;
        if (anzs != null) {
            anzs.getClass();
            aoaa.h = anzs;
            i |= 32;
            aoaa.a = i;
        }
        if (anyo != null) {
            anyo.getClass();
            aoaa.f = anyo;
            aoaa.a = i | 8;
        }
        a((aoaa) o.i());
    }

    public aicy(ajpn ajpn, iby iby) {
        this.b = ajpn;
        this.a = iby;
    }

    public final void a(aoaa aoaa) {
        aucd o = anui.p.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anui anui = (anui) o.b;
        anui.b = 5;
        int i = anui.a | 1;
        anui.a = i;
        aoaa.getClass();
        anui.g = aoaa;
        anui.a = i | 32;
        this.b.a(o.i()).b();
    }
}
