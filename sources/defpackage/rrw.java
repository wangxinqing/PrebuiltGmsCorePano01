package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: rrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class rrw extends rrx {
    final /* synthetic */ rsa e;

    public rrw(rsa rsa) {
        this.e = rsa;
    }

    public final Object a() {
        try {
            rsa rsa = this.e;
            rsb rsb = rsa.a;
            if (rsb != null) {
                return mbz.a(a(rsb));
            }
            rsf rsf = rsa.b.a;
            if (rsf == null) {
                return null;
            }
            rsa.a = rsf.newCameraUpdateFactoryDelegate();
            return mbz.a(a(this.e.a));
        } catch (RemoteException e2) {
            Log.e("maps.CreatorImpl", "Failed to compute lazy value.", e2);
            return null;
        }
    }
}
