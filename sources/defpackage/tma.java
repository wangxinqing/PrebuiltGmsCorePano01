package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tma implements Runnable {
    private final tmz a;
    private final String b;
    private final asac c;
    private final tlh d;
    private final CountDownLatch e;

    public tma(tmz tmz, String str, asac asac, tlh tlh, CountDownLatch countDownLatch) {
        this.a = tmz;
        this.b = str;
        this.c = asac;
        this.d = tlh;
        this.e = countDownLatch;
    }

    public final void run() {
        byte[] bArr;
        tmz tmz = this.a;
        String str = this.b;
        asac asac = this.c;
        tlh tlh = this.d;
        CountDownLatch countDownLatch = this.e;
        ((anih) tky.a.d()).a("PCPHandler(%s) got CONNECTION_RESPONSE OfflineFrame from endpoint %s (with status %d).", (Object) tmz.g().a(), (Object) str, (Object) Integer.valueOf(asac.b));
        if (!tlh.h(str)) {
            if (asac.b == 0) {
                ((anih) tky.a.d()).a("Endpoint %s has accepted the connection", (Object) str);
                tlh.j(str);
            } else {
                ((anih) tky.a.d()).a("Endpoint %s has rejected the connection", (Object) str);
                tlh.k(str);
            }
            if ((asac.a & 2) != 0) {
                bArr = asac.c.k();
            } else {
                bArr = null;
            }
            tmz.a(tlh, str, bArr, true);
            countDownLatch.countDown();
            return;
        }
        ((anih) tky.a.c()).a("Unexpected connection response from endpoint %s", (Object) str);
    }
}
