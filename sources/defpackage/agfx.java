package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: agfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agfx implements Runnable {
    private final agge a;
    private final ExecutorService b;
    private final Runnable c;

    public agfx(agge agge, ExecutorService executorService, Runnable runnable) {
        this.a = agge;
        this.b = executorService;
        this.c = runnable;
    }

    public final void run() {
        agge agge = this.a;
        ExecutorService executorService = this.b;
        try {
            executorService.submit(this.c);
            anhq anhq = aggw.a;
        } catch (RuntimeException e) {
            anhn anhn = (anhn) agge.a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agge", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Primes failed to initialize");
            agge.c();
        }
        if (agge.f.a() == null) {
            executorService.shutdown();
        }
    }
}
