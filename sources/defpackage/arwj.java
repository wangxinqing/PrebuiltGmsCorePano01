package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: arwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arwj extends arwm {
    final /* synthetic */ arwm a;
    final /* synthetic */ CountDownLatch b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arwj(String str, arwm arwm, CountDownLatch countDownLatch) {
        super(str);
        this.a = arwm;
        this.b = countDownLatch;
    }

    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.countDown();
        }
    }
}
