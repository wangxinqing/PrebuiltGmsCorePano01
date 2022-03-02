package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fhk implements aora {
    final /* synthetic */ ftc a;

    public fhk(ftc ftc) {
        this.a = ftc;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        CompleteSignInResult completeSignInResult = (CompleteSignInResult) obj;
        try {
            ftc ftc = this.a;
            Status status = Status.a;
            iva.a((Object) completeSignInResult);
            ftc.a(status, completeSignInResult);
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
            this.a.a(a2.b(), (CompleteSignInResult) null);
        } catch (RemoteException e) {
            fho.a.e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
