package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aear();
    public final int a;
    public final List b;

    public GetConnectedNodesResponse(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
