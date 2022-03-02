package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.fido2.api.view.BlePairViewOptions;

/* renamed from: nak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BlePairViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        BleDeviceIdentifier bleDeviceIdentifier = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                bleDeviceIdentifier = (BleDeviceIdentifier) ivw.a(parcel, readInt, BleDeviceIdentifier.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new BlePairViewOptions(bleDeviceIdentifier);
    }
}
