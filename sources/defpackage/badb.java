package defpackage;

import java.net.SocketAddress;
import java.net.URI;

/* renamed from: badb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badb extends baan {
    final SocketAddress a;
    final String b;

    public badb(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    public final baas a(URI uri, baal baal) {
        return new bada(this);
    }

    public final String a() {
        return "directaddress";
    }
}
