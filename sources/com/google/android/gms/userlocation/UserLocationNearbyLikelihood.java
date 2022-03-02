package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserLocationNearbyLikelihood extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new advc();
    public final String a;
    public final double b;
    public final double c;
    public final List d;

    public UserLocationNearbyLikelihood(String str, double d2, double d3, List list) {
        this.a = str;
        this.b = d2;
        this.c = d3;
        this.d = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
