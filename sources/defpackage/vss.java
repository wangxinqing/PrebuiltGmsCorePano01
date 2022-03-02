package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;

/* renamed from: vss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vss implements igp {
    private final ShareTarget a;

    public vss(ShareTarget shareTarget) {
        this.a = shareTarget;
    }

    public final void a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.a;
        int i = vts.a;
        vxb vxb = new vxb();
        vxb.a.a = shareTarget;
        ifu b = vts.b((acwd) obj2);
        AcceptParams acceptParams = vxb.a;
        acceptParams.b = b;
        ((vyk) ((waz) obj).x()).a(acceptParams);
    }
}
