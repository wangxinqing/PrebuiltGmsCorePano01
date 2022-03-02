package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: vju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vju implements vtx {
    final /* synthetic */ NearbySharingChimeraService a;

    public vju(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.a.a((Runnable) new vjt(this, shareTarget, transferMetadata));
    }
}
