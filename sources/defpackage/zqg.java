package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: zqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqg {
    public static void a(StringBuilder sb, String str, String str2) {
        try {
            sb.append("&");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
