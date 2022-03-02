package defpackage;

import android.net.wifi.aware.PublishDiscoverySession;

/* renamed from: uva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uva extends uvc {
    final /* synthetic */ aosh a;
    final /* synthetic */ String b;
    final /* synthetic */ uvb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uva(uvb uvb, uvp uvp, String str, aosh aosh, String str2) {
        super(uvp, str);
        this.c = uvb;
        this.a = aosh;
        this.b = str2;
    }

    public final void onPublishStarted(PublishDiscoverySession publishDiscoverySession) {
        this.d = publishDiscoverySession;
        this.a.b((Object) publishDiscoverySession);
    }

    public final void onSessionConfigFailed() {
        this.a.a((Throwable) new RuntimeException(String.format("Failed to publish %s with service id %s over WiFi Aware", new Object[]{this.b, this.c.a})));
    }

    public final void onSessionTerminated() {
        ((anih) ((anih) ulh.a.c()).a("uva", "onSessionTerminated", 1222, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware publish for serviceId %s was terminated.", (Object) this.c.a);
        this.c.b.e(this.d);
    }
}
