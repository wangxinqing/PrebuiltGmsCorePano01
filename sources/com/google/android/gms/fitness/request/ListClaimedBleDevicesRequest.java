package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nes();
    private final ner a;

    public ListClaimedBleDevicesRequest(IBinder iBinder) {
        ner ner;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            ner = queryLocalInterface instanceof ner ? (ner) queryLocalInterface : new nep(iBinder);
        } else {
            ner = null;
        }
        this.a = ner;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.b(parcel, a2);
    }

    public ListClaimedBleDevicesRequest(ner ner) {
        this.a = ner;
    }
}
