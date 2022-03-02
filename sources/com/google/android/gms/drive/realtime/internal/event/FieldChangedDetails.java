package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldChangedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmx();
    final int a;

    public FieldChangedDetails(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
