package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: jfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jfv extends AbstractExecutorService implements jfc {
    private static final ScheduledThreadPoolExecutor e = new ScheduledThreadPoolExecutor(1, new jlt("GlobalScheduler"));
    public final jfz a;
    public final Object b = new Object();
    public final ou c = new ou(0);
    public volatile boolean d = false;
    private final ScheduledExecutorService f = e;
    private final ou g = new ou(0);

    static {
        int i = Build.VERSION.SDK_INT;
        e.setRemoveOnCancelPolicy(true);
    }

    public jfv(int i, int i2) {
        this.a = new jfr(i, i2);
    }

    protected static final aort a(ScheduledFuture scheduledFuture, aorr aorr) {
        return new jfq(scheduledFuture, aorr);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final aorr submit(Callable callable) {
        aorr b2;
        synchronized (this.b) {
            a();
            b2 = this.a.submit(callable);
        }
        return b2;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            a();
            this.a.execute(runnable);
        }
    }

    public final boolean isShutdown() {
        return this.d;
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        synchronized (this.b) {
            this.d = true;
            if (this.g.isEmpty()) {
                this.a.shutdown();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final List shutdownNow() {
        ArrayList arrayList;
        int i;
        ou ouVar;
        ou ouVar2;
        synchronized (this.b) {
            arrayList = new ArrayList(this.g.h + this.c.h);
            this.d = true;
            i = 0;
            int i2 = 0;
            while (true) {
                ouVar = this.g;
                if (i2 >= ouVar.h) {
                    break;
                }
                if (((ScheduledFuture) ouVar.c(i2)).cancel(true)) {
                    arrayList.add((jfu) this.g.b(i2));
                }
                i2++;
            }
            ouVar.clear();
            int i3 = 0;
            while (true) {
                ouVar2 = this.c;
                if (i3 >= ouVar2.h) {
                    break;
                }
                if (((ScheduledFuture) ouVar2.c(i3)).cancel(true)) {
                    arrayList.add((jfu) this.c.b(i3));
                }
                i3++;
            }
            ouVar2.clear();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        while (i < size) {
            jfu jfu = (jfu) arrayList.get(i);
            jfu.a.lock();
            try {
                iva.a(!jfu.e);
                jgd jgd = new jgd(jfu.b, jfu.c);
                jfu.d = jgd;
                jfu.d.a(new jfs(jfu), aoqm.a);
                jfu.a();
                jfu.a.unlock();
                arrayList2.add(jgd);
                i++;
            } catch (Throwable th) {
                jfu.a.unlock();
                throw th;
            }
        }
        arrayList2.addAll(this.a.shutdownNow());
        return arrayList2;
    }

    private final void a() {
        if (this.d) {
            throw new RejectedExecutionException();
        }
    }

    /* renamed from: b */
    public final aort scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jfu a2;
        ScheduledFuture<?> scheduleWithFixedDelay;
        synchronized (this.b) {
            a();
            a2 = a(Executors.callable(runnable, (Object) null));
            ScheduledExecutorService scheduledExecutorService = this.f;
            a2.a(a(j2, timeUnit));
            scheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(a2, j, j2, timeUnit);
            this.c.put(a2, scheduleWithFixedDelay);
        }
        aort a3 = a((ScheduledFuture) scheduleWithFixedDelay, (aorr) a2);
        jfi.a(a3);
        return a3;
    }

    private static final boolean a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.convert(j, timeUnit) >= jfa.a.b;
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable) {
        aorr a2;
        synchronized (this.b) {
            a();
            a2 = this.a.submit(runnable, (Object) null);
        }
        return a2;
    }

    /* renamed from: a */
    public final aorr submit(Runnable runnable, Object obj) {
        aorr a2;
        synchronized (this.b) {
            a();
            a2 = this.a.submit(runnable, obj);
        }
        return a2;
    }

    /* renamed from: a */
    public final aort scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jfu a2;
        ScheduledFuture<?> scheduleAtFixedRate;
        synchronized (this.b) {
            a();
            a2 = a(Executors.callable(runnable, (Object) null));
            ScheduledExecutorService scheduledExecutorService = this.f;
            a2.a(a(j2, timeUnit));
            scheduleAtFixedRate = scheduledExecutorService.scheduleAtFixedRate(a2, j, j2, timeUnit);
            this.c.put(a2, scheduleAtFixedRate);
        }
        aort a3 = a((ScheduledFuture) scheduleAtFixedRate, (aorr) a2);
        jfi.a(a3);
        return a3;
    }

    /* renamed from: a */
    public final aort schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable, (Object) null), j, timeUnit);
    }

    /* renamed from: a */
    public final aort schedule(Callable callable, long j, TimeUnit timeUnit) {
        jfu a2;
        ScheduledFuture<?> schedule;
        synchronized (this.b) {
            a();
            a2 = a(callable);
            ScheduledExecutorService scheduledExecutorService = this.f;
            a2.a(a(j, timeUnit));
            schedule = scheduledExecutorService.schedule(a2, j, timeUnit);
            if (!schedule.isDone()) {
                this.g.put(a2, schedule);
            }
        }
        return a((ScheduledFuture) schedule, (aorr) a2);
    }

    /* access modifiers changed from: protected */
    public final jfu a(Callable callable) {
        return new jfu(this, callable);
    }

    /* access modifiers changed from: protected */
    public final void a(jfu jfu, boolean z) {
        if (this.g.remove(jfu) != null) {
            if (this.d && this.g.isEmpty()) {
                this.a.shutdown();
            }
            jfu.a();
        } else if (z && this.c.remove(jfu) != null) {
            jfu.a();
        }
    }
}
