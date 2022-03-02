package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.HashSet;
import java.util.Map;

/* renamed from: vfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfm extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfm(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        HashSet hashSet = new HashSet();
        uyt uyt = (uyt) this.a.h.a(uyt.class);
        for (uyq uyq : uyt.b()) {
            if (uyq.a()) {
                hashSet.add(uyt.a(uyq));
            }
        }
        synchronized (NearbyMessagesChimeraService.a) {
            Map map = this.a.d;
            if (map != null) {
                map.keySet().retainAll(hashSet);
                if (this.a.d.isEmpty()) {
                    this.a.d = null;
                }
            }
        }
    }
}
