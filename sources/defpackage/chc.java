package defpackage;

import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import java.util.List;

/* renamed from: chc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chc implements ContextHubTransaction.OnCompleteListener {
    final /* synthetic */ acwd a;

    public chc(acwd acwd) {
        this.a = acwd;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        for (NanoAppState nanoAppState : (List) response.getContents()) {
            if (nanoAppState.getNanoAppId() == 5147455389092024337L) {
                if (!nanoAppState.isEnabled() || nanoAppState.getNanoAppVersion() < awwn.a.a().g()) {
                    new Object[1][0] = Long.valueOf(nanoAppState.getNanoAppVersion());
                } else {
                    new Object[1][0] = Long.valueOf(nanoAppState.getNanoAppVersion());
                    this.a.a((Object) true);
                    return;
                }
            }
        }
        this.a.a((Object) false);
    }
}
