package defpackage;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bawy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawy implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    private final Runnable a(boolean z, long j) {
        Runnable runnable;
        if (z) {
            try {
                runnable = (Runnable) this.a.poll(j, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e2);
                throw interruptedIOException;
            }
        } else {
            runnable = (Runnable) this.a.take();
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }

    public final void b() {
        this.b = false;
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.a.put(runnable);
            } catch (InterruptedException e2) {
                throw new RejectedExecutionException(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void a() {
        a(0);
    }

    public final void a(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        if (this.c) {
            InterruptedIOException interruptedIOException = this.d;
            if (interruptedIOException == null) {
                throw this.e;
            }
            throw interruptedIOException;
        } else if (!this.b) {
            this.b = true;
            while (this.b) {
                if (i != 0) {
                    try {
                        a(true, (convert - System.nanoTime()) + nanoTime).run();
                    } catch (InterruptedIOException e2) {
                        this.b = false;
                        this.c = true;
                        this.d = e2;
                        throw e2;
                    } catch (RuntimeException e3) {
                        this.b = false;
                        this.c = true;
                        this.e = e3;
                        throw e3;
                    }
                } else {
                    a(false, 0).run();
                }
            }
        } else {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
    }
}
