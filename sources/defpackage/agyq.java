package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* renamed from: agyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agyq {
    public static final Pattern a = Pattern.compile("^data:[-\\w]+/[-\\w]+;base64,");

    static void a(Uri uri) {
        if (uri != null) {
            String trim = uri.toString().trim();
            if (!trim.isEmpty() && !amrk.a(uri.getScheme())) {
                if (!URLUtil.isNetworkUrl(trim)) {
                    Object[] objArr = {uri.getScheme(), "<REDACTED>"};
                    return;
                }
                StringBuilder sb = new StringBuilder(64);
                sb.append(uri.getScheme());
                sb.append("://");
                if (!amrk.a(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (uri.getPort() != -1) {
                    sb.append(":");
                    sb.append(uri.getPort());
                }
                sb.append("/<REDACTED>");
                sb.toString();
            }
        }
    }
}
