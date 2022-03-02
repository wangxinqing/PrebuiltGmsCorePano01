package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: awag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class awag {
    public static final awag a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: awae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: awag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: awad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: awae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: awae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: awae} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[ExcHandler: NoSuchMethodException (e java.lang.NoSuchMethodException), Splitter:B:9:0x0033] */
    static {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            r4 = 1
            r5 = 0
            java.lang.String r6 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r6 = move-exception
            java.lang.String r6 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0079 }
        L_0x0016:
            awac r6 = new awac     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0079 }
            r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.String r8 = "setUseSessionTickets"
            r9 = 0
            r6.<init>(r9, r8, r7)     // Catch:{ ClassNotFoundException -> 0x0079 }
            awac r7 = new awac     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r8[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.String r10 = "setHostname"
            r7.<init>(r9, r10, r8)     // Catch:{ ClassNotFoundException -> 0x0079 }
            java.lang.String r8 = "android.net.TrafficStats"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r5] = r11     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.String r11 = "tagSocket"
            r8.getMethod(r11, r10)     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r5] = r11     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.String r11 = "untagSocket"
            r8.getMethod(r11, r10)     // Catch:{ ClassNotFoundException -> 0x0071, NoSuchMethodException -> 0x006f }
            java.lang.String r8 = "android.net.Network"
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x006c, NoSuchMethodException -> 0x006f }
            awac r8 = new awac     // Catch:{ ClassNotFoundException -> 0x006c, NoSuchMethodException -> 0x006f }
            java.lang.String r10 = "getAlpnSelectedProtocol"
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x006c, NoSuchMethodException -> 0x006f }
            r8.<init>(r0, r10, r11)     // Catch:{ ClassNotFoundException -> 0x006c, NoSuchMethodException -> 0x006f }
            awac r10 = new awac     // Catch:{ ClassNotFoundException -> 0x006a, NoSuchMethodException -> 0x0068 }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x006a, NoSuchMethodException -> 0x0068 }
            r11[r5] = r0     // Catch:{ ClassNotFoundException -> 0x006a, NoSuchMethodException -> 0x0068 }
            java.lang.String r0 = "setAlpnProtocols"
            r10.<init>(r9, r0, r11)     // Catch:{ ClassNotFoundException -> 0x006a, NoSuchMethodException -> 0x0068 }
            r9 = r10
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            goto L_0x0073
        L_0x006a:
            r0 = move-exception
            goto L_0x006e
        L_0x006c:
            r0 = move-exception
            r8 = r9
        L_0x006e:
            goto L_0x0073
        L_0x006f:
            r0 = move-exception
            goto L_0x0072
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            r8 = r9
        L_0x0073:
            awad r0 = new awad     // Catch:{ ClassNotFoundException -> 0x0079 }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ ClassNotFoundException -> 0x0079 }
            goto L_0x00c2
        L_0x0079:
            r0 = move-exception
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class r10 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class r11 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class<javax.net.ssl.SSLSocket> r3 = javax.net.ssl.SSLSocket.class
            r2[r5] = r3     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            r2[r4] = r1     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.String r1 = "put"
            java.lang.reflect.Method r7 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            r1[r5] = r2     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.String r2 = "get"
            java.lang.reflect.Method r8 = r0.getMethod(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            r1[r5] = r2     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            java.lang.String r2 = "remove"
            java.lang.reflect.Method r9 = r0.getMethod(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            awae r0 = new awae     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException -> 0x00bc, NoSuchMethodException -> 0x00ba }
            goto L_0x00c2
        L_0x00ba:
            r0 = move-exception
            goto L_0x00bd
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            awag r0 = new awag
            r0.<init>()
        L_0x00c2:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awag.<clinit>():void");
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public final void a(String str) {
        System.out.println(str);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }
}
