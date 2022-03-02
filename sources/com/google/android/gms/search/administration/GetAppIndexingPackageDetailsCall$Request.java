package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAppIndexingPackageDetailsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aagc();
    public String a;

    public GetAppIndexingPackageDetailsCall$Request(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
