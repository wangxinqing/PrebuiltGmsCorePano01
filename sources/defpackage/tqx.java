package defpackage;

import java.util.Collections;

/* renamed from: tqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqx implements Runnable {
    private final trm a;
    private final asas b;
    private final String c;
    private final asap d;
    private final tlh e;

    public tqx(trm trm, asas asas, String str, asap asap, tlh tlh) {
        this.a = trm;
        this.b = asas;
        this.c = str;
        this.d = asap;
        this.e = tlh;
    }

    public final void run() {
        int i;
        long j;
        trm trm = this.a;
        asas asas = this.b;
        String str = this.c;
        asap asap = this.d;
        tlh tlh = this.e;
        trk a2 = trm.d.a(asas.b);
        if (a2 != null && a2.a(str) != null) {
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
            tlh.a(str, tje.a);
            if (a3) {
                tlh.f.a(str, asas.b, asog.SUCCESS);
                a2.a(Collections.singletonList(str));
                if (a2.c().isEmpty()) {
                    a2.d();
                    trm.d.b(asas.b);
                    return;
                }
                return;
            }
            tlh.f.a(str, asas.b, (long) asap.d.a());
        }
    }
}
