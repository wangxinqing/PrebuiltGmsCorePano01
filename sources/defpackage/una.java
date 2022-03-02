package defpackage;

import android.net.wifi.p2p.WifiP2pConfig;

/* renamed from: una  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class una implements Runnable {
    private final unc a;
    private final WifiP2pConfig.Builder b;

    public una(unc unc, WifiP2pConfig.Builder builder) {
        this.a = unc;
        this.b = builder;
    }

    public final void run() {
        unc unc = this.a;
        if (!unc.a(this.b.build())) {
            unc.c();
            throw new RuntimeException("Failed to create group.");
        }
    }
}
