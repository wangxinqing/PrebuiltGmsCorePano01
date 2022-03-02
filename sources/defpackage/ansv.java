package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ansv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansv {
    private final Logger a;

    @Deprecated
    public ansv() {
        this(Logger.getAnonymousLogger());
    }

    public final void a(Level level, String str, String str2, String str3, Throwable th) {
        Object[] objArr = {th};
        if (this.a.isLoggable(level)) {
            ansu ansu = new ansu(level, str3, str, str2);
            if (th != null) {
                ansu.setThrown(th);
            }
            ansu.setParameters(objArr);
            if (ansu.c == null || ansu.b == null) {
                ansu.a = new Throwable();
            }
            ansu.setLoggerName(this.a.getName());
            this.a.log(ansu);
        }
    }

    @Deprecated
    public ansv(Logger logger) {
        if (logger != null) {
            this.a = logger;
            return;
        }
        throw new NullPointerException("logger is null");
    }
}
