package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: awcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awcb {
    public static final awcb a = new awcb();

    public static final InetAddress a(Proxy proxy, avzd avzd) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(avzd.b);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
