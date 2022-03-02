package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rtu extends bhw implements rtv {
    final /* synthetic */ rqm a;

    public rtu() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        rwg rwg;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            rwg = queryLocalInterface instanceof rwg ? (rwg) queryLocalInterface : new rwe(readStrongBinder);
        } else {
            rwg = null;
        }
        boolean a2 = this.a.a(new rvg(rwg));
        parcel2.writeNoException();
        bhx.a(parcel2, a2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtu(rqm rqm) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        this.a = rqm;
    }
}
