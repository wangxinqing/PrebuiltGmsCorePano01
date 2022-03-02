package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* renamed from: fzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzq {
    private static final iwd a = new iwd("AuthUtil", "UrlChecker");
    private final Pattern b;

    public fzq(Pattern pattern) {
        this.b = pattern;
    }

    public static fzq a(String str) {
        return new fzq(Pattern.compile(str));
    }

    private static final void c(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(host).length() + String.valueOf(path).length());
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            sb.append(path);
            String sb2 = sb.toString();
            iwd iwd = a;
            String valueOf = String.valueOf(sb2);
            iwd.c(valueOf.length() == 0 ? new String("Untrusted URL: ") : "Untrusted URL: ".concat(valueOf), new Object[0]);
        } catch (URISyntaxException e) {
            iwd iwd2 = a;
            String valueOf2 = String.valueOf(e.getMessage());
            iwd2.c(valueOf2.length() == 0 ? new String("Untrusted URL with URISyntaxException: ") : "Untrusted URL with URISyntaxException: ".concat(valueOf2), new Object[0]);
        }
    }

    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        boolean find = this.b.matcher(str).find();
        if (!find) {
            c(str);
        }
        return find;
    }
}
