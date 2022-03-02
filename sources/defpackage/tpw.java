package defpackage;

import android.net.nsd.NsdServiceInfo;

/* renamed from: tpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpw implements Runnable {
    private final tpy a;
    private final NsdServiceInfo b;

    public tpw(tpy tpy, NsdServiceInfo nsdServiceInfo) {
        this.a = tpy;
        this.b = nsdServiceInfo;
    }

    public final void run() {
        tpy tpy = this.a;
        NsdServiceInfo nsdServiceInfo = this.b;
        if (!tpy.a.k()) {
            ((anih) tky.a.c()).a("Skipping discovery of NsdServiceInfo %s because we are no longer discovering.", (Object) nsdServiceInfo.getServiceName());
            return;
        }
        tsa a2 = tsa.a(nsdServiceInfo);
        nsdServiceInfo.getServiceName();
        if (tpy.a(a2)) {
            ((anih) tky.a.d()).a("Found WifiLanServiceInfo %s (with EndpointId %s and EndpointInfo %s)", (Object) nsdServiceInfo.getServiceName(), (Object) a2.c, (Object) tky.a(a2.e));
            tpy.d.b(tpy.a, (tms) new tmy(nsdServiceInfo, a2.c, a2.e, tpy.b));
            tpy.d.a(tpy.a, a2.c, asoe.WIFI_LAN, 1);
        }
    }
}
