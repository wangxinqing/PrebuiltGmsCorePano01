package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfl extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfl(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        this.a.h.a();
    }
}
