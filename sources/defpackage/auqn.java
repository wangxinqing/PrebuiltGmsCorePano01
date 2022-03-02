package defpackage;

/* renamed from: auqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqn implements Runnable {
    final /* synthetic */ anvb a;
    final /* synthetic */ anvc b;
    final /* synthetic */ auqs c;

    public auqn(auqs auqs, anvb anvb, anvc anvc) {
        this.c = auqs;
        this.a = anvb;
        this.b = anvc;
    }

    public final void run() {
        aucd o = anvd.g.o();
        anvb anvb = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anvd anvd = (anvd) o.b;
        anvb.getClass();
        anvd.b = anvb;
        int i = anvd.a | 1;
        anvd.a = i;
        anvc anvc = this.b;
        anvc.getClass();
        anvd.c = anvc;
        anvd.a = i | 2;
        this.c.a((anvd) o.i());
    }
}
