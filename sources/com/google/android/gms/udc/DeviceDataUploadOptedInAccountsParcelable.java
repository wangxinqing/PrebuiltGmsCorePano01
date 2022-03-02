package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable implements acyt {
    public static final Parcelable.Creator CREATOR = new acyh();
    public final List a;
    public final List b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (!ius.a(this.a, deviceDataUploadOptedInAccountsParcelable.a) || !ius.a(this.b, deviceDataUploadOptedInAccountsParcelable.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
