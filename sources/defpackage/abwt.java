package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: abwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        abxe abxe;
        int b = ivw.b(parcel);
        abxb abxb = null;
        IBinder iBinder = null;
        ConnectionRequest connectionRequest = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 2) {
                connectionRequest = (ConnectionRequest) ivw.a(parcel, readInt, ConnectionRequest.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                iBinder2 = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
            abxe = queryLocalInterface instanceof abxe ? (abxe) queryLocalInterface : new abxc(iBinder);
        } else {
            abxe = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
            if (queryLocalInterface2 instanceof abxb) {
                abxb = (abxb) queryLocalInterface2;
            } else {
                abxb = new abwz(iBinder2);
            }
        }
        return new ConnectParams(abxe, connectionRequest, abxb);
    }
}
