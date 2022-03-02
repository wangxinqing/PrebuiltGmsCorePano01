package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;

/* renamed from: vko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vko implements Runnable {
    private final vmt a;
    private final AcceptParams b;

    public vko(vmt vmt, AcceptParams acceptParams) {
        this.a = vmt;
        this.b = acceptParams;
    }

    public final void run() {
        vmt vmt = this.a;
        AcceptParams acceptParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "accept", acceptParams.b, new vlm(vmt, acceptParams));
    }
}
