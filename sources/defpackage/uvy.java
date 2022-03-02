package defpackage;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import java.util.Arrays;

/* renamed from: uvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uvy {
    public final PeerHandle a;
    public final String b;
    public final DiscoverySession c;
    public byte[] d;

    public uvy(PeerHandle peerHandle, String str, DiscoverySession discoverySession, byte[] bArr) {
        this.a = peerHandle;
        this.b = str;
        this.c = discoverySession;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uvy) {
            uvy uvy = (uvy) obj;
            return ius.a(this.a, uvy.a) && ius.a(this.c, uvy.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c});
    }

    public final String toString() {
        return String.format("WifiAwarePeer{serviceId=%s, sessionId=%s, peerHandle=%s, discoverySession=%s}", new Object[]{this.b, ulu.a(this.d), this.a, this.c});
    }
}
