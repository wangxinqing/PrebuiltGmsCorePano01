package defpackage;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.SubscribeDiscoverySession;
import java.util.List;

/* renamed from: uvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uvd extends uvc {
    final /* synthetic */ aosh a;
    final /* synthetic */ uve b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uvd(uve uve, uvp uvp, String str, aosh aosh) {
        super(uvp, str);
        this.b = uve;
        this.a = aosh;
    }

    public final void onServiceDiscovered(PeerHandle peerHandle, byte[] bArr, List list) {
        uuk uuk = this.b.d;
        DiscoverySession discoverySession = this.d;
        uvf uvf = uuk.a;
        uvf.a((Runnable) new uup(uvf, discoverySession, peerHandle, uuk.b, bArr, list, uuk.c));
    }

    public final void onSessionConfigFailed() {
        this.a.a((Throwable) new RuntimeException(String.format("Failed to subscribe to %s over WiFi Aware", new Object[]{this.b.a})));
    }

    public final void onSessionTerminated() {
        ((anih) ((anih) ulh.a.c()).a("uvd", "onSessionTerminated", 1394, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware subscription for serviceId %s was terminated.", (Object) this.b.a);
        this.b.b.e(this.d);
    }

    public final void onSubscribeStarted(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.d = subscribeDiscoverySession;
        this.a.b((Object) subscribeDiscoverySession);
    }
}
