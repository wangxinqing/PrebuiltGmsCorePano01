package defpackage;

/* renamed from: auqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqm implements Runnable {
    final /* synthetic */ anvb a;
    final /* synthetic */ anve b;
    final /* synthetic */ auqs c;

    public auqm(auqs auqs, anvb anvb, anve anve) {
        this.c = auqs;
        this.a = anvb;
        this.b = anve;
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
        anve anve = this.b;
        anve.getClass();
        anvd.f = anve;
        anvd.a = i | 16;
        this.c.a((anvd) o.i());
    }
}
