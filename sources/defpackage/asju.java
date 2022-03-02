package defpackage;

import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: asju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asju extends arwm {
    final /* synthetic */ int a;
    final /* synthetic */ NearbyDirectChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asju(NearbyDirectChimeraService nearbyDirectChimeraService, String str, int i) {
        super(str);
        this.b = nearbyDirectChimeraService;
        this.a = i;
    }

    public final void run() {
        jjg jjg = asil.a;
        this.b.stopSelf(this.a);
    }
}
