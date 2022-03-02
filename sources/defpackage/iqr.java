package defpackage;

import java.util.regex.Pattern;

/* renamed from: iqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqr {
    public static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    public static synchronized int a() {
        int i;
        synchronized (iqr.class) {
            i = b + 1;
            b = i;
            b = i % 3;
        }
        return i;
    }
}
