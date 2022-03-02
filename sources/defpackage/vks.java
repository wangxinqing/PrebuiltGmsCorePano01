package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import java.nio.charset.Charset;

/* renamed from: vks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vks implements Runnable {
    private final vmt a;
    private final IsOptedInParams b;

    public vks(vmt vmt, IsOptedInParams isOptedInParams) {
        this.a = vmt;
        this.b = isOptedInParams;
    }

    public final void run() {
        vmt vmt = this.a;
        try {
            vya vya = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            Charset charset = NearbySharingChimeraService.a;
            vya.a(nearbySharingChimeraService.j());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke isOptedIn callback.");
        }
    }
}
