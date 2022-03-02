package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rhe();
    final int a;
    public final boolean b;
    final List c;
    public final String d;
    public final int e;

    public AutocompleteFilter(int i, boolean z, List list, String str) {
        this.a = i;
        this.c = list;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            i2 = ((Integer) list.iterator().next()).intValue();
        }
        this.e = i2;
        this.d = str;
        if (this.a <= 0) {
            this.b = !z;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutocompleteFilter) {
            AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
            return this.e == autocompleteFilter.e && this.b == autocompleteFilter.b && this.d == autocompleteFilter.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Integer.valueOf(this.e), this.d});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("includeQueryPredictions", Boolean.valueOf(this.b));
        a2.a("typeFilter", Integer.valueOf(this.e));
        a2.a("country", this.d);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
