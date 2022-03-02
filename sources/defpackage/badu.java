package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: badu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badu {
    static final Logger a = Logger.getLogger(azxj.class.getName());
    public final Object b = new Object();
    public final azyx c;
    public final Collection d;

    public badu(azyx azyx, long j, String str) {
        amrl.a((Object) str, (Object) "description");
        amrl.a((Object) azyx, (Object) "logId");
        this.c = azyx;
        this.d = null;
        azyq azyq = new azyq();
        azyq.a = String.valueOf(str).concat(" created");
        azyq.b = azyr.CT_INFO;
        azyq.a(j);
        a(azyq.a());
    }

    static void a(azyx azyx, Level level, String str) {
        if (a.isLoggable(level)) {
            String valueOf = String.valueOf(azyx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(str).length());
            sb.append("[");
            sb.append(valueOf);
            sb.append("] ");
            sb.append(str);
            LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(a.getName());
            logRecord.setSourceClassName(a.getName());
            logRecord.setSourceMethodName("log");
            a.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.b) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(azys azys) {
        Level level;
        azyr azyr = azyr.CT_UNKNOWN;
        int ordinal = azys.b.ordinal();
        if (ordinal == 2) {
            level = Level.FINER;
        } else if (ordinal != 3) {
            level = Level.FINEST;
        } else {
            level = Level.FINE;
        }
        a();
        a(this.c, level, azys.a);
    }
}
