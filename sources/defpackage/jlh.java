package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: jlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlh {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String c(String str) {
        char charAt;
        char upperCase;
        if (str.length() == 0 || (charAt = str.charAt(0)) == (upperCase = Character.toUpperCase(charAt))) {
            return str;
        }
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
        sb.append(upperCase);
        sb.append(substring);
        return sb.toString();
    }

    public static boolean d(String str) {
        return str == null || str.trim().isEmpty();
    }
}
