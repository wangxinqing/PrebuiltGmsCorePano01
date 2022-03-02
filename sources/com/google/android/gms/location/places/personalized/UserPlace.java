package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlh();
    public final String a;
    public final List b;

    public UserPlace(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static UserPlace a(String str, List list) {
        return new UserPlace(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserPlace) {
            UserPlace userPlace = (UserPlace) obj;
            return this.a.equals(userPlace.a) && this.b.equals(userPlace.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("placeId", this.a);
        a2.a("userPlaceTypes", this.b);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
