package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkMonitorAutoDetect$NetworkInformation {
    public final String a;
    public final NetworkMonitorAutoDetect$ConnectionType b;
    public final NetworkMonitorAutoDetect$ConnectionType c;
    public final long d;
    public final NetworkMonitorAutoDetect$IPAddress[] e;

    public NetworkMonitorAutoDetect$NetworkInformation(String str, NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType, NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType2, long j, NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr) {
        this.a = str;
        this.b = networkMonitorAutoDetect$ConnectionType;
        this.c = networkMonitorAutoDetect$ConnectionType2;
        this.d = j;
        this.e = networkMonitorAutoDetect$IPAddressArr;
    }

    private NetworkMonitorAutoDetect$ConnectionType getConnectionType() {
        return this.b;
    }

    private long getHandle() {
        return this.d;
    }

    private NetworkMonitorAutoDetect$IPAddress[] getIpAddresses() {
        return this.e;
    }

    private String getName() {
        return this.a;
    }

    private NetworkMonitorAutoDetect$ConnectionType getUnderlyingConnectionTypeForVpn() {
        return this.c;
    }
}
