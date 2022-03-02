package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tnv implements Runnable {
    private final tob a;
    private final tlh b;
    private final String c;
    private final CountDownLatch d;

    public tnv(tob tob, tlh tlh, String str, CountDownLatch countDownLatch) {
        this.a = tob;
        this.b = tlh;
        this.c = str;
        this.d = countDownLatch;
    }

    public final void run() {
        tob tob = this.a;
        tlh tlh = this.b;
        String str = this.c;
        CountDownLatch countDownLatch = this.d;
        tob.a(tlh, str, false);
        countDownLatch.countDown();
    }
}
