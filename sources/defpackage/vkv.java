package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;

/* renamed from: vkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkv implements Runnable {
    private final vmt a;
    private final MarkContactAsSelectedParams b;

    public vkv(vmt vmt, MarkContactAsSelectedParams markContactAsSelectedParams) {
        this.a = vmt;
        this.b = markContactAsSelectedParams;
    }

    public final void run() {
        vmt vmt = this.a;
        MarkContactAsSelectedParams markContactAsSelectedParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "markContactAsSelected", markContactAsSelectedParams.b, new vli(vmt, markContactAsSelectedParams));
    }
}
