package defpackage;

import android.webkit.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: acdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdv {
    private static final iwd b = acqa.a("CookieReader");
    public final CookieManager a = CookieManager.getInstance();

    public static final String a(String str) {
        try {
            String host = new URI(str).getHost();
            if (host != null) {
                return host;
            }
            b.c(String.format("Invalid URI: %s", new Object[]{str}), new Object[0]);
            return str;
        } catch (URISyntaxException e) {
            b.c(String.format("Invalid URI: %s", new Object[]{str}), new Object[0]);
            return str;
        }
    }

    public final void a(String str, String str2) {
        this.a.setCookie(str, str2.concat("=;expires=Thu, 01 Jan 1970 00:00:00 UTC"));
    }
}
