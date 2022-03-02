package defpackage;

import android.net.wifi.WifiManager;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: uot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uot extends urq {
    public final WifiManager a;
    public final InetAddress b;
    public uwh c;
    private final int d;
    private final String e;
    private final tfw f;

    public uot(WifiManager wifiManager, InetAddress inetAddress, int i, tfw tfw) {
        super(43, tfw);
        this.a = wifiManager;
        this.b = inetAddress;
        this.d = i;
        String valueOf = String.valueOf(inetAddress);
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append("::");
        sb.append(i2);
        this.e = sb.toString();
        this.f = tfw;
    }

    public final int b() {
        if (this.f.b()) {
            jjg jjg = ulh.a;
            return 3;
        }
        uoz.a(this.a, this.b, true);
        ulu.a();
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(this.b, this.d), (int) aymi.ai());
            uwh uwh = new uwh(socket);
            this.c = uwh;
            uwh.a(new uos(this));
        } catch (SocketTimeoutException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uot", "b", 1127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out while trying to connect via a Wifi LAN socket to %s within %d milliseconds.", (Object) this.e, aymi.ai());
        } catch (IOException e3) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("uot", "b", 1131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect via a Wifi LAN socket to %s.", (Object) this.e);
        } catch (Throwable th) {
            ulu.b();
            throw th;
        }
        ulu.b();
        if (this.c != null) {
            jjg jjg2 = ulh.a;
            return a(44);
        }
        uoz.a(this.a, this.b, false);
        return 3;
    }
}
