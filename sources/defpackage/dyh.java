package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyh implements dyf {
    final /* synthetic */ dxz a;

    public dyh(dxz dxz) {
        this.a = dxz;
    }

    public final void a(ContactPerson contactPerson, boolean z) {
        try {
            dxz dxz = this.a;
            Parcel aQ = dxz.aQ();
            bhx.a(aQ, (Parcelable) contactPerson);
            bhx.a(aQ, z);
            dxz.c(1, aQ);
        } catch (RemoteException e) {
            apev.a(e);
        }
    }
}
