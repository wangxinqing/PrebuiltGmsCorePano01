package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ukv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ukv implements acvp {
    private final CountDownLatch a;

    public ukv(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void a(acwa acwa) {
        this.a.countDown();
    }
}
