package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aebn();
    public final int a;
    public final long b;
    public final List c;

    public StorageInfoResponse(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.c(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
