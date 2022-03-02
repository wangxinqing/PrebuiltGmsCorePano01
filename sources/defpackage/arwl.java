package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: arwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwl implements arwf {
    public static final long a = TimeUnit.SECONDS.toMillis(5);
    public static final long b = TimeUnit.SECONDS.toMillis(2);
    public final arwk c;
    public final jjg d;
    public volatile boolean e = false;

    public arwl(String str, Looper looper) {
        this.d = tgd.a(str);
        this.c = new arwk(this, looper);
        looper.getThread().getName();
        looper.getThread().getId();
    }

    public final void a(arwm arwm, boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.c.a(new arwj(arwm.m, arwm, countDownLatch), 0, z)) {
            countDownLatch.countDown();
        }
        countDownLatch.await();
    }
}
