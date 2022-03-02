package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: azyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyo {
    public String a;
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    public final azyp a() {
        return new azyp(this.c, this.d, this.a, this.b);
    }

    public final void a(InetSocketAddress inetSocketAddress) {
        amrl.a((Object) inetSocketAddress, (Object) "targetAddress");
        this.d = inetSocketAddress;
    }

    public final void a(SocketAddress socketAddress) {
        amrl.a((Object) socketAddress, (Object) "proxyAddress");
        this.c = socketAddress;
    }
}
