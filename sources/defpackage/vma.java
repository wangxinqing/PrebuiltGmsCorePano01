package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import java.nio.charset.Charset;

/* renamed from: vma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vma implements Runnable {
    private final vmt a;
    private final GetDeviceNameParams b;

    public vma(vmt vmt, GetDeviceNameParams getDeviceNameParams) {
        this.a = vmt;
        this.b = getDeviceNameParams;
    }

    public final void run() {
        vmt vmt = this.a;
        try {
            vyq vyq = this.b.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            Charset charset = NearbySharingChimeraService.a;
            vyq.a(nearbySharingChimeraService.n());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke getDeviceName callback.");
        }
    }
}
