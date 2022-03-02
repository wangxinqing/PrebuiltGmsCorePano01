package defpackage;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vxi extends vym {
    public ige a;

    public vxi(ige ige) {
        this.a = ige;
    }

    public final void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        if (this.a != null) {
            way.a().a(onShareTargetDiscoveredParams.a, this.a);
            this.a.a(new vxf(onShareTargetDiscoveredParams));
        }
    }

    public final void a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
        ige ige = this.a;
        if (ige != null) {
            ige.a(new vxh(onShareTargetDistanceChangedParams));
        }
    }

    public final void a(OnShareTargetLostParams onShareTargetLostParams) {
        if (this.a != null) {
            way.a().a(onShareTargetLostParams.a);
            this.a.a(new vxg(onShareTargetLostParams));
        }
    }
}
