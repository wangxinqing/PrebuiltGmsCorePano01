package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmk implements Runnable {
    private final tmz a;
    private final tlh b;
    private final CountDownLatch c;

    public tmk(tmz tmz, tlh tlh, CountDownLatch countDownLatch) {
        this.a = tmz;
        this.b = tlh;
        this.c = countDownLatch;
    }

    public final void run() {
        tmz tmz = this.a;
        tlh tlh = this.b;
        CountDownLatch countDownLatch = this.c;
        tmz.b(tlh);
        tlh.w();
        countDownLatch.countDown();
    }
}
