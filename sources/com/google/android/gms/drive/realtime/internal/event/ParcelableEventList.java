package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableEventList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lna();
    final List a;
    public final DataHolder b;
    final boolean c;
    final List d;
    final ParcelableChangeInfo e;

    public ParcelableEventList(List list, DataHolder dataHolder, boolean z, List list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.a = list;
        this.b = dataHolder;
        this.c = z;
        this.d = list2;
        this.e = parcelableChangeInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.b(parcel, a2);
    }
}
