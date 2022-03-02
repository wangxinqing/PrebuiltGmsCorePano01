package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TimeSeriesFootprintsSubscriptionFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryt();
    public final int a;
    public final Long b;
    public final Long c;

    static {
        new TimeSeriesFootprintsSubscriptionFilter(0, (Long) null, (Long) null);
    }

    public TimeSeriesFootprintsSubscriptionFilter(int i, Long l, Long l2) {
        this.a = i;
        this.c = l2;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(timeSeriesFootprintsSubscriptionFilter.a)) && ius.a(this.b, timeSeriesFootprintsSubscriptionFilter.b) && ius.a(this.c, timeSeriesFootprintsSubscriptionFilter.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
