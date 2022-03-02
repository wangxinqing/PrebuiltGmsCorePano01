package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: aqei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqei {
    public final HttpURLConnection a;
    public final boolean b;
    public boolean c;
    public boolean d;

    public aqei(String str, boolean z) {
        this.b = z;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.a = httpURLConnection;
            httpURLConnection.setConnectTimeout(30000);
            this.a.setReadTimeout(30000);
            this.a.setRequestProperty("User-Agent", "GoogleMobile/1.0");
            if (z) {
                this.a.setDoOutput(true);
                this.a.setChunkedStreamingMode(0);
            }
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append("post=");
            sb.append(z);
            sb.append(", url=");
            sb.append(str);
            IOException iOException = new IOException(sb.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final void a(String str, String str2) {
        if (!"Content-Length".equals(str) && !"Transfer-Encoding".equals(str)) {
            this.a.setRequestProperty(str, str2);
        }
    }
}
