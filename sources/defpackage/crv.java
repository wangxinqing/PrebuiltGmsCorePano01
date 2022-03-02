package defpackage;

/* renamed from: crv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class crv implements aj {
    private static crv a = null;
    private static int b = 0;
    private final al c = new al(this);
    private final crx d;

    private crv() {
        irc c2 = ihs.c();
        al alVar = this.c;
        awdx.a(c2);
        awdx.a(alVar);
        this.d = new crx(c2, alVar);
        this.c.a(ad.CREATED);
    }

    public static synchronized crx a(ae aeVar) {
        crx crx;
        synchronized (crv.class) {
            if (a == null) {
                a = new crv();
            }
            b(aeVar);
            crx = a.d;
        }
        return crx;
    }

    private static synchronized void b(ae aeVar) {
        synchronized (crv.class) {
            b++;
            diz.a(aeVar, cru.a);
        }
    }

    public final ae getLifecycle() {
        return this.c;
    }

    public static synchronized void a() {
        synchronized (crv.class) {
            int i = b - 1;
            b = i;
            if (i == 0) {
                a.c.a(ad.DESTROYED);
                a = null;
            }
        }
    }
}
