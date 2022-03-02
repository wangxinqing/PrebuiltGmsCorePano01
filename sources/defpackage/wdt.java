package defpackage;

/* renamed from: wdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdt implements Runnable {
    private final wgu a;

    public wdt(wgu wgu) {
        this.a = wgu;
    }

    public final void run() {
        wgu wgu = this.a;
        wgu.o();
        wgu.g.c();
        wgu.m();
        wgu.y = wgu.a((Runnable) new wfm(wgu), ayni.a.a().i());
        wgu.h = null;
        vva vva = wgu.o;
        long j = wgu.r;
        aucd d = vvb.d(7);
        aucd o = aslq.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslq aslq = (aslq) o.b;
        aslq.a |= 1;
        aslq.b = j;
        aslq aslq2 = (aslq) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslq2.getClass();
        asmc.h = aslq2;
        asmc.a |= 128;
        vva.a(new vuu((asmc) d.i()));
        ((anih) ((anih) vvj.a.d()).a("wgu", "q", 1200, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped discovery");
    }
}
