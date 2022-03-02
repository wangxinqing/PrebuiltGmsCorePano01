package defpackage;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: tlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlq implements Runnable {
    private final tnm a;
    private final CountDownLatch b;

    public tlq(tnm tnm, CountDownLatch countDownLatch) {
        this.a = tnm;
        this.b = countDownLatch;
    }

    public final void run() {
        tnm tnm = this.a;
        CountDownLatch countDownLatch = this.b;
        try {
            tnm.e();
        } catch (IOException e) {
        }
        countDownLatch.countDown();
    }
}
