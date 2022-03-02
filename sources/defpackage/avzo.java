package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: avzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzo {
    public final avyj a;
    public final Proxy b;
    public final InetSocketAddress c;

    public avzo(avyj avyj, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (avyj == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = avyj;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avzo) {
            avzo avzo = (avzo) obj;
            return this.a.equals(avzo.a) && this.b.equals(avzo.b) && this.c.equals(avzo.c);
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
