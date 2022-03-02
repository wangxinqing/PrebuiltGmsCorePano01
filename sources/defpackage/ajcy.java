package defpackage;

/* renamed from: ajcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajcy implements Runnable {
    private final ajdb a;
    private final aqek b;

    public ajcy(ajdb ajdb, aqek aqek) {
        this.a = ajdb;
        this.b = aqek;
    }

    public final void run() {
        aiba aiba;
        ajdb ajdb = this.a;
        aqek aqek = this.b;
        ajcz ajcz = ajdb.c;
        if (ajcz != null) {
            ahtu ahtu = ajcz.a;
            if (ahtu.a != null) {
                atih a2 = ahtu.a("g:loc/uil", aqek);
                ahtt ahtt = new ahtt();
                synchronized (ahtu.b) {
                    amrl.b(!ahtu.b.containsKey(a2), (Object) "Duplicated request.");
                    ahtu.b.put(a2, ahtt);
                }
                ahtu.a.a(a2);
                while (ahtt.b == null) {
                    try {
                        ahtt.a.await();
                        break;
                    } catch (InterruptedException e) {
                    }
                }
                aiba = ahtt.b;
            } else {
                aiba = aiba.a((Object) null, "Could not initialize MASF service.");
            }
            ahtu.a((aqek) aiba.a, (String) aiba.b);
        }
    }
}
