package defpackage;

/* renamed from: pom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pom implements Runnable {
    private final poo a;

    public pom(poo poo) {
        this.a = poo;
    }

    public final void run() {
        poo poo = this.a;
        aucd o = aolb.g.o();
        poq a2 = poo.a();
        try {
            int a3 = poo.f.a(poo.a, false) - a2.a("sms", false);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aolb aolb = (aolb) o.b;
            aolb.a |= 1;
            aolb.b = a3;
            int a4 = poo.f.a(poo.b, false) - a2.a("mms", false);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aolb aolb2 = (aolb) o.b;
            aolb2.a |= 2;
            aolb2.c = a4;
            int a5 = poo.f.a(poo.a, true) - a2.a("sms", true);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aolb aolb3 = (aolb) o.b;
            aolb3.a |= 4;
            aolb3.d = a5;
            int a6 = poo.f.a(poo.b, true) - a2.a("mms", true);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aolb aolb4 = (aolb) o.b;
            aolb4.a |= 8;
            aolb4.e = a6;
            int a7 = (int) (jit.a(poo.d, "icing_mmssms.db") >> 10);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aolb aolb5 = (aolb) o.b;
            aolb5.a |= 16;
            aolb5.f = a7;
        } finally {
            poo.e.a((aolb) o.i());
        }
    }
}
