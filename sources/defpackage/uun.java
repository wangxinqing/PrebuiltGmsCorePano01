package defpackage;

import android.net.Network;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

/* renamed from: uun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uun implements Callable {
    private final uvf a;
    private final uvy b;
    private final InetSocketAddress c;

    public uun(uvf uvf, uvy uvy, InetSocketAddress inetSocketAddress) {
        this.a = uvf;
        this.b = uvy;
        this.c = inetSocketAddress;
    }

    public final Object call() {
        uvf uvf = this.a;
        uvy uvy = this.b;
        InetSocketAddress inetSocketAddress = this.c;
        ulu.a();
        Socket socket = new Socket();
        ((Network) uvf.e.get(uvy)).bindSocket(socket);
        socket.connect(inetSocketAddress, (int) aymi.a.a().bb());
        ((anih) ((anih) ulh.a.d()).a("uvf", "a", 796, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully connected to a socket on a WiFi Aware network.");
        uvz uvz = new uvz(socket);
        uvz.a(new uuo(uvf, uvy));
        return uvz;
    }
}
