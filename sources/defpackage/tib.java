package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tib implements tic {
    public final aoru a;

    public tib(aoru aoru) {
        this.a = aoru;
    }

    public static aosh a(aoru aoru, tia tia) {
        aosh f = aosh.f();
        try {
            aoru.execute(new thz(f, Thread.currentThread(), tia));
        } catch (RejectedExecutionException e) {
            f.a((Throwable) e);
        }
        return f;
    }

    public final void b() {
        this.a.shutdownNow();
    }

    private static tia a(Thread thread, tia tia) {
        tia tia2 = new tia(tia);
        tia2.setStackTrace(thread.getStackTrace());
        return tia2;
    }

    static final /* synthetic */ void a(aosh aosh, Thread thread, tia tia) {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (true) {
            try {
                aosh.get(aymi.C(), TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                anih anih = (anih) tgb.a.c();
                anih.a((Throwable) a(thread, tia));
                anih.a("Method is still running after %d millis.", SystemClock.uptimeMillis() - uptimeMillis);
            }
        }
        if (SystemClock.uptimeMillis() - uptimeMillis > aymi.C()) {
            anih anih2 = (anih) tgb.a.c();
            anih2.a((Throwable) a(thread, tia));
            anih2.a("Method finished running after %d millis.", SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    public final Runnable a(Runnable runnable) {
        return new thx(this, new tia(), runnable);
    }

    public final Callable a(Callable callable) {
        return new thy(this, new tia(), callable);
    }

    public final void a() {
        this.a.shutdown();
    }
}
