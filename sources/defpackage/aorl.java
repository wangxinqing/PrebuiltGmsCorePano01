package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aorl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aorl {
    public static aorr a() {
        return new aorm();
    }

    public static aord b(Iterable iterable) {
        return new aord(false, amzy.a(iterable));
    }

    public static aord c(Iterable iterable) {
        return new aord(true, amzy.a(iterable));
    }

    public static aorr d(Iterable iterable) {
        return new aoqh(amzy.a(iterable), false);
    }

    public static aorr a(aoqa aoqa, Executor executor) {
        aosp aosp = new aosp(aoqa);
        executor.execute(aosp);
        return aosp;
    }

    @SafeVarargs
    public static aord b(aorr... aorrArr) {
        return new aord(false, amzy.a((Object[]) aorrArr));
    }

    @SafeVarargs
    public static aord c(aorr... aorrArr) {
        return new aord(true, amzy.a((Object[]) aorrArr));
    }

    public static aorr a(aorr aorr) {
        if (aorr.isDone()) {
            return aorr;
        }
        aore aore = new aore(aorr);
        aorr.a(aore, aoqm.a);
        return aore;
    }

    public static aorr a(aorr aorr, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aorr.isDone()) {
            return aorr;
        }
        aosm aosm = new aosm(aorr);
        aosk aosk = new aosk(aosm);
        aosm.b = ((jfv) scheduledExecutorService).schedule((Runnable) aosk, j, timeUnit);
        aorr.a(aosk, aoqm.a);
        return aosm;
    }

    public static aorr a(Iterable iterable) {
        return new aoqh(amzy.a(iterable), true);
    }

    public static aorr a(Object obj) {
        if (obj != null) {
            return new aoro(obj);
        }
        return aoro.a;
    }

    public static aorr a(Runnable runnable, Executor executor) {
        aosp a = aosp.a(runnable, (Object) null);
        executor.execute(a);
        return a;
    }

    public static aorr a(Throwable th) {
        amrl.a((Object) th);
        return new aorn(th);
    }

    public static aorr a(Callable callable, Executor executor) {
        aosp a = aosp.a(callable);
        executor.execute(a);
        return a;
    }

    @SafeVarargs
    public static aorr a(aorr... aorrArr) {
        return new aoqh(amzy.a((Object[]) aorrArr), true);
    }

    public static Object a(Future future) {
        amrl.b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return aosr.a(future);
    }

    public static void a(aorr aorr, aora aora, Executor executor) {
        amrl.a((Object) aora);
        aorr.a(new aorb(aorr, aora), executor);
    }
}
