package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: thr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thr {
    public static int a(String str, Future future) {
        try {
            return ((Integer) future.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the status.", (Object) str);
            if (!(e instanceof InterruptedException)) {
                return 13;
            }
            Thread.currentThread().interrupt();
            return 13;
        }
    }

    public static int b(String str, acwa acwa, long j) {
        try {
            acws.a(acwa, j, TimeUnit.MILLISECONDS);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the task.", (Object) str);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Exception e2 = acwa.e();
            if (e2 instanceof ibr) {
                return ((ibr) e2).a();
            }
            return 13;
        }
    }

    public static Object c(String str, Future future, long j) {
        try {
            return future.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the result.", (Object) str);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public static int a(String str, Future future, long j) {
        try {
            return ((Integer) future.get(j, TimeUnit.MILLISECONDS)).intValue();
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the status.", (Object) str);
            if (!(e instanceof InterruptedException)) {
                return 13;
            }
            Thread.currentThread().interrupt();
            return 13;
        }
    }

    public static acwa a(aorr aorr, long j) {
        return acws.a((Executor) tid.b(), (Callable) new thq(aorr, j));
    }

    public static boolean b(String str, Future future, long j) {
        try {
            future.get(j, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the result.", (Object) str);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public static Object a(String str, acwa acwa, long j) {
        try {
            acws.a(acwa, j, TimeUnit.MILLISECONDS);
            return acwa.d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the task.", (Object) str);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public static void a(String str, CountDownLatch countDownLatch) {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e);
            anih.a("Failed %s while waiting for the latch.", (Object) str);
            Thread.currentThread().interrupt();
        }
    }

    public static void a(String str, CountDownLatch countDownLatch, long j) {
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e);
            anih.a("Failed %s while waiting for the latch.", (Object) str);
            Thread.currentThread().interrupt();
        }
    }
}
