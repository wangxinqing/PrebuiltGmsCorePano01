package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OptInParams;

/* renamed from: vkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkh implements Runnable {
    private final vmt a;
    private final OptInParams b;

    public vkh(vmt vmt, OptInParams optInParams) {
        this.a = vmt;
        this.b = optInParams;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "optIn", this.b.a, new vly(vmt));
    }
}
