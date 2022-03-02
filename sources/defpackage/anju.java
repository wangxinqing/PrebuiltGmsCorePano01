package defpackage;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: anju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anju extends anis {
    private static volatile boolean a = false;
    private final Logger b;

    public anju(Logger logger) {
        this.b = logger;
    }

    private static void a(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler publish : logger.getHandlers()) {
            publish.publish(logRecord);
        }
        if (logger.getUseParentHandlers() && (parent = logger.getParent()) != null) {
            a(parent, logRecord);
        }
    }

    public final String a() {
        return this.b.getName();
    }

    public final void a(anir anir) {
        a((LogRecord) new anjv(anir, (byte[]) null), anir.j());
    }

    public final void a(RuntimeException runtimeException, anir anir) {
        a((LogRecord) new anjv(runtimeException, anir), anir.j());
    }

    /* access modifiers changed from: package-private */
    public final void a(LogRecord logRecord, boolean z) {
        if (!z || this.b.isLoggable(logRecord.getLevel())) {
            this.b.log(logRecord);
            return;
        }
        Filter filter = this.b.getFilter();
        if (filter != null) {
            filter.isLoggable(logRecord);
        }
        if (this.b.getClass() != Logger.class && !a) {
            Logger logger = Logger.getLogger(String.valueOf(this.b.getName()).concat(".__forced__"));
            try {
                logger.setLevel(Level.ALL);
                logger.log(logRecord);
            } catch (SecurityException e) {
                a = true;
                Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger sub-classes.\n");
                a(this.b, logRecord);
            }
        } else {
            a(this.b, logRecord);
        }
    }

    public final boolean a(Level level) {
        return this.b.isLoggable(level);
    }
}
