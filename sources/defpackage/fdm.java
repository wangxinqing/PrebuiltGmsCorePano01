package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.credentialsaving.CredentialSavingChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: fdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fdm implements aora {
    final /* synthetic */ fdk a;

    public fdm(fdk fdk) {
        this.a = fdk;
    }

    public final void a(Object obj) {
        try {
            this.a.a(Status.a, obj);
        } catch (RemoteException e) {
            fdn.a.e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        try {
            qbf a2 = qbf.a(th);
            if (a2.a == 8) {
                fdn.a.e("Internal error.", a2, new Object[0]);
            }
            this.a.a(CredentialSavingChimeraService.a(a2), (Object) null);
        } catch (RemoteException e) {
            fdn.a.e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
