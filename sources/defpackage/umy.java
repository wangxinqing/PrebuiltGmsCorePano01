package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: umy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umy implements Runnable {
    public uwd a;
    final /* synthetic */ InetAddress b;
    final /* synthetic */ int c;

    public umy(InetAddress inetAddress, int i) {
        this.b = inetAddress;
        this.c = i;
    }

    public final void run() {
        try {
            ulu.a();
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(this.b, this.c), (int) aymi.Z());
            this.a = new uwd(socket);
        } catch (SocketTimeoutException e) {
            throw new RuntimeException(String.format("Timed out while trying to connect via a Wifi Direct socket to %s within %d milliseconds", new Object[]{this.b, Long.valueOf(aymi.Z())}), e);
        } catch (IOException e2) {
            throw new RuntimeException(String.format("WiFi Direct failed to connect to %s:%s", new Object[]{this.b, Integer.valueOf(this.c)}), e2);
        }
    }
}
