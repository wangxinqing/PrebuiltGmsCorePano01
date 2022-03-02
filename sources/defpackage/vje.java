package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.List;

/* renamed from: vje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vje implements Runnable {
    private final NearbySharingChimeraService a;
    private final aosh b;
    private final vke c;

    public vje(NearbySharingChimeraService nearbySharingChimeraService, vke vke, aosh aosh) {
        this.a = nearbySharingChimeraService;
        this.c = vke;
        this.b = aosh;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        vke vke = this.c;
        aosh aosh = this.b;
        ((anih) vvj.a.d()).a("Files not ready yet, started to download attachment");
        List list = (List) thr.c("getAttachments", aosh, ayni.z());
        if (list == null || list.isEmpty()) {
            ((anih) vvj.a.d()).a("Download in progress.");
            vke.c.b(vke.a, new vtv(12).a());
            List list2 = (List) thr.c("getAttachments", aosh, ayni.a.a().as() - ayni.z());
            if (list2 == null || list2.isEmpty()) {
                vke.b.a((Throwable) new IllegalStateException("Failed to download attachments"));
                nearbySharingChimeraService.v = null;
                return;
            }
            vke.a(list2);
            nearbySharingChimeraService.v = null;
            return;
        }
        vke.a(list);
    }
}
