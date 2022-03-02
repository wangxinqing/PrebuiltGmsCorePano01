package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: azyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyp extends baba {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public azyp(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        amrl.a((Object) socketAddress, (Object) "proxyAddress");
        amrl.a((Object) inetSocketAddress, (Object) "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            amrl.b(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", (Object) socketAddress);
        }
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public static azyo a() {
        return new azyo();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azyp) {
            azyp azyp = (azyp) obj;
            if (!amqx.a(this.a, azyp.a) || !amqx.a(this.b, azyp.b) || !amqx.a(this.c, azyp.c) || !amqx.a(this.d, azyp.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        boolean z;
        amrg a2 = amrh.a((Object) this);
        a2.a("proxyAddr", (Object) this.a);
        a2.a("targetAddr", (Object) this.b);
        a2.a("username", (Object) this.c);
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        a2.a("hasPassword", z);
        return a2.toString();
    }
}
