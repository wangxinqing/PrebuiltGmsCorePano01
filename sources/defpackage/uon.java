package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;

/* renamed from: uon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uon extends jfx {
    final String a;
    final /* synthetic */ InetAddress e;
    final /* synthetic */ ServerSocket f;
    final /* synthetic */ uoz g;
    final /* synthetic */ top h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uon(uoz uoz, int i, InetAddress inetAddress, ServerSocket serverSocket, top top) {
        super(i);
        this.g = uoz;
        this.e = inetAddress;
        this.f = serverSocket;
        this.h = top;
        String valueOf = String.valueOf(this.e);
        int localPort = this.f.getLocalPort();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append("::");
        sb.append(localPort);
        this.a = sb.toString();
    }

    public final void run() {
        try {
            ulu.a();
            while (true) {
                uwh uwh = new uwh(this.f.accept());
                SocketAddress remoteSocketAddress = uwh.c.getRemoteSocketAddress();
                if (remoteSocketAddress instanceof InetSocketAddress) {
                    InetAddress address = ((InetSocketAddress) remoteSocketAddress).getAddress();
                    this.g.a(address, true);
                    uwh.a(new uok(this, address));
                    String str = uwh.a;
                    urq urq = new urq(44);
                    if (urt.SUCCESS == this.g.a.b(urq)) {
                        uwh.a(new uol(this, urq));
                        this.h.a.a(uwh);
                    } else {
                        ((anih) ((anih) ulh.a.b()).a("uon", "run", 293, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create a WifiLanSocket because we were unable to register the MediumOperation.");
                        ulu.a((ull) uwh, "WifiLan", str);
                    }
                } else {
                    String valueOf = String.valueOf(remoteSocketAddress);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Unknown address type: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } catch (IOException e2) {
            ulu.a(this.f, "WifiLan", this.a);
            ulu.b();
        } catch (Throwable th) {
            ulu.b();
            throw th;
        }
    }
}
