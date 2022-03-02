package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import java.util.Locale;

/* renamed from: hiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hiq {
    private static final iwd a = new iwd("ChromeSync", "Common", "PasswordDomains");

    public static amri a(Context context, String str) {
        try {
            byte[] c = jhg.c(context, str, "SHA-512");
            if (c == null) {
                return ampu.a;
            }
            return amri.b(String.format("android://%s@%s/", new Object[]{Base64.encodeToString(c, 10), str}));
        } catch (PackageManager.NameNotFoundException e) {
            a.e("Unable to find the package: %s.", e, str);
            return ampu.a;
        }
    }

    public static boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android://");
    }

    public static String c(String str) {
        amrl.a(b(str));
        String host = Uri.parse(str).getHost();
        amrl.a((Object) host);
        return host;
    }

    public static String a(String str) {
        Uri parse = Uri.parse(str);
        if (!b(str)) {
            return amrk.a(parse.getPath()) ? parse.buildUpon().path("/").toString() : str;
        }
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 4 + String.valueOf(authority).length());
        sb.append(scheme);
        sb.append("://");
        sb.append(authority);
        sb.append("/");
        return sb.toString();
    }
}
