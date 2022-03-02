package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: ndd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleDevice[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 3) {
                arrayList = ivw.C(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, DataType.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new BleDevice(str, str2, arrayList, arrayList2);
    }
}
