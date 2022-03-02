package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: agfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agfz implements Runnable {
    private final agge a;
    private final aggc b;
    private final aggd c;

    public agfz(agge agge, aggc aggc, aggd aggd) {
        this.a = agge;
        this.b = aggc;
        this.c = aggd;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        agge agge = this.a;
        aggc aggc = this.b;
        aggd aggd = this.c;
        try {
            ((anhn) ((anhn) agge.a.d()).a("agge", "b", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("background initialization");
            agge.a(aggc, aggd);
            countDownLatch = agge.g;
        } catch (RuntimeException e) {
            anhn anhn = (anhn) agge.a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agge", "b", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Primes failed to initialize in the background");
            agge.c();
            countDownLatch = agge.g;
        } catch (Throwable th) {
            agge.g.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
