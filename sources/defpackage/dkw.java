package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: dkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkw {
    public static volatile dkw a;
    public final Context b;
    public final List c = new CopyOnWriteArrayList();
    public final dkt d = new dkt(this);
    public volatile dld e;
    public Thread.UncaughtExceptionHandler f;

    public dkw(Context context) {
        Context applicationContext = context.getApplicationContext();
        iva.a((Object) applicationContext);
        this.b = applicationContext;
        new dkm();
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof dkv)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future a(Callable callable) {
        iva.a((Object) callable);
        if (!(Thread.currentThread() instanceof dkv)) {
            return this.d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void a(Runnable runnable) {
        iva.a((Object) runnable);
        this.d.submit(runnable);
    }
}
