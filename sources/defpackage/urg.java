package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: urg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class urg implements Runnable {
    private final CountDownLatch a;

    public urg(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void run() {
        this.a.countDown();
    }
}
