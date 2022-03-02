package defpackage;

import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfj extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfj(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        uwr uwr = (uwr) this.a.h.a(uwr.class);
        uwr.b.c(new uwo(uwr, "CopresenceHelper.init"));
        this.a.h.a(vei.class);
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.a;
        nearbyMessagesChimeraService.f = new CopresenceBroadcastReceiver((vav) nearbyMessagesChimeraService.h.a(vav.class), (arwg) this.a.h.a(arwg.class));
        this.a.h.a(vbf.class);
    }
}
