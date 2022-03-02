package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ascu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ascu implements asiz {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ asda c;

    public ascu(asda asda, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.c = asda;
        this.a = atomicBoolean;
        this.b = countDownLatch;
    }

    public final void a() {
        this.a.set(true);
        this.b.countDown();
    }

    public final void b() {
        this.c.i();
        this.b.countDown();
    }
}
