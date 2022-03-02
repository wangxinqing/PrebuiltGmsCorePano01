package defpackage;

import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: asjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjv extends arwm {
    final /* synthetic */ NearbyDirectChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asjv(NearbyDirectChimeraService nearbyDirectChimeraService, String str) {
        super(str);
        this.a = nearbyDirectChimeraService;
    }

    public final void run() {
        jjg jjg = asil.a;
        this.a.a.getLooper().quit();
    }
}
