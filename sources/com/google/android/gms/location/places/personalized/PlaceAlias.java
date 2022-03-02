package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceAlias extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rle();
    public static final PlaceAlias a = new PlaceAlias("Home");
    public static final PlaceAlias b = new PlaceAlias("Work");
    public final String c;

    public PlaceAlias(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceAlias) {
            return ius.a(this.c, ((PlaceAlias) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("alias", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.c, false);
        ivx.b(parcel, a2);
    }
}
