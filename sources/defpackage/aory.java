package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: aory  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aory extends aopo {
    private final Object a = new Object();
    private int b = 0;
    private boolean c = false;

    private final void a() {
        synchronized (this.a) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.a.notifyAll();
            }
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.a) {
            while (true) {
                if (this.c) {
                    if (this.b == 0) {
                        return true;
                    }
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            if (!this.c) {
                this.b++;
            } else {
                throw new RejectedExecutionException("Executor already shutdown");
            }
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.b == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void shutdown() {
        synchronized (this.a) {
            this.c = true;
            if (this.b == 0) {
                this.a.notifyAll();
            }
        }
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
