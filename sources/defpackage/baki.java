package defpackage;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: baki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baki {
    public static final PasswordAuthentication a(String str, InetAddress inetAddress, int i, String str2, String str3) {
        URL url;
        try {
            url = new URL(str2, str, i, "");
        } catch (MalformedURLException e) {
            bakk.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", new Object[]{str2, str}));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, (String) null, url, Authenticator.RequestorType.PROXY);
    }
}
