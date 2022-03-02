package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

/* renamed from: vst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vst implements igp {
    private final ShareTarget a;

    public vst(ShareTarget shareTarget) {
        this.a = shareTarget;
    }

    public final void a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.a;
        int i = vts.a;
        waj waj = new waj();
        waj.a.a = shareTarget;
        ifu b = vts.b((acwd) obj2);
        RejectParams rejectParams = waj.a;
        rejectParams.b = b;
        ((vyk) ((waz) obj).x()).a(rejectParams);
    }
}
