package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;

/* renamed from: uxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessageFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, MessageType.CREATOR);
            } else if (a == 2) {
                arrayList2 = ivw.c(parcel, readInt, NearbyDeviceFilter.CREATOR);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a == 4) {
                arrayList3 = ivw.c(parcel, readInt, BleFilter.CREATOR);
            } else if (a == 5) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MessageFilter(i, arrayList, arrayList2, z, arrayList3, i2);
    }
}
