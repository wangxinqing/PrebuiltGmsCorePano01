package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: agy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class agy implements aorr {
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    static final agp b;
    private static final Logger c;
    private static final Object d = new Object();
    volatile agt listeners;
    volatile Object value;
    volatile agx waiters;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: agu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: agw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: agu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: agu} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<agy> r0 = defpackage.agy.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            a = r1
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            c = r1
            agu r1 = new agu     // Catch:{ all -> 0x004e }
            java.lang.Class<agx> r2 = defpackage.agx.class
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch:{ all -> 0x004e }
            java.lang.Class<agx> r2 = defpackage.agx.class
            java.lang.Class<agx> r4 = defpackage.agx.class
            java.lang.String r5 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<agx> r2 = defpackage.agx.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<agt> r2 = defpackage.agt.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            agw r1 = new agw
            r1.<init>()
        L_0x0054:
            b = r1
            if (r0 == 0) goto L_0x0061
            java.util.logging.Logger r1 = c
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0061:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.<clinit>():void");
    }

    protected agy() {
    }

    static Object a(aorr aorr) {
        if (aorr instanceof agy) {
            Object obj = ((agy) aorr).value;
            if (!(obj instanceof agq)) {
                return obj;
            }
            agq agq = (agq) obj;
            if (!agq.c) {
                return obj;
            }
            Throwable th = agq.d;
            return th != null ? new agq(false, th) : agq.b;
        }
        boolean isCancelled = aorr.isCancelled();
        if ((!a) && isCancelled) {
            return agq.b;
        }
        try {
            Object a2 = a((Future) aorr);
            return a2 == null ? d : a2;
        } catch (ExecutionException e) {
            return new ags(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new agq(false, e2);
            }
            return new ags(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aorr, e2));
        } catch (Throwable th2) {
            return new ags(th2);
        }
    }

    static void b(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    private final String c(Object obj) {
        return obj != this ? String.valueOf(obj) : "this future";
    }

    private static final Object d(Object obj) {
        if (obj instanceof agq) {
            Throwable th = ((agq) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof ags) {
            throw new ExecutionException(((ags) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: aorr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: agy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof defpackage.agv
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = a
            if (r3 == 0) goto L_0x001f
            agq r3 = new agq
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 != 0) goto L_0x0024
            agq r3 = defpackage.agq.b
            goto L_0x0026
        L_0x0024:
            agq r3 = defpackage.agq.a
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            agp r6 = b
            boolean r6 = r6.a((defpackage.agy) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x0059
            a((defpackage.agy) r4)
            boolean r4 = r0 instanceof defpackage.agv
            if (r4 == 0) goto L_0x0056
            agv r0 = (defpackage.agv) r0
            aorr r0 = r0.b
            boolean r4 = r0 instanceof defpackage.agy
            if (r4 == 0) goto L_0x0052
            r4 = r0
            agy r4 = (defpackage.agy) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof defpackage.agv
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0050
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r1 = 1
            goto L_0x0062
        L_0x0052:
            r0.cancel(r8)
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            r1 = 1
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof defpackage.agv
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.cancel(boolean):boolean");
    }

    public final Object get() {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof agv))) {
                return d(obj2);
            }
            agx agx = this.waiters;
            if (agx != agx.a) {
                agx agx2 = new agx();
                do {
                    agx2.a(agx);
                    if (b.a(this, agx, agx2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                                if (obj != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                a(agx2);
                                throw new InterruptedException();
                            }
                        } while (!(z & (!(obj instanceof agv))));
                        return d(obj);
                    }
                    agx = this.waiters;
                } while (agx != agx.a);
            }
            return d(this.value);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.value instanceof agq;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof agv)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = a();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = true;
            if ((obj != null) && (!(obj instanceof agv))) {
                return d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                agx agx = this.waiters;
                if (agx != agx.a) {
                    agx agx2 = new agx();
                    do {
                        agx2.a(agx);
                        if (!b.a(this, agx, agx2)) {
                            agx = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof agv))) {
                                        return d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(agx2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(agx2);
                        }
                    } while (agx != agx.a);
                }
                return d(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (!(obj3 instanceof agv))) {
                    return d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String agy = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + agy);
        }
        throw new InterruptedException();
    }

    private final void a(agx agx) {
        agx.thread = null;
        while (true) {
            agx agx2 = this.waiters;
            if (agx2 != agx.a) {
                agx agx3 = null;
                while (agx2 != null) {
                    agx agx4 = agx2.next;
                    if (agx2.thread != null) {
                        agx3 = agx2;
                    } else if (agx3 != null) {
                        agx3.next = agx4;
                        if (agx3.thread == null) {
                        }
                    } else if (!b.a(this, agx2, agx4)) {
                    }
                    agx2 = agx4;
                }
                return;
            }
            return;
        }
    }

    static void a(agy agy) {
        agt agt;
        agt agt2 = null;
        while (true) {
            agx agx = agy.waiters;
            if (b.a(agy, agx, agx.a)) {
                while (agx != null) {
                    Thread thread = agx.thread;
                    if (thread != null) {
                        agx.thread = null;
                        LockSupport.unpark(thread);
                    }
                    agx = agx.next;
                }
                do {
                    agt = agy.listeners;
                } while (!b.a(agy, agt, agt.a));
                agt agt3 = agt2;
                agt agt4 = agt;
                while (agt4 != null) {
                    agt agt5 = agt4.next;
                    agt4.next = agt3;
                    agt3 = agt4;
                    agt4 = agt5;
                }
                while (agt3 != null) {
                    agt2 = agt3.next;
                    Runnable runnable = agt3.b;
                    if (runnable instanceof agv) {
                        agv agv = (agv) runnable;
                        agy = agv.a;
                        if (agy.value == agv) {
                            if (b.a(agy, (Object) agv, a(agv.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, agt3.c);
                    }
                    agt3 = agt2;
                }
                return;
            }
        }
    }

    private final void a(StringBuilder sb) {
        try {
            Object a2 = a((Future) this);
            sb.append("SUCCESS, result=[");
            sb.append(c(a2));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        Object obj = this.value;
        if (obj instanceof agv) {
            return "setFuture=[" + c(((agv) obj).b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        b(runnable);
        b(executor);
        agt agt = this.listeners;
        if (agt != agt.a) {
            agt agt2 = new agt(runnable, executor);
            do {
                agt2.next = agt;
                if (!b.a(this, agt, agt2)) {
                    agt = this.listeners;
                } else {
                    return;
                }
            } while (agt != agt.a);
        }
        b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!b.a(this, (Object) null, obj)) {
            return false;
        }
        a(this);
        return true;
    }
}
