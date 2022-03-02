package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: sps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sps implements Parcelable.Creator {
    public static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, eventParcel.a, false);
        ivx.a(parcel, 3, eventParcel.b, i, false);
        ivx.a(parcel, 4, eventParcel.c, false);
        ivx.a(parcel, 5, eventParcel.d);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        EventParams eventParams = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                eventParams = (EventParams) ivw.a(parcel, readInt, EventParams.CREATOR);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new EventParcel(str, eventParams, str2, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EventParcel[i];
    }
}
