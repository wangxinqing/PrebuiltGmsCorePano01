package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacefencingFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new riw();
    public final List a;
    public final List b;
    public final List c;

    public PlacefencingFilter(List list, List list2, List list3) {
        List list4;
        List list5;
        this.a = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        if (list2 != null) {
            list4 = Collections.unmodifiableList(list2);
        } else {
            list4 = Collections.emptyList();
        }
        this.b = list4;
        if (list3 != null) {
            list5 = Collections.unmodifiableList(list3);
        } else {
            list5 = Collections.emptyList();
        }
        this.c = list5;
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty()) {
            throw new IllegalArgumentException("PlacefencingFilter must specify something to filter");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
