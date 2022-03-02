package defpackage;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: amrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrk {
    static {
        Logger.getLogger(amrk.class.getName());
    }

    private amrk() {
    }

    static long a() {
        return System.nanoTime();
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String c(String str) {
        if (a(str)) {
            return null;
        }
        return str;
    }

    static amqp d(String str) {
        amrl.a((Object) str);
        return new amrb(Pattern.compile(str));
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}
