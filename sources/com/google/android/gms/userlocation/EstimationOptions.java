package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EstimationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adtx();
    public final boolean a;
    public final boolean b;

    public EstimationOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EstimationOptions) {
            EstimationOptions estimationOptions = (EstimationOptions) obj;
            return estimationOptions.a == this.a && estimationOptions.b == this.b;
        }
    }

    public final int hashCode() {
        return (this.a ? 1 : 0) + (!this.b ? 0 : 2);
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("shouldEstimateDetails", Boolean.valueOf(this.a));
        a2.a("shouldProvidePlaceHierarchy", Boolean.valueOf(this.b));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
