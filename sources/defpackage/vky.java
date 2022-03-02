package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import java.nio.charset.Charset;

/* renamed from: vky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vky implements Runnable {
    private final vmt a;
    private final GetAccountParams b;

    public vky(vmt vmt, GetAccountParams getAccountParams) {
        this.a = vmt;
        this.b = getAccountParams;
    }

    public final void run() {
        vmt vmt = this.a;
        try {
            vxx vxx = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            Charset charset = NearbySharingChimeraService.a;
            vxx.a(nearbySharingChimeraService.r());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke getAccount callback.");
        }
    }
}
