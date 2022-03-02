package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.fido2.api.view.BleSelectViewOptions;
import java.util.ArrayList;

/* renamed from: nam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nam implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleSelectViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                z = ivw.c(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, BleDeviceIdentifier.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new BleSelectViewOptions(z, arrayList);
    }
}
