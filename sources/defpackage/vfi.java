package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfi extends arwm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfi(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void run() {
        this.a.b();
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.a;
        jjg jjg = tgc.a;
        int i = 0;
        if (aymw.w()) {
            qwq a2 = qwq.a((Context) nearbyMessagesChimeraService);
            qxi qxi = new qxi();
            qxi.i = "com.google.android.gms.nearby.messages.offline.OfflineCachingService";
            qxi.a(aync.g() ? 1 : 0, (axcc.c() || aync.g()) ? 1 : 0);
            qxi.k = "OfflineCachingTask";
            qxi.a = aync.a.a().I();
            qxj a3 = qxi.b();
            try {
                a2.a("OfflineCachingTask", "com.google.android.gms.nearby.messages.offline.OfflineCachingService");
                a2.a((qxx) a3);
            } catch (IllegalArgumentException e) {
                anih anih = (anih) tgc.a.c();
                anih.a((Throwable) e);
                anih.a("OfflineCache: Failed to schedule task");
            }
        } else {
            ((anih) tgc.a.d()).a("OfflineCache: old scanner cache is not enabled");
        }
        if (aymw.A()) {
            qwq a4 = qwq.a((Context) nearbyMessagesChimeraService);
            qxi qxi2 = new qxi();
            qxi2.i = "com.google.android.gms.nearby.messages.offline.OfflineCachingService";
            boolean C = aymw.C();
            if (axcc.c() || aymw.C()) {
                i = 1;
            }
            qxi2.a(C ? 1 : 0, i);
            qxi2.k = "OfflineCachingTask";
            qxi2.a = aymt.a.a().T();
            qxj a5 = qxi2.b();
            try {
                a4.a("OfflineCachingTask", "com.google.android.gms.nearby.messages.offline.OfflineCachingService");
                a4.a((qxx) a5);
            } catch (IllegalArgumentException e2) {
                anih anih2 = (anih) tgc.a.c();
                anih2.a((Throwable) e2);
                anih2.a("NewOfflineCache: Failed to schedule task");
            }
        } else {
            ((anih) tgc.a.d()).a("NewOfflineCache: new scanner cache is not enabled");
        }
    }
}
