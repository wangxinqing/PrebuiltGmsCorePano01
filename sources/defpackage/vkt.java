package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import java.nio.charset.Charset;

/* renamed from: vkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkt implements Runnable {
    private final vmt a;
    private final GetContactsParams b;

    public vkt(vmt vmt, GetContactsParams getContactsParams) {
        this.a = vmt;
        this.b = getContactsParams;
    }

    public final void run() {
        vmt vmt = this.a;
        GetContactsParams getContactsParams = this.b;
        try {
            vyd vyd = getContactsParams.a;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            int i = getContactsParams.b;
            int i2 = getContactsParams.c;
            ContactFilter contactFilter = getContactsParams.d;
            Charset charset = NearbySharingChimeraService.a;
            vyd.a(nearbySharingChimeraService.a(i, i2, contactFilter));
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke getContacts callback.");
        }
    }
}
