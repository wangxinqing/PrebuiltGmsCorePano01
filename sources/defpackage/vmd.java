package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: vmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmd implements Runnable {
    private final vmt a;
    private final UnregisterSharingProviderParams b;
    private final vmq c;

    public vmd(vmt vmt, UnregisterSharingProviderParams unregisterSharingProviderParams, vmq vmq) {
        this.a = vmt;
        this.b = unregisterSharingProviderParams;
        this.c = vmq;
    }

    public final void run() {
        vmt vmt = this.a;
        NearbySharingChimeraService.a(vmt.a, "unregisterSharingProvider", this.b.a, new vlu(vmt, this.c));
    }
}
