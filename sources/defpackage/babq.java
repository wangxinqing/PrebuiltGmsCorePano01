package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: babq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babq implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public babq(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        amrl.a((Object) uncaughtExceptionHandler, (Object) "uncaughtExceptionHandler");
        this.a = uncaughtExceptionHandler;
    }

    public final babp a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        babo babo = new babo(runnable);
        return new babp(babo, scheduledExecutorService.schedule(new babn(this, babo, runnable), j, timeUnit));
    }

    public final void b() {
        amrl.b(Thread.currentThread() == this.c.get(), (Object) "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        a(runnable);
        a();
    }

    public final void a() {
        while (this.c.compareAndSet((Object) null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        this.c.set((Object) null);
                        if (this.b.isEmpty()) {
                            return;
                        }
                    } else {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    this.c.set((Object) null);
                    throw th;
                }
            }
        }
    }

    public final void a(Runnable runnable) {
        Queue queue = this.b;
        amrl.a((Object) runnable, (Object) "runnable is null");
        queue.add(runnable);
    }
}
