package defpackage;

/* renamed from: trd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class trd implements Runnable {
    private final trm a;
    private final asas b;
    private final asap c;
    private final tlh d;
    private final String e;

    public trd(trm trm, asas asas, asap asap, tlh tlh, String str) {
        this.a = trm;
        this.b = asas;
        this.c = asap;
        this.d = tlh;
        this.e = str;
    }

    public final void run() {
        int i;
        long j;
        trm trm = this.a;
        asas asas = this.b;
        asap asap = this.c;
        tlh tlh = this.d;
        String str = this.e;
        trk a2 = trm.d.a(asas.b);
        if (a2 != null) {
            boolean a3 = trm.a(asap);
            tje tje = new tje();
            tje.b(asas.b);
            if (!a3) {
                i = 3;
            } else {
                i = 1;
            }
            tje.a(i);
            tje.c(asas.d);
            if (!a3) {
                j = asap.c + ((long) asap.d.a());
            } else {
                j = asap.c;
            }
            tje.a(j);
            trm.a(tlh, str, tje.a, a3);
            if (a3) {
                a2.d();
                tlh.f.b(str, asas.b, asog.SUCCESS);
                return;
            }
            tlh.f.b(str, asas.b, (long) asap.d.a());
        }
    }
}
