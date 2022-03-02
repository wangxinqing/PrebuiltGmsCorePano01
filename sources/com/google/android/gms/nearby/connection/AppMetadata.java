package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tii();
    public final List a;

    public AppMetadata(List list) {
        iva.a((Object) list, (Object) "Must specify application identifiers");
        this.a = list;
        iva.a(list.size(), (Object) "Application identifiers cannot be empty");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
