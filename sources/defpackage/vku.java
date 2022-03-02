package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import java.nio.charset.Charset;

/* renamed from: vku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vku implements Runnable {
    private final vmt a;
    private final GetContactsCountParams b;

    public vku(vmt vmt, GetContactsCountParams getContactsCountParams) {
        this.a = vmt;
        this.b = getContactsCountParams;
    }

    public final void run() {
        vmt vmt = this.a;
        GetContactsCountParams getContactsCountParams = this.b;
        try {
            vyh vyh = getContactsCountParams.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            ContactFilter contactFilter = getContactsCountParams.b;
            Charset charset = NearbySharingChimeraService.a;
            vyh.a(nearbySharingChimeraService.a(0, 0, contactFilter).size());
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke getContactsCount callback.");
        }
    }
}
