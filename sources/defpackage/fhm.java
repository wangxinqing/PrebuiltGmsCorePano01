package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fhm implements aora {
    final /* synthetic */ ftk a;

    public fhm(ftk ftk) {
        this.a = ftk;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.a(Status.a, new GetDefaultAccountResult((Account) ((amri) obj).c()));
        } catch (RemoteException e) {
            fho.a.e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        qbf a2 = qbf.a(th);
        if (a2.a == 8) {
            fho.a.e("Internal error.", a2, new Object[0]);
        }
        try {
            this.a.a(a2.b(), (GetDefaultAccountResult) null);
        } catch (RemoteException e) {
            fho.a.e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
