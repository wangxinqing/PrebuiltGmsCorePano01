package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;

/* renamed from: vld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vld implements Runnable {
    private final vmt a;
    private final SetEnabledParams b;

    public vld(vmt vmt, SetEnabledParams setEnabledParams) {
        this.a = vmt;
        this.b = setEnabledParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SetEnabledParams setEnabledParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "setEnabled", setEnabledParams.b, new vlx(vmt, setEnabledParams));
    }
}
