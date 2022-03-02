package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: vmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vmu extends vhh {
    private final vmt a;

    public vmu(NearbySharingChimeraService nearbySharingChimeraService, String str) {
        this.a = new vmt(nearbySharingChimeraService, str);
    }

    public final void a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        if (!ayni.F()) {
            a("registerSendSurface");
        }
        this.a.a(registerSendSurfaceParams);
    }

    public final void a(RegisterSharingProviderParams registerSharingProviderParams) {
        if (!ayni.H()) {
            a("registerSharingProvider");
        }
        this.a.a(registerSharingProviderParams);
    }

    public final void a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        if (!ayni.F()) {
            a("unregisterSendSurface");
        }
        this.a.a(unregisterSendSurfaceParams);
    }

    public final void a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        this.a.a(unregisterSharingProviderParams);
    }
}
