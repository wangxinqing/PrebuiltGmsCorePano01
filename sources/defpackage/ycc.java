package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ycc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycc {
    public static final String[] a = {"^~([3-6])", "^", "/$"};
    public static final String[] b = {"lh$1.googleusercontent.com", "https://", "/photo.jpg"};
    private static final anaf c;
    private static final anaf d;
    private static final Pattern e = Pattern.compile("\\/photo\\.jpg\\?sz\\=\\d*$");

    static {
        anab h = anaf.h();
        h.a("lh3.googleusercontent.com", "~3");
        h.a("lh4.googleusercontent.com", "~4");
        h.a("lh5.googleusercontent.com", "~5");
        h.a("lh6.googleusercontent.com", "~6");
        c = h.a();
        anab h2 = anaf.h();
        h2.a("~3", "lh3.googleusercontent.com");
        h2.a("~4", "lh4.googleusercontent.com");
        h2.a("~5", "lh5.googleusercontent.com");
        h2.a("~6", "lh6.googleusercontent.com");
        d = h2.a();
    }

    public static int a(Context context, int i) {
        int i2;
        if (i == 0) {
            i2 = R.dimen.people_avatar_size_tiny;
        } else if (i == 1) {
            i2 = R.dimen.people_avatar_size_small;
        } else if (i == 2) {
            i2 = R.dimen.people_avatar_size_medium;
        } else if (i == 3) {
            i2 = R.dimen.people_avatar_size_large;
        } else if (i == 4) {
            return 96;
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid avatar size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return (int) context.getResources().getDimension(i2);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (c(str) > 0) {
            xdt.b("FifeImageUtils", "Uncompressing url that isn't compressed. url=%s", str);
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        if (str.charAt(0) == '~') {
            int indexOf = str.indexOf(47);
            sb.append((String) d.get(str.substring(0, indexOf)));
            sb.append(str.substring(indexOf));
        } else {
            sb.append(str);
        }
        if (str.endsWith("/")) {
            sb.append("photo.jpg");
        }
        return sb.toString();
    }

    private static int c(String str) {
        if (str.startsWith("https://")) {
            return 8;
        }
        if (!str.startsWith("http://")) {
            return str.startsWith("//") ? 2 : 0;
        }
        return 7;
    }

    public static String a(Context context, String str, int i, int i2) {
        boolean z;
        if (!iqk.b(str)) {
            return str;
        }
        iqt iqt = new iqt();
        iqt.a(a(context, i));
        iqt.a();
        if (((i2 & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iqt.a = z;
        iqt.b = true;
        iqt.c = 1;
        return iqt.a(str);
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c2 = c(str);
        int length = str.length();
        if (str.endsWith("/photo.jpg")) {
            length -= 9;
        } else if (!str.endsWith("/photo.jpg?sz=50")) {
            Matcher matcher = e.matcher(str);
            if (matcher.find()) {
                length -= (matcher.end() - matcher.start()) - 1;
            }
        } else {
            length -= 15;
        }
        int indexOf = str.indexOf(47, c2);
        if (indexOf != -1) {
            str2 = (String) c.get(str.substring(c2, indexOf));
        }
        if (str2 == null) {
            return str.substring(c2, length);
        }
        String valueOf = String.valueOf(str2);
        String valueOf2 = String.valueOf(str.substring(indexOf, length));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public static boolean b(Throwable th) {
        NetworkResponse networkResponse;
        if (!(th instanceof VolleyError) || (networkResponse = ((VolleyError) th).networkResponse) == null) {
            Throwable cause = th.getCause();
            return (cause == null || cause == th || !b(cause)) ? false : true;
        }
        int i = networkResponse.statusCode;
        return i == 403 || i == 429 || (i >= 500 && i < 600);
    }

    public static String a(String str, int i) {
        String valueOf = String.valueOf(String.valueOf(i));
        return a(str, valueOf.length() == 0 ? new String("w") : "w".concat(valueOf));
    }

    public static String a(String str, String str2) {
        if (!iqk.b(str)) {
            return str;
        }
        String[] split = iqk.a(str).split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        for (String str3 : split) {
            if (!str3.startsWith("w") && !str3.startsWith("s") && !str3.startsWith("h") && !str3.isEmpty()) {
                if (sb.length() == 0) {
                    sb.append(str3);
                } else {
                    sb.append("-");
                    sb.append(str3);
                }
            }
        }
        return Uri.decode(iqk.a(sb.toString(), str).toString());
    }

    public static boolean a(Throwable th) {
        NetworkResponse networkResponse;
        if ((th instanceof VolleyError) && (networkResponse = ((VolleyError) th).networkResponse) != null) {
            return networkResponse.statusCode == 404;
        }
        Throwable cause = th.getCause();
        return (cause == null || cause == th || !a(cause)) ? false : true;
    }
}
