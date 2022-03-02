package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: awad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awad extends awag {
    private final awac b;
    private final awac c;
    private final awac d;
    private final awac e;

    public awad(awac awac, awac awac2, awac awac3, awac awac4) {
        this.b = awac;
        this.c = awac2;
        this.d = awac3;
        this.e = awac4;
    }

    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        awac awac = this.d;
        if (awac == null || !awac.a((Object) sSLSocket) || (bArr = (byte[]) this.d.a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, awaj.c);
    }

    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (awaj.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        }
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.b.b(sSLSocket, true);
            this.c.b(sSLSocket, str);
        }
        awac awac = this.e;
        if (awac != null && awac.a((Object) sSLSocket)) {
            Object[] objArr = new Object[1];
            batd batd = new batd();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                avzh avzh = (avzh) list.get(i);
                if (avzh != avzh.HTTP_1_0) {
                    batd.h(avzh.e.length());
                    batd.b(avzh.e);
                }
            }
            objArr[0] = batd.m();
            this.e.a(sSLSocket, objArr);
        }
    }
}
