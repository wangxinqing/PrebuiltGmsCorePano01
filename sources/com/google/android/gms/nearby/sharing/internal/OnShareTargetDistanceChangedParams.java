package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnShareTargetDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzd();
    public ShareTarget a;
    public int b;

    public OnShareTargetDistanceChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetDistanceChangedParams) {
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams = (OnShareTargetDistanceChangedParams) obj;
            return ius.a(this.a, onShareTargetDistanceChangedParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(onShareTargetDistanceChangedParams.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public OnShareTargetDistanceChangedParams(ShareTarget shareTarget, int i) {
        this.a = shareTarget;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
