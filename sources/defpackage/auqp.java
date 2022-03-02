package defpackage;

/* renamed from: auqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqp implements Runnable {
    final /* synthetic */ anuy a;
    final /* synthetic */ anvb b;
    final /* synthetic */ auqs c;

    public auqp(auqs auqs, anuy anuy, anvb anvb) {
        this.c = auqs;
        this.a = anuy;
        this.b = anvb;
    }

    public final void run() {
        aucd o = anuz.b.o();
        anuy anuy = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuz anuz = (anuz) o.b;
        anuy.getClass();
        if (!anuz.a.a()) {
            anuz.a = aucj.a(anuz.a);
        }
        anuz.a.add(anuy);
        anuz anuz2 = (anuz) o.i();
        aucd o2 = anvd.g.o();
        anvb anvb = this.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anvd anvd = (anvd) o2.b;
        anvb.getClass();
        anvd.b = anvb;
        int i = anvd.a | 1;
        anvd.a = i;
        anuz2.getClass();
        anvd.e = anuz2;
        anvd.a = i | 8;
        this.c.a((anvd) o2.i());
    }
}
