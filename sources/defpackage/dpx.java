package defpackage;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: dpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpx {
    public static dle a(dpk dpk, String str) {
        iva.a((Object) dpk);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            Map a = jjq.a(new URI(valueOf.length() == 0 ? new String("?") : "?".concat(valueOf)), "UTF-8");
            dle dle = new dle();
            dle.e = (String) a.get("utm_content");
            dle.c = (String) a.get("utm_medium");
            dle.a = (String) a.get("utm_campaign");
            dle.b = (String) a.get("utm_source");
            dle.d = (String) a.get("utm_term");
            dle.f = (String) a.get("utm_id");
            dle.g = (String) a.get("anid");
            dle.h = (String) a.get("gclid");
            dle.i = (String) a.get("dclid");
            dle.j = (String) a.get("aclid");
            return dle;
        } catch (URISyntaxException e) {
            dpk.d("No valid campaign data found", e);
            return null;
        }
    }

    public static long b(String str) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    public static MessageDigest c(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http:")) {
            return true;
        }
        return false;
    }

    public static String a(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                return sb.toString();
            }
        }
        return null;
    }

    public static Map a(String str) {
        HashMap hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split("=", 3);
            int length = split2.length;
            String str2 = null;
            if (length > 1) {
                hashMap.put(split2[0], !TextUtils.isEmpty(split2[1]) ? split2[1] : null);
                if (length == 3 && !TextUtils.isEmpty(split2[1]) && !hashMap.containsKey(split2[1])) {
                    String str3 = split2[1];
                    if (!TextUtils.isEmpty(split2[2])) {
                        str2 = split2[2];
                    }
                    hashMap.put(str3, str2);
                }
            } else if (length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], (Object) null);
            }
        }
        return hashMap;
    }

    public static void a(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void a(Map map, String str, Map map2) {
        a(map, str, (String) map2.get(str));
    }

    public static boolean a(double d, String str) {
        int i;
        if (d <= 0.0d || d >= 100.0d) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = ((i << 6) & 65535) + charAt + (charAt << 14);
                int i2 = i >> 21;
                if ((266338304 & i) != 0) {
                    i ^= i2 & 127;
                }
            }
        } else {
            i = 1;
        }
        if (((double) (i % 10000)) < d * 100.0d) {
            return false;
        }
        return true;
    }
}
