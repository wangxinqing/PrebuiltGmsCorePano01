package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjl implements Runnable {
    private final NearbySharingChimeraService a;

    public vjl(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        nearbySharingChimeraService.b(wia.a((Context) nearbySharingChimeraService));
    }
}
