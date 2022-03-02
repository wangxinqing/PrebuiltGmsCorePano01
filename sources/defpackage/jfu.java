package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: jfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jfu implements RunnableFuture, aorr {
    protected final ReentrantLock a;
    public final Callable b;
    Object c;
    public jgd d = null;
    public boolean e = false;
    final /* synthetic */ jfv f;
    private final Condition g;
    private final aoqp h = new aoqp();

    public jfu(jfv jfv, Callable callable) {
        this.f = jfv;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.g = reentrantLock.newCondition();
        this.b = callable;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
    }

    public final void b() {
        this.h.a();
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        this.a.lock();
        try {
            boolean z3 = false;
            if (!this.e) {
                this.e = true;
                jgd jgd = this.d;
                if (jgd == null || jgd.cancel(z)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.e = z2;
                synchronized (this.f.b) {
                    if (this.e || this.f.c.containsKey(this)) {
                        z3 = true;
                    }
                    this.e = z3;
                    if (z3) {
                        this.f.a(this, true);
                    }
                }
                if (this.e) {
                    b();
                    this.g.signalAll();
                }
                boolean z4 = this.e;
                this.a.unlock();
                return z4;
            }
            this.a.unlock();
            return false;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[SYNTHETIC, Splitter:B:10:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.a
            r0.lock()
        L_0x0005:
            jgd r0 = r2.d     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
            boolean r1 = r2.e     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0013
            java.util.concurrent.locks.Condition r0 = r2.g     // Catch:{ all -> 0x0025 }
            r0.await()     // Catch:{ all -> 0x0025 }
            goto L_0x0005
        L_0x0013:
            if (r0 == 0) goto L_0x001f
            java.util.concurrent.locks.ReentrantLock r1 = r2.a
            r1.unlock()
            java.lang.Object r0 = r0.get()
            return r0
        L_0x001f:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0025 }
            r0.<init>()     // Catch:{ all -> 0x0025 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.a
            r1.unlock()
            goto L_0x002d
        L_0x002c:
            throw r0
        L_0x002d:
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfu.get():java.lang.Object");
    }

    public final boolean isCancelled() {
        this.a.lock();
        try {
            return this.e;
        } finally {
            this.a.unlock();
        }
    }

    public final boolean isDone() {
        this.a.lock();
        try {
            boolean z = false;
            if (!this.e) {
                jgd jgd = this.d;
                if (jgd != null && jgd.isDone()) {
                    z = true;
                }
            } else {
                z = true;
            }
            return z;
        } finally {
            this.a.unlock();
        }
    }

    public final void run() {
        ReentrantLock reentrantLock;
        jgd jgd = new jgd(this.b, this.c);
        jgd.a(new jft(this), aoqm.a);
        this.a.lock();
        try {
            if (!this.e) {
                synchronized (this.f.b) {
                    if (!Thread.interrupted()) {
                        this.d = jgd;
                        this.f.a.execute(jgd);
                        this.f.a(this, false);
                        this.g.signalAll();
                        reentrantLock = this.a;
                    } else {
                        reentrantLock = this.a;
                    }
                }
            } else {
                reentrantLock = this.a;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public final String toString() {
        return this.b.toString();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.h.a(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.c = z ? jez.a("scheduled_t") : jez.a();
    }

    /* JADX INFO: finally extract failed */
    public final Object get(long j, TimeUnit timeUnit) {
        jgd jgd;
        long nanos = timeUnit.toNanos(j);
        this.a.lock();
        while (true) {
            try {
                jgd = this.d;
                if (jgd == null && !this.e && nanos > 0) {
                    nanos = this.g.awaitNanos(nanos);
                }
            } catch (Throwable th) {
                this.a.unlock();
                throw th;
            }
        }
        if (nanos <= 0) {
            throw new TimeoutException();
        } else if (jgd != null) {
            this.a.unlock();
            return jgd.get(nanos, TimeUnit.NANOSECONDS);
        } else {
            throw new CancellationException();
        }
    }
}
