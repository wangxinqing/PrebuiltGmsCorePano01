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

/* renamed from: aopn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aopn extends aoss implements aorr {
    private static final Logger a;
    private static final Object b = new Object();
    public static final boolean j;
    public static final aopa k;
    public volatile aope listeners;
    public volatile Object value;
    public volatile aopm waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        aopa aopa;
        Class<aopn> cls = aopn.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            z = false;
        }
        j = z;
        a = Logger.getLogger(cls.getName());
        try {
            aopa = new aopl();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            aopa = new aoph();
        }
        k = aopa;
        if (th != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected aopn() {
    }

    public static Object a(aorr aorr) {
        Throwable e;
        if (aorr instanceof aopi) {
            Object obj = ((aopn) aorr).value;
            if (!(obj instanceof aopb)) {
                return obj;
            }
            aopb aopb = (aopb) obj;
            if (!aopb.c) {
                return obj;
            }
            Throwable th = aopb.d;
            return th != null ? new aopb(false, th) : aopb.b;
        } else if ((aorr instanceof aoss) && (e = ((aoss) aorr).e()) != null) {
            return new aopd(e);
        } else {
            boolean isCancelled = aorr.isCancelled();
            if ((!j) && isCancelled) {
                return aopb.b;
            }
            try {
                Object b2 = b((Future) aorr);
                if (!isCancelled) {
                    return b2 == null ? b : b2;
                }
                String valueOf = String.valueOf(aorr);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new aopb(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new aopd(e2.getCause());
                }
                String valueOf2 = String.valueOf(aorr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new aopb(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new aopb(false, e3);
                }
                String valueOf3 = String.valueOf(aorr);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new aopd(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th2) {
                return new aopd(th2);
            }
        }
    }

    private static Object b(Future future) {
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

    /* access modifiers changed from: protected */
    public String aK() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: aorr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: aopn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
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
            boolean r4 = r0 instanceof defpackage.aopg
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0067
            boolean r3 = j
            if (r3 == 0) goto L_0x001f
            aopb r3 = new aopb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 != 0) goto L_0x0024
            aopb r3 = defpackage.aopb.b
            goto L_0x0026
        L_0x0024:
            aopb r3 = defpackage.aopb.a
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            aopa r6 = k
            boolean r6 = r6.a((defpackage.aopn) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 != 0) goto L_0x0038
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof defpackage.aopg
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0068
        L_0x0038:
            if (r8 != 0) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            r4.c()
        L_0x003e:
            a((defpackage.aopn) r4)
            boolean r4 = r0 instanceof defpackage.aopg
            if (r4 == 0) goto L_0x0064
            aopg r0 = (defpackage.aopg) r0
            aorr r0 = r0.b
            boolean r4 = r0 instanceof defpackage.aopi
            if (r4 == 0) goto L_0x0060
            r4 = r0
            aopn r4 = (defpackage.aopn) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            boolean r6 = r0 instanceof defpackage.aopg
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005e
            r5 = 1
            goto L_0x0028
        L_0x005e:
            r1 = 1
            goto L_0x0068
        L_0x0060:
            r0.cancel(r8)
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            r1 = 1
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopn.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        Object obj = this.value;
        return (obj instanceof aopb) && ((aopb) obj).c;
    }

    public final Throwable e() {
        if (!(this instanceof aopi)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof aopd) {
            return ((aopd) obj).b;
        }
        return null;
    }

    public Object get() {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof aopg))) {
                return a(obj2);
            }
            aopm aopm = this.waiters;
            if (aopm != aopm.a) {
                aopm aopm2 = new aopm();
                do {
                    aopm2.a(aopm);
                    if (k.a(this, aopm, aopm2)) {
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
                                a(aopm2);
                                throw new InterruptedException();
                            }
                        } while (!(z & (!(obj instanceof aopg))));
                        return a(obj);
                    }
                    aopm = this.waiters;
                } while (aopm != aopm.a);
            }
            return a(this.value);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof aopb;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof aopg)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            a(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    private final void b(StringBuilder sb) {
        try {
            Object b2 = b((Future) this);
            sb.append("SUCCESS, result=[");
            a(sb, b2);
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

    public final void b(aorr aorr) {
        aopg aopg;
        aopd aopd;
        amrl.a((Object) aorr);
        Object obj = this.value;
        if (obj == null) {
            if (aorr.isDone()) {
                if (k.a(this, (Object) null, a(aorr))) {
                    a(this);
                    return;
                }
                return;
            }
            aopg = new aopg(this, aorr);
            if (!k.a(this, (Object) null, (Object) aopg)) {
                obj = this.value;
            } else {
                try {
                    aorr.a(aopg, aoqm.a);
                    return;
                } catch (Throwable th) {
                    aopd = aopd.a;
                }
            }
        }
        if (obj instanceof aopb) {
            aorr.cancel(((aopb) obj).c);
            return;
        }
        return;
        k.a(this, (Object) aopg, (Object) aopd);
    }

    public Object get(long j2, TimeUnit timeUnit) {
        boolean z;
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = true;
            if ((obj != null) && (!(obj instanceof aopg))) {
                return a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                aopm aopm = this.waiters;
                if (aopm != aopm.a) {
                    aopm aopm2 = new aopm();
                    do {
                        aopm2.a(aopm);
                        if (!k.a(this, aopm, aopm2)) {
                            aopm = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof aopg))) {
                                        return a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(aopm2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(aopm2);
                        }
                    } while (aopm != aopm.a);
                }
                return a(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (!(obj3 instanceof aopg))) {
                    return a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aopn = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z2) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z2) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(aopn).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(aopn);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    private static final Object a(Object obj) {
        if (obj instanceof aopb) {
            Throwable th = ((aopb) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof aopd) {
            throw new ExecutionException(((aopd) obj).b);
        } else if (obj == b) {
            return null;
        } else {
            return obj;
        }
    }

    private final void a(aopm aopm) {
        aopm.thread = null;
        while (true) {
            aopm aopm2 = this.waiters;
            if (aopm2 != aopm.a) {
                aopm aopm3 = null;
                while (aopm2 != null) {
                    aopm aopm4 = aopm2.next;
                    if (aopm2.thread != null) {
                        aopm3 = aopm2;
                    } else if (aopm3 != null) {
                        aopm3.next = aopm4;
                        if (aopm3.thread == null) {
                        }
                    } else if (!k.a(this, aopm2, aopm4)) {
                    }
                    aopm2 = aopm4;
                }
                return;
            }
            return;
        }
    }

    public boolean b(Object obj) {
        if (obj == null) {
            obj = b;
        }
        if (!k.a(this, (Object) null, obj)) {
            return false;
        }
        a(this);
        return true;
    }

    public static void a(aopn aopn) {
        aope aope;
        aope aope2 = null;
        while (true) {
            aopm aopm = aopn.waiters;
            if (k.a(aopn, aopm, aopm.a)) {
                while (aopm != null) {
                    Thread thread = aopm.thread;
                    if (thread != null) {
                        aopm.thread = null;
                        LockSupport.unpark(thread);
                    }
                    aopm = aopm.next;
                }
                aopn.b();
                do {
                    aope = aopn.listeners;
                } while (!k.a(aopn, aope, aope.a));
                aope aope3 = aope2;
                aope aope4 = aope;
                while (aope4 != null) {
                    aope aope5 = aope4.next;
                    aope4.next = aope3;
                    aope3 = aope4;
                    aope4 = aope5;
                }
                while (aope3 != null) {
                    aope2 = aope3.next;
                    Runnable runnable = aope3.b;
                    if (runnable instanceof aopg) {
                        aopg aopg = (aopg) runnable;
                        aopn = aopg.a;
                        if (aopn.value == aopg) {
                            if (k.a(aopn, (Object) aopg, a(aopg.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, aope3.c);
                    }
                    aope3 = aope2;
                }
                return;
            }
        }
    }

    private final void a(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof aopg) {
            sb.append(", setFuture=[");
            a(sb, (Object) ((aopg) obj).b);
            sb.append("]");
        } else {
            try {
                str = amrk.c(aK());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            b(sb);
        }
    }

    private final void a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        aope aope;
        amrl.a((Object) runnable, (Object) "Runnable was null.");
        amrl.a((Object) executor, (Object) "Executor was null.");
        if (isDone() || (aope = this.listeners) == aope.a) {
            b(runnable, executor);
        }
        aope aope2 = new aope(runnable, executor);
        do {
            aope2.next = aope;
            if (!k.a(this, aope, aope2)) {
                aope = this.listeners;
            } else {
                return;
            }
        } while (aope != aope.a);
        b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void a(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(d());
        }
    }

    public final boolean a(Throwable th) {
        amrl.a((Object) th);
        if (!k.a(this, (Object) null, (Object) new aopd(th))) {
            return false;
        }
        a(this);
        return true;
    }
}
