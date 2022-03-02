package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: oau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oau {
    private static final String[] a = {"&", "?"};

    public static String a(String str) {
        String aA = axmj.a.a().aA();
        if (TextUtils.isEmpty(aA)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return Uri.parse(aA).buildUpon().encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build().toString();
    }

    public static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String queryParameter = Uri.parse(str).getQueryParameter(str2);
        if (!TextUtils.isEmpty(queryParameter)) {
            for (String equals : queryParameter.split(",")) {
                if (TextUtils.equals(str3, equals)) {
                    return str;
                }
            }
        }
        for (String str4 : a) {
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + str2.length());
            sb.append(str4);
            sb.append(str2);
            sb.append("=");
            String sb2 = sb.toString();
            if (str.contains(sb2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str3).length());
                sb3.append(sb2);
                sb3.append(str3);
                sb3.append(",");
                return str.replace(sb2, sb3.toString());
            }
        }
        String str5 = "?";
        if (str.contains(str5)) {
            str5 = "&";
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 1 + str5.length() + str2.length() + String.valueOf(str3).length());
        sb4.append(str);
        sb4.append(str5);
        sb4.append(str2);
        sb4.append("=");
        sb4.append(str3);
        return sb4.toString();
    }
}
