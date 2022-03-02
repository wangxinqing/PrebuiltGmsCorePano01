package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vmo implements vsh {
    final /* synthetic */ vyn a;

    public vmo(vyn vyn) {
        this.a = vyn;
    }

    public final void a(ShareTarget shareTarget) {
        try {
            vyn vyn = this.a;
            OnShareTargetDiscoveredParams onShareTargetDiscoveredParams = new vza().a;
            onShareTargetDiscoveredParams.a = shareTarget;
            vyn.a(onShareTargetDiscoveredParams);
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke onShareTargetDiscovered on registered share sheet.");
        }
    }

    public final void b(ShareTarget shareTarget) {
        try {
            vyn vyn = this.a;
            OnShareTargetLostParams onShareTargetLostParams = new vze().a;
            onShareTargetLostParams.a = shareTarget;
            vyn.a(onShareTargetLostParams);
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke onShareTargetLost on registered share sheet.");
        }
    }

    public final void a(ShareTarget shareTarget, int i) {
        try {
            vyn vyn = this.a;
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams = new vzc().a;
            onShareTargetDistanceChangedParams.a = shareTarget;
            onShareTargetDistanceChangedParams.b = i;
            vyn.a(onShareTargetDistanceChangedParams);
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke onShareTargetDistanceChanged on registered share sheet.");
        }
    }
}
