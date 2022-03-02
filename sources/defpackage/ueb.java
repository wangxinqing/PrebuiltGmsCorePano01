package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import java.util.Set;

/* renamed from: ueb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ueb extends ugg {
    private final ige a;
    private final Set b = new ob();
    private final Set c = new ob();

    public ueb(ige ige) {
        iva.a((Object) ige);
        this.a = ige;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        for (String udz : this.b) {
            this.a.a(new udz(udz));
        }
        this.b.clear();
        for (String uea : this.c) {
            this.a.a(new uea(uea));
        }
        this.c.clear();
    }

    public final void a(OnBandwidthChangedParams onBandwidthChangedParams) {
        this.a.a(new udy(onBandwidthChangedParams));
    }

    public final synchronized void a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        this.b.add(onConnectionInitiatedParams.a);
        this.a.a(new udv(onConnectionInitiatedParams));
    }

    public final synchronized void a(OnConnectionResultParams onConnectionResultParams) {
        this.b.remove(onConnectionResultParams.a);
        Status b2 = ueq.b(onConnectionResultParams.b);
        if (b2.c()) {
            this.c.add(onConnectionResultParams.a);
        }
        this.a.a(new udw(onConnectionResultParams, b2));
    }

    public final synchronized void a(OnDisconnectedParams onDisconnectedParams) {
        this.c.remove(onDisconnectedParams.a);
        this.a.a(new udx(onDisconnectedParams));
    }
}
