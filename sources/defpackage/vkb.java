package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkb implements Runnable {
    private final vkd a;
    private final ShareTarget b;

    public vkb(vkd vkd, ShareTarget shareTarget) {
        this.a = vkd;
        this.b = shareTarget;
    }

    public final void run() {
        vkd vkd = this.a;
        ShareTarget shareTarget = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vkd.a;
        for (vmx vmx : nearbySharingChimeraService.m.values()) {
            vmx.a.b(shareTarget);
        }
        nearbySharingChimeraService.w.c(shareTarget);
    }
}
