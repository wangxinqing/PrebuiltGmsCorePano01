package defpackage;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: jfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jfz extends ThreadPoolExecutor implements aoru {
    public final Executor a;
    public final Set b = Collections.newSetFromMap(new IdentityHashMap());
    public final BlockingQueue c = getQueue();
    public final ReentrantLock d;
    public final Condition e;
    public int f;
    public final AtomicInteger g;
    public int h;
    public boolean i;
    private int j;
    private boolean k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jfz(int r8, int r9) {
        /*
            r7 = this;
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            java.util.IdentityHashMap r8 = new java.util.IdentityHashMap
            r8.<init>()
            java.util.Set r8 = java.util.Collections.newSetFromMap(r8)
            r7.b = r8
            java.util.concurrent.BlockingQueue r8 = r7.getQueue()
            r7.c = r8
            java.util.concurrent.locks.ReentrantLock r8 = new java.util.concurrent.locks.ReentrantLock
            r8.<init>()
            r7.d = r8
            java.util.concurrent.locks.Condition r8 = r8.newCondition()
            r7.e = r8
            r8 = 0
            r7.f = r8
            r7.j = r8
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r7.g = r0
            r7.h = r8
            java.util.concurrent.ThreadPoolExecutor r8 = com.google.android.gms.common.threads.internal.GlobalExecutorsImpl.getPool(r9)
            r7.a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfz.<init>(int, int):void");
    }

    protected static final jgd a(Callable callable) {
        return new jgd(callable, jez.a());
    }

    private final void c(Runnable runnable) {
        getRejectedExecutionHandler().rejectedExecution(runnable, this);
    }

    public final void allowCoreThreadTimeOut(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean allowsCoreThreadTimeOut() {
        Executor executor = this.a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).allowsCoreThreadTimeOut();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        this.d.lock();
        while (true) {
            try {
                if (this.k) {
                    if (this.f == 0) {
                        this.d.unlock();
                        return true;
                    }
                }
                if (nanos > 0) {
                    nanos = this.e.awaitNanos(nanos);
                } else {
                    this.d.unlock();
                    return false;
                }
            } catch (Throwable th) {
                this.d.unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final aorr submit(Callable callable) {
        return (aorr) super.submit(callable);
    }

    public final void execute(Runnable runnable) {
        iva.a((Object) runnable);
        a(runnable, !(runnable instanceof jey) ? jez.a() : null);
    }

    public final int getActiveCount() {
        this.d.lock();
        try {
            return this.b.size();
        } finally {
            this.d.unlock();
        }
    }

    public final long getCompletedTaskCount() {
        return (long) this.g.get();
    }

    public final long getKeepAliveTime(TimeUnit timeUnit) {
        Executor executor = this.a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).getKeepAliveTime(timeUnit);
        }
        throw new UnsupportedOperationException();
    }

    public final int getLargestPoolSize() {
        this.d.lock();
        try {
            return this.h;
        } finally {
            this.d.unlock();
        }
    }

    public final int getPoolSize() {
        return getActiveCount();
    }

    /* JADX INFO: finally extract failed */
    public final long getTaskCount() {
        this.d.lock();
        try {
            int i2 = this.j;
            this.d.unlock();
            return (long) i2;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final ThreadFactory getThreadFactory() {
        Executor executor = this.a;
        if (executor instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executor).getThreadFactory();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean isShutdown() {
        this.d.lock();
        try {
            return this.k;
        } finally {
            this.d.unlock();
        }
    }

    public final boolean isTerminated() {
        this.d.lock();
        try {
            boolean z = false;
            if (this.k && this.f == 0) {
                z = true;
            }
            return z;
        } finally {
            this.d.unlock();
        }
    }

    public final boolean isTerminating() {
        this.d.lock();
        try {
            boolean z = false;
            if (this.k && this.f != 0) {
                z = true;
            }
            return z;
        } finally {
            this.d.unlock();
        }
    }

    public final int prestartAllCoreThreads() {
        int i2 = 0;
        while (prestartCoreThread()) {
            i2++;
        }
        return i2;
    }

    public final boolean prestartCoreThread() {
        ReentrantLock reentrantLock;
        this.d.lock();
        try {
            if (this.f >= getCorePoolSize()) {
                reentrantLock = this.d;
            } else if (!this.c.isEmpty()) {
                this.f++;
                this.a.execute(new jfy(this, (Runnable) this.c.poll(), (amko) null));
                return true;
            } else {
                reentrantLock = this.d;
            }
            reentrantLock.unlock();
            return false;
        } finally {
            this.d.unlock();
        }
    }

    public final boolean remove(Runnable runnable) {
        return this.c.remove(runnable) || this.c.remove(new jew(runnable, (Object) null));
    }

    public final void setCorePoolSize(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void setKeepAliveTime(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void setThreadFactory(ThreadFactory threadFactory) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    public final void shutdown() {
        this.d.lock();
        try {
            this.k = true;
            this.d.unlock();
            terminated();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List shutdownNow() {
        this.d.lock();
        try {
            this.k = true;
            this.i = true;
            ArrayList arrayList = new ArrayList(this.c.size());
            this.c.drainTo(arrayList);
            for (Thread interrupt : this.b) {
                interrupt.interrupt();
            }
            this.d.unlock();
            terminated();
            return arrayList;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final String toString() {
        String str;
        long taskCount = getTaskCount();
        long completedTaskCount = getCompletedTaskCount();
        int activeCount = getActiveCount();
        int largestPoolSize = getLargestPoolSize();
        int maximumPoolSize = getMaximumPoolSize();
        if (!isShutdown()) {
            str = " !";
        } else {
            str = " ";
        }
        String str2 = !isTerminated() ? "!" : "";
        StringBuilder sb = new StringBuilder(str.length() + 243 + str2.length());
        sb.append("PooledThreadPoolExecutor[getTaskCount() = ");
        sb.append(taskCount);
        sb.append(", getCompletedTaskCount() = ");
        sb.append(completedTaskCount);
        sb.append(", getActiveCount() = ");
        sb.append(activeCount);
        sb.append(", getLargestPoolSize() = ");
        sb.append(largestPoolSize);
        sb.append(", getMaximumPoolSize() = ");
        sb.append(maximumPoolSize);
        sb.append(str);
        sb.append("isShutDown(), ");
        sb.append(str2);
        sb.append("isTerminated()]");
        return sb.toString();
    }

    private final void a(Runnable runnable, amko amko) {
        ReentrantLock reentrantLock;
        Runnable runnable2;
        this.d.lock();
        try {
            if (!this.k) {
                this.j++;
                int maximumPoolSize = getMaximumPoolSize();
                int i2 = this.f;
                if (i2 < maximumPoolSize) {
                    this.f = i2 + 1;
                    this.a.execute(new jfy(this, runnable, amko));
                    reentrantLock = this.d;
                } else {
                    BlockingQueue blockingQueue = this.c;
                    if (amko != null) {
                        runnable2 = new jew(runnable, amko);
                    } else {
                        runnable2 = runnable;
                    }
                    if (!blockingQueue.offer(runnable2)) {
                        this.j--;
                        c(runnable);
                        reentrantLock = this.d;
                    } else {
                        reentrantLock = this.d;
                    }
                }
            } else {
                c(runnable);
                reentrantLock = this.d;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Runnable runnable) {
        a(runnable, (amko) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return a(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return a(callable);
    }

    public jfz(int i2, BlockingQueue blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(1, 1, 0, TimeUnit.NANOSECONDS, blockingQueue, rejectedExecutionHandler);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        this.e = reentrantLock.newCondition();
        this.f = 0;
        this.j = 0;
        this.g = new AtomicInteger();
        this.h = 0;
        this.a = GlobalExecutorsImpl.getPool(i2);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable) {
        return (aorr) super.submit(runnable);
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable, Object obj) {
        return (aorr) super.submit(runnable, obj);
    }
}
