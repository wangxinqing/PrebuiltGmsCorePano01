package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vkd implements vsh {
    final /* synthetic */ NearbySharingChimeraService a;

    public vkd(NearbySharingChimeraService nearbySharingChimeraService) {
        this.a = nearbySharingChimeraService;
    }

    public final void a(ShareTarget shareTarget) {
        this.a.a((Runnable) new vka(this, shareTarget));
    }

    public final void b(ShareTarget shareTarget) {
        this.a.a((Runnable) new vkb(this, shareTarget));
    }

    public final void a(ShareTarget shareTarget, int i) {
        this.a.a((Runnable) new vkc(this, shareTarget, i));
    }
}
