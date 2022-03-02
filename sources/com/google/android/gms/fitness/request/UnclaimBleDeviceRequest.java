package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new net();
    public final String a;
    private final nem b;

    public UnclaimBleDeviceRequest(String str, IBinder iBinder) {
        nem nem;
        this.a = str;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            nem = queryLocalInterface instanceof nem ? (nem) queryLocalInterface : new nek(iBinder);
        } else {
            nem = null;
        }
        this.b = nem;
    }

    public final String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        nem nem = this.b;
        if (nem != null) {
            iBinder = nem.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        ivx.b(parcel, a2);
    }

    public UnclaimBleDeviceRequest(String str, nem nem) {
        this.a = str;
        this.b = nem;
    }
}
