package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmc implements Runnable {
    private final tmz a;
    private final String b;
    private final tlh c;
    private final CountDownLatch d;

    public tmc(tmz tmz, String str, tlh tlh, CountDownLatch countDownLatch) {
        this.a = tmz;
        this.b = str;
        this.c = tlh;
        this.d = countDownLatch;
    }

    public final void run() {
        tmz tmz = this.a;
        String str = this.b;
        tlh tlh = this.c;
        CountDownLatch countDownLatch = this.d;
        tfu tfu = (tfu) tmz.i.remove(str);
        if (tfu != null) {
            tfu.b();
        }
        tmz.b(tlh, str);
        countDownLatch.countDown();
    }
}
