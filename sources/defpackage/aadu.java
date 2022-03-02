package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: aadu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadu implements aadq {
    public final boolean a(Uri uri, int i) {
        Socket socket;
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(uri.getHost()), uri.getPort());
            socket = new Socket();
            socket.connect(inetSocketAddress, i);
            socket.close();
            return true;
        } catch (IOException | IllegalArgumentException e) {
            Log.e("TcpReachabilityChecker", String.format("Error checking if %s:%d is reachable: %s", new Object[]{uri.getHost(), Integer.valueOf(uri.getPort()), e}));
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
