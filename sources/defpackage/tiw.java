package defpackage;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: tiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tiw {
    public final DiscoveryOptions a;

    public tiw() {
        this.a = new DiscoveryOptions();
    }

    public final void a(Strategy strategy) {
        this.a.a = strategy;
    }

    public tiw(DiscoveryOptions discoveryOptions) {
        DiscoveryOptions discoveryOptions2 = new DiscoveryOptions();
        this.a = discoveryOptions2;
        discoveryOptions2.a = discoveryOptions.a;
        discoveryOptions2.b = discoveryOptions.b;
        discoveryOptions2.c = discoveryOptions.c;
        discoveryOptions2.d = discoveryOptions.d;
        discoveryOptions2.e = discoveryOptions.e;
        discoveryOptions2.f = discoveryOptions.f;
        discoveryOptions2.g = discoveryOptions.g;
        discoveryOptions2.h = discoveryOptions.h;
        discoveryOptions2.i = discoveryOptions.i;
    }
}
