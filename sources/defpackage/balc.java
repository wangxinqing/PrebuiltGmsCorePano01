package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: balc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class balc implements Executor, Runnable {
    private static final Logger b;
    private static final bakz c;
    public volatile int a = 0;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();

    static {
        bakz bakz;
        Class<balc> cls = balc.class;
        b = Logger.getLogger(cls.getName());
        try {
            bakz = new bala(AtomicIntegerFieldUpdater.newUpdater(cls, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            bakz = new balb();
        }
        c = bakz;
    }

    public balc(Executor executor) {
        amrl.a((Object) executor, (Object) "'executor' must not be null.");
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        Queue queue = this.e;
        amrl.a((Object) runnable, (Object) "'r' must not be null.");
        queue.add(runnable);
        a(runnable);
    }

    public final void run() {
        Runnable runnable;
        while (true) {
            try {
                runnable = (Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
            } catch (RuntimeException e2) {
                Logger logger = b;
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Exception while executing runnable ");
                sb.append(valueOf);
                logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), e2);
            } catch (Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (!this.e.isEmpty()) {
            a((Runnable) null);
        }
    }
}
