package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfd();
    public final List a;

    public SleepSegmentRequest(List list) {
        this.a = list;
    }

    public static SleepSegmentRequest a() {
        return new SleepSegmentRequest(Arrays.asList(new UserPreferredSleepWindow[]{new UserPreferredSleepWindow(7, 0, 7, 0)}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepSegmentRequest) {
            return ius.a(this.a, ((SleepSegmentRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
