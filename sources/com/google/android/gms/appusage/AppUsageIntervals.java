package com.google.android.gms.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppUsageIntervals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ebu();
    public final List a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ebw();
        public final int a;
        public final long b;
        public final long c;

        public Interval(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b);
            ivx.a(parcel, 3, this.c);
            ivx.b(parcel, a2);
        }
    }

    public AppUsageIntervals(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.c(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
