package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: uar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uar implements Runnable {
    private final DiscoveryChimeraService a;

    public uar(DiscoveryChimeraService discoveryChimeraService) {
        this.a = discoveryChimeraService;
    }

    public final void run() {
        this.a.c();
    }
}
