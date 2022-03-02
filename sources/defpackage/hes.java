package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: hes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hes implements Runnable {
    private final CountDownLatch a;

    public hes(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void run() {
        this.a.countDown();
    }
}
