package defpackage;

/* renamed from: wfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfv implements Runnable {
    private final wgu a;

    public wfv(wgu wgu) {
        this.a = wgu;
    }

    public final void run() {
        wgu wgu = this.a;
        wgu.g.b();
        wgu.i = null;
        wgu.j = null;
        vva vva = wgu.o;
        long j = wgu.s;
        aucd d = vvb.d(9);
        aucd o = aslb.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslb aslb = (aslb) o.b;
        aslb.a |= 1;
        aslb.b = j;
        aslb aslb2 = (aslb) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslb2.getClass();
        asmc.j = aslb2;
        asmc.a |= 512;
        vva.a(new vut((asmc) d.i()));
    }
}
