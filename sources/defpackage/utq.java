package defpackage;

import android.net.wifi.aware.PublishDiscoverySession;

/* renamed from: utq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utq implements Runnable {
    private final uts a;
    private final PublishDiscoverySession b;

    public utq(uts uts, PublishDiscoverySession publishDiscoverySession) {
        this.a = uts;
        this.b = publishDiscoverySession;
    }

    public final void run() {
        this.a.f(this.b);
    }
}
