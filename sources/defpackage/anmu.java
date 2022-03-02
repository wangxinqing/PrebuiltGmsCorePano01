package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmu implements anmw {
    static final anmu a = new anmu();

    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = anmt.a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", sb.toString(), th2);
    }
}
