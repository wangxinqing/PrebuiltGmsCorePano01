package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: kdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdr implements Runnable {
    final /* synthetic */ CountDownLatch a;

    public kdr(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void run() {
        this.a.countDown();
    }
}
