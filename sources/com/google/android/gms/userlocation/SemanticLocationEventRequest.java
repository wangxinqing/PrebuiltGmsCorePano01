package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adug();
    public final String a;
    public final int b;
    public final EstimationOptions c;
    public final int d;

    public SemanticLocationEventRequest(String str, int i, EstimationOptions estimationOptions, int i2) {
        this.a = str;
        this.b = i;
        this.c = estimationOptions;
        this.d = i2;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("requestId", this.a);
        a2.a("priority", Integer.valueOf(this.b));
        a2.a("eventTypes", Integer.valueOf(this.d));
        a2.a("options", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
