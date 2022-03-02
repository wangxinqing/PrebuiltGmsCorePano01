package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: fxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fxa implements aora {
    final /* synthetic */ fxb a;

    public fxa(fxb fxb) {
        this.a = fxb;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.b.a((GoogleSignInAccount) ((amri) obj).c(), Status.a);
            this.a.a(0);
        } catch (RemoteException e) {
            fxb.a.d("RemoteException when calling back onSilentSignedInToGoogle().", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        try {
            Status b = fxi.b(fxi.a(th));
            this.a.a(b);
            this.a.a(b.i);
        } catch (RemoteException e) {
            fxb.a.d("RemoteException when calling back onSilentSignedInToGoogle", e, new Object[0]);
        }
    }
}
