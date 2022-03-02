package defpackage;

import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: bamx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamx extends bamy {
    private static final banm d = new banm((Class) null, "setUseSessionTickets", Boolean.TYPE);
    private static final banm e = new banm((Class) null, "setHostname", String.class);
    private static final banm f;
    private static final banm g;
    private static final banm h;
    private static final banm i;

    static {
        Class<byte[]> cls = byte[].class;
        f = new banm(cls, "getAlpnSelectedProtocol", new Class[0]);
        g = new banm((Class) null, "setAlpnProtocols", cls);
        h = new banm(cls, "getNpnSelectedProtocol", new Class[0]);
        i = new banm((Class) null, "setNpnProtocols", cls);
    }

    public bamx(banu banu) {
        super(banu);
    }

    public final String a(SSLSocket sSLSocket) {
        if (this.c.a() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, banx.b);
                }
            } catch (Exception e2) {
                bamy.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", e2);
            }
        }
        if (this.c.a() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) h.a(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, banx.b);
            }
            return null;
        } catch (Exception e3) {
            bamy.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", e3);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            d.b(sSLSocket, true);
            e.b(sSLSocket, str);
        }
        Object[] objArr = {banu.a(list)};
        if (this.c.a() == 1) {
            g.a(sSLSocket, objArr);
        }
        if (this.c.a() != 3) {
            i.a(sSLSocket, objArr);
            return;
        }
        throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }

    public final String a(SSLSocket sSLSocket, String str, List list) {
        String a = a(sSLSocket);
        return a == null ? super.a(sSLSocket, str, list) : a;
    }
}
