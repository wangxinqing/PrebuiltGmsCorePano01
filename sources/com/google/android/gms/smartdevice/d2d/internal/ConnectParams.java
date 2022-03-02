package com.google.android.gms.smartdevice.d2d.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abwt();
    public abxe a;
    public ConnectionRequest b;
    public abxb c;

    private ConnectParams() {
    }

    public ConnectParams(abxe abxe, ConnectionRequest connectionRequest, abxb abxb) {
        this.a = abxe;
        this.b = connectionRequest;
        this.c = abxb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        abxe abxe = this.a;
        IBinder iBinder2 = null;
        if (abxe != null) {
            iBinder = abxe.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        ivx.a(parcel, 2, this.b, i, false);
        abxb abxb = this.c;
        if (abxb != null) {
            iBinder2 = abxb.asBinder();
        }
        ivx.a(parcel, 3, iBinder2);
        ivx.b(parcel, a2);
    }
}
