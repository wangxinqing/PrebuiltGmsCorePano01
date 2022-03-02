package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: rrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class rrk extends rrx {
    final /* synthetic */ rvt b;

    public rrk(rvt rvt) {
        this.b = rvt;
    }

    public final Object a() {
        try {
            rvt rvt = this.b;
            rvu rvu = rvt.a;
            if (rvu != null) {
                return mbz.a(a(rvu));
            }
            rsf rsf = rvt.b.a;
            if (rsf == null) {
                return null;
            }
            rvt.a = rsf.newBitmapDescriptorFactoryDelegate();
            return mbz.a(a(this.b.a));
        } catch (RemoteException e) {
            Log.e("maps.CreatorImpl", "Failed to compute lazy value.", e);
            return null;
        }
    }
}
