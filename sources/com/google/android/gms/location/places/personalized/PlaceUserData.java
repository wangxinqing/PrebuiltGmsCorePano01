package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlg();
    public final String a;
    public final String b;
    public final List c;

    public PlaceUserData(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static PlaceUserData a(String str, String str2, List list) {
        return new PlaceUserData(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceUserData) {
            PlaceUserData placeUserData = (PlaceUserData) obj;
            return this.a.equals(placeUserData.a) && this.b.equals(placeUserData.b) && this.c.equals(placeUserData.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("accountName", this.a);
        a2.a("placeId", this.b);
        a2.a("placeAliases", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.c(parcel, 6, this.c, false);
        ivx.b(parcel, a2);
    }
}
