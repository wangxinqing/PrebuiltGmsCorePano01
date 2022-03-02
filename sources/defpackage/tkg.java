package defpackage;

import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;

/* renamed from: tkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkg implements Runnable {
    private final tku a;
    private final DisconnectFromEndpointParams b;
    private final tlh c;

    public tkg(tku tku, DisconnectFromEndpointParams disconnectFromEndpointParams, tlh tlh) {
        this.a = tku;
        this.b = disconnectFromEndpointParams;
        this.c = tlh;
    }

    public final void run() {
        tku tku = this.a;
        DisconnectFromEndpointParams disconnectFromEndpointParams = this.b;
        tlh tlh = this.c;
        String str = disconnectFromEndpointParams.a;
        if (tlh.e(str) || tlh.f(str)) {
            tku.a.c(tlh, str);
        }
    }
}
