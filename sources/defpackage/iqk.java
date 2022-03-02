package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: iqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqk {
    private static final amsk a = amsk.a("=").a();
    private static final amsk b = amsk.a("/").a();
    private static final Pattern c = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-dev\\-lighthouse\\.sandbox\\.google\\.com(\\/image)?))\\/");

    public static Uri a(String str, String str2) {
        Uri parse = Uri.parse(str2);
        ArrayList a2 = a(b.a((CharSequence) parse.getPath()));
        int size = a2.size();
        boolean z = true;
        if (a2.size() > 1 && ((String) a2.get(0)).equals("image")) {
            size--;
        }
        if (size >= 4 && size <= 6) {
            String path = parse.getPath();
            ArrayList a3 = a(b.a((CharSequence) path));
            if (a3.size() <= 0 || !((String) a3.get(0)).equals("image")) {
                z = false;
            } else {
                a3.remove(0);
            }
            int size2 = a3.size();
            boolean endsWith = path.endsWith("/");
            if (!endsWith && size2 == 5) {
                a3.add((String) a3.get(4));
            }
            if (size2 != 4) {
                a3.set(4, str);
            } else {
                a3.add(str);
            }
            if (z) {
                a3.add(0, "image");
            }
            if (endsWith) {
                a3.add("");
            }
            Uri.Builder buildUpon = parse.buildUpon();
            String valueOf = String.valueOf(TextUtils.join("/", a3));
            return buildUpon.path(valueOf.length() == 0 ? new String("/") : "/".concat(valueOf)).build();
        } else if (size != 1) {
            return parse;
        } else {
            String str3 = (String) a(a.a((CharSequence) parse.getPath())).get(0);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str);
            return parse.buildUpon().path(sb.toString()).build();
        }
    }

    public static boolean b(String str) {
        if (str != null) {
            return c.matcher(str).find();
        }
        return false;
    }

    public static String a(int i, int i2, String str) {
        if (str == null || !b(str)) {
            return str;
        }
        return a(a("w" + i + "-h" + i2 + "-d-no", str));
    }

    public static String a(int i, String str) {
        if (str == null || !b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (i != -1) {
            sb.append("s");
            sb.append(i);
        }
        sb.append("-d-no-c-k");
        return a(a(sb.toString(), str));
    }

    public static String a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append(':');
        }
        String encodedAuthority = uri.getEncodedAuthority();
        if (encodedAuthority != null) {
            sb.append("//");
            sb.append(encodedAuthority);
        }
        String encode = Uri.encode(uri.getPath(), "/=");
        if (encode != null) {
            sb.append(encode);
        }
        String encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            sb.append('?');
            sb.append(encodedQuery);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            sb.append('#');
            sb.append(encodedFragment);
        }
        return sb.toString();
    }

    public static String a(String str) {
        Uri parse = Uri.parse(str);
        ArrayList a2 = a(b.a((CharSequence) parse.getPath()));
        int size = a2.size();
        if (a2.size() > 1 && ((String) a2.get(0)).equals("image")) {
            size--;
        }
        if (size >= 4 && size <= 6) {
            String path = parse.getPath();
            ArrayList a3 = a(b.a((CharSequence) path));
            if (a3.size() > 0 && ((String) a3.get(0)).equals("image")) {
                a3.remove(0);
            }
            int size2 = a3.size();
            if ((path.endsWith("/") || size2 != 5) && size2 != 4) {
                return (String) a3.get(4);
            }
            return "";
        } else if (size != 1) {
            return "";
        } else {
            ArrayList a4 = a(a.a((CharSequence) parse.getPath()));
            if (a4.size() > 1) {
                return (String) a4.get(1);
            }
            return "";
        }
    }

    private static ArrayList a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
