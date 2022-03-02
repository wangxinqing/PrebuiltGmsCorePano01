package defpackage;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* renamed from: afne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afne extends SocketFactory {
    private final SocketFactory a;
    private final int b;

    public afne(SocketFactory socketFactory, int i) {
        this.a = socketFactory;
        this.b = i;
    }

    public final Socket createSocket() {
        Socket createSocket = this.a.createSocket();
        TrafficStats.setThreadStatsTag(this.b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.a.createSocket(str, i);
        TrafficStats.setThreadStatsTag(this.b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        TrafficStats.setThreadStatsTag(this.b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        TrafficStats.setThreadStatsTag(this.b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        TrafficStats.setThreadStatsTag(this.b);
        TrafficStats.tagSocket(createSocket);
        return createSocket;
    }
}
