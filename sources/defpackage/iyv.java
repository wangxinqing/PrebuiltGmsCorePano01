package defpackage;

import android.net.Uri;

/* renamed from: iyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iyv {
    public static String a(String str) {
        iva.a((Object) str, (Object) "Encoding a null parameter!");
        return Uri.encode(str);
    }

    @Deprecated
    public static String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str.indexOf("?") != -1) {
            sb.append('&');
        } else {
            sb.append('?');
        }
        sb.append(str2);
        sb.append('=');
        sb.append(str3);
        return sb.toString();
    }

    public static void a(StringBuilder sb, String str, String str2) {
        if (sb.indexOf("?") != -1) {
            sb.append('&');
        } else {
            sb.append('?');
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }
}
