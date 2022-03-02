package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;

/* renamed from: rys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rys implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeSeriesFootprintsReadFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Long l = null;
        Long l2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                l = ivw.j(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                l2 = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new TimeSeriesFootprintsReadFilter(i, l, l2);
    }
}
