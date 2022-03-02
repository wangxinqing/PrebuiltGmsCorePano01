package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bana  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bana {
    static final List a = Collections.unmodifiableList(Arrays.asList(new banv[]{banv.HTTP_2}));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, banj banj) {
        String[] strArr;
        banv banv;
        String str2;
        amrl.a((Object) sSLSocketFactory, (Object) "sslSocketFactory");
        amrl.a((Object) socket, (Object) "socket");
        amrl.a((Object) banj, (Object) "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        List list = null;
        if (banj.c != null) {
            strArr = (String[]) banx.a(String.class, banj.c, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        bani bani = new bani(banj);
        bani.a(strArr);
        bani.b((String[]) banx.a(String.class, banj.d, enabledProtocols));
        banj a2 = bani.a();
        sSLSocket.setEnabledProtocols(a2.d);
        String[] strArr2 = a2.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        bamy bamy = bamy.b;
        if (banj.e) {
            list = a;
        }
        String a3 = bamy.a(sSLSocket, str, list);
        List list2 = a;
        if (a3.equals(banv.HTTP_1_0.e)) {
            banv = banv.HTTP_1_0;
        } else if (a3.equals(banv.HTTP_1_1.e)) {
            banv = banv.HTTP_1_1;
        } else if (a3.equals(banv.HTTP_2.e)) {
            banv = banv.HTTP_2;
        } else if (!a3.equals(banv.SPDY_3.e)) {
            String valueOf = String.valueOf(a3);
            throw new IOException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
        } else {
            banv = banv.SPDY_3;
        }
        boolean contains = list2.contains(banv);
        String valueOf2 = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 50);
        sb.append("Only ");
        sb.append(valueOf2);
        sb.append(" are supported, but negotiated protocol is %s");
        amrl.b(contains, sb.toString(), (Object) a3);
        banl banl = banl.a;
        if (!str.startsWith("[") || !str.endsWith("]")) {
            str2 = str;
        } else {
            str2 = str.substring(1, str.length() - 1);
        }
        if (banl.verify(str2, sSLSocket.getSession())) {
            return sSLSocket;
        }
        String valueOf3 = String.valueOf(str);
        throw new SSLPeerUnverifiedException(valueOf3.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf3));
    }
}
