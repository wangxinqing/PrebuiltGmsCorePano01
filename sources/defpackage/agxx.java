package defpackage;

import java.util.Locale;

/* renamed from: agxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxx {
    public static boolean a(long j) {
        return j < 281474976710656L && j >= 0;
    }

    public static boolean b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null SSID.");
        } else if (str.indexOf(95) < 0) {
            return false;
        } else {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("_nomap") || lowerCase.contains("_optout")) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(long j, String str) {
        if (!a(j)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid MAC Address: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if ((j & 2199023255552L) != 0) {
            return true;
        } else {
            return b(str);
        }
    }

    public static boolean a(String str) {
        if (str == null || str.length() != 17) {
            return false;
        }
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            if (i2 % 3 != 0) {
                if ((str.charAt(i) < '0' || str.charAt(i) > '9') && ((str.charAt(i) < 'A' || str.charAt(i) > 'F') && (str.charAt(i) < 'a' || str.charAt(i) > 'f'))) {
                    return false;
                }
            } else if (!(str.charAt(i) == '-' || str.charAt(i) == ':')) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if (str != null && !a(str)) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Invalid MAC Address: ") : "Invalid MAC Address: ".concat(str));
        } else if (str2 == null) {
            throw new IllegalArgumentException("Null SSID.");
        } else if (str == null || !"2367abefABEF".contains(str.substring(1, 2))) {
            return b(str2);
        } else {
            return true;
        }
    }
}
