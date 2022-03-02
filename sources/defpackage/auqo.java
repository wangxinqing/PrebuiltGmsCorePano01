package defpackage;

/* renamed from: auqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auqo implements Runnable {
    final /* synthetic */ anvb a;
    final /* synthetic */ anvb b;
    final /* synthetic */ auqs c;

    public auqo(auqs auqs, anvb anvb, anvb anvb2) {
        this.c = auqs;
        this.a = anvb;
        this.b = anvb2;
    }

    public final void run() {
        aucd o = anva.b.o();
        anvb anvb = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anva anva = (anva) o.b;
        anvb.getClass();
        if (!anva.a.a()) {
            anva.a = aucj.a(anva.a);
        }
        anva.a.add(anvb);
        anva anva2 = (anva) o.i();
        aucd o2 = anvd.g.o();
        anvb anvb2 = this.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anvd anvd = (anvd) o2.b;
        anvb2.getClass();
        anvd.b = anvb2;
        int i = anvd.a | 1;
        anvd.a = i;
        anva2.getClass();
        anvd.d = anva2;
        anvd.a = i | 4;
        this.c.a((anvd) o2.i());
    }
}
