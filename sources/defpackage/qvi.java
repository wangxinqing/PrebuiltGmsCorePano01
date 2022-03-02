package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: qvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qvi implements qvh {
    public final ExecutorService a() {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public final ExecutorService b(int i) {
        return d(1);
    }

    public final ScheduledExecutorService c(int i) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    public final ExecutorService d(int i) {
        return a(i, Executors.defaultThreadFactory());
    }

    public final ExecutorService a(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final ExecutorService a(ThreadFactory threadFactory) {
        return a(1, threadFactory);
    }

    public final ScheduledExecutorService a(ThreadFactory threadFactory, int i) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
