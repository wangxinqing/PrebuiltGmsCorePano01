package defpackage;

import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;
import java.util.Set;

/* renamed from: ueg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ueg extends ugp {
    private final ige a;
    private final Set b = new ob();

    public ueg(ige ige) {
        iva.a((Object) ige);
        this.a = ige;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams r3) {
        /*
            android.bluetooth.BluetoothDevice r0 = r3.d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r3 = r3.a
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = "__UNRECOGNIZED_BLUETOOTH_DEVICE__"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            return r1
        L_0x0014:
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ueg.b(com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        for (String uef : this.b) {
            this.a.a(new uef(uef));
        }
        this.b.clear();
    }

    public final void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
    }

    public final synchronized void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
        this.a.a(new uec(onEndpointDistanceChangedParams));
    }

    public final synchronized void a(OnEndpointFoundParams onEndpointFoundParams) {
        if (!b(onEndpointFoundParams)) {
            this.b.add(onEndpointFoundParams.a);
        }
        this.a.a(new ued(onEndpointFoundParams));
    }

    public final synchronized void a(OnEndpointLostParams onEndpointLostParams) {
        this.b.remove(onEndpointLostParams.a);
        this.a.a(new uee(onEndpointLostParams));
    }
}
