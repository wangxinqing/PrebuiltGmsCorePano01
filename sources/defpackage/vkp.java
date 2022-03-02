package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

/* renamed from: vkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkp implements Runnable {
    private final vmt a;
    private final RejectParams b;

    public vkp(vmt vmt, RejectParams rejectParams) {
        this.a = vmt;
        this.b = rejectParams;
    }

    public final void run() {
        vmt vmt = this.a;
        RejectParams rejectParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "reject", rejectParams.b, new vll(vmt, rejectParams));
    }
}
