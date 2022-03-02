package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* renamed from: bamy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class bamy {
    public static final Logger a;
    public static final bamy b;
    private static final banu d = banu.b;
    protected final banu c;

    static {
        bamy bamy;
        Class<bamy> cls = bamy.class;
        a = Logger.getLogger(cls.getName());
        ClassLoader classLoader = cls.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                bamy = new bamy(d);
            }
        }
        bamy = new bamx(d);
        b = bamy;
    }

    public bamy(banu banu) {
        amrl.a((Object) banu, (Object) "platform");
        this.c = banu;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    /* access modifiers changed from: protected */
    public void b(SSLSocket sSLSocket, String str, List list) {
        this.c.a(sSLSocket, str, list);
    }

    public String a(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a2 = a(sSLSocket);
            if (a2 != null) {
                return a2;
            }
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } finally {
            this.c.b(sSLSocket);
        }
    }
}
