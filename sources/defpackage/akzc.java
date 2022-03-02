package defpackage;

import android.os.RemoteException;

/* renamed from: akzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzc implements rqs {
    final /* synthetic */ akzj a;

    public akzc(akzj akzj) {
        this.a = akzj;
    }

    public final void a(rqn rqn) {
        this.a.f = rqn;
        try {
            rqn.a.g();
            try {
                rqn.a.i();
                rqn.a(true);
                rqn.a((rqk) this.a);
                rqn.a((rqm) this.a);
                rqn.a((rql) this.a);
                rqn.d().c();
                rqn.d().d();
                rqn.d().c();
                rqn.d().a(true);
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } catch (RemoteException e2) {
            throw new rvl(e2);
        }
    }
}
