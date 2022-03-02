package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: evm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class evm implements aora {
    final /* synthetic */ evo a;

    public evm(evo evo) {
        this.a = evo;
    }

    public final void a(Object obj) {
        try {
            this.a.a(Status.a, obj);
        } catch (RemoteException e) {
            evn.a.e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        Status status;
        try {
            qbf a2 = qbf.a(th);
            if (a2.a == 8) {
                evn.a.e("Internal error.", a2, new Object[0]);
            }
            evo evo = this.a;
            int i = a2.a;
            if (i == 7) {
                status = new Status(7);
            } else if (i == 11000) {
                status = new Status(6, "Passphrase required.");
            } else if (i == 28433) {
                status = new Status(16, "Cannot find a matching credential.");
            } else if (i == 28436) {
                status = new Status(16, "Caller has been temporarily blacklisted due to too many canceled sign-in prompts");
            } else if (i == 28442) {
                status = new Status(10, "Invalid calling package");
            } else if (i != 28443) {
                status = Status.c;
            } else {
                status = new Status(10, "Caller not whitelisted to call SignIn APIs");
            }
            evo.a(status, (Object) null);
        } catch (RemoteException e) {
            evn.a.e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
