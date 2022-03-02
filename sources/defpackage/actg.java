package defpackage;

import java.util.regex.Pattern;

/* renamed from: actg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actg {
    public static final Pattern a = Pattern.compile("\\n");
    public static final Pattern b = Pattern.compile(".*\\sname:(\\S+).*");
    public final acth c;

    protected actg(acth acth) {
        this.c = acth;
    }

    protected static String a(String str) {
        if (str.contains("GLOBAL SETTINGS")) {
            return "GLOBAL";
        }
        if (str.contains("SECURE SETTINGS")) {
            return "SECURE";
        }
        if (str.contains("SYSTEM SETTINGS")) {
            return "SYSTEM";
        }
        return null;
    }
}
