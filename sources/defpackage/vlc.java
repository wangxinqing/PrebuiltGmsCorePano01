package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import java.nio.charset.Charset;

/* renamed from: vlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlc implements Runnable {
    private final vmt a;
    private final GetVisibilityParams b;

    public vlc(vmt vmt, GetVisibilityParams getVisibilityParams) {
        this.a = vmt;
        this.b = getVisibilityParams;
    }

    public final void run() {
        vmt vmt = this.a;
        try {
            vyh vyh = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            Charset charset = NearbySharingChimeraService.a;
            vyh.a(nearbySharingChimeraService.m());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke getVisibility callback.");
        }
    }
}
