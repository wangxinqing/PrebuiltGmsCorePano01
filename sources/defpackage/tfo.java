package defpackage;

/* renamed from: tfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfo implements Runnable {
    final /* synthetic */ teb a;
    final /* synthetic */ tfq b;

    public tfo(tfq tfq, teb teb) {
        this.b = tfq;
        this.a = teb;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            teb teb = this.a;
            tdk d = a2.d();
            if (d == null) {
                a2.a(teb, 2982);
                return;
            }
            a2.j.a(10, d);
            if (d.f != null) {
                aucd o = asgp.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asgp asgp = (asgp) o.b;
                asgp.b = 1;
                int i = 1 | asgp.a;
                asgp.a = i;
                String str = d.f.b;
                str.getClass();
                asgp.a = i | 2;
                asgp.c = str;
                d.c.a((asgp) o.i());
            } else {
                ((anih) ((anih) tdk.b.c()).a("tdk", "l", 224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: unable to confirm before connect");
            }
            a2.b(teb);
        }
    }
}
