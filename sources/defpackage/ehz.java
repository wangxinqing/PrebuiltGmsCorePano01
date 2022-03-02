package defpackage;

import android.text.TextUtils;

/* renamed from: ehz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehz {
    public static String a(String str, Boolean bool) {
        iva.c(str);
        String str2 = !a(bool) ? "http" : "https";
        StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("://");
        sb.append(str);
        return sb.toString();
    }

    public static String a(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (a(bool)) {
            sb.append(";HttpOnly");
        }
        if (a(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        return sb.toString();
    }

    private static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
