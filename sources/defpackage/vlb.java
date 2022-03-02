package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;

/* renamed from: vlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlb implements Runnable {
    private final vmt a;
    private final SetVisibilityParams b;

    public vlb(vmt vmt, SetVisibilityParams setVisibilityParams) {
        this.a = vmt;
        this.b = setVisibilityParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SetVisibilityParams setVisibilityParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "setVisibility", setVisibilityParams.b, new vle(vmt, setVisibilityParams));
    }
}
