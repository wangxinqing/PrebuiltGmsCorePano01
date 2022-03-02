package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: tqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqy implements Runnable {
    private final trm a;
    private final String b;
    private final tlh c;
    private final CountDownLatch d;

    public tqy(trm trm, String str, tlh tlh, CountDownLatch countDownLatch) {
        this.a = trm;
        this.b = str;
        this.c = tlh;
        this.d = countDownLatch;
    }

    public final void run() {
        trm trm = this.a;
        String str = this.b;
        tlh tlh = this.c;
        CountDownLatch countDownLatch = this.d;
        List singletonList = Collections.singletonList(str);
        List a2 = trm.d.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            trk trk = (trk) a2.get(i);
            trj a3 = trk.a(str);
            if (a3 != null) {
                trk.a(singletonList);
                if (trk.c().isEmpty()) {
                    trm.d.b(trk.a());
                    trk.d();
                }
                tje tje = new tje();
                tje.b(trk.a());
                tje.a(2);
                tje.c(trk.a.b());
                tje.a(a3.c);
                tlh.a(str, tje.a);
                if (trk.b) {
                    tlh.f.b(str, trk.a(), asog.ENDPOINT_IO_ERROR);
                } else {
                    tlh.f.a(str, trk.a(), asog.ENDPOINT_IO_ERROR);
                }
            }
        }
        countDownLatch.countDown();
    }
}
