package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baid implements Runnable {
    private static final Logger a = Logger.getLogger(baid.class.getName());
    private final Runnable b;

    public baid(Runnable runnable) {
        amrl.a((Object) runnable, (Object) "task");
        this.b = runnable;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Exception while executing runnable ");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", sb.toString(), th);
            amtb.a(th);
            throw new AssertionError(th);
        }
    }
}
