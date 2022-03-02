package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d {
    public static final aoru a;
    public static final ScheduledExecutorService b = new ScheduledThreadPoolExecutor(3, a("Schedule"));

    static {
        a((Executor) new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = a((Executor) threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        a((Executor) threadPoolExecutor2);
        a((Executor) new b());
        a((Executor) aoqm.a);
    }

    private static aoru a(Executor executor) {
        return new c(executor);
    }

    private static ThreadFactory a(String str) {
        return new a(str);
    }
}
