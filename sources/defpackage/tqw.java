package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.List;

/* renamed from: tqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqw implements Runnable {
    private final trm a;
    private final asas b;
    private final asog c;
    private final long d;
    private final List e;
    private final tlh f;

    public tqw(trm trm, asas asas, asog asog, long j, List list, tlh tlh) {
        this.a = trm;
        this.b = asas;
        this.c = asog;
        this.d = j;
        this.e = list;
        this.f = tlh;
    }

    public final void run() {
        trm trm = this.a;
        asas asas = this.b;
        asog asog = this.c;
        long j = this.d;
        List<String> list = this.e;
        tlh tlh = this.f;
        trk a2 = trm.d.a(asas.b);
        if (a2 != null) {
            tje tje = new tje();
            tje.b(asas.b);
            tje.a(trm.a(asog));
            tje.c(asas.d);
            tje.a(j);
            PayloadTransferUpdate payloadTransferUpdate = tje.a;
            for (String str : list) {
                if (a2.a(str) != null) {
                    tlh.a(str, payloadTransferUpdate);
                    tlh.f.a(str, asas.b, asog);
                }
            }
            a2.a((List) list);
            if (a2.c().isEmpty()) {
                a2.d();
                trm.d.b(asas.b);
            }
        }
    }
}
