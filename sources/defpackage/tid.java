package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: tid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tid {
    public static aoru b() {
        return a(jfm.b(9));
    }

    public static aoru c() {
        return a(jfm.b(10));
    }

    public static aoru a(int i) {
        return a(jfb.a(i, 9));
    }

    private static aoru a(aoru aoru) {
        if (aymi.a.a().aN()) {
            return new tht(aoru);
        }
        if (aoru instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) aoru).setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        }
        return aoru;
    }

    public static ScheduledExecutorService a() {
        jfc a = jfm.a(1, 9);
        return aymi.a.a().ab() ? new thv(a) : a;
    }

    public static void a(ExecutorService executorService, String str) {
        executorService.shutdown();
        try {
            if (executorService.awaitTermination(500, TimeUnit.MILLISECONDS)) {
                ((anih) tgb.a.d()).a("Successfully shutdown executor %s.", (Object) str);
            } else {
                ((anih) tgb.a.d()).a("Failed to shutdown executor %s.", (Object) str);
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            anih anih = (anih) tgb.a.c();
            anih.a((Throwable) e);
            anih.a("Had to force shutdown of executor %s, expect crashes from NullPointerExceptions.", (Object) str);
            Thread.currentThread().interrupt();
        }
    }
}
