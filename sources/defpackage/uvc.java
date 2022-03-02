package defpackage;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.DiscoverySessionCallback;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.SubscribeDiscoverySession;
import java.util.Map;

/* renamed from: uvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class uvc extends DiscoverySessionCallback {
    private final uvp a;
    private final String b;
    private final Map c = new nz();
    public DiscoverySession d;

    public uvc(uvp uvp, String str) {
        this.a = uvp;
        this.b = str;
    }

    public final void onMessageReceived(PeerHandle peerHandle, byte[] bArr) {
        uvy uvy = (uvy) this.c.get(peerHandle);
        if (uvy == null) {
            uvy uvy2 = new uvy(peerHandle, this.b, this.d, new byte[2]);
            this.c.put(peerHandle, uvy2);
            uvy = uvy2;
        }
        uvp uvp = this.a;
        uvp.a((Runnable) new uvm(uvp, uvy, bArr));
    }

    public final void onMessageSendFailed(int i) {
        uvp uvp = this.a;
        uvp.a((Runnable) new uvl(uvp, i));
    }

    public final void onMessageSendSucceeded(int i) {
        uvp uvp = this.a;
        uvp.a((Runnable) new uvk(uvp, i));
    }

    public void onPublishStarted(PublishDiscoverySession publishDiscoverySession) {
        this.d = publishDiscoverySession;
    }

    public void onSubscribeStarted(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.d = subscribeDiscoverySession;
    }
}
