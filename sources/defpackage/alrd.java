package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: alrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrd {
    static String a(String str) {
        int i = 0;
        while (i < str.length()) {
            if (!a(str.charAt(i))) {
                try {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : str.getBytes("UTF-8")) {
                        char c = (char) b;
                        if (!a(c)) {
                            sb.append('%');
                            sb.append(Character.forDigit((b & 240) >> 4, 16));
                            sb.append(Character.forDigit(b & 15, 16));
                        } else {
                            sb.append(c);
                        }
                    }
                    return sb.toString();
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError();
                }
            } else {
                i++;
            }
        }
        return str;
    }

    private static boolean a(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < 'A' || c > 'Z') {
            return (c >= '0' && c <= '9') || c == '-' || c == '.' || c == '_' || c == '~';
        }
        return true;
    }
}
