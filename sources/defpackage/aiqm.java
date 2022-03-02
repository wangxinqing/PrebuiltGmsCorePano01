package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: aiqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiqm implements Runnable {
    private final aiqn a;
    private final int b;
    private final CountDownLatch c;

    public aiqm(aiqn aiqn, int i, CountDownLatch countDownLatch) {
        this.a = aiqn;
        this.b = i;
        this.c = countDownLatch;
    }

    public final void run() {
        aiqn aiqn = this.a;
        int i = this.b;
        CountDownLatch countDownLatch = this.c;
        aiqn.b.b(i);
        countDownLatch.countDown();
    }
}
