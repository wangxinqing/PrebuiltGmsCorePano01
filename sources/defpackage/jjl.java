package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: jjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjl {
    private static Pattern a = null;

    public static int a(int i) {
        if (i != -1) {
            return i / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        }
        return -1;
    }

    public static int b(String str) {
        long a2 = a(str);
        if (a2 != -1) {
            return (int) (a2 / 10000);
        }
        return -1;
    }

    public static int c(String str) {
        long a2 = a(str);
        if (a2 != -1) {
            return (int) ((a2 / 100) % 100);
        }
        return -1;
    }

    public static int d(String str) {
        long a2 = a(str);
        if (a2 != -1) {
            return (int) (a2 % 100);
        }
        return -1;
    }

    public static long a(String str) {
        if (str != null) {
            Matcher matcher = a().matcher(str);
            if (matcher.find()) {
                try {
                    return Long.parseLong(matcher.group(1));
                } catch (NumberFormatException e) {
                }
            }
        }
        return -1;
    }

    public static Pattern a() {
        if (a == null) {
            a = Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
        }
        return a;
    }
}
