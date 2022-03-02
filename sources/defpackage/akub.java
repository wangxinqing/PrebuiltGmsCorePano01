package defpackage;

import java.util.regex.Pattern;

/* renamed from: akub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akub {
    public static final Pattern a;
    public static final String[] b = {"WEP", "WPA", "WPA2", "IEEE8021X"};
    private static final String c;

    static {
        String format = String.format("%1$s:%1$s:%1$s:%1$s:%1$s:%1$s", new Object[]{"(\\p{XDigit}{2})"});
        c = format;
        a = Pattern.compile(format);
    }
}
