package defpackage;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aiqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiqh implements Runnable {
    private final aiqo a;
    private final long b;
    private final int c;

    public aiqh(aiqo aiqo, long j, int i) {
        this.a = aiqo;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        aiqo aiqo = this.a;
        long j = this.b;
        int i = this.c;
        List a2 = aiqo.a(Long.valueOf(j));
        CountDownLatch countDownLatch = new CountDownLatch(a2.size());
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            aiqn aiqn = (aiqn) a2.get(i2);
            aiqn.c.post(new aiqm(aiqn, i, countDownLatch));
        }
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            new Object[1][0] = "Manager:";
        }
    }
}
