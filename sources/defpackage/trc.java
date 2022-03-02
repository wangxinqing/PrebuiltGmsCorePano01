package defpackage;

/* renamed from: trc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class trc implements Runnable {
    private final trm a;
    private final asas b;
    private final asog c;
    private final long d;
    private final tlh e;
    private final String f;

    public trc(trm trm, asas asas, asog asog, long j, tlh tlh, String str) {
        this.a = trm;
        this.b = asas;
        this.c = asog;
        this.d = j;
        this.e = tlh;
        this.f = str;
    }

    public final void run() {
        trm trm = this.a;
        asas asas = this.b;
        asog asog = this.c;
        long j = this.d;
        tlh tlh = this.e;
        String str = this.f;
        trk a2 = trm.d.a(asas.b);
        if (a2 != null) {
            a2.d();
            tje tje = new tje();
            tje.b(asas.b);
            tje.a(trm.a(asog));
            tje.c(asas.d);
            tje.a(j);
            trm.a(tlh, str, tje.a, true);
            tlh.f.b(str, asas.b, asog);
        }
    }
}
