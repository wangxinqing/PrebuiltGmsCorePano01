package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SemanticLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adud();
    public static final List a = new ArrayList(0);
    public final int b;
    public final long c;
    public final TransitEstimate d;
    public final List e;
    public final List f;
    public final Position g;

    public SemanticLocation(int i, long j, TransitEstimate transitEstimate, List list, List list2, Position position) {
        this.b = i;
        this.c = j;
        this.d = transitEstimate;
        this.e = list;
        this.f = list2;
        this.g = position;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.c(parcel, 4, this.e, false);
        ivx.c(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
