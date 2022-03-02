package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetPermissionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kwa();
    final List a;
    final int b;

    public GetPermissionsResponse(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
