package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bakk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakk implements babb {
    public static final Logger a = Logger.getLogger(bakk.class.getName());
    private static final amsv c = new bakj();
    private static final baki d = new baki();
    public final InetSocketAddress b;

    public bakk() {
        int i;
        amsv amsv = c;
        baki baki = d;
        String str = System.getenv("GRPC_PROXY_EXP");
        amrl.a((Object) amsv);
        amrl.a((Object) baki);
        if (str != null) {
            String[] split = str.split(":", 2);
            if (split.length > 1) {
                i = Integer.parseInt(split[1]);
            } else {
                i = 80;
            }
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.b = new InetSocketAddress(split[0], i);
            return;
        }
        this.b = null;
    }

    public final baba a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", (String) null, bagt.a(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a2 = baki.a(bagt.a(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "");
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                azyo a3 = azyp.a();
                a3.a(inetSocketAddress);
                a3.a((SocketAddress) inetSocketAddress2);
                if (a2 == null) {
                    return a3.a();
                }
                a3.a = a2.getUserName();
                if (a2.getPassword() != null) {
                    str = new String(a2.getPassword());
                }
                a3.b = str;
                return a3.a();
            } catch (URISyntaxException e) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", e);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
