package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rtr extends bhw implements rts {
    final /* synthetic */ rqs a;

    public rtr() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        rsi rsi;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            rsi = queryLocalInterface instanceof rsi ? (rsi) queryLocalInterface : new rsg(readStrongBinder);
        } else {
            rsi = null;
        }
        this.a.a(new rqn(rsi));
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtr(rqs rqs) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        this.a = rqs;
    }
}
