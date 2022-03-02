package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: vfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfh extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfh(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.a;
        try {
            nearbyMessagesChimeraService.j.a();
            if (nearbyMessagesChimeraService.j.b().isEmpty()) {
                uyj uyj = (uyj) nearbyMessagesChimeraService.h.a(uyj.class);
                uyj.d.b();
                uyj.c();
                if (!uyj.c.isEmpty() || !Collections.unmodifiableSet(((uyj) nearbyMessagesChimeraService.h.a(uyj.class)).b.keySet()).isEmpty() || !((uyt) nearbyMessagesChimeraService.h.a(uyt.class)).d() || !new HashSet(((uyt) nearbyMessagesChimeraService.h.a(uyt.class)).c.n()).isEmpty() || ((uws) nearbyMessagesChimeraService.h.a(uws.class)).a()) {
                    return;
                }
                jjg jjg = tgc.a;
                this.a.stopSelf();
            }
        } catch (Exception e) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "d", 1109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception while waiting for BackgroundSubscribeCache init.");
        }
    }
}
