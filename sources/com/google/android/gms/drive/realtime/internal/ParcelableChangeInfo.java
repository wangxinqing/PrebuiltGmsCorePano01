package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableChangeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmp();
    final long a;
    final List b;

    public ParcelableChangeInfo(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
