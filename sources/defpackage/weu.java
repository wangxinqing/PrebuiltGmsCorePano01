package defpackage;

import java.util.Iterator;

/* renamed from: weu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class weu implements Runnable {
    private final wgu a;
    private final wcx b;

    public weu(wgu wgu, wcx wcx) {
        this.a = wgu;
        this.b = wcx;
    }

    public final void run() {
        vnw vnw;
        wgu wgu = this.a;
        wcx wcx = this.b;
        while (!wcx.c()) {
            Iterator it = wgu.l.keySet().iterator();
            if (it.hasNext()) {
                vnw = (vnw) wgu.l.remove(it.next());
            } else {
                vnw = null;
            }
            if (vnw == null) {
                vnw = wgu.a(wcx);
            }
            if (vnw != null) {
                vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
                vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
                wgn wgn = wgn.SUCCESS;
                vnv a2 = vnv.a(vnw.b);
                if (a2 == null) {
                    a2 = vnv.UNKNOWN_FRAME_TYPE;
                }
                if (a2.ordinal() != 5) {
                    anih anih = (anih) ((anih) vvj.a.d()).a("wgu", "c", 4273, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    vnv a3 = vnv.a(vnw.b);
                    if (a3 == null) {
                        a3 = vnv.UNKNOWN_FRAME_TYPE;
                    }
                    anih.a("Discarding unknown frame of type %s", (Object) a3);
                } else {
                    wgu.a((Runnable) new wev(wgu, vnw));
                }
            }
        }
    }
}
