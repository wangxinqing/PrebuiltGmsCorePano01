package defpackage;

/* renamed from: pqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqb implements Runnable {
    private final oyq a;

    public pqb(oyq oyq) {
        this.a = oyq;
    }

    public final void run() {
        while (true) {
            try {
                Thread.sleep(((Long) ozx.cb.c()).longValue());
                if (ppz.a(((Long) ozx.cb.c()).longValue())) {
                    aolh a2 = ppz.a();
                    oyq oyq = this.a;
                    long u = axrp.a.a().u();
                    if (oyq.a(u)) {
                        aucd o = aoji.R.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aoji aoji = (aoji) o.b;
                        a2.getClass();
                        aoji.y = a2;
                        aoji.a |= 134217728;
                        oyq.a(15002, o, u);
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
