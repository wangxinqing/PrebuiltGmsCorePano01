package defpackage;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: svs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svs extends swm {
    public static final AtomicLong f = new AtomicLong(Long.MIN_VALUE);
    public svr a;
    public svr b;
    public final Object c = new Object();
    public final Semaphore d = new Semaphore(2);
    public volatile boolean e;
    private final PriorityBlockingQueue g = new PriorityBlockingQueue();
    private final BlockingQueue h = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler i = new svp(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler j = new svp(this, "Thread death: Uncaught exception on network thread");

    public svs(svv svv) {
        super(svv);
    }

    public final Future a(Callable callable) {
        k();
        iva.a((Object) callable);
        svq svq = new svq(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            if (!this.g.isEmpty()) {
                E().f.a("Callable skipped the worker queue.");
            }
            svq.run();
        } else {
            a(svq);
        }
        return svq;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    public final void b(Runnable runnable) {
        k();
        iva.a((Object) runnable);
        svq svq = new svq(this, runnable, "Task exception on network thread");
        synchronized (this.c) {
            this.h.add(svq);
            svr svr = this.b;
            if (svr == null) {
                svr svr2 = new svr(this, "Measurement Network", this.h);
                this.b = svr2;
                svr2.setUncaughtExceptionHandler(this.j);
                this.b.start();
            } else {
                svr.a();
            }
        }
    }

    public final boolean c() {
        return Thread.currentThread() == this.a;
    }

    public final void h() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void a(Runnable runnable) {
        k();
        iva.a((Object) runnable);
        a(new svq(this, runnable, "Task exception on worker thread"));
    }

    /* access modifiers changed from: package-private */
    public final void a(AtomicReference atomicReference, String str, Runnable runnable) {
        synchronized (atomicReference) {
            F().a(runnable);
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e2) {
                E().f.a(str.length() == 0 ? new String("Interrupted waiting for ") : "Interrupted waiting for ".concat(str));
                return;
            }
        }
        if (atomicReference.get() == null) {
            E().f.a(str.length() == 0 ? new String("Timed out waiting for ") : "Timed out waiting for ".concat(str));
        }
    }

    public final void a(svq svq) {
        synchronized (this.c) {
            this.g.add(svq);
            svr svr = this.a;
            if (svr == null) {
                svr svr2 = new svr(this, "Measurement Worker", this.g);
                this.a = svr2;
                svr2.setUncaughtExceptionHandler(this.i);
                this.a.start();
            } else {
                svr.a();
            }
        }
    }
}
