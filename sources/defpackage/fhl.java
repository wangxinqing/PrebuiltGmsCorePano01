package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fhl implements aora {
    final /* synthetic */ ftu a;

    public fhl(ftu ftu) {
        this.a = ftu;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MatchPasswordResult matchPasswordResult = (MatchPasswordResult) obj;
        try {
            ftu ftu = this.a;
            Status status = Status.a;
            iva.a((Object) matchPasswordResult);
            ftu.a(status, matchPasswordResult);
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
            this.a.a(a2.b(), (MatchPasswordResult) null);
        } catch (RemoteException e) {
            fho.a.e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
