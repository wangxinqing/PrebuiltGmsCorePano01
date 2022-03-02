package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: alef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alef implements rei {
    final /* synthetic */ aleo a;

    public alef(aleo aleo) {
        this.a = aleo;
    }

    public final void a(Location location) {
        rqj rqj;
        alen alen = this.a.e;
        if (alen != null && (rqj = ((alee) alen).j) != null) {
            try {
                rtk rtk = rqj.a;
                Parcel aQ = rtk.aQ();
                bhx.a(aQ, (Parcelable) location);
                rtk.b(2, aQ);
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        }
    }
}
