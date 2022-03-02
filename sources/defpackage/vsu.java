package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

/* renamed from: vsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsu implements igp {
    private final ShareTarget a;

    public vsu(ShareTarget shareTarget) {
        this.a = shareTarget;
    }

    public final void a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.a;
        int i = vts.a;
        vxd vxd = new vxd();
        vxd.a.a = shareTarget;
        ifu b = vts.b((acwd) obj2);
        CancelParams cancelParams = vxd.a;
        cancelParams.b = b;
        ((vyk) ((waz) obj).x()).a(cancelParams);
    }
}
