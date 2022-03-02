package defpackage;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import java.util.List;

/* renamed from: uup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uup implements Runnable {
    private final uvf a;
    private final DiscoverySession b;
    private final PeerHandle c;
    private final String d;
    private final byte[] e;
    private final List f;
    private final umo g;

    public uup(uvf uvf, DiscoverySession discoverySession, PeerHandle peerHandle, String str, byte[] bArr, List list, umo umo) {
        this.a = uvf;
        this.b = discoverySession;
        this.c = peerHandle;
        this.d = str;
        this.e = bArr;
        this.f = list;
        this.g = umo;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
