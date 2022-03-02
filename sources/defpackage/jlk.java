package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: jlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlk {
    public static URLConnection a(URL url, int i) {
        izj.b(i);
        return url.openConnection();
    }

    public static void a(HttpURLConnection httpURLConnection) {
        izj.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
