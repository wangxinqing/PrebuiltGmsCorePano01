package defpackage;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: gom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gom {
    private static final iwd a = ehv.a("CookieReader");
    private final CookieManager b;

    public gom(CookieManager cookieManager) {
        this.b = cookieManager;
    }

    public static gom a() {
        CookieManager instance = CookieManager.getInstance();
        ihs.b();
        return new gom(instance);
    }

    public final String b(String str) {
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e) {
            a.c(String.format("Invalid URI: %s", new Object[]{str}), new Object[0]);
            return str;
        }
    }

    public final gol a(String str) {
        String str2;
        int i;
        String cookie = this.b.getCookie(str);
        String str3 = null;
        if (cookie != null) {
            String b2 = b(str);
            str2 = null;
            String str4 = null;
            for (String str5 : cookie.split("\\;")) {
                int indexOf = str5.indexOf(61);
                if (indexOf > 0 && (i = indexOf + 1) < str5.length()) {
                    String trim = str5.substring(0, indexOf).trim();
                    String trim2 = str5.substring(i).trim();
                    if ("oauth_token".equalsIgnoreCase(trim)) {
                        a(b2, "oauth_token");
                        str3 = trim2;
                    }
                    if ("user_id".equalsIgnoreCase(trim)) {
                        a(b2, "user_id");
                        str2 = trim2;
                    }
                    if ("GASC".equalsIgnoreCase(trim)) {
                        a(b2, "GASC");
                        str4 = trim2;
                    }
                    if (!(str3 == null || str2 == null || str4 == null)) {
                        break;
                    }
                }
            }
        } else {
            str2 = null;
        }
        return new gol(str3, str2);
    }

    public final void b() {
        int i = Build.VERSION.SDK_INT;
        this.b.removeAllCookies((ValueCallback) null);
        this.b.flush();
    }

    public final void a(String str, String str2) {
        this.b.setCookie(str, str2.concat("=;expires=Thu, 01 Jan 1970 00:00:00 UTC"));
    }
}
