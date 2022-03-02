package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SectionPayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new due();
    public final SparseArray a;

    public SectionPayload(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        SparseArray sparseArray = this.a;
        if (sparseArray != null) {
            int a3 = ivx.a(parcel, 1);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeByteArray((byte[]) sparseArray.valueAt(i2));
            }
            ivx.b(parcel, a3);
        }
        ivx.b(parcel, a2);
    }
}
