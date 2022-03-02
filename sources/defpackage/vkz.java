package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;

/* renamed from: vkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkz implements Runnable {
    private final vmt a;
    private final SetDataUsageParams b;

    public vkz(vmt vmt, SetDataUsageParams setDataUsageParams) {
        this.a = vmt;
        this.b = setDataUsageParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SetDataUsageParams setDataUsageParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "setDataUsage", setDataUsageParams.b, new vlf(vmt, setDataUsageParams));
    }
}
