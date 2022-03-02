package defpackage;

import android.os.RemoteException;

/* renamed from: akyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyu implements rqs {
    final /* synthetic */ boolean a;

    public akyu(boolean z) {
        this.a = z;
    }

    public final void a(rqn rqn) {
        rqw d = rqn.d();
        try {
            d.a.a(this.a);
            try {
                d.a.b(this.a);
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } catch (RemoteException e2) {
            throw new rvl(e2);
        }
    }
}
