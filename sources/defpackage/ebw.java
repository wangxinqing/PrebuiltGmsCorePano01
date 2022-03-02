package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appusage.AppUsageIntervals;

/* renamed from: ebw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppUsageIntervals.Interval[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                j2 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AppUsageIntervals.Interval(i, j, j2);
    }
}
