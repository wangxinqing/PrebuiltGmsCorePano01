package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Logging {
    private static final Logger a;
    private static volatile boolean b;

    public static void a(int i, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        int i2 = i - 1;
        if (i2 == 1) {
            level = Level.INFO;
        } else if (i2 == 2) {
            level = Level.WARNING;
        } else if (i2 != 3) {
            level = Level.FINE;
        } else {
            level = Level.SEVERE;
        }
        Logger logger = a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "org.webrtc.Logging", "log", sb.toString());
    }

    public static void b(String str, String str2) {
        a(4, str, str2);
    }

    public static void c(String str, String str2) {
        a(3, str, str2);
    }

    public static void d(String str, String str2) {
        a(1, str, str2);
    }

    static {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        a = logger;
    }

    public static void a(String str, String str2) {
        a(2, str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        a(4, str, str2);
        a(4, str, th.toString());
        StringWriter stringWriter = new StringWriter();
        apev.a(th, new PrintWriter(stringWriter));
        a(4, str, stringWriter.toString());
    }
}
