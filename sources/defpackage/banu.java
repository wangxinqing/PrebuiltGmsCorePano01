package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* renamed from: banu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class banu {
    public static final Logger a = Logger.getLogger(banu.class.getName());
    public static final banu b = b();
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public final Provider c;

    public banu(Provider provider) {
        this.c = provider;
    }

    public static byte[] a(List list) {
        batd batd = new batd();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            banv banv = (banv) list.get(i);
            if (banv != banv.HTTP_1_0) {
                batd.h(banv.e.length());
                batd.b(banv.e);
            }
        }
        return batd.m();
    }

    public int a() {
        return 3;
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    private static banu b() {
        Provider provider;
        int i;
        Class<banu> cls = banu.class;
        Class<byte[]> cls2 = byte[].class;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            for (String str : d) {
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            banm banm = new banm((Class) null, "setUseSessionTickets", Boolean.TYPE);
            banm banm2 = new banm((Class) null, "setHostname", String.class);
            banm banm3 = new banm(cls2, "getAlpnSelectedProtocol", new Class[0]);
            banm banm4 = new banm((Class) null, "setAlpnProtocols", cls2);
            try {
                Class<?> cls3 = Class.forName("android.net.TrafficStats");
                cls3.getMethod("tagSocket", new Class[]{Socket.class});
                cls3.getMethod("untagSocket", new Class[]{Socket.class});
            } catch (ClassNotFoundException | NoSuchMethodException e) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i = 1;
            } else {
                try {
                    cls.getClassLoader().loadClass("android.net.Network");
                    i = 1;
                } catch (ClassNotFoundException e2) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", e2);
                    try {
                        cls.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e3) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", e3);
                        i = 3;
                    }
                }
            }
            return new banq(banm, banm2, banm3, banm4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                SSLContext instance = SSLContext.getInstance("TLS", provider3);
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                ((Method) AccessController.doPrivileged(new bann())).invoke(instance.createSSLEngine(), new Object[0]);
                return new banr(provider3, (Method) AccessController.doPrivileged(new bano()), (Method) AccessController.doPrivileged(new banp()));
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException e4) {
                try {
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new bans(cls4.getMethod("put", new Class[]{SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")}), cls4.getMethod("get", new Class[]{SSLSocket.class}), cls4.getMethod("remove", new Class[]{SSLSocket.class}), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                } catch (ClassNotFoundException | NoSuchMethodException e5) {
                    return new banu(provider3);
                }
            }
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        }
    }
}
