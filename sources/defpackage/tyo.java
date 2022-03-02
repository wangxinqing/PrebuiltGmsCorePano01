package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tyo implements Runnable {
    private final AtomicBoolean a;
    private final amsv b;
    private final CountDownLatch c;

    public tyo(AtomicBoolean atomicBoolean, amsv amsv, CountDownLatch countDownLatch) {
        this.a = atomicBoolean;
        this.b = amsv;
        this.c = countDownLatch;
    }

    public final void run() {
        AtomicBoolean atomicBoolean = this.a;
        amsv amsv = this.b;
        CountDownLatch countDownLatch = this.c;
        atomicBoolean.set(((Boolean) amsv.a()).booleanValue());
        countDownLatch.countDown();
    }
}
