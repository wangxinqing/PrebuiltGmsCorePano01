package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import java.nio.charset.Charset;

/* renamed from: vlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlo implements Runnable {
    private final vmt a;
    private final IsEnabledParams b;

    public vlo(vmt vmt, IsEnabledParams isEnabledParams) {
        this.a = vmt;
        this.b = isEnabledParams;
    }

    public final void run() {
        vmt vmt = this.a;
        try {
            vya vya = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            Charset charset = NearbySharingChimeraService.a;
            vya.a(nearbySharingChimeraService.k());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke isEnabled callback.");
        }
    }
}
