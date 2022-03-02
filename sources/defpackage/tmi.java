package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmi implements Runnable {
    private final tmz a;
    private final tlh b;
    private final CountDownLatch c;

    public tmi(tmz tmz, tlh tlh, CountDownLatch countDownLatch) {
        this.a = tmz;
        this.b = tlh;
        this.c = countDownLatch;
    }

    public final void run() {
        tmz tmz = this.a;
        tlh tlh = this.b;
        CountDownLatch countDownLatch = this.c;
        tmz.a(tlh);
        tlh.v();
        countDownLatch.countDown();
    }
}
