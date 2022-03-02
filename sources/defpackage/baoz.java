package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

/* renamed from: baoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baoz extends ConcurrentLinkedQueue implements Executor {
    public static final Logger a = Logger.getLogger(baoz.class.getName());
    public volatile Thread b;

    public static void a() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void execute(Runnable runnable) {
        add(runnable);
        LockSupport.unpark(this.b);
    }
}
