package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: aorq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aorq extends AtomicReference implements Runnable {
    private static final Runnable a = new aorp();
    private static final Runnable b = new aorp();
    private static final Runnable c = new aorp();

    public abstract String a();

    public abstract void a(Object obj, Throwable th);

    public abstract Object b();

    public abstract boolean c();

    /* access modifiers changed from: package-private */
    public final void e() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, b)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(a)) == c) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (((Runnable) getAndSet(a)) == c) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !c();
            if (z) {
                try {
                    obj = b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, a)) {
                        Runnable runnable = (Runnable) get();
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            if (runnable != b && runnable != c) {
                                break;
                            }
                            i++;
                            if (i <= 1000) {
                                Thread.yield();
                            } else {
                                Runnable runnable2 = c;
                                if (runnable == runnable2 || compareAndSet(b, runnable2)) {
                                    z2 = Thread.interrupted() ? true : z2;
                                    LockSupport.park(this);
                                }
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    a((Object) null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, a)) {
                Runnable runnable3 = (Runnable) get();
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    if (runnable3 != b && runnable3 != c) {
                        break;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else {
                        Runnable runnable4 = c;
                        if (runnable3 == runnable4 || compareAndSet(b, runnable4)) {
                            z3 = Thread.interrupted() ? true : z3;
                            LockSupport.park(this);
                        }
                    }
                    runnable3 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                a(obj, (Throwable) null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String a2 = a();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(a2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(a2);
        return sb2.toString();
    }
}
