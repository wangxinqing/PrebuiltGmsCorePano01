package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: aavd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aavd implements aauq {
    final /* synthetic */ CountDownLatch a;

    public aavd(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void a() {
        this.a.countDown();
    }
}
