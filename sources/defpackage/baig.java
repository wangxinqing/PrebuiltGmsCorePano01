package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baig implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ baji a;

    public baig(baji baji) {
        this.a = baji;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = baji.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.a.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$1", "uncaughtException", sb.toString(), th);
        baji baji = this.a;
        if (!baji.t) {
            baji.t = true;
            baji.b(true);
            baji.a(false);
            baji.a((azzm) new baij(th));
            baji.E.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            baji.o.a(azxz.TRANSIENT_FAILURE);
        }
    }
}
