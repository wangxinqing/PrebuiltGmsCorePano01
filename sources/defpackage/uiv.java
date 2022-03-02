package defpackage;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;

/* renamed from: uiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uiv {
    public final StartDiscoveryParams a;

    public uiv() {
        this.a = new StartDiscoveryParams();
    }

    public final void a(DiscoveryOptions discoveryOptions) {
        this.a.e = discoveryOptions;
    }

    public final void a(String str) {
        this.a.c = str;
    }

    public final void a(ugn ugn) {
        this.a.b = ugn;
    }

    public final void a(ugq ugq) {
        this.a.f = ugq;
    }

    public final void a(uha uha) {
        this.a.a = uha;
    }

    public uiv(StartDiscoveryParams startDiscoveryParams) {
        StartDiscoveryParams startDiscoveryParams2 = new StartDiscoveryParams();
        this.a = startDiscoveryParams2;
        startDiscoveryParams2.a = startDiscoveryParams.a;
        startDiscoveryParams2.b = startDiscoveryParams.b;
        startDiscoveryParams2.c = startDiscoveryParams.c;
        startDiscoveryParams2.d = startDiscoveryParams.d;
        startDiscoveryParams2.e = startDiscoveryParams.e;
        startDiscoveryParams2.f = startDiscoveryParams.f;
    }
}
