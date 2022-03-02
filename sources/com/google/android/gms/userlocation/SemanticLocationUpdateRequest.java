package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SemanticLocationUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adux();
    public final String a;
    public final int b;
    public final EstimationOptions c;

    public SemanticLocationUpdateRequest(String str, int i, EstimationOptions estimationOptions) {
        this.a = str;
        this.b = i;
        this.c = estimationOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
