package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.BleProcessRequestViewOptions;

/* renamed from: ncp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ncp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleProcessRequestViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        BleDeviceIdentifier bleDeviceIdentifier = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bleDeviceIdentifier = (BleDeviceIdentifier) ivw.a(parcel, readInt, BleDeviceIdentifier.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BleProcessRequestViewOptions(bleDeviceIdentifier, z);
    }
}
