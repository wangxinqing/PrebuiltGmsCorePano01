package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: akly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akly implements akoe {
    private final Logger a = Logger.getAnonymousLogger();

    public final void a(String str, String str2) {
        Logger logger = this.a;
        Level level = Level.INFO;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "i", sb.toString());
    }

    public final void b(String str, String str2) {
        Logger logger = this.a;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "w", sb.toString());
    }

    public final void c(String str, String str2) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "e", sb.toString());
    }

    public final void d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        String sb2 = sb.toString();
        this.a.logp(Level.SEVERE, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "wtf", sb2);
        throw new RuntimeException(sb2);
    }

    public final void a(String str, String str2, Throwable th) {
        Logger logger = this.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(th);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 5 + str2.length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append(" - ");
        sb.append(valueOf);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "e", sb.toString());
    }
}
