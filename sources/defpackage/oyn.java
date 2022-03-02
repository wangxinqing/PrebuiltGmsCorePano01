package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;

/* renamed from: oyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyn {
    public static void a(String str) {
        iva.a((Object) str);
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.isAbsolute()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Invalid String passed as URL: '");
            sb.append(str);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void b(String str) {
        iva.a((Object) str);
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Web URL must use http or https scheme: '");
            sb.append(str);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
