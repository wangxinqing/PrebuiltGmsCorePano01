package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aajo();
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
