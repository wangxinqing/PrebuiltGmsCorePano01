package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tih();
    public final String a;

    public AppIdentifier(String str) {
        iva.a(str, (Object) "Missing application identifier value");
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
