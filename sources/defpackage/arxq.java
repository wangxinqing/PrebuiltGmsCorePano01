package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: arxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arxq implements aora {
    final /* synthetic */ CountDownLatch a;

    public arxq(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        aryq aryq = aryq.a;
        this.a.countDown();
    }

    public final void a(Throwable th) {
        aryq aryq = aryq.a;
        this.a.countDown();
    }
}
