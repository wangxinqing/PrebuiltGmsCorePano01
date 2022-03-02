package defpackage;

import java.io.IOException;

/* renamed from: tqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqp implements Runnable {
    private final tqq a;
    private final uvz b;

    public tqp(tqq tqq, uvz uvz) {
        this.a = tqq;
        this.b = uvz;
    }

    public final void run() {
        tqq tqq = this.a;
        uvz uvz = this.b;
        String str = uvz.a;
        trs a2 = trs.a(uvz);
        if (a2 != null) {
            jjg jjg = tky.a;
            tky.a(tqq.b);
        } else {
            try {
                uvz.close();
            } catch (IOException e) {
                anih anih = (anih) tky.a.b();
                anih.a((Throwable) e);
                anih.a("Failed to close Wifi Aware socket with device %s", (Object) str);
            }
        }
        tqq.c.a(tqq.a, str, (tnm) a2, asoe.WIFI_AWARE);
    }
}
