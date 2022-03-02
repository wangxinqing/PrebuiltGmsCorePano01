package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OpenParams;

/* renamed from: vsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsv implements igp {
    private final ShareTarget a;

    public vsv(ShareTarget shareTarget) {
        this.a = shareTarget;
    }

    public final void a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.a;
        int i = vts.a;
        vzi vzi = new vzi();
        vzi.a.a = shareTarget;
        ifu b = vts.b((acwd) obj2);
        OpenParams openParams = vzi.a;
        openParams.b = b;
        ((vyk) ((waz) obj).x()).a(openParams);
    }
}
