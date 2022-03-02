package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.concurrent.TimeUnit;

/* renamed from: vfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfk extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfk(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        try {
            this.a.e.await(aync.a.a().j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            jjg jjg = tgc.a;
        }
    }
}
